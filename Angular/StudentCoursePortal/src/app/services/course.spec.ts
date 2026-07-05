import { TestBed } from '@angular/core/testing';
import { provideHttpClient } from '@angular/common/http';

import { CourseService } from './course';

describe('CourseService', () => {

  let service: CourseService;

  beforeEach(() => {

    TestBed.configureTestingModule({
      providers: [
        provideHttpClient()
      ]
    });

    service = TestBed.inject(CourseService);

  });

  it('should be created', () => {

    expect(service).toBeTruthy();

  });

});