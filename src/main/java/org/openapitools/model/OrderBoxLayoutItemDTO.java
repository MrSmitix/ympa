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
import org.openapitools.model.OrderBoxLayoutPartialCountDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о товаре в коробке.
 */

@Schema(name = "OrderBoxLayoutItemDTO", description = "Информация о товаре в коробке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxLayoutItemDTO {

  private Long id;

  private Integer fullCount;

  private OrderBoxLayoutPartialCountDTO partialCount;

  @Valid
  private JsonNullable<List<@Valid BriefOrderItemInstanceDTO>> instances = JsonNullable.<List<@Valid BriefOrderItemInstanceDTO>>undefined();

  public OrderBoxLayoutItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderBoxLayoutItemDTO(Long id) {
    this.id = id;
  }

  public OrderBoxLayoutItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderBoxLayoutItemDTO fullCount(Integer fullCount) {
    this.fullCount = fullCount;
    return this;
  }

  /**
   * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
   * minimum: 1
   * @return fullCount
   */
  @Min(1) 
  @Schema(name = "fullCount", description = "Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullCount")
  public Integer getFullCount() {
    return fullCount;
  }

  public void setFullCount(Integer fullCount) {
    this.fullCount = fullCount;
  }

  public OrderBoxLayoutItemDTO partialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
    return this;
  }

  /**
   * Get partialCount
   * @return partialCount
   */
  @Valid 
  @Schema(name = "partialCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partialCount")
  public OrderBoxLayoutPartialCountDTO getPartialCount() {
    return partialCount;
  }

  public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
  }

  public OrderBoxLayoutItemDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = JsonNullable.of(instances);
    return this;
  }

  public OrderBoxLayoutItemDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
    if (this.instances == null || !this.instances.isPresent()) {
      this.instances = JsonNullable.of(new ArrayList<>());
    }
    this.instances.get().add(instancesItem);
    return this;
  }

  /**
   * Переданные вами коды маркировки.
   * @return instances
   */
  @Valid 
  @Schema(name = "instances", description = "Переданные вами коды маркировки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrderBoxLayoutItemDTO orderBoxLayoutItemDTO = (OrderBoxLayoutItemDTO) o;
    return Objects.equals(this.id, orderBoxLayoutItemDTO.id) &&
        Objects.equals(this.fullCount, orderBoxLayoutItemDTO.fullCount) &&
        Objects.equals(this.partialCount, orderBoxLayoutItemDTO.partialCount) &&
        equalsNullable(this.instances, orderBoxLayoutItemDTO.instances);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullCount, partialCount, hashCodeNullable(instances));
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

