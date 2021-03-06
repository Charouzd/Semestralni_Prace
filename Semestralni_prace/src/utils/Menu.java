package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Class of menus</h1>
 * <p>
 * To shorter UI code I stored menus outputs and following answer in this class.
 * Every menu's task is in the name of method</p>
 *
 * @author Filip Charouzd
 */
public final class Menu {

    static Scanner sc = new Scanner(System.in);

    public static int usersChoiseMainMenu() {

        Menu.mainMenu();
        System.out.print("Zadej volbu: ");
        try {
            int choise = sc.nextInt();
            return choise;
        } catch (InputMismatchException ex) {
            sc.nextLine();
            return 11;
        }

    }

    public static int usersChoiseSaveMenu() {

        Menu.saveMenu();
        System.out.print("Zadej volbu: ");
        try {
            int choise = sc.nextInt();
            return choise;
        } catch (InputMismatchException ex) {
            sc.nextLine();
            return 11;
        }

    }

    public static int usersChoiseManualMenu() {

        manualMenu();
        System.out.print("Zadej volbu: ");
        try {
            int choise = sc.nextInt();
            return choise;
        } catch (InputMismatchException ex) {
            sc.nextLine();
            return 11;
        }

    }

    /**
     *
     * @return Integer for switch
     */
    public static int usersChoiseSortMenu() {
        sortMenu();
        System.out.print("Zadej volbu: ");
        try {
            int choise = sc.nextInt();
            return choise;
        } catch (InputMismatchException ex) {

            sc.nextLine();
            return 11;
        }

    }

    /**
     *
     * @return Integer for switch
     */
    public static int usersChoiseLoadMenu() {
        loadMenu();
        System.out.print("Zadej volbu: ");
        try {
            int choise = sc.nextInt();
            return choise;
        } catch (InputMismatchException ex) {

            sc.nextLine();
            return 11;
        }

    }

    private static void mainMenu() {
        System.out.println("");
        System.out.println("System vyhodnocovani maturitnich praci ");
        System.out.println("1. Manualni zadavani");
        System.out.println("2. Nacist cele soubory ");
        System.out.println("3. Zobrazit zapsan?? studenty");
        System.out.println("4. Vyhodnotit v??dledky zadan??ch student??");
        System.out.println("5. Srovnat absolventy podle skore");
        System.out.println("6. Ulozit vysledky do souboru");
        System.out.println("7. Zobrazit absolventy");
        System.out.println("0. Konec programu");
    }

    public static void manualMenu() {
        System.out.println("1. P??idat studenta");
        System.out.println("2. P??idat v??sledek");
        System.out.println("0. Zp??t");
    }

    public static void sortMenu() {
        System.out.println("1. Zobrazit absolventy");
        System.out.println("2. Srovnat Absolventy podle bodu od nejlep????ch");
        System.out.println("3. Srovnat Absolventy podle bodu od nejhor????ch");
        System.out.println("0. Zp??t");
    }

    public static void saveMenu() {
        System.out.println("1. Ulozit jako .txt ");
        System.out.println("2. Ulozit jako .dat");
        System.out.println("3. Ulozit jako .pdf");
        System.out.println("0. Zp??t");
    }

    public static void loadMenu() {

        System.out.println("1. Nahr??t soubor se studenty");
        System.out.println("2. Nahr??t v??sledky z tohoto roku");
        System.out.println("3. Nahr??t v??sledky konkr??tn??ho roku");
        System.out.println("4. Ukazat pocet nahranych informaci");
        System.out.println("0. Zp??t");
    }
}
