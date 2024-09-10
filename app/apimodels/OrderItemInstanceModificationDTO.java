package apimodels;

import apimodels.BriefOrderItemInstanceDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Позиция в корзине, требующая маркировки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemInstanceModificationDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("instances")
  @NotNull
@Valid

  private List<@Valid BriefOrderItemInstanceDTO> instances = new ArrayList<>();

  public OrderItemInstanceModificationDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderItemInstanceModificationDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public OrderItemInstanceModificationDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Список кодов маркировки единиц товара. 
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
    OrderItemInstanceModificationDTO orderItemInstanceModificationDTO = (OrderItemInstanceModificationDTO) o;
    return Objects.equals(id, orderItemInstanceModificationDTO.id) &&
        Objects.equals(instances, orderItemInstanceModificationDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

