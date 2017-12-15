
public abstract class Tag {

	String id;
	String name;
	String text;
	String tag;
	
	public void setId(String id){
		if (this.getClass().getSuperclass() != Tag.class){
			throw new UnsupportedOperationException();
		}
		this.id = id;
	}
	
	public void setName(String name){
		if (this.getClass().getSuperclass() != Tag.class){
			throw new UnsupportedOperationException();
		}
		this.name=name;
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
