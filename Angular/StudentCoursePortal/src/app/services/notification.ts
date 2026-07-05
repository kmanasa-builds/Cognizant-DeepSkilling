import { Injectable } from '@angular/core';

@Injectable()
export class NotificationService {

  private message = 'Welcome to Notification Component';

  getMessage(): string {
    return this.message;
  }

}