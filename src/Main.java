import java.io.*;

public class Main {
    public static void main(String[] args){
        String[] value = new String[11];
        File srcFolder = new File("D://Games//src");
        File resFolder = new File("D://Games//res");
        File savegamesFolder = new File("D://Games//savegames");
        File tempFolder = new File("D://Games//temp");

        if (srcFolder.mkdir()) {
            System.out.println("SRC has been created");
            value[0] = "SRC has been created";
        }
        if (resFolder.mkdir()) {
            System.out.println("RES has been created");
            value[1] = "RES has been created";
        }
        if (savegamesFolder.mkdir()){
            System.out.println("SAVEGAMES has been created");
            value[2] = "SAVEGAMES has been created";
        }
        if (tempFolder.mkdir()){
            System.out.println("TEMP has been created");
            value[3] = "TEMP has been created";
        }
        File mainSRCFolder = new File("D://Games//src//main");
        File testSRCFolder = new File("D://Games//src//test");

        if (mainSRCFolder.mkdir()){
            System.out.println("main in SRC has been created");
            value[4] = "main in SRC has been created";
        }
        if (testSRCFolder.mkdir()){
            System.out.println("test in SRC has been created");
            value[5] = "test in SRC has been created";
        }





        File mainJava = new File("D://Games//src//main//Main.java");
        File utilsJava = new File("D://Games//src//main//Utils.java");

        try {
            if (mainJava.createNewFile()){
                System.out.println("Main.java has been created");
                value[6] = "Main.java has been created";
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (utilsJava.createNewFile()){
                System.out.println("Utils.java has been created");
                value[7] = "Utils.java has been created";
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawablesRESFolder = new File("D://Games//res//drawablesRESFolder");
        File vectorsRESFolder = new File("D://Games//res//");
        File iconsRESFolder = new File("D://Games//res//");

        if (drawablesRESFolder.mkdir()){
            System.out.println("DRAWABLES has been created");
            value[8] = "DRAWABLES has been created";
        }
        if (vectorsRESFolder.mkdir()){
            System.out.println("VECTORS has been created");
            value[9] = "VECTORS has been created";
        }
        if (iconsRESFolder.mkdir()){
            System.out.println("ICONS has been created");
            value[10] = "ICONS has been created";
        }
        File tempTXT = new File("D://Games//temp//temp.txt");
        try {
            if (tempTXT.createNewFile()){
                System.out.println("temp.txt has been created");
                value[11] = "temp.txt has been created";
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream writer = new FileOutputStream("D://Games//temp//temp.txt")) {
            for (int i = 0; i < value.length; i++) {
                writer.write(value[i]);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
