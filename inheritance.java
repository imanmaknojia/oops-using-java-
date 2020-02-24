class Flower
{
	private String name;
	private String color;
	private String fragrance;
	public Flower(String na,String col,String frag)
	{
	 name=na;
	 color=col;
	 fragrance=frag;
	}
	public String getName()
	{
	 return name;
	}
	public String getColor()
	{
	 return color;
	}
	public String getFrag()
	{
	 return fragrance;
	}
}
class Sunflower extends Flower
{
	private int buds;
	public Sunflower(String na,String col, String frag, int buds)
	{
	 super(na,col,frag);
	 this.buds=buds;
	}
	public int getbuds()
	{
	 return buds;
	}
}
class Test
{
public static void main(String args[])
{
Sunflower s= new Sunflower("sunflower","yellow","sweet",5);
System.out.println("the name of the flower is "+ s.getName());
System.out.println("The color of "+s.getName()+"is "+ s.getColor());
System.out.println("The fragrance is pleasantly "+ s.getFrag());
System.out.println(" and the number of buds are "+ s.getbuds());
}
}
 
 
