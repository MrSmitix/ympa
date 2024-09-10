package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Позиция в корзине, требующая маркировки.
 */
@ApiModel(description="Позиция в корзине, требующая маркировки.")

public class OrderItemInstanceModificationDTO  {
  
 /**
  * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  private Long id;

 /**
  * Список кодов маркировки единиц товара. 
  */
  @ApiModelProperty(required = true, value = "Список кодов маркировки единиц товара. ")
  @Valid
  private List<@Valid BriefOrderItemInstanceDTO> instances = new ArrayList<>();
 /**
  * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
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
  public OrderItemInstanceModificationDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Список кодов маркировки единиц товара. 
  * @return instances
  */
  @JsonProperty("instances")
  @NotNull
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
  public OrderItemInstanceModificationDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Adds a new item to the <code>instances</code> list.
   */
  public OrderItemInstanceModificationDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
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
    OrderItemInstanceModificationDTO orderItemInstanceModificationDTO = (OrderItemInstanceModificationDTO) o;
    return Objects.equals(this.id, orderItemInstanceModificationDTO.id) &&
        Objects.equals(this.instances, orderItemInstanceModificationDTO.instances);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

