import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Output {

	private ArrayList<ProjectSupplies> projectsSupplies;

	public Output() {
		this.projectsSupplies = new ArrayList<ProjectSupplies>();
	}
	
	public void setProjectsSupplies(ArrayList<ProjectSupplies> projectsSupplies1) {
		this.projectsSupplies = projectsSupplies;
	}
	
	public void addProjectSupplies(ProjectSupplies projectSupplies) {
		this.projectsSupplies.add(projectSupplies);
	}

	public ArrayList<ProjectSupplies> getProjectsSupplies() {
		return projectsSupplies;
	}
	
	public void print(String pathToOutputFile) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		for (ProjectSupplies p : projectsSupplies) {
			lines.add(p.getAllSuppliesPerRegionalProviderToString());
		}
		
		Charset utf8 = StandardCharsets.UTF_8;
		try {

			Files.write(Paths.get(pathToOutputFile), lines,  utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

	
}
