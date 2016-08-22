package uni.sofia.fmi.master.tzi.templates;

public interface TemplateParser {

	public void parseTemplate() throws TemplateCannotBeParsed;	
	public String getParsedTemplate();	
}
