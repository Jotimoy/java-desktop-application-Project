module com.abcd.mukut1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.abcd.mukut1 to javafx.fxml;
    exports com.abcd.mukut1;
}