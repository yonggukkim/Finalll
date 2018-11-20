package repository;

import java.util.Date;

import command.LoginSession;

public interface UserDAO {
	public LoginSession comparisonLogin(LoginSession dto);
	
	public void keepLogin(String uid, String sessionId, Date next);
	
	public LoginSession checkUserWithSessionKey(String sessionId);
}
