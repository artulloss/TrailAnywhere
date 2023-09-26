package com.trailanywhere.enterprise.service;

import com.trailanywhere.enterprise.dto.Alert;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IAlertService {
    /**
     * Fetch all alerts
     * @return - list of alerts
     */
    ArrayList<Alert> fetchAllAlerts();

    /**
     * Add an alert
     * @param alert - new alert
     */
    void addAlert(Alert alert);
}
