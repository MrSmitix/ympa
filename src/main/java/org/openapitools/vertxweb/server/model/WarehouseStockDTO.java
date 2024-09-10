package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.WarehouseStockType;

/**
 * Информация об остатках товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseStockDTO   {
  
  private WarehouseStockType type;
  private Long count;

  public WarehouseStockDTO () {

  }

  public WarehouseStockDTO (WarehouseStockType type, Long count) {
    this.type = type;
    this.count = count;
  }

    
  @JsonProperty("type")
  public WarehouseStockType getType() {
    return type;
  }
  public void setType(WarehouseStockType type) {
    this.type = type;
  }

    
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseStockDTO warehouseStockDTO = (WarehouseStockDTO) o;
    return Objects.equals(type, warehouseStockDTO.type) &&
        Objects.equals(count, warehouseStockDTO.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseStockDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
