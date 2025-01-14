import command.Command;
import exceptions.SundayException;
import utilities.Parser;
import utilities.Ui;

/**
 * Sunday is the class that is responsible for making sense of user inputs
 * and driving the main logic of the program.
 *
 * @author Tan Yan-Hao Joshua
 *
 */
public class Sunday {

    /**
     * Returns a response based on the given input.
     * The input is parsed using the Parser class to create a Command object,
     * which is executed with the remaining input as the argument.
     * If a SundayException is thrown during the execution of the command,
     * the exception message is displayed using the Ui class.
     *
     * @param input the input string to be parsed and executed
     * @return the response string generated by executing the Command object
     */
    public String getResponse(String input) {
        String response = "";
        try {
            String description = input.substring(input.split(" ")[0].length());
            Command command = Parser.parse(input);
            response = command.execute(description);
        } catch (SundayException e) {
            response = Ui.showException(e);
        }
        return response;
    }
}
