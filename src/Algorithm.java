import java.util.ArrayList;

public class Algorithm {

	public static Output FIFO(InputReader input) {
		
		Output output = new Output();
		
		int totalServices = input.totalServices;
		int totalRegionalProviders = input.totalRegionalProviders;
		ArrayList<Provider> providers = input.getProviders();
		ArrayList<Project> projects = input.getProjects();
		int providerIndex = 0;
		int regionIndex = 0;
		
		for (Project project : projects) {
			
			int[] servicesUnitsNeeded = project.getServicesUnitsNeeded();
			ProjectSupplies projectSupplies = new ProjectSupplies(totalRegionalProviders);
			
			for (int i=0; i<totalServices; i++) {
					for (Provider provider : providers) {
						while (provider.isServiceAvailable(i) && servicesUnitsNeeded[i] > 0) {
							regionIndex = provider.getWhereServiceAvailable(i);
							RegionalProvider regional = provider.getRegionalProviders().get(regionIndex);
							int[] serviceUnitsPerPackage = regional.getServiceUnitsPerPackage();
							for (int j=0; j<totalServices; j++) {
								servicesUnitsNeeded[j] -= serviceUnitsPerPackage[j];
							}
							int n = regional.getTotalPackagesAvailable();
							n -= 1;
							regional.setTotalPackagesAvailable(n);
							projectSupplies.suppliesPerRegionalProvider[providerIndex + regionIndex] += 1;
						}
						providerIndex += provider.getTotalProviderRegions();
					}
					providerIndex = 0;
			}
			
			output.addProjectSupplies(projectSupplies);
		}
		
		
		return output;
	}
}
