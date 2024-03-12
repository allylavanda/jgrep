/**
 * This program is being made to be a windows equivalent of grep because I use windows subsystem for linux daily just for grep lol
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to jgrep by allylavanda");
        argHandler(args);
    }

    private static void argHandler(String[] args){
        if(args.length == 0){
            System.out.println("You must use arguments to run this application. If you need help, run this program with the 'help' argument, or consult the github.");
            System.exit(0);
        }
        if(args[0].equals("cd")){
            System.out.println("Starting current directory search...");
            CurrentDir cur = new CurrentDir();
            cur.run();
        }
    }
}
