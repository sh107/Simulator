/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

/**
 *
 * @author Sijin
 */
public class DatabaseRunnable implements Runnable {

    private String id;
    private String time;
    private String ip;
    private String pw;

    DatabaseRunnable(String string, String time, String ip, String pw) {
        this.id = string;
        this.time = time;
        this.ip = ip;
        this.pw = pw;

    }

    public void run() {
        Simulation sim = new Simulation(id, time, ip, pw);
        sim.start();
      //  System.out.println("aaa");
    }
}
