package uni.sofia.fmi.master.tzi.templates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONTemplate implements TemplateParser{

	private File templateSample = null;
	private StringBuffer template = new StringBuffer();
	
	public JSONTemplate(File f) {
		templateSample = f;
	}
	
	public void parseTemplate() throws TemplateCannotBeParsed {
		if(templateSample == null || !templateSample.isFile()){
			throw new TemplateCannotBeParsed("Template cannot be extracted from file: " + templateSample);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(templateSample))) {
			int columnIndex = 0;
		    for(String line; (line = br.readLine()) != null; ) {
		    	columnIndex = line.indexOf(":");
		    	if(columnIndex == -1 && !line.contains("\"")){
		    		template.append(line).append(System.lineSeparator());
		    	}else{
		    	 	template.append(line.substring(0, columnIndex + 1));
		    	 	String valuePart = line.substring(columnIndex + 1);
		    	 	if(valuePart.contains("\"")){
		    	 		if(!valuePart.endsWith("\"")){
		    	 			template.append(valuePart.substring(valuePart.lastIndexOf("\"") + 1));
		    	 		}
		    	 	}else{
		    	 		template.append(valuePart);
		    	 	}
			    	template.append(System.lineSeparator());
		    	}
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getParsedTemplate() {
		return template.toString();
	}
}