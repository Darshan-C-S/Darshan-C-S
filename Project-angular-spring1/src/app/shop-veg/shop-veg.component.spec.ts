import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShopVegComponent } from './shop-veg.component';

describe('ShopVegComponent', () => {
  let component: ShopVegComponent;
  let fixture: ComponentFixture<ShopVegComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShopVegComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShopVegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
