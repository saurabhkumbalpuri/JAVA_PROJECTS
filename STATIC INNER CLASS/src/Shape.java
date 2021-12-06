 
public class Shape {

        //fill your code here
	public double value1;
	public double value2;

	public static class Rectangle {
	    //fill your code here
		public double value1;
     	public double value2;
		
		public double getValue1() {
			return value1;
		}
		public void setValue1(double value1) {
			this.value1 = value1;
		}
		public double getValue2() {
			return value2;
		}
        public void setValue2(double value2) {
			this.value2 = value2;
		}
        
        public Double computeRectangleArea()
		{
		double  area = (value1*value2);	
		return area;
		}
		
	}
	
	public static class Triangle {
	    //fill your code here
		public double value1;
     	public double value2;
		
		public double getValue1() {
			return value1;
		}
		public void setValue1(double value1) {
			this.value1 = value1;
		}
		public double getValue2() {
			return value2;
		}
        public void setValue2(double value2) {
			this.value2 = value2;
		}
        
		public Double computeTriangleArea()
		{
			double area=(value1*value2)*1/2;
			return area;
		}
		
		
	}	
}