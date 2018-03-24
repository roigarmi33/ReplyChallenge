import java.io.*;
import java.util.*;

public class InputReader {

    /**
     * 1 < 20
     */
    private int totalProviders = 0;

    /**
     * 1 < 500
     */
    private int totalServices = 0;

    /**
     * 1 < 20
     */
    private int totalCountries = 0;

    /**
     * 1 < 100,000
     */
    private int totalProjects = 0;


    private String[] servicesNames;
    private String[] countriesNames;
    private ArrayList<Provider> providers;
    private int totalRegionalProviders = 0;
    private ArrayList<Project> projects;

    public InputReader(String pathToInputFile) throws Exception {
        try{
            readInput(pathToInputFile);
        } catch (Exception e){
            System.out.format("The file does not exists...");
        }
    }

    private void readInput(String pathToInputFile) throws IOException {
        
    	FileReader fileReader = new FileReader(pathToInputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int[] VSCP = readLineReturnArrayInt(bufferedReader.readLine());
        totalProviders = VSCP[0];
        totalServices = VSCP[1];
        totalCountries = VSCP[2];
        totalProjects = VSCP[3];
        servicesNames = bufferedReader.readLine().split(" ");
        countriesNames = bufferedReader.readLine().split(" ");
        providers = new ArrayList<Provider>(totalProviders);
        projects = new ArrayList<Project>(totalProjects);

        setProviders(bufferedReader, totalProviders);
        setProjects(bufferedReader, totalProjects, totalServices);

        //bufferedReader.close();
    }

    private void setProviders(BufferedReader bufferedReader, int totalProviders) throws IOException {
    	
        String line;
        String providerName;
        int totalProviderRegions;

        for(int j = 0; j<totalProviders; j++){

        	line = bufferedReader.readLine();

        	providerName = line.split(" ")[0];

            totalProviderRegions = Integer.parseInt( line.split(" ")[1] );
            totalRegionalProviders += totalProviderRegions;

            Provider provider = new Provider(providerName, totalProviderRegions);
        	provider.setIndex(j);

            addRegionsToProvider(bufferedReader, totalProviderRegions, provider);

            providers.add(provider);

        }
    }

    private void addRegionsToProvider(BufferedReader bufferedReader, int totalProviderRegions, Provider provider) throws IOException {

        for (int i = 0; i<totalProviderRegions; i++){

            RegionalProvider regionalProvider = createRegionalProvider(bufferedReader, i);
            provider.addRegionalProvider(regionalProvider);
        }
    }

    private RegionalProvider createRegionalProvider(BufferedReader bufferedReader, int i) throws IOException {

        String region = bufferedReader.readLine();
        RegionalProvider regionalProvider = new RegionalProvider(region, i);


        String line = bufferedReader.readLine();
        regionalProvider.setTotalPackagesAvailable(Integer.parseInt(line.split(" ")[0]));
        regionalProvider.setPackageUnitCost(Float.parseFloat(line.split(" ")[1]));
        regionalProvider.setServiceUnitsPerPackage(splitServiceStringToArray(line));


        line = bufferedReader.readLine();
        regionalProvider.setCountriesLatency(readLineReturnArrayInt(line));

        return regionalProvider;
    }




    private int[] splitServiceStringToArray(String line) {
        int[] tempArr = new int[totalServices];
        for(int k=0; k<totalServices; k++){
            tempArr[k] = Integer.parseInt(line.split(" ")[k+2]);
        }
        return tempArr;
    }

    private void setProjects(BufferedReader bufferedReader, int totalProjects, int totalServices) throws IOException {
        
    	String line;

        for (int j = 0; j < totalProjects; j++) {
        	
            line = bufferedReader.readLine();
            String[] arr = line.split(" ");
            
            int penalty = Integer.parseInt(arr[0]);

            String countriesName = arr[1];

            int[] servicesUnitsNeeded = new int[totalServices];
            int k = 0;
            for (int i=2; i<arr.length; i++) {
                servicesUnitsNeeded[k++] = Integer.parseInt(arr[i]);
            }

            projects.add(new Project(penalty, countriesName, servicesUnitsNeeded));
        }
    }

    private int[] readLineReturnArrayInt(String line) {
        String[] arr1 = line.split(" ");
        int[] numArray = new int[arr1.length];
        int k=0;
        for (String s : arr1) {
            numArray[k++] = Integer.parseInt(s);
        }

        return numArray;
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

	public int getTotalRegionalProviders() {
		return totalRegionalProviders;
	}


    public int getTotalProviders() {
        return totalProviders;
    }

    public int getTotalServices() {
        return totalServices;
    }

    public int getTotalCountries() {
        return totalCountries;
    }

    public int getTotalProjects() {
        return totalProjects;
    }


}