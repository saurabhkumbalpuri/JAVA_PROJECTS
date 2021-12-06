
 public class Rectangle {
    		
	//Fill your code
	private int length;
	private int width;

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Integer area() {		

		//Fill your code
		int area=length*width;
		
		return area;

	}
	public Rectangle(Integer length, Integer width)
	{
		super();
		 //this.setLength=length;
		// this.setWidth=width;
		this.length=length;
		this.width=width;
	}
	public void display(){
		
		//Fill your code
		System.out.println("Rectangle Dimension");
		System.out.println("Length:"+this.getLength());
		System.out.println("Width:"+this.getWidth());
		

	}
	
	Rectangle dimensionChange(Integer newDimension){

		//int newDimension;
		//Fill your code
		Rectangle r = new Rectangle(newDimension*this.getLength(),newDimension*this.getWidth());
		/*System.out.println("Rectangle Dimension");
		System.out.println("Length:"+this.getLength()*newDimension);
		System.out.println("Width:"+this.getWidth()*newDimension);
		System.out.println("Area of the Rectangle:"+(this.getLength()newDimension)(this.getWidth()*newDimension));
		*/
		return r;
		
		
	
	}
	
	
}