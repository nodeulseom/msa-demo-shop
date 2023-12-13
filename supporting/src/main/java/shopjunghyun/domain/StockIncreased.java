package shopjunghyun.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopjunghyun.domain.*;
import shopjunghyun.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String qty;
    private String name;

    public StockIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
