package uni.sofia.fmi.master.tzi.templates;

public class TemplateCannotBeParsed extends Exception {
	private static final long serialVersionUID = 1L;

	public TemplateCannotBeParsed(){
		super();
	}
	
	public TemplateCannotBeParsed(String message){
		super(message);
	}
}