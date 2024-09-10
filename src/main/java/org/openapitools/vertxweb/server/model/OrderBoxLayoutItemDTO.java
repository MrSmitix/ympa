package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BriefOrderItemInstanceDTO;
import org.openapitools.vertxweb.server.model.OrderBoxLayoutPartialCountDTO;

/**
 * Информация о товаре в коробке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBoxLayoutItemDTO   {
  
  private Long id;
  private Integer fullCount;
  private OrderBoxLayoutPartialCountDTO partialCount;
  private List<BriefOrderItemInstanceDTO> instances;

  public OrderBoxLayoutItemDTO () {

  }

  public OrderBoxLayoutItemDTO (Long id, Integer fullCount, OrderBoxLayoutPartialCountDTO partialCount, List<BriefOrderItemInstanceDTO> instances) {
    this.id = id;
    this.fullCount = fullCount;
    this.partialCount = partialCount;
    this.instances = instances;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("fullCount")
  public Integer getFullCount() {
    return fullCount;
  }
  public void setFullCount(Integer fullCount) {
    this.fullCount = fullCount;
  }

    
  @JsonProperty("partialCount")
  public OrderBoxLayoutPartialCountDTO getPartialCount() {
    return partialCount;
  }
  public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
    this.partialCount = partialCount;
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
