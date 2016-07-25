package uni.sofia.fmi.master.tzi.templates;

import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;
import uni.sofia.fmi.master.tzi.YAMLRedactor;

public class YAMLRedactorFileSystemView extends FileSystemView {

	@Override
	public File createNewFolder(File containingDir) throws IOException {
		return null;
	}

	@Override
	public File[] getRoots() {
		return new File[] { YAMLRedactor.workingDir.toFile() };
	}

	@Override
	public boolean isRoot(File file) {
		if (YAMLRedactor.workingDir.toFile().equals(file)) {
			return true;
		}
		return false;
	}
	
	@Override
	public File getHomeDirectory() {
		return YAMLRedactor.workingDir.toFile();
	}
}
