package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import net.sf.jasperreports.engine.JRException;

public class GradoviController {



    public void stampajGradove(ActionEvent actionEvent) {
        try {
            new PrintReport().showReport(GeografijaDAO.getConn());
        } catch (JRException e1) {
            e1.printStackTrace();
        }
    }
}
