package Commands;

import Exceptions.MissingDescriptionException;
import Storage.Storage;
import TaskList.TaskList;
import Ui.Ui;

/**
 * Command object that handles a find operation
 */
public class FindCommand extends Command {
    /**
     * Constructs a Find Command object
     * @param rawUserInput String provided by user
     */
    public FindCommand(String rawUserInput) {
        super(rawUserInput);
    }

    /**
     * Finds and prints to Ui the list of Task objects that contains the substring
     * provided by user.
     * Updates Task list and writes to Storage
     * @param taskList object handling task operations
     * @param ui object handling default user interface messages
     * @param storage object handling storage operations
     * @throws MissingDescriptionException throws when user does not provide a keyword to find
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws MissingDescriptionException {
        try {
            String[] splitCommands = removeCommandWord(rawUserInput);
            taskList.findTask(splitCommands[1]);
        } catch (MissingDescriptionException e) {
            System.out.println("Missing keywords to search for! Please provide a keyword to search!");
        }
    }
}
