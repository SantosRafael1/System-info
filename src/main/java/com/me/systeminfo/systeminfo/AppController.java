package com.me.systeminfo.systeminfo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;

public class AppController {
    @FXML
    private Label os_name,
            os_arch,
            os_version,
            user_name,
            user_home,
            processors_cores,
            disk_size;

    String getCurrentText = "";

    public void set_os_name() {
        getCurrentText = os_name.getText();
        os_name.setText(getCurrentText + System.getProperty("os.name"));
    }

    public void set_os_arch() {
        getCurrentText = os_arch.getText();
        os_arch.setText(getCurrentText + System.getProperty("os.arch"));
    }

    public void set_os_version() {
        getCurrentText = os_version.getText();
        os_version.setText(getCurrentText + System.getProperty("os.version"));
    }

    public void set_user_name() {
        getCurrentText = user_name.getText();
        user_name.setText(getCurrentText + System.getProperty("user.name"));
    }

    public void set_user_home() {
        getCurrentText = user_home.getText();
        user_home.setText(getCurrentText + System.getProperty("user.home"));
    }

    public void processors_cores(){
        getCurrentText = processors_cores.getText();
        processors_cores.setText(getCurrentText + Runtime.getRuntime().availableProcessors());
    }

    public void disk_size(){
        getCurrentText = disk_size.getText();
        long diskSize = new File("/").getTotalSpace(); //bytes
        double sizeKB = diskSize / 1024; //kilobyte
        double sizeMB = sizeKB / 1024; //megabyte
        double sizeGB = sizeMB / 1024; //gigabyte
        //disk_size.setText(getCurrentText + sizeGB + "GB");
        disk_size.setText(String.format("%s: %.2f GB", getCurrentText, sizeGB));
    }

    public void initialize(){
        set_os_name();
        set_os_arch();
        set_os_version();
        set_user_name();
        set_user_home();
        processors_cores();
        disk_size();
    }
}