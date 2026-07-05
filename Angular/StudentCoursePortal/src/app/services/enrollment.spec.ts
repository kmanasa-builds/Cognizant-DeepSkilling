import { TestBed } from '@angular/core/testing';
import { provideHttpClient } from '@angular/common/http';

import { EnrollmentService } from './enrollment';

describe('EnrollmentService', () => {

  let service: EnrollmentService;

  beforeEach(() => {

    TestBed.configureTestingModule({
      providers: [
        provideHttpClient()
      ]
    });

    service = TestBed.inject(EnrollmentService);

  });

  it('should be created', () => {

    expect(service).toBeTruthy();

  });

});