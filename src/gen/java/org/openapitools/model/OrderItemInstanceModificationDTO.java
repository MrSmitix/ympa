package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BriefOrderItemInstanceDTO;



/**
 * Позиция в корзине, требующая маркировки.
 **/

@ApiModel(description = "Позиция в корзине, требующая маркировки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemInstanceModificationDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("instances")
  private List<BriefOrderItemInstanceDTO> instances = new ArrayList<>();

  /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   **/
  public OrderItemInstanceModificationDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Список кодов маркировки единиц товара. 
   **/
  public OrderItemInstanceModificationDTO instances(List<BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список кодов маркировки единиц товара. ")
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
    OrderItemInstanceModificationDTO orderItemInstanceModificationDTO = (OrderItemInstanceModificationDTO) o;
    return Objects.equals(id, orderItemInstanceModificationDTO.id) &&
        Objects.equals(instances, orderItemInstanceModificationDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

