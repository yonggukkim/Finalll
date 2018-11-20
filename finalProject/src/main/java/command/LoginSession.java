package command;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class LoginSession implements Serializable {
	private String commandId;
	private String commandPw;
	private String commandName;
	private String commandDvice;
	private boolean commandCookie;
	public boolean isCommandCookie() {
		return commandCookie;
	}

	public void setCommandCookie(boolean commandCookie) {
		this.commandCookie = commandCookie;
	}
	public String getCommandId() {
		return commandId;
	}
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}
	public String getCommandPw() {
		return commandPw;
	}

	public void setCommandPw(String commandPw) {
		this.commandPw = commandPw;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}
	public String getCommandDvice() {
		return commandDvice;
	}
	public void setCommandDvice(String commandDvice) {
		this.commandDvice = commandDvice;
	}
}
