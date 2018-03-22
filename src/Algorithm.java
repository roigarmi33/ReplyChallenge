import java.util.ArrayList;

public class Algorithm {

	
	public static Output FIFO(InputReader input) {

		Output output = new Output();

		int totalServices = input.getTotalServices();
		int totalRegionalProviders = input.getTotalRegionalProviders();
		ArrayList<Provider> providers = input.getProviders();
		ArrayList<Project> projects = input.getProjects();

		int providerIndex = 0;
		int regionIndex = 0;
		int k=0; // TODO refactor this maybe there's a better way

		for (Project project : projects){

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

						regional.setTotalPackagesAvailable( regional.getTotalPackagesAvailable() -1 );

						projectSupplies.getSingleSupplieFromProvider(k);

						if (projectSupplies.getSingleSupplieFromProvider(k)[0] == providerIndex){
							if (projectSupplies.getSingleSupplieFromProvider(k)[1] == regionIndex){
								projectSupplies.getSingleSupplieFromProvider(k)[2] += 1;
								projectSupplies.setSingleSupplieFromProvider(k, projectSupplies.getSingleSupplieFromProvider(k));
							} else { // regionalProvider is different
								k++;
								projectSupplies.getSingleSupplieFromProvider(k)[1] = regionIndex;
								projectSupplies.getSingleSupplieFromProvider(k)[2] = 1;
								projectSupplies.setSingleSupplieFromProvider(k, projectSupplies.getSingleSupplieFromProvider(k));
							}
						} else { // providerIndex is different
							k++;
							projectSupplies.getSingleSupplieFromProvider(k)[0] = providerIndex;
							projectSupplies.getSingleSupplieFromProvider(k)[1] = regionIndex;
							projectSupplies.getSingleSupplieFromProvider(k)[2] = 1;
							projectSupplies.setSingleSupplieFromProvider(k, projectSupplies.getSingleSupplieFromProvider(k));

						}
					}
					providerIndex++;
				}
			}

			output.addProjectSupplies(projectSupplies);
			providerIndex = 0;
			regionIndex = 0;
			k=0;
		}

		return output;
	}
}
