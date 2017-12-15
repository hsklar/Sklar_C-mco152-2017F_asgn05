
public class DivTag extends Tag{
	
	public DivTag(String text){
		this.text=text;
		tag="div";
		name=null;
		id=null;
	}
	
	public String getTag(){
		StringBuilder line= new StringBuilder();
		line.append("<"+ tag);
		if (this.id !=  null){
			line.append(" id="+id);
		}
		if (this.name !=  null){
			line.append(" name="+name);
		}
		line.append(">"+text+"</"+tag+">");
		return line.toString();
	}
}
