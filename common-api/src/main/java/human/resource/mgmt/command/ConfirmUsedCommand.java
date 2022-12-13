package human.resource.mgmt.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.util.Date; 



import lombok.Data;
import lombok.ToString;
import java.util.List;
import human.resource.mgmt.query.*;



@ToString
@Data
public class ConfirmUsedCommand {


    @TargetAggregateIdentifier
    private String id;


}


