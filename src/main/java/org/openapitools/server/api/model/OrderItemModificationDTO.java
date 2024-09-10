package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BriefOrderItemInstanceDTO;

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemModificationDTO   {
  
  private Long id;
  private Integer count;
  private List<BriefOrderItemInstanceDTO> instances;

  public OrderItemModificationDTO () {

  }

  public OrderItemModificationDTO (Long id, Integer count, List<BriefOrderItemInstanceDTO> instances) {
    this.id = id;
    this.count = count;
    this.instances = instances;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
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
    OrderItemModificationDTO orderItemModificationDTO = (OrderItemModificationDTO) o;
    return Objects.equals(id, orderItemModificationDTO.id) &&
        Objects.equals(count, orderItemModificationDTO.count) &&
        Objects.equals(instances, orderItemModificationDTO.instances);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
