package shopjunghyun.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopjunghyun.domain.*;
import shopjunghyun.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SendEmail extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;

    public SendEmail(Order aggregate) {
        super(aggregate);
    }

    public SendEmail() {
        super();
    }
}
//>>> DDD / Domain Event
