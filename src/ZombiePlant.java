public class ZombiePlant{
    private int potency;
    private int treatments;
    public ZombiePlant(int potency, int treatments){
        this.potency=potency;
        this.treatments=treatments;
    }
    public int getPotency(){

        return potency;
    }
    public int treatmentsNeeded(){

        return treatments;
    }
    public boolean isDangerous(){
        if(treatments>0){
            return true;
        }
        return false;
    }
    public void treat(int p){
        int t=treatments;
        if(p<=potency&&p>0&&t>0) {
            treatments--;
        }
        if(p>potency){
            treatments++;
        }

    }
}
