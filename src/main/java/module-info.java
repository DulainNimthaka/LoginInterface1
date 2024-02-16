module org.example.week1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.week1 to javafx.fxml;
    exports org.example.week1;
}