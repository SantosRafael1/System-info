module com.me.systeminfo.systeminfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.management;


    opens com.me.systeminfo.systeminfo to javafx.fxml;
    exports com.me.systeminfo.systeminfo;
}