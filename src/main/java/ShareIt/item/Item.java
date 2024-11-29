package ShareIt.item;


import ShareIt.request.ItemRequest;
import ShareIt.user.User;
import lombok.Data;

import java.util.Optional;

@Data
public class Item {
    private Long id;
    private String name;
    private String description;
    private boolean available = true;
    private User owner;
    private ItemRequest request;

}


