/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ProjectUAS;

/**
 *
 * @author Andakara
 */
public class UserSession {
    private static String role;
    private static Boolean isCreateOrder;
    private static Boolean isIsOrderCompleted;
    public static void setRole(String roleValue) {
        role = roleValue;
    }
    
    public static String getRole() {
        return role;
    }    
    
    public static void setIsCreateOrder(Boolean isCreateCustValue) {
        isCreateOrder = isCreateCustValue;
    }

    public static Boolean getIsCreateOrder() {
        return isCreateOrder;
    }
    
    public static void setIsOrderCompleted(Boolean isCreateCustValue) {
        isCreateOrder = isCreateCustValue;
    }

    public static Boolean getIsOrderCompleted() {
        return isCreateOrder;
    }
    
    
}