import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { map, tap, retry, catchError } from 'rxjs/operators';
import { Course } from '../models/course.model';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private apiUrl = 'http://localhost:3000/courses';

  constructor(private http: HttpClient) {}

  getCourses(): Observable<Course[]> {

    return this.http.get<Course[]>(this.apiUrl).pipe(

      map(courses =>
        courses.filter(course => course.credits > 0)
      ),

      tap(courses =>
        console.log('Courses loaded:', courses.length)
      ),

      retry(2),

      catchError(error => {

        console.error(error);

        return throwError(() =>
          new Error('Failed to load courses. Please try again.')
        );

      })

    );

  }

  getCourseById(id: number): Observable<Course> {

    return this.http.get<Course[]>(this.apiUrl).pipe(

      map(courses => {

        const course = courses.find(
          c => Number(c.id) === id
        );

        if (!course) {
          throw new Error('Course not found');
        }

        return course;

      })

    );

  }

  createCourse(course: Omit<Course, 'id'>): Observable<Course> {

    return this.http.post<Course>(
      this.apiUrl,
      course
    );

  }

  updateCourse(id: number, course: Course): Observable<Course> {

    return this.http.put<Course>(
      `${this.apiUrl}/${id}`,
      course
    );

  }

  deleteCourse(id: number): Observable<void> {

    return this.http.delete<void>(
      `${this.apiUrl}/${id}`
    );

  }

}