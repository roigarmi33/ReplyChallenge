public class SingleProjectSupply {

    private int providerIndex;
    private int regionalProviderIndex;
    private int packageUnitsNumber;

    public void setProviderIndex(String line) {
        providerIndex = 0;
        regionalProviderIndex = 0;
        packageUnitsNumber = 0;
    }

    public int getProviderIndex() {
        return providerIndex;
    }

    public void setProviderIndex(int providerIndex) {
        this.providerIndex = providerIndex;
    }


    public int getRegionalProviderIndex() {
        return regionalProviderIndex;
    }

    public void setRegionalProviderIndex(int regionalProviderIndex) {
        this.regionalProviderIndex = regionalProviderIndex;
    }


    public int getPackageUnitsNumber() {
        return packageUnitsNumber;
    }

    public void setPackageUnitsNumber(int packageUnitsNumber) {
        this.packageUnitsNumber = packageUnitsNumber;
    }

}