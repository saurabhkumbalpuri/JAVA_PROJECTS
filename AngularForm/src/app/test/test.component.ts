import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {


  digits : number = 100; 
    studentArr: any[] = [ { 
       "id": 1, 
       "name": "student1" 
    }, 
    { 
       "id": 2,
       "name": "student2" 
    }, 
    { 
       "id": 3, "name": "student3"
    },
    { 
       "id": 4, 
       "name": "student4" 
    } 
    ]; 
    trackByData(index:number, studentArr:any): number { 
       return studentArr.id; 
    }

  constructor() { }
  showData($event: any){ 
    console.log("button is clicked!"); if($event) { 
       console.log($event.target); 
       console.log($event.target.value); 
    } 
 } 

  ngOnInit(): void {
  }

}
