import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaidingEntryComponent } from './taiding-entry.component';

describe('TaidingEntryComponent', () => {
  let component: TaidingEntryComponent;
  let fixture: ComponentFixture<TaidingEntryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TaidingEntryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TaidingEntryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
