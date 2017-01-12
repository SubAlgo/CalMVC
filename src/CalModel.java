
public class CalModel {
   // private float day;
    //private float msave;
    
    private float sum;
    
    public void calculate(float day, float money){
        sum = ((day*money)+money)*(day/2);
    }
    
    public float getcalculationValue(){
        return sum;
    }
    
}
