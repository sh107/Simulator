/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.validator.routines.InetAddressValidator;

/**
 * For running simulation 
 * @author Sijin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Options options = new Options();
        options.addOption("u", true, "options: user1, user2, user3, user4, user5");
        options.addOption("w", true, "password");
        options.addOption("t", true, "options: time interval in seconds");
        options.addOption("p", true, "options: ip address");

        CommandLineParser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, args);
        //System.out.println(cmd.getOptionValue("u"));
        String name = cmd.getOptionValue("u");

//        String name = "user1";
//
//        for(int i = 2; i <= 100; i++){
//            name += "@user" + i;
//        }

        String[] a = name.split(Pattern.quote("@"));

        InetAddressValidator iav = new InetAddressValidator();

        if (Main.isInteger(cmd.getOptionValue("t")) && iav.isValidInet4Address(cmd.getOptionValue("p"))) {

            for (int i = 0; i < a.length; i++ ) {
                Thread thread = new Thread(new DatabaseRunnable(a[i], cmd.getOptionValue("t"), cmd.getOptionValue("p"), cmd.getOptionValue("w")));
                thread.start();
           //     System.out.println(a[i]);

            }

        }

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
