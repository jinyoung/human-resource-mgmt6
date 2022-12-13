package human.resource.mgmt.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import lombok.Data;
import lombok.ToString;
import java.util.List;
import human.resource.mgmt.query.*;



@ToString
@Data
public class CancelCalendarCommand {


    @TargetAggregateIdentifier
    private String userId;


}

