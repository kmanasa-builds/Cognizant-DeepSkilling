import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

import { Observable } from 'rxjs';

import { Store } from '@ngrx/store';

import { Course } from '../../models/course.model';

import { loadCourses } from '../../store/course/course.actions';

import {
  selectAllCourses
} from '../../store/course/course.selectors';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseListComponent implements OnInit {

  courses$!: Observable<Course[]>;

  searchTerm = '';

  selectedCourseId: number | null = null;

  constructor(
    private store: Store,
    private router: Router
  ) {}

  ngOnInit(): void {

    this.courses$ =
      this.store.select(selectAllCourses);

    this.store.dispatch(loadCourses());

  }

  goToCourse(id: number): void {

    this.selectedCourseId = id;

    this.router.navigate(['/courses', id]);

  }

  trackByCourseId(index: number, course: Course): number {

    return course.id;

  }

}