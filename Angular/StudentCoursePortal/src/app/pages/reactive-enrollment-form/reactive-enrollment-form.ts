import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  AbstractControl,
  AsyncValidatorFn,
  FormArray,
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  ValidationErrors,
  Validators
} from '@angular/forms';

@Component({
  selector: 'app-reactive-enrollment-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './reactive-enrollment-form.html',
  styleUrl: './reactive-enrollment-form.css'
})
export class ReactiveEnrollmentForm {

  enrollForm: FormGroup;

  constructor(private fb: FormBuilder) {

    this.enrollForm = this.fb.group({

      studentName: [
        '',
        [Validators.required, Validators.minLength(3)]
      ],

      studentEmail: [
        '',
        {
          validators: [
            Validators.required,
            Validators.email
          ],
          asyncValidators: [
            this.emailTakenValidator()
          ],
          updateOn: 'blur'
        }
      ],

      courseId: [
        '',
        [Validators.required, this.noCourseCode]
      ],

      preferredSemester: [
        'Odd',
        Validators.required
      ],

      additionalCourses: this.fb.array([]),

      agreeToTerms: [
        false,
        Validators.requiredTrue
      ]

    });

  }

  get additionalCourses(): FormArray {

    return this.enrollForm.get(
      'additionalCourses'
    ) as FormArray;

  }

  addCourse() {

    this.additionalCourses.push(
      this.fb.control(
        '',
        Validators.required
      )
    );

  }

  removeCourse(index: number) {

    this.additionalCourses.removeAt(index);

  }

  noCourseCode(control: AbstractControl): ValidationErrors | null {

    const value = control.value;

    if (
      value &&
      value.toUpperCase().startsWith('XX')
    ) {

      return {
        noCourseCode: true
      };

    }

    return null;

  }

  emailTakenValidator(): AsyncValidatorFn {

    return (control: AbstractControl) => {

      return new Promise<ValidationErrors | null>((resolve) => {

        setTimeout(() => {

          if (
            control.value &&
            control.value.toLowerCase() === 'test@example.com'
          ) {

            resolve({
              emailTaken: true
            });

          } else {

            resolve(null);

          }

        }, 800);

      });

    };

  }

  onSubmit() {

    console.log(this.enrollForm.value);

    alert(
      'Enrollment submitted successfully!'
    );

    this.enrollForm.markAsPristine();

  }

}