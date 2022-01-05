import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My New Angular page';
  info = 'thise is my first projct in angular';
  presentDate = new Date();
  
}
