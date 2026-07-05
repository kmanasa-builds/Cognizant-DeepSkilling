import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseSummaryWidgetComponent } from './course-summary-widget';

describe('CourseSummaryWidgetComponent', () => {

  let component: CourseSummaryWidgetComponent;
  let fixture: ComponentFixture<CourseSummaryWidgetComponent>;

  beforeEach(async () => {

    await TestBed.configureTestingModule({
      imports: [CourseSummaryWidgetComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CourseSummaryWidgetComponent);
    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create', () => {

    expect(component).toBeTruthy();

  });

});