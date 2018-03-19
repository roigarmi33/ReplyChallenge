import java.util.ArrayList;

public class Provider {

    private String providerName;
    private int totalProviderRegions = 0;
    private ArrayList<RegionalProvider> regionalProviders;
    private int index;


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

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean isServiceAvailable(int serviceIndex) {
		for (RegionalProvider rp : regionalProviders) {
			if (rp.isServiceAvailable(serviceIndex)) {
				return true;
			}
		}
		return false;
	}
	
	public int getWhereServiceAvailable(int serviceIndex) {
		for (RegionalProvider rp : regionalProviders) {
			if (rp.isServiceAvailable(serviceIndex)) {
				return rp.getIndex();
			}
		}
		return -1;
	}

}