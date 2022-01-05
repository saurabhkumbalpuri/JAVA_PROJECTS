import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpenceEntryComponent } from './expence-entry.component';

describe('ExpenceEntryComponent', () => {
  let component: ExpenceEntryComponent;
  let fixture: ComponentFixture<ExpenceEntryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpenceEntryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExpenceEntryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
