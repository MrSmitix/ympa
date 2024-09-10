package apimodels;

import apimodels.WarehouseStockType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об остатках товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WarehouseStockDTO   {
  @JsonProperty("type")
  @NotNull
@Valid

  private WarehouseStockType type;

  @JsonProperty("count")
  @NotNull

  private Long count;

  public WarehouseStockDTO type(WarehouseStockType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

