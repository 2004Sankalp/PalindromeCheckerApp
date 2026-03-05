/**
 * ================================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application name
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Application Name
        String appName = "Palindrome Checker App";

        // Application Version
        String appVersion = "Version 1.0";

        // Welcome Message
        System.out.println("=========================================");
        System.out.println("      Welcome to " + appName);
        System.out.println("=========================================");
        System.out.println("Application Details:");
        System.out.println("Name    : " + appName);
        System.out.println("Version : " + appVersion);
        System.out.println("=========================================");

        
        System.out.println("System initialized successfully.");
        System.out.println("Ready for next operation...");
    }
}
