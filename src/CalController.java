
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalController {

    private CalView cView;
    private CalModel cModel;
    
    //---Constructor Method สำหรับกำหนดค่าเริ่มต้น---
    public CalController(CalView cView,CalModel cModel){
        this.cView = cView;
        this.cModel = cModel;
        
        this.cView.btnEvetn(new CalculationListener());
        
    }
    
    class CalculationListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            float day,money;
              
            try{
              day = cView.getday();
              money = cView.getmoney();
              
              cModel.calculate(day, money);
              
              cView.setsum(cModel.getcalculationValue());
              
            }catch(NumberFormatException ex){
                System.out.println(ex);
                cView.displayErrorMessage("You need to enter 2 Integer");
            }

        }
        
    }

    
}
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
