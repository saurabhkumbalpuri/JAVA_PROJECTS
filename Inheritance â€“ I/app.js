var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');
var input1=input[0].split(',');
var input2=input[1].split(',');
var input3=input[2].split(',');


class Shape
{
    constructor(name,nos,color)
    {
        this.name=name;
        this.nos=nos;
        this.color=color;
    }
    displayShapeColor()
    {
        console.log(this.name+' is in color '+this.color);
    }
}
class Circle extends Shape
{
     constructor(name,nos,color)
    {
        super(name,nos,color);
    }
    displayShapeSides()
    {
        console.log(this.name+ ' has '+this.nos+ ' sides');
    }
}

class Square extends Shape
{
     constructor(name,nos,color)
    {
        super(name,nos,color);
    }
    displayShapeSides()
    {
         console.log(this.name+ ' has '+this.nos+ ' sides');
    }
}
class Triangle extends Shape
{
     constructor(name,nos,color)
    {
       super(name,nos,color);
    }
    displayShapeSides()
    {
       console.log(this.name+ ' has '+this.nos+ ' sides');
    }
}

let circle=new Circle(input1[0],input1[1],input1[2]);
let square=new Square(input2[0],input2[1],input2[2]);
let triangle=new Triangle(input3[0],input3[1],input3[2]);
 circle.displayShapeColor();
 circle.displayShapeSides();
 square.displayShapeColor();
 square.displayShapeSides();
 triangle.displayShapeColor();
 triangle.displayShapeSides()