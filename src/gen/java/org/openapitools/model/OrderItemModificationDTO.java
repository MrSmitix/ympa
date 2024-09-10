package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 **/
@ApiModel(description="Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ")

public class OrderItemModificationDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. ")
 /**
   * Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Новое количество товара.")
 /**
   * Новое количество товара.
  **/
  private Integer count;

  @ApiModelProperty(value = "Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). ")
  @Valid
 /**
   * Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
  **/
  private List<@Valid BriefOrderItemInstanceDTO> instances;
 /**
   * Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderItemModificationDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Новое количество товара.
   * minimum: 0
   * @return count
  **/
  @JsonProperty("count")
  @NotNull
 @Min(0)  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrderItemModificationDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
   * @return instances
  **/
  @JsonProperty("instances")
  public List<@Valid BriefOrderItemInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  public OrderItemModificationDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public OrderItemModificationDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
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
    OrderItemModificationDTO orderItemModificationDTO = (OrderItemModificationDTO) o;
    return Objects.equals(this.id, orderItemModificationDTO.id) &&
        Objects.equals(this.count, orderItemModificationDTO.count) &&
        Objects.equals(this.instances, orderItemModificationDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemModificationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

