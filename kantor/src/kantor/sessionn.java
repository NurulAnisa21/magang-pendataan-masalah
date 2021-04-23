/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantor;

/**
 *
 * @author Nurul AD
 */
public class sessionn {
    private static String id_log;
    public static String level;
    public static String get_Id_Log(){
        return id_log;
    }
    public static void set_Id_Log(String id_log){
        sessionn.id_log = id_log;
    }
    public static String get_Level(){
        return level;
    }
    public static void set_Level(String level){
        sessionn.level = level;
    }
}
