
public class CalculateMVC {
     public static void main(String args[]) {
        CalView cView = new CalView();
        CalModel cModel = new CalModel();
        CalController cControll =  new CalController(cView,cModel);
        
        //cView.setVisible(true);
    } 
    
}
