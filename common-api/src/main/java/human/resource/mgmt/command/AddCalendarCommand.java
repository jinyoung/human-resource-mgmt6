package human.resource.mgmt.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import lombok.Data;
import lombok.ToString;
import java.util.List;
import human.resource.mgmt.query.*;

import java.util.Date;


@ToString
@Data
public class AddCalendarCommand {


    @TargetAggregateIdentifier
    private String userId;

        private String title;
        private Date from;
        private Date to;

}


