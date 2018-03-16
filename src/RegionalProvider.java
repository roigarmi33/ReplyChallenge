public class RegionalProvider {

    private String region;

    private int totalNumberOfPackeges;
    private float packageUnitCost;
    private int[] servicesAvailable;
    private int[] countriesLatency;

    public RegionalProvider(String location, int S, int C){

        this.region = location;
        servicesAvailable = new int[S];
        countriesLatency = new int[C];

    }


    public void setServicesAvailable(int[] arr){
        for (int i=0; i<arr.length;  i++){
            this.servicesAvailable[i] = arr[i];
        }
    }

    public void setCountriesLatency(int[] arr){
        for (int i=0; i<arr.length; i++){
            this.countriesLatency[i] = arr[i];
        }
    }

    public int getTotalNumberOfPackeges() {
        return totalNumberOfPackeges;
    }

    public void setTotalNumberOfPackeges(int totalNumberOfPackeges) {
        this.totalNumberOfPackeges = totalNumberOfPackeges;
    }

    public float getPackageUnitCost() {
        return packageUnitCost;
    }

    public void setPackageUnitCost(float packageUnitCost) {
        this.packageUnitCost = packageUnitCost;
    }

}