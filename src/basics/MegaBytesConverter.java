package basics;

public class MegaBytesConverter {

        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            // 1 MB = 1024kb

            int megaBytes;
            int extraKiloBytes;
            megaBytes =  kiloBytes/1024;
            extraKiloBytes =  kiloBytes%1024;
            if(kiloBytes <0){
                System.out.println("Invalid Value");
            }else {
                System.out.println(kiloBytes+" KB = "+megaBytes+" MB and " + extraKiloBytes +" KB");
            }
        }
    }