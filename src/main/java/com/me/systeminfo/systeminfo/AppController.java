package com.me.systeminfo.systeminfo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    @FXML
    private Label os_name, os_arch, os_version, user_name, user_home;

    public void set_os_name() {
        String getCurrentText = os_name.getText();
        os_name.setText(getCurrentText + System.getProperty("os.name"));
    }

    public void set_os_arch() {
        String getCurrentText = os_arch.getText();
        os_arch.setText(getCurrentText + System.getProperty("os.arch"));
    }

    public void set_os_version() {
        String getCurrentText = os_version.getText();
        os_version.setText(getCurrentText + System.getProperty("os.version"));
    }

    public void set_user_name() {
        String getCurrentText = user_name.getText();
        user_name.setText(getCurrentText + System.getProperty("user.name"));
    }

    public void set_user_home() {
        String getCurrentText = user_home.getText();
        user_home.setText(getCurrentText + System.getProperty("user.home"));
    }

    public void initialize(){
        set_os_name();
        set_os_arch();
        set_os_version();
        set_user_name();
        set_user_home();
    }
}