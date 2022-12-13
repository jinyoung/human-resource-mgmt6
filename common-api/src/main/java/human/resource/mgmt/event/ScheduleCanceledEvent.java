package human.resource.mgmt.event;

import lombok.Data;
import lombok.ToString;

import java.util.Date; 




@Data
@ToString
public class ScheduleCanceledEvent {

    private String title;
    private Date date;
    private String userId;

}
