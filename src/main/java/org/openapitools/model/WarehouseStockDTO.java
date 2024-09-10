package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.WarehouseStockType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об остатках товара.
 */

@Schema(name = "WarehouseStockDTO", description = "Информация об остатках товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseStockDTO {

  private WarehouseStockType type;

  private Long count;

  public WarehouseStockDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseStockDTO(WarehouseStockType type, Long count) {
    this.type = type;
    this.count = count;
  }

  public WarehouseStockDTO type(WarehouseStockType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public WarehouseStockType getType() {
    return type;
  }

  public void setType(WarehouseStockType type) {
    this.type = type;
  }

  public WarehouseStockDTO count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Значение остатков.
   * @return count
   */
  @NotNull 
  @Schema(name = "count", description = "Значение остатков.", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

