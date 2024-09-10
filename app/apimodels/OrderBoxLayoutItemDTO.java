package apimodels;

import apimodels.BriefOrderItemInstanceDTO;
import apimodels.OrderBoxLayoutPartialCountDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о товаре в коробке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBoxLayoutItemDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("fullCount")
  @Min(1)

  private Integer fullCount;

  @JsonProperty("partialCount")
  @Valid

  private OrderBoxLayoutPartialCountDTO partialCount;

  @JsonProperty("instances")
  @Valid

  private List<@Valid BriefOrderItemInstanceDTO> instances = null;

  public OrderBoxLayoutItemDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
   * @return id
  **/
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
  **/
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
  **/
  public OrderBoxLayoutPartialCountDTO getPartialCount() {
    return partialCount;
  }

  public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
  }

  public OrderBoxLayoutItemDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public OrderBoxLayoutItemDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Переданные вами коды маркировки.
   * @return instances
  **/
  public List<@Valid BriefOrderItemInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid BriefOrderItemInstanceDTO> instances) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

