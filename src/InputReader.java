import java.io.*;
import java.util.*;

public class InputReader {

    /*
    1 ≤ V ≤ 20    number of providers
    1 ≤ S ≤ 500 the number of services
    1 ≤ Rv ≤ 100
    1 ≤ C ≤ 20   number of countries
    1 ≤ P ≤ 100000      number of projects
     */

    int[] VSCP = new int[4];
    String[] servicesNames;
    String[] countriesNames;
    ArrayList<Provider> providers;
    ArrayList<Project> projects;

    public InputReader(String pathToFile) throws Exception {
        // check file exists
        readInput(pathToFile);
    }

    private void readInput(String pathToFile) throws IOException {
        
    	FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        VSCP = readLineReturnArrayInt(bufferedReader.readLine());

        servicesNames = bufferedReader.readLine().split(" ");
        countriesNames = bufferedReader.readLine().split(" ");
        providers = new ArrayList<Provider>(VSCP[0]);
        projects = new ArrayList<Project>(VSCP[3]);

        getProviders(bufferedReader, VSCP[0]);
        getProjects(bufferedReader, VSCP[3], VSCP[1]);
    }


    private void getProviders(BufferedReader bufferedReader, int V) throws IOException {
        String line;

        for(int j = 0; j<V; j++){ //for number of providers

            line = bufferedReader.readLine();
            providers.add(new Provider(line));

            Provider tempProvider = providers.get(providers.size()-1);
            int n = tempProvider.getN();

            for (int i=0; i<n; i++){

                line = bufferedReader.readLine();
                RegionalProvider tempRegionalProvider = new RegionalProvider(line);

                line = bufferedReader.readLine();

                tempRegionalProvider.setTotalPackagesAvailable(Integer.parseInt(line.split(" ")[0]));
                tempRegionalProvider.setPackageUnitCost(Float.parseFloat(line.split(" ")[1]));

                int[] tempArr = new int[line.split(" ").length-2];
                for(int k=0; k<tempArr.length; k++){
                    tempArr[k] = Integer.parseInt(line.split(" ")[k+2]);
                }

                tempRegionalProvider.setServicePerPackage(tempArr);

                line = bufferedReader.readLine();
                tempArr = readLineReturnArrayInt(line);
                tempRegionalProvider.setCountriesLatency(tempArr);

                tempProvider.addRegionalProvider(tempRegionalProvider);
            }

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


    private void getProjects(BufferedReader bufferedReader, int P, int S) throws IOException {
        String line;

        for (int j = 0; j < P; j++) { //for number of projects

            //255000 Italy 20 0 555

            line = bufferedReader.readLine();
            String[] arr = line.split(" ");

            int penalty = Integer.parseInt(arr[0]);

            String countriesName = arr[1];

            int[] units = new int[S];
            int k = 0;
            for (int i=2; i<arr.length; i++) {
                units[k++] = Integer.parseInt(arr[i]);
            }

            projects.add(new Project(penalty, countriesName, units));
        }
    }


    public int[] getVSCP() {
        return VSCP;
    }

    public String[] getServicesNames() {
        return servicesNames;
    }

    public String[] getCountriesNames() {
        return countriesNames;
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

}