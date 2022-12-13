package human.resource.mgmt.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import lombok.Data;
import lombok.ToString;
import java.util.List;
import human.resource.mgmt.query.*;



@ToString
@Data
public class ResignCommand {


    @TargetAggregateIdentifier
    private String userId;


}


