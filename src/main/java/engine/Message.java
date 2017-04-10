package engine;

public class Message
{
    private String msg;
    private String msg_id;

    public Message(String msg_id, String msg)
    {
        this.msg = msg;
        this.msg_id = msg_id;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getMsg_id()
    {
        return msg_id;
    }

    public void setMsg_id(String msg_id)
    {
        this.msg_id = msg_id;
    }
}
