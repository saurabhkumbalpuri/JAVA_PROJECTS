import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { ExpenceEntryComponent } from './expence-entry/expence-entry.component';
import { TaidingEntryComponent } from './taiding-entry/taiding-entry.component';
import { Test1Component } from './test1/test1.component';
import { CustomstyleDirective } from './customstyle.directive';
import { DigitcountPipe } from './digitcount.pipe';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    ExpenceEntryComponent,
    TaidingEntryComponent,
    Test1Component,
    CustomstyleDirective,
    DigitcountPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
