import java.util.ArrayList;

public class Provider {

    private String providerName;
    private int totalProviderRegions = 0;
    private ArrayList<RegionalProvider> regionalProviders;

    public Provider(){
    	this.providerName = "Ghost Provider";
    }

    public Provider(String providerName, int totalProviderRegions){
    	this.setProviderName(providerName);
    	this.setTotalProviderRegions(totalProviderRegions);
        this.regionalProviders = new ArrayList<RegionalProvider>();
    }

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public int getTotalProviderRegions() {
		return totalProviderRegions;
	}

	public void setTotalProviderRegions(int totalProviderRegions) {
		this.totalProviderRegions = totalProviderRegions;
	}

	public ArrayList<RegionalProvider> getRegionalProviders() {
		return regionalProviders;
	}

	public void setRegionalProviders(ArrayList<RegionalProvider> regionalProviders) {
		this.regionalProviders = regionalProviders;
	}

	public void addRegionalProvider(RegionalProvider regionalProvider){
		this.regionalProviders.add(regionalProvider);
    }


}