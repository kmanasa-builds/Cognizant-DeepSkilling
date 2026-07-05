import { Routes } from '@angular/router';

import { HomeComponent } from './pages/home/home';
import { CourseListComponent } from './pages/course-list/course-list';
import { CourseDetailComponent } from './pages/course-detail/course-detail';
import { StudentProfile } from './pages/student-profile/student-profile';
import { EnrollmentForm } from './pages/enrollment-form/enrollment-form';
import { ReactiveEnrollmentForm } from './pages/reactive-enrollment-form/reactive-enrollment-form';
import { NotFoundComponent } from './pages/not-found/not-found';

import { authGuard } from './guards/auth-guard';

export const routes: Routes = [

  {
    path: '',
    component: HomeComponent
  },

  {
    path: 'courses',
    component: CourseListComponent
  },

  {
    path: 'courses/:id',
    component: CourseDetailComponent
  },

  {
    path: 'profile',
    component: StudentProfile,
    canActivate: [authGuard]
  },

  {
    path: 'enroll',
    component: EnrollmentForm
  },

  {
    path: 'reactive-enroll',
    component: ReactiveEnrollmentForm
  },

  {
    path: '**',
    component: NotFoundComponent
  }

];