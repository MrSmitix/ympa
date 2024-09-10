package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.model.WarehouseOffersDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список складов с информацией об остатках на каждом из них.
 */

@Schema(name = "GetWarehouseStocksDTO", description = "Список складов с информацией об остатках на каждом из них.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetWarehouseStocksDTO {

  private ScrollingPagerDTO paging;

  @Valid
  private List<@Valid WarehouseOffersDTO> warehouses = new ArrayList<>();

  public GetWarehouseStocksDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetWarehouseStocksDTO(List<@Valid WarehouseOffersDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public GetWarehouseStocksDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetWarehouseStocksDTO warehouses(List<@Valid WarehouseOffersDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public GetWarehouseStocksDTO addWarehousesItem(WarehouseOffersDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }

  /**
   * Страница списка складов.
   * @return warehouses
   */
  @NotNull @Valid 
  @Schema(name = "warehouses", description = "Страница списка складов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouses")
  public List<@Valid WarehouseOffersDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid WarehouseOffersDTO> warehouses) {
    this.warehouses = warehouses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarehouseStocksDTO getWarehouseStocksDTO = (GetWarehouseStocksDTO) o;
    return Objects.equals(this.paging, getWarehouseStocksDTO.paging) &&
        Objects.equals(this.warehouses, getWarehouseStocksDTO.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, warehouses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarehouseStocksDTO {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
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

