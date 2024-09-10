package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 */

@Schema(name = "OrderItemModificationDTO", description = "Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemModificationDTO {

  private Long id;

  private Integer count;

  @Valid
  private JsonNullable<List<@Valid BriefOrderItemInstanceDTO>> instances = JsonNullable.<List<@Valid BriefOrderItemInstanceDTO>>undefined();

  public OrderItemModificationDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderItemModificationDTO(Long id, Integer count) {
    this.id = id;
    this.count = count;
  }

  public OrderItemModificationDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderItemModificationDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Новое количество товара.
   * minimum: 0
   * @return count
   */
  @NotNull @Min(0) 
  @Schema(name = "count", description = "Новое количество товара.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrderItemModificationDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = JsonNullable.of(instances);
    return this;
  }

  public OrderItemModificationDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
    if (this.instances == null || !this.instances.isPresent()) {
      this.instances = JsonNullable.of(new ArrayList<>());
    }
    this.instances.get().add(instancesItem);
    return this;
  }

  /**
   * Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
   * @return instances
   */
  @Valid 
  @Schema(name = "instances", description = "Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public JsonNullable<List<@Valid BriefOrderItemInstanceDTO>> getInstances() {
    return instances;
  }

  public void setInstances(JsonNullable<List<@Valid BriefOrderItemInstanceDTO>> instances) {
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
    OrderItemModificationDTO orderItemModificationDTO = (OrderItemModificationDTO) o;
    return Objects.equals(this.id, orderItemModificationDTO.id) &&
        Objects.equals(this.count, orderItemModificationDTO.count) &&
        equalsNullable(this.instances, orderItemModificationDTO.instances);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count, hashCodeNullable(instances));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

