package QLBH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class myFunction {
    
    public static Connection getConnection() {
        String connectionUrl = "jdbc:sqlserver://giaan-mssql.database.windows.net:1433;database=doan-java-qlbh;user=giaan@giaan-mssql;password={An@951995};";
        try{
         return DriverManager.getConnection(connectionUrl);
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static String dateLongtoShort(String datetime) {
        String frDate = "yyyy-MM-dd hh:mm:ss";
        String toDate = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(frDate);
        try {
            Date date = sdf.parse(datetime);
            return String.valueOf(new SimpleDateFormat(toDate).format(date));
        } catch (Exception e) {
            return null;
        }
     }
    
    public static String dateShorttoLongto(String datetime){
        String frDate = "dd/MM/yyyy";
        String toDate = "yyyy-MM-dd  hh:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(frDate);
        try {
            Date date = sdf.parse(datetime);
            return String.valueOf(new SimpleDateFormat(toDate).format(date));
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String moneyCompact(String num){
      return new DecimalFormat("###,###.##").format(Double.valueOf(num));  
    }
    
    public static double moneytoDouble(String num){
      return Double.parseDouble(new DecimalFormat("###.##").format(Double.valueOf(num)));  
    }
    
    public static String getCurrentDate(){
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now());
    }
    
    public static boolean isVNDate(String inDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (Exception pe) {
            return false;
        }
        return true;
       }
    public static String mergeIdName(String id, String name){
        if(id==null) return "";
        return id + " - " + name;
    }
    public static String mergeIdName(String id, String name, String nuocsx){
        if(id==null) return "";
        return id + " - " + name + " - " + nuocsx;
    }
    public static String getID(String idname){
        if(idname==null) return "";
        String[] output = idname.split(" - ");
        return output[0];
    }
}