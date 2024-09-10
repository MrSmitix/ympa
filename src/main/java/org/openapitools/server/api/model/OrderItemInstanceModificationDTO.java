package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.BriefOrderItemInstanceDTO;

/**
 * Позиция в корзине, требующая маркировки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemInstanceModificationDTO   {
  
  private Long id;
  private List<BriefOrderItemInstanceDTO> instances = new ArrayList<>();

  public OrderItemInstanceModificationDTO () {

  }

  public OrderItemInstanceModificationDTO (Long id, List<BriefOrderItemInstanceDTO> instances) {
    this.id = id;
    this.instances = instances;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
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
