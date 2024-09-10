package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderItemInstanceModificationDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProvideOrderItemIdentifiersRequest   {

    private List<@Valid OrderItemInstanceModificationDTO> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProvideOrderItemIdentifiersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProvideOrderItemIdentifiersRequest.
     *
     * @param items Список позиций, требующих маркировки. 
     */
    public ProvideOrderItemIdentifiersRequest(
        List<@Valid OrderItemInstanceModificationDTO> items
    ) {
        this.items = items;
    }



    /**
     * Список позиций, требующих маркировки. 
     * @return items
     */
    public List<@Valid OrderItemInstanceModificationDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrderItemInstanceModificationDTO> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvideOrderItemIdentifiersRequest {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

