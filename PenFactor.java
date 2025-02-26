package ders;

public class PenFactor {

	public static void main(String[] args) {
	 Pen firstpen =new Pen();
	 String message="First pen producted";
	 firstpen.color="black";
	 firstpen.height=12;
	 firstpen.Writemassage(message);
		
	 Pen secondpen =new Pen();
	 String message1="Second pen producted";
	 secondpen.color="purple";
	 secondpen.height=19;
	 secondpen.Writemassage(message1);
System.out.println("Firstpen color: " +firstpen.color+"firstpen hight: "+firstpen.height+ "+ secondpen color:"  +secondpen.color+"secondpen hight: "+secondpen.height );

	}

}
