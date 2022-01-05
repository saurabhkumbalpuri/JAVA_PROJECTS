import { Component, OnInit } from '@angular/core';
import { User } from '../user'; 

@Component({
  selector: 'app-test1',
  templateUrl: './test1.component.html',
  styleUrls: ['./test1.component.css']
})
export class Test1Component implements OnInit {


  users: User[] = [ 
    { 
       "userId": 1, 
       "userName": 'User1' 
    }, 
    { 
       "userId": 2, 
       "userName": 'User2' 
    }, 
 ]; 













  isLogIn : boolean = false;
   isLogOut : boolean = true; 
   list = [1,2,3,4,5];

  constructor() { }

  ngOnInit(): void {
  }

}
