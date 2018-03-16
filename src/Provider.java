import java.util.ArrayList;

public class Provider {

    String name;
    private int n=0; // indica il numero delle regioni
    private ArrayList<RegionalProvider> regionalProviders;

    public Provider(String line){

        name = line.split(" ")[0];
        n = Integer.parseInt( line.split(" ")[1] );
        regionalProviders = new ArrayList<RegionalProvider>();
    }

    public void addRegionalProvider(RegionalProvider new_region){
        this.regionalProviders.add(new_region);
    }

    public int getN(){
        return this.n;
    }


}