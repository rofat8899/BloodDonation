/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rofat.blooddonation.Class;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rofat
 */
public class GlobalFuntions {
    private final String[] fields;
    private Map<String, Object> obj = new HashMap<>();

    public GlobalFuntions(String[] fields) {
        this.fields = fields;
    }

    public void setObject(Map<String, Object> obj) {

        this.obj.putAll(obj);
    }

    public void checkAndAssignValueToTF(JTextField tf, String str) {
        if (null == obj.get(str)) {
            tf.setText(str);
        } else if ("".equals(obj.get(str))) {
            tf.setText(str);
        } else if (str.equals(obj.get(str))) {
            tf.setText(str);
        } else {
            tf.setText((String) obj.get(str));
        }
    }

    public void checkAndAssignValueToCB(JComboBox cb, String str) {
        if (null == obj.get(str)) {
            cb.setSelectedItem(str);
        } else if (str.equals(obj.get(str))) {
            cb.setSelectedItem(str);
        } else {
            cb.setSelectedItem(obj.get(str));
        }
    }

    public void clearTextBox(JTextField tf) {
        for (String each : fields) {
            if (each.equals(tf.getText())) {
                tf.setText("");
            }
            tf.setForeground(Color.BLACK);
        }
    }

    public void setForeColor(JTextField tf) {

        for (String each : fields) {
            if (each.equals(tf.getText())) {
                tf.setForeground(Color.GRAY);
                break;
            } else {
                tf.setForeground(Color.BLACK);
            }
        }
    }
}
