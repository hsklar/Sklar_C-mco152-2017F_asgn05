
public abstract class DecoratorTag extends Tag{
 
	 Tag concreteTag;
	 
	 //this method was not made abstract because many decorator tags will utilize it. it does
	 //not work for all decorator tags, and therefore those will need to specify their own
	 public String getTag(){
		 return "<"+tag+">"+concreteTag.getTag()+"</"+tag+">";
	 }
	 
}
