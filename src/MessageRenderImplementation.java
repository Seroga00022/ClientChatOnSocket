import java.text.SimpleDateFormat;
//A class that implements the message output interface.
public class MessageRenderImplementation implements MessageRender {
    @Override
    public void renderMessage(Message message) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy - hh:mm");
        String text = message.getSender() + " " + sdf.format(message.getDepartmentTime() + " > " + message.getText());
        System.out.println(text);
    }
}
