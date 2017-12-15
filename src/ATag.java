
public class ATag extends DecoratorTag{

	private String href;
	
	public ATag(Tag t){
		this.concreteTag=t;
		tag="a";
		href="";
	}
	
	public void setHref(String link){
		href="href="+"\""+link+"\"";
	}
	
	public String getTag(){
		return "<"+tag+" "+href+">"+concreteTag.getTag()+"</"+tag+">";
	}
}
