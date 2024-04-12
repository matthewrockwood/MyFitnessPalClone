module com.example.piiproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piiproject to javafx.fxml;
    exports com.example.piiproject;
    exports com.example.piiproject.protein;
    opens com.example.piiproject.protein to javafx.fxml;
    exports com.example.piiproject.Fat_Misc;
    opens com.example.piiproject.Fat_Misc to javafx.fxml;
    exports com.example.piiproject.Controller;
    opens com.example.piiproject.Controller to javafx.fxml;
}