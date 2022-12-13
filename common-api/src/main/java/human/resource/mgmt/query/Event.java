package human.resource.mgmt.query;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.*;
import java.util.Date;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    
    
    
    private Long id;
    
    
    
    private String title;
    
    
    
    private Date start;
    
    
    
    private Date end;



}

