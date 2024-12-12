module com.example.myproteine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myproteine to javafx.fxml;
    exports com.example.myproteine;
}