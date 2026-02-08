public class p{
	public static void main(String [] args){
		Child c=new Child();
		System.out.print(c.j);
	}
}
class Parent{
	int i;
	Parent(int i){
		this.i=i;
	}
}
class Child extends Parent{
	 Child(){
	    super(5);
	}
		int j=6;

}
