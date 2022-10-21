package homework.day6;

public class StringLog {

    public void log(String str) {

        String concatim = "";
        String[] log = str.split("\n");
        int ok = 0;
        int failed = 0;

        for (String z : log) {
            z = z.substring(22);
            z = z.replaceAll("[^0-9.]", "");
            String[] xz = z.split("\n");
            for (int i = 0; i < xz.length; i++) {
                        if (!concatim.contains(xz[i])) {
                            concatim = concatim.concat(xz[i]);
                            System.out.printf(xz[i] + " " + ok + " " + failed + "\n");
                        }
                    }
                }
            }
        }




  //          for (int i = 0; i < log.length; i++) {
  //              if (log[i].contains(z) && (log[i].contains("granted")))  {
   //                     ok++;
   //                 } else if (log[i].contains(z) && (log[i].contains("denied"))){
    //                    failed++;

