package human.resource.mgmt.query;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


import lombok.Data;

@Data
public class VacationStatusQuery {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date from;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date to;
    String title;
    
}
