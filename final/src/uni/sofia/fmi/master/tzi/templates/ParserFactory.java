package uni.sofia.fmi.master.tzi.templates;

import java.io.File;

public class ParserFactory {

	public static TemplateParser getParser(File selectedFile) throws TemplateCannotBeParsed{
		if(selectedFile == null){
			throw new IllegalArgumentException("Null argument passed");
		}
		
		String extention = extensionOfFile(selectedFile);
		if(extention.equalsIgnoreCase(".json")){
			return new JSONTemplate(selectedFile);
		}
		
		if(extention.equalsIgnoreCase(".yaml") || extention.equalsIgnoreCase(".yml")){
			return new YMLTemplate(selectedFile);
		}
		
		throw new TemplateCannotBeParsed("Template parser for file extension " + extention + " is not supported." );
	}
	
	private static String extensionOfFile(File selectedFile) {
		int lastDotPosition = selectedFile.getName().lastIndexOf('.');
		return selectedFile.getName().substring(lastDotPosition);
	}
}