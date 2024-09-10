package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseStockType;



/**
 * Информация об остатках товара.
 **/

@ApiModel(description = "Информация об остатках товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseStockDTO   {
  @JsonProperty("type")
  private WarehouseStockType type;

  @JsonProperty("count")
  private Long count;

  /**
   **/
  public WarehouseStockDTO type(WarehouseStockType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public WarehouseStockType getType() {
    return type;
  }
  public void setType(WarehouseStockType type) {
    this.type = type;
  }

  /**
   * Значение остатков.
   **/
  public WarehouseStockDTO count(Long count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение остатков.")
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

