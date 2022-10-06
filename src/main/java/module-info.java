module com.me.systeminfo.systeminfo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.me.systeminfo.systeminfo to javafx.fxml;
    exports com.me.systeminfo.systeminfo;
}