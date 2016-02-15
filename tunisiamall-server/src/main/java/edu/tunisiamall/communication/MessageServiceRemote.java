package edu.tunisiamall.communication;

import java.util.List;
import javax.ejb.Remote;
import edu.tunisiamall.entities.User;
import edu.tunisiamall.entities.Message;

@Remote
public interface MessageServiceRemote {
	public List<Message> getMessagesFromTo(User src, User dest);
	public List<Message> getMessagesFor(User u);
	public boolean sendMessage(User src, User dest, String text);
	public boolean deleteMessage(Message m);
	public boolean setMessageSeen(Message m);
}
