package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.WarehouseStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об остатках товара.
 **/
@ApiModel(description="Информация об остатках товара.")

public class WarehouseStockDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private WarehouseStockType type;

  @ApiModelProperty(required = true, value = "Значение остатков.")
 /**
   * Значение остатков.
  **/
  private Long count;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public WarehouseStockType getType() {
    return type;
  }

  public void setType(WarehouseStockType type) {
    this.type = type;
  }

  public WarehouseStockDTO type(WarehouseStockType type) {
    this.type = type;
    return this;
  }

 /**
   * Значение остатков.
   * @return count
  **/
  @JsonProperty("count")
  @NotNull
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public WarehouseStockDTO count(Long count) {
    this.count = count;
    return this;
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
    return Objects.equals(this.type, warehouseStockDTO.type) &&
        Objects.equals(this.count, warehouseStockDTO.count);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

