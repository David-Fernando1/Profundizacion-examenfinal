package co.edu.poli.Examenfinal.helpers;

import lombok.Builder;
import lombok.Data;
import org.aspectj.bridge.Message;

@Data
@Builder
public class Response {
    private Integer code;
    private Object data;
}

