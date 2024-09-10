package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о части товара в коробке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBoxLayoutPartialCountDTO   {
  
  private Integer current;
  private Integer total;

  public OrderBoxLayoutPartialCountDTO () {

  }

  public OrderBoxLayoutPartialCountDTO (Integer current, Integer total) {
    this.current = current;
    this.total = total;
  }

    
  @JsonProperty("current")
  public Integer getCurrent() {
    return current;
  }
  public void setCurrent(Integer current) {
    this.current = current;
  }

    
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO = (OrderBoxLayoutPartialCountDTO) o;
    return Objects.equals(current, orderBoxLayoutPartialCountDTO.current) &&
        Objects.equals(total, orderBoxLayoutPartialCountDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxLayoutPartialCountDTO {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
