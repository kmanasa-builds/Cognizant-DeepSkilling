import { TestBed } from '@angular/core/testing';

import { NotificationService } from './notification';

describe('NotificationService', () => {

  let service: NotificationService;

  beforeEach(() => {

    TestBed.configureTestingModule({
      providers: [NotificationService]
    });

    service = TestBed.inject(NotificationService);

  });

  it('should be created', () => {

    expect(service).toBeTruthy();

  });

  it('should return the message', () => {

    expect(service.getMessage())
      .toBe('Welcome to Notification Component');

  });

});