package ShareIt.request;

import ShareIt.user.User;
import lombok.Data;

import java.time.Instant;

@Data
public class ItemRequest {
    private Long id;
    private String description;
    private User requestor;
    private Instant created;

}
