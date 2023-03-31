// 6.1 Write, compile and run the ChoosingOption program
import javax.swing.JOptionPane;
public class ChoosingOption {
 public static void main(String[] args) {
     int option = JOptionPane.showConfirmDialog(null,
      "Do you want to change the first class ticket?");
      
     JOptionPane.showMessageDialog(null, "You've chosen: "
     + (option==JOptionPane.YES_OPTION?"Yes":"No"));
     System.exit(0);
 }
}

// Questions:

// - What happens if users choose "Cancel"?
//   Answer: The program will not be launched.

// - How to customize the options to users, e.g. only two options: "Yes" and "No", OR "I do"
//   and " I don't " (Suggestion: Use Javadocs or using Eclipse/Netbean IDE help).
//   Answer: change int option
// - "Yes" and "No": JOptionPane.showConfirmDialog(null, "Do you want ...", null, 0)
// - "I do" and "I don't": create an Object array: Object[] options = {"I do", "I don't"}
//   JOptionPane.showOptionDialog(null, "Do you want ...", null, 0, 0, choice, choice[0])
