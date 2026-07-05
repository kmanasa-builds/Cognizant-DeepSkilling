import {
  Component,
  Input,
  Output,
  EventEmitter,
  OnChanges,
  SimpleChanges
} from '@angular/core';

import { CommonModule } from '@angular/common';

import { CreditLabelPipe } from '../../pipes/credit-label-pipe';
import { EnrollmentService } from '../../services/enrollment';
import { Course } from '../../models/course.model';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [
    CommonModule,
    CreditLabelPipe
  ],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard implements OnChanges {

  @Input()
  course!: Course;

  @Output()
  enrollRequested = new EventEmitter<number>();

  isExpanded = false;

  constructor(public enrollmentService: EnrollmentService) {}

  get cardClasses() {

    return {

      'card--enrolled': this.enrollmentService.isEnrolled(this.course.id),

      'card--full': this.course.credits >= 4,

      'expanded': this.isExpanded

    };

  }

  ngOnChanges(changes: SimpleChanges): void {

    console.log(
      'Previous Value:',
      changes['course']?.previousValue
    );

    console.log(
      'Current Value:',
      changes['course']?.currentValue
    );

  }

  toggleEnrollment() {

    if (this.enrollmentService.isEnrolled(this.course.id)) {

      this.enrollmentService.unenroll(this.course.id);

    } else {

      this.enrollmentService.enroll(this.course.id);

      this.enrollRequested.emit(this.course.id);

    }

  }

}