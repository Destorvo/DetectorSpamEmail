module com.project.detectorspamemail {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.detectorspamemail to javafx.fxml;
    exports com.project.detectorspamemail;
}