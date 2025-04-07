import java.io.FileWriter;
import java.io.IOException;

/**
 * Takes in four numerical arguments and an output txt file.
 * Writes the content as needed/modified to the output file specified.
 * Pathing to the output file must be specified e.g. "addFiles/output/specificFile1.txt"
 * If the output file is not empty, appends the new information to the end of the file.
 * If the file does not exist it will attempt to create a new txt file.
 *
 * @author nherd
 * @version 4/6/2025
 */
public class OutputFileWriter {
    private void fileWriter (final int argument1, final int argument2,
                             final int argument3, final int argument4,
                             final boolean fileHaseBeenWrittenTo,
                             final String theOutputFile) {
        StringBuilder builder = new StringBuilder();
        //If the file is fresh we can place our default writing information here
        if (!fileHaseBeenWrittenTo) {
            try (FileWriter writer = new FileWriter(theOutputFile)) {
                //Clean input is placed here.
                writer.write("");
                writer.close();
            } catch (IOException e) {
                System.err.print("An error occurred" + e.getMessage());
            }
        } else {
            //The file has been written to, so we append to it.
            try (FileWriter writer = new FileWriter(theOutputFile,true)) {
                builder.append("\n");
                builder.append("");
                writer.write(builder.toString());
                writer.close();
            } catch (IOException e) {
                System.err.print("An error occurred" + e.getMessage());
            }
        }
    }
}
