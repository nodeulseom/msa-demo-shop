package shopjunghyun.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopjunghyun.domain.*;
import shopjunghyun.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryWithdrawed extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer qty;
    private String status;
    private String address;

    public DeliveryWithdrawed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryWithdrawed() {
        super();
    }
}
//>>> DDD / Domain Event
