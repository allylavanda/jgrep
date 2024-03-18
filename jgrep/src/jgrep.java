import java.io.IOException;

/**
 * This program is being made to be a windows equivalent of grep because I use windows subsystem for linux daily just for grep lol
 */
public class jgrep {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to jgrep by allylavanda");
        argHandler(args);
    }
    private static void argHandler(String[] args) throws IOException{
        if(args.length == 0){
            System.out.println("You must use arguments to run this application. If you need help, run this program with the 'help' argument, or consult the github.");
            System.exit(0);
        }
        if(args[0].equals("cd")){
            System.out.println("Starting current directory search...");
            CurrentDir cd = new CurrentDir();
            cd.run(args[1],args[2]);
        } else if(args[0].equals("rd")){
            System.out.println("Starting recursive directory search...");
            RecursiveDir rd = new RecursiveDir();
            rd.run(args[1], args[2]);
            // RecursiveDir rd = new RecursiveDir();
        } else if(args[0].equalsIgnoreCase("h") || args[0].equalsIgnoreCase("help")){
            System.out.println("Please refer to the github documentaiton: https://github.com/allylavanda/jgrep");
        } else if(args[0].equals("f")){
            System.out.println("Reading "+args[1]);
            ReadFile f = new ReadFile();
            f.run(args[1], args[2]);
        }
    }
}