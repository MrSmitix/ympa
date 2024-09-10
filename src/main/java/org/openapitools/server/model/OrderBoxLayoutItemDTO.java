package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BriefOrderItemInstanceDTO;
import org.openapitools.server.model.OrderBoxLayoutPartialCountDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товаре в коробке.
 */
public class OrderBoxLayoutItemDTO   {

    private Long id;
    private Integer fullCount;
    private OrderBoxLayoutPartialCountDTO partialCount;
    private List<@Valid BriefOrderItemInstanceDTO> instances;

    /**
     * Default constructor.
     */
    public OrderBoxLayoutItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBoxLayoutItemDTO.
     *
     * @param id Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}   
     * @param fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;. 
     * @param partialCount partialCount
     * @param instances Переданные вами коды маркировки.
     */
    public OrderBoxLayoutItemDTO(
        Long id, 
        Integer fullCount, 
        OrderBoxLayoutPartialCountDTO partialCount, 
        List<@Valid BriefOrderItemInstanceDTO> instances
    ) {
        this.id = id;
        this.fullCount = fullCount;
        this.partialCount = partialCount;
        this.instances = instances;
    }



    /**
     * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
     * minimum: 1
     * @return fullCount
     */
    public Integer getFullCount() {
        return fullCount;
    }

    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    /**
     * Get partialCount
     * @return partialCount
     */
    public OrderBoxLayoutPartialCountDTO getPartialCount() {
        return partialCount;
    }

    public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
        this.partialCount = partialCount;
    }

    /**
     * Переданные вами коды маркировки.
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
        sb.append("class OrderBoxLayoutItemDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fullCount: ").append(toIndentedString(fullCount)).append("\n");
        sb.append("    partialCount: ").append(toIndentedString(partialCount)).append("\n");
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

