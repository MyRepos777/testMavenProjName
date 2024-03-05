import org.apache.commons.io.FileUtils;
import java.io.File;

/**
 * Created by Vasilij on 05.03.2024.
 */
public class tstMaven {
    public static void main(String[] args) {
        File tmpDir = FileUtils.getTempDirectory();

        System.out.println(tmpDir.toString());
    }
}
