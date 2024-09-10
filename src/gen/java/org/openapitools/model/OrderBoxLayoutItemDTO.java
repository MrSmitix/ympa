package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import org.openapitools.model.OrderBoxLayoutPartialCountDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товаре в коробке.
 */
@ApiModel(description="Информация о товаре в коробке.")

public class OrderBoxLayoutItemDTO  {
  
 /**
  * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
  */
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   ")
  private Long id;

 /**
  * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
  */
  @ApiModelProperty(value = "Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. ")
  private Integer fullCount;

  @ApiModelProperty(value = "")
  @Valid
  private OrderBoxLayoutPartialCountDTO partialCount;

 /**
  * Переданные вами коды маркировки.
  */
  @ApiModelProperty(value = "Переданные вами коды маркировки.")
  @Valid
  private List<@Valid BriefOrderItemInstanceDTO> instances;
 /**
  * Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}   
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderBoxLayoutItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;. 
  * minimum: 1
  * @return fullCount
  */
  @JsonProperty("fullCount")
 @Min(1)  public Integer getFullCount() {
    return fullCount;
  }

  /**
   * Sets the <code>fullCount</code> property.
   */
 public void setFullCount(Integer fullCount) {
    this.fullCount = fullCount;
  }

  /**
   * Sets the <code>fullCount</code> property.
   */
  public OrderBoxLayoutItemDTO fullCount(Integer fullCount) {
    this.fullCount = fullCount;
    return this;
  }

 /**
  * Get partialCount
  * @return partialCount
  */
  @JsonProperty("partialCount")
  public OrderBoxLayoutPartialCountDTO getPartialCount() {
    return partialCount;
  }

  /**
   * Sets the <code>partialCount</code> property.
   */
 public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
  }

  /**
   * Sets the <code>partialCount</code> property.
   */
  public OrderBoxLayoutItemDTO partialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
    return this;
  }

 /**
  * Переданные вами коды маркировки.
  * @return instances
  */
  @JsonProperty("instances")
  public List<@Valid BriefOrderItemInstanceDTO> getInstances() {
    return instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
 public void setInstances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
  public OrderBoxLayoutItemDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Adds a new item to the <code>instances</code> list.
   */
  public OrderBoxLayoutItemDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBoxLayoutItemDTO orderBoxLayoutItemDTO = (OrderBoxLayoutItemDTO) o;
    return Objects.equals(this.id, orderBoxLayoutItemDTO.id) &&
        Objects.equals(this.fullCount, orderBoxLayoutItemDTO.fullCount) &&
        Objects.equals(this.partialCount, orderBoxLayoutItemDTO.partialCount) &&
        Objects.equals(this.instances, orderBoxLayoutItemDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullCount, partialCount, instances);
  }

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

