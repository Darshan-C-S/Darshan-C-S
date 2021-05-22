import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewvegComponent } from './viewveg.component';

describe('ViewvegComponent', () => {
  let component: ViewvegComponent;
  let fixture: ComponentFixture<ViewvegComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewvegComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewvegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
