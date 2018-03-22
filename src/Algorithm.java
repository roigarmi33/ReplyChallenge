import java.util.ArrayList;

public class Algorithm {

	public static Output FIFO(InputReader input) {

		Output output = new Output();

		int totalServices = input.getTotalServices();
		int totalRegionalProviders = input.getTotalRegionalProviders();
		ArrayList<Provider> providers = input.getProviders();
		ArrayList<Project> projects = input.getProjects();
		int regionalProviderIndex;

		for (Project project : projects) {

            int[] servicesUnitsNeeded = project.getServicesUnitsNeeded();
            ProjectSupplies projectSupplies = new ProjectSupplies();

            for (int i = 0; i < totalServices; i++) {

                for (Provider provider : providers) {

                    for (RegionalProvider regionalProvider : provider.getRegionalProviders()) {

                        if (regionalProvider.isServiceAvailable(i)) {
                            SingleProjectSupply singleProjectSupply = new SingleProjectSupply(provider.getIndex(), regionalProvider.getIndex(), 0);

                            while (regionalProvider.isServiceAvailable(i) && servicesUnitsNeeded[i] > 0) {

                                int[] serviceUnitsPerPackage = regionalProvider.getServiceUnitsPerPackage();

                                for (int j = 0; j < totalServices; j++) {
                                    servicesUnitsNeeded[j] -= serviceUnitsPerPackage[j];
                                }

                                regionalProvider.setTotalPackagesAvailable(regionalProvider.getTotalPackagesAvailable() - 1);

                                singleProjectSupply.addPackageUnitsNumber(1);
                            }
                            projectSupplies.addSingleProjectSupply(singleProjectSupply);
                        }
                    }
                }
            }
            output.addProjectSupplies(projectSupplies);
        }


		return output;
	}
}
