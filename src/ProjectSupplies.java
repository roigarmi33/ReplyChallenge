import java.util.Vector;

public class ProjectSupplies {

	private Vector<SingleProjectSupply> suppliesPerProvider;

	public ProjectSupplies() {
		this.suppliesPerProvider = new Vector<>();
	}


	public void addSingleProjectSupply(SingleProjectSupply singleProjectSupply) {
		if (singleProjectSupply.getPackageUnitsNumber() != 0) {
			this.suppliesPerProvider.add(singleProjectSupply);
		}
	}

	public SingleProjectSupply getSingleSupplieFromProvider(int index) {
		return this.suppliesPerProvider.get(index);
	}


	public String getAllSuppliesPerRegionalProviderToString(){
		String line = "";

		for (SingleProjectSupply sPS : suppliesPerProvider){
			line = concatenateSupplieToString(line, sPS);
		}

		return reformatString(line); // can be empty
	}

	private String concatenateSupplieToString(String line, SingleProjectSupply singleProjectSupply) {
		return line + singleProjectSupply.toString() + " ";
	}


	/**
	 * removes first space and/or last space
	 * @MODIFY line only if it's not empty
	 *
	 * @return string without space at the start or at the end
	 * @return empty string if input line is empty
	 */
	private String reformatString(String line) {
		if (line.isEmpty()) {
			return line;
		}
		if (isSpaceAtTheStart(line)) {
			line = removeSpaceAtTheStart(line);
		}
		if (isSpaceAtTheEnd(line)) {
			line = removeSpaceAtTheEnd(line);
		}
		return line;
	}

	private boolean isSpaceAtTheStart(String line) {
		return line.charAt(0) == ' ';
	}

	private boolean isSpaceAtTheEnd(String line) {
		return line.charAt(line.length() - 1) == ' ';
	}

	private String removeSpaceAtTheEnd(String line) {
		return line.substring(1);
	}

	private String removeSpaceAtTheStart(String line){
		return line.substring(0, line.length()-1);
	}

}
