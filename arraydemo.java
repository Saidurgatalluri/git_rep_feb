package arraydemo;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
      //product pro=new product(10,"sai",950000);
      //product pro1=new product(20,"saini",650000);
      //product pro2=new product(30,"saina",850000);
	
      product[] p=new product[3];
      p[0]=new product(10,"sai",350000);
      p[1]=new product(20,"saini",650000);
      p[2]=new product(30,"saina",850000);
      
      for(int i=0;i<p.length;i++)
      {
    	  System.out.println("address "+p[i]);
    	  System.out.println("id is: "+p[i].a+" name is: "+p[i].b+" price is: "+p[i].c);;
      }
      
	}

}
class product
{
	int a;
	String b;
    double c;
	product(int a,String b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
