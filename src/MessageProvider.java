import java.io.IOException;
//Receiving and sending messages.
public interface MessageProvider {
    public void sendMessage(Message message) throws IOException;

    public Message readMessage() throws IOException;
}
