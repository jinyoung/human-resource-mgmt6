package human.resource.mgmt.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import lombok.Data;
import lombok.ToString;
import java.util.List;
import human.resource.mgmt.query.*;



@ToString
@Data
public class AddCommand {


    @TargetAggregateIdentifier
    private String userId;

        private Integer dayCount;
        private String reason;

}


