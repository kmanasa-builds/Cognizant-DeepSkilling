import { CanDeactivateFn } from '@angular/router';
import { ReactiveEnrollmentForm } from '../pages/reactive-enrollment-form/reactive-enrollment-form';

export const unsavedChangesGuard: CanDeactivateFn<ReactiveEnrollmentForm> = (
  component
) => {

  if (component.enrollForm.dirty) {

    return window.confirm(
      'You have unsaved changes. Leave?'
    );

  }

  return true;

};