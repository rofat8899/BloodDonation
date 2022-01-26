/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rofat.blooddonation.Class;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rofat.blooddonation.Login;
import dto.BloodRequest;
import dto.Inbox;
import dto.User;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author rofat
 */
public class Api {
    //** for Login
    public String validateUser(String email, String password) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(
                "http://localhost:8080/user/login");

        StringEntity input = null;
        try {
            input = new StringEntity("{\n" + "\"email\":\"" + email + "\",\"password\":\"" + password + "\"}");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        assert input != null;
        input.setContentType("application/json");
        postRequest.setEntity(input);
        HttpResponse response1 = httpClient.execute(postRequest);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));

        String output1;
        System.out.println("Output from Server .... \n");
        while ((output1 = br1.readLine()) != null) {

            Gson g = new Gson();
            ResponseMessage rm = g.fromJson(output1, ResponseMessage.class);
            System.out.println(rm.getMessage());
            return rm.getMessage();
        }
        return "";
    }

    //** for Register
    public Object Register(Map<String, Object> obj) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(
                "http://localhost:8080/user");

        StringEntity input = new StringEntity("{\n" +
                "    \"email\":\"" + obj.get("Email") + "\",\n" +
                "    \"password\":\"" + obj.get("Password") + "\",\n" +
                "    \"name\":\"" + obj.get("Full Name") + "\",\n" +
                "    \"gender\":\"" + obj.get("Gender") + "\",\n" +
                "    \"age\":\"" + obj.get("Date of Birth") + "\",\n" +
                "    \"bloodType\":\"" + obj.get("Blood Type") + "\",\n" +
                "    \"userType\":\"" + obj.get("User Type") + "\",\n" +
                "    \"address\": {\n" +
                "            \"village\": \"" + obj.get("Village") + "\",\n" +
                "            \"commune\": \"" + obj.get("Commune") + "\",\n" +
                "            \"district\": \"" + obj.get("District") + "\",\n" +
                "            \"province\": \"" + obj.get("Province") + "\",\n" +
                "            \"streetNumber\":\"" + obj.get("Street No") + "\"  \n" +
                "        },\n" +
                "    \"contact\": {\n" +
                "                \"phoneNumber\": \"" + obj.get("Phone Number 1") + "\",\n" +
                "                \"email\": \"" + obj.get("Email Address") + "\",\n" +
                "                \"facebook_telegram\":\"" + obj.get("Facebook (Optional)") + "\"\n" +
                "        }\n" +
                "}");

        input.setContentType("application/json");
        postRequest.setEntity(input);
        HttpResponse response1 = httpClient.execute(postRequest);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));

        String output1;
        System.out.println("Output from Server .... \n");
        while ((output1 = br1.readLine()) != null) {

            Gson g = new Gson();
            Object rm = g.fromJson(output1, Object.class);
            System.out.println(rm.toString());
            return rm;
        }
        return "";
    }

    public User getUser(String email) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet Request = new HttpGet(
                "http://localhost:8080/user/" + email + "");

        HttpResponse response1 = httpClient.execute(Request);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));

        String output1;
        System.out.println("Output from Server .... \n");
        while ((output1 = br1.readLine()) != null) {

            Gson g = new Gson();
            return g.fromJson(output1, User.class);
        }
        return null;
    }

    public List<BloodRequest> getRequests() throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet Request = new HttpGet(
                "http://localhost:8080/blood/request/pending");

        HttpResponse response1 = httpClient.execute(Request);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));
        String output1;
        while (( output1 = br1.readLine()) != null) {
            Gson g = new Gson();
            Type BloodRequestListType = new TypeToken<ArrayList<BloodRequest>>() {
            }.getType();
            ArrayList<BloodRequest> bloodReq = g.fromJson(output1, BloodRequestListType);
            //System.out.println(bloodReq.toString());
            return bloodReq;
        }
        return null;
    }
    public List<Inbox> getInbox(String email) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet Request = new HttpGet(
                "http://localhost:8080/user/inbox/"+email);

        HttpResponse response1 = httpClient.execute(Request);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));
        String output1;
        while ((output1 = br1.readLine()) != null) {
            Gson g = new Gson();
            Type Type = new TypeToken<ArrayList<Inbox>>() {
            }.getType();
            ArrayList<Inbox> result = g.fromJson(output1, Type);
            return result;
        }
        return null;
    }
 public Object AddPendingDonate(Map<String, Object> obj) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(
                "http://localhost:8080/user/donation");

        StringEntity input = new StringEntity("{\n" + "\"donorEmail\":\"" + obj.get("Email") + "\",\"availableDate\":\"" + obj.get("AvailableDate") + "\"}");

        input.setContentType("application/json");
        postRequest.setEntity(input);
        HttpResponse response1 = httpClient.execute(postRequest);
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));

        String output1;
        System.out.println("Output from Server .... \n");
        while ((output1 = br1.readLine()) != null) {

            Gson g = new Gson();
            Object rm = g.fromJson(output1, Object.class);
            System.out.println(rm.toString());
            return rm;
        }
        return "";
    }
}
