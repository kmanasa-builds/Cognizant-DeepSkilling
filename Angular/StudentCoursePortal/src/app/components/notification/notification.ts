import { Component } from '@angular/core';
import { NotificationService } from '../../services/notification';

@Component({
  selector: 'app-notification',
  standalone: true,
  imports: [],
  templateUrl: './notification.html',
  styleUrl: './notification.css',
  providers: [NotificationService]
})
export class NotificationComponent {

  constructor(
    public notificationService: NotificationService
  ) {}

}