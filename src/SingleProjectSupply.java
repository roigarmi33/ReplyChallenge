public class SingleProjectSupply {

    private int providerIndex;
    private int regionalProviderIndex;
    private int packageUnitsNumber;

    public SingleProjectSupply() {
        this.providerIndex = 0;
        this.regionalProviderIndex = 0;
        this.packageUnitsNumber = 0;
    }

    public SingleProjectSupply(int providerIndex, int regionalProviderIndex, int packageUnitsNumber) {
        this.providerIndex = providerIndex;
        this.regionalProviderIndex = regionalProviderIndex;
        this.packageUnitsNumber = packageUnitsNumber;
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


    public String toString() {
        String line =	providerIndex + " " + regionalProviderIndex + " " + packageUnitsNumber;
        return line;
    }

    public void addPackageUnitsNumber(int units) {
        this.packageUnitsNumber += units;
    }
}