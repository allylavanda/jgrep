import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    protected String path;
    protected String pattern;

    private void read(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        int lineNum = 0;
        while(sc.hasNextLine()){
            lineNum++;
            String line = sc.nextLine();
            if(line.toLowerCase().contains(this.pattern)){
                System.out.println("Pattern found at Line# "+lineNum+": "+line);
            }
        }
        sc.close();
    }
    public void run(String dir, String pattern) throws FileNotFoundException {
        this.path = dir;
        this.pattern = pattern;
        read(new File(this.path));
    }

}
