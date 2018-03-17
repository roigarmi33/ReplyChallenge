import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Output {

	private ArrayList<ProjectSupplies> projectsSupplies;
	
	public Output() {
		this.projectsSupplies = new ArrayList<ProjectSupplies>();
	}
	
	public void setProjectsSupplies(ArrayList<ProjectSupplies> projectsSupplies) {
		this.projectsSupplies = projectsSupplies;
	}
	
	public void addProjectSupplies(ProjectSupplies projectSupplies) {
		this.projectsSupplies.add(projectSupplies);
	}

	public ArrayList<ProjectSupplies> getProjectsSupplies() {
		return projectsSupplies;
	}
	
	public void print(String pathToOutputFile) throws IOException {
		List<String> lines = new ArrayList<String>();
		for (ProjectSupplies p : projectsSupplies) {
			lines.add(readArrayIntReturnLine(p.getSuppliesPerRegionalProvider()));
		}
		
		Charset utf8 = StandardCharsets.UTF_8;
		try {
		    //Files.write(Paths.get("file5.txt"), lines, utf8);
		    Files.write(Paths.get(pathToOutputFile), lines, utf8,
		            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

    
	private String readArrayIntReturnLine(int[] arr) {
        String line = "";
        line += arr[0];
        for (int i=1; i<arr.length; i++){
            line = line + " " + arr[i];
        }

        return line;
    }
	
	
}
