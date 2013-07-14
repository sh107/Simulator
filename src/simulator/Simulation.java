/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Normal User simulation
 * @author Sijin
 */
public class Simulation {

    private String username;
    private String password;
    private int interval;
    private String ip;
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Simulation(String optionValue, String optionValue0, String ip, String pw) {

        this.username = optionValue;
        this.password = pw;
        this.interval = Integer.parseInt(optionValue0);
        this.ip = ip;

//        System.out.println(this.username);
//        System.out.println(this.password);
//        System.out.println(this.interval);
//        System.out.println(this.ip);


    }

    //interval in seconds
    public String readDatabaseQuery1() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`VMs` where loginsID = 'sijinsijin'");
            System.out.println("select * from `RedDragon`.`VMs` where loginsID = 'sijinsijin'");

        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery2() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`ippool` where login = 'sijinsijin'");
            System.out.println("select * from `RedDragon`.`ippool` where login = 'sijinsijin'");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery3() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`users`");
            System.out.println("select * from `RedDragon`.`users`");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery4() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT memory FROM `RedDragon`.`VMStatistics` where logTime between '2012-07-10 8:00:19' and '2012-07-10 10:00:19';");
            System.out.println("SELECT memory FROM `RedDragon`.`VMStatistics` where logTime between '2012-07-10 8:00:19' and '2012-07-10 10:00:19';");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery5() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`logins` a JOIN `RedDragon`.`users` b on a.userID = b.userID");
            System.out.println("select * from `RedDragon`.`logins` a JOIN `RedDragon`.`users` b on a.userID = b.userID");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery6() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`privateippool` where login = 'sijinsijin'");
            System.out.println("select * from `RedDragon`.`privateippool` where login = 'sijinsijin'");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery7() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`Volume` where owner = 'sijinsijin'");
            System.out.println("select * from `RedDragon`.`Volume` where owner = 'sijinsijin'");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery8() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from `RedDragon`.`ipusage` a Left JOIN `RedDragon`.`VMs` b on a.vmUUID = b.idVMs");
            System.out.println("select * from `RedDragon`.`ipusage` a Left JOIN `RedDragon`.`VMs` b on a.vmUUID = b.idVMs");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery9() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT memory FROM `RedDragon`.`VMStatistics` where logTime between '2012-07-09 10:00:19' and '2012-07-10 10:00:19';");
            System.out.println("SELECT memory FROM `RedDragon`.`VMStatistics` where logTime between '2012-07-09 10:00:19' and '2012-07-10 10:00:19';");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    //interval in seconds
    public String readDatabaseQuery10() throws Exception {

        String json = "";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/RedDragon?"
                    + "user=" + username + "&password=" + password);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT totalCPUPercentage FROM `RedDragon`.`VMStatistics` where logTime between '2012-07-10 6:00:19' and '2012-07-10 10:00:19'");
            System.out.println("SELECT totalCPUPercentage FROM `RedDragon`.`VMStatistics` where logTime between '2012-07- 6:00:19' and '2012-07-10 10:00:19'");
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            close();
            return json;
        }

    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
        }
    }

    void start() {

        while (interval > 0) {

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(20);
            // System.out.println(randomInt);
            if (randomInt % 10 == 0) {
                try {
                    readDatabaseQuery1();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 1) {
                try {
                    readDatabaseQuery2();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 2) {
                try {
                    readDatabaseQuery3();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 3) {
                try {
                    readDatabaseQuery4();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 4) {
                try {
                    readDatabaseQuery5();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 5) {
                try {
                    readDatabaseQuery6();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 6) {
                try {
                    readDatabaseQuery7();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 7) {
                try {
                    readDatabaseQuery8();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (randomInt % 10 == 8) {
                try {
                    readDatabaseQuery9();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    readDatabaseQuery10();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {
                Thread.sleep(randomInt * 1000);
                interval = interval - randomInt;
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
