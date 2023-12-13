package shopjunghyun.domain;

import java.util.*;
import lombok.*;
import shopjunghyun.domain.*;
import shopjunghyun.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private String status;
}
