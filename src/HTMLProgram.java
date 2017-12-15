
public class HTMLProgram {

	public static void main (String[]args){
		HTag head=new HTag("Headers get your point across", 4);
		head.setId("head");
		head.setName("aboutus");
		InputTag input=new InputTag();
		input.setType("button");
		input.setValue("Click on input tag");
		input.setEvent("onclick=\"Huh?\"");
		DivTag div=new DivTag("divs keep things organized");
		PTag p=new PTag("p are great for lots of info");
		p.setId("id");
		p.setName("veryOriginalName");

		ITag i=new ITag(head);
		ATag link=new ATag(i);
		link.setHref("http://www.touro.edu");
		System.out.println(link.getTag());

		UTag u=new UTag(div);
		StrongTag strong=new StrongTag(u);
		System.out.println(strong.getTag());

		EmTag em= new EmTag(p);
		System.out.println(em.getTag());

		SmallTag small=new SmallTag(input);
		System.out.println(small.getTag());
	}
}
