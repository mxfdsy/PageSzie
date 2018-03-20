/**
 * 业务逻辑异常
 * Created by 平凡的世界 on 2018/3/20.
 */
public class LogicExcepton extends Exception{
    public LogicExcepton(String message) {
        super(message);
    }

    public LogicExcepton(Throwable cause) {
        super(cause);
    }
}
