import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Hagrid {
    final static List<String> compass = new ArrayList<>(Arrays.asList("N","E","S","W"));

    public static void main(String[] args) {
        File root = new File("C:/Users/.../Desktop/Hedge Maze");
        gogogo(root,100);
    }

    public static void gogogo(File root, int depth) {
        if (depth == 0) return;
        for (String s : compass) {
            File subdir = new File(root,s);
            subdir.mkdirs();
            gogogo(subdir,depth-1);
        }
    }
}
