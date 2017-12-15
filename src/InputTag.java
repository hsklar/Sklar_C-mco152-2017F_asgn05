
public class InputTag extends Tag{

	private String type;
	private String event;
	private String value;
	
	public InputTag(){
		tag="input";
		type=null;
		event=null;
		value=null;	
		name=null;
		id=null;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	public void setEvent(String event){
		this.event=event;
	}
	
	public void setValue(String value){
		this.value=value;
	}

	public String getTag(){
		StringBuilder info=new StringBuilder("<input");
		if(type != null){
			info.append(" type=\""+ type+"\"");
		}
		if (value !=null){
			info.append(" value=\""+value+"\"");
		}
		if (event != null){	
			info.append(" "+event);
		}
		info.append("></input>");
		return info.toString();
	}
}

