package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BriefOrderItemInstanceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Позиция в корзине, требующая маркировки.
 */
public class OrderItemInstanceModificationDTO   {

    private Long id;
    private List<@Valid BriefOrderItemInstanceDTO> instances = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderItemInstanceModificationDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemInstanceModificationDTO.
     *
     * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
     * @param instances Список кодов маркировки единиц товара. 
     */
    public OrderItemInstanceModificationDTO(
        Long id, 
        List<@Valid BriefOrderItemInstanceDTO> instances
    ) {
        this.id = id;
        this.instances = instances;
    }



    /**
     * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Список кодов маркировки единиц товара. 
     * @return instances
     */
    public List<@Valid BriefOrderItemInstanceDTO> getInstances() {
        return instances;
    }

    public void setInstances(List<@Valid BriefOrderItemInstanceDTO> instances) {
        this.instances = instances;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemInstanceModificationDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

