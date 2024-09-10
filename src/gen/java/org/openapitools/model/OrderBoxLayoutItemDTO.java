package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import org.openapitools.model.OrderBoxLayoutPartialCountDTO;



/**
 * Информация о товаре в коробке.
 **/

@ApiModel(description = "Информация о товаре в коробке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxLayoutItemDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("fullCount")
  private Integer fullCount;

  @JsonProperty("partialCount")
  private OrderBoxLayoutPartialCountDTO partialCount;

  @JsonProperty("instances")
  private List<BriefOrderItemInstanceDTO> instances = null;

  /**
   * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
   **/
  public OrderBoxLayoutItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
   * minimum: 1
   **/
  public OrderBoxLayoutItemDTO fullCount(Integer fullCount) {
    this.fullCount = fullCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. ")
  @JsonProperty("fullCount")
  public Integer getFullCount() {
    return fullCount;
  }
  public void setFullCount(Integer fullCount) {
    this.fullCount = fullCount;
  }

  /**
   **/
  public OrderBoxLayoutItemDTO partialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partialCount")
  public OrderBoxLayoutPartialCountDTO getPartialCount() {
    return partialCount;
  }
  public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
  }

  /**
   * Переданные вами коды маркировки.
   **/
  public OrderBoxLayoutItemDTO instances(List<BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(value = "Переданные вами коды маркировки.")
  @JsonProperty("instances")
  public List<BriefOrderItemInstanceDTO> getInstances() {
    return instances;
  }
  public void setInstances(List<BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
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
    return Objects.equals(id, orderBoxLayoutItemDTO.id) &&
        Objects.equals(fullCount, orderBoxLayoutItemDTO.fullCount) &&
        Objects.equals(partialCount, orderBoxLayoutItemDTO.partialCount) &&
        Objects.equals(instances, orderBoxLayoutItemDTO.instances);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

