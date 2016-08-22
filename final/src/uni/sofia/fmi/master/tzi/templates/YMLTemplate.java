package uni.sofia.fmi.master.tzi.templates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class YMLTemplate implements TemplateParser{
	
	private File templateSample = null;
	private StringBuffer template = new StringBuffer();
	
	public YMLTemplate(File f){
		templateSample = f;
	}
	
	public void parseTemplate() throws TemplateCannotBeParsed{
		if(templateSample == null || !templateSample.isFile()){
			throw new TemplateCannotBeParsed("Template cannot be extracted from file: " + templateSample);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(templateSample))) {
			int columnIndex = 0;
			template.append("---").append(System.lineSeparator());
		    for(String line; (line = br.readLine()) != null; ) {
		        columnIndex = line.indexOf(":");
		        if(columnIndex > -1){
		        	template.append(line.substring(0, columnIndex + 1));
		        	template.append(System.lineSeparator());
		        }
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getParsedTemplate(){
		return template.toString();
	}
}
