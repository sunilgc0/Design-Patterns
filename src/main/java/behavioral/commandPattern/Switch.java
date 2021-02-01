package behavioral.commandPattern;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
