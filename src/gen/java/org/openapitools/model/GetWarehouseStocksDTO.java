package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.model.WarehouseOffersDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список складов с информацией об остатках на каждом из них.
 */
@ApiModel(description="Список складов с информацией об остатках на каждом из них.")

public class GetWarehouseStocksDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

 /**
  * Страница списка складов.
  */
  @ApiModelProperty(required = true, value = "Страница списка складов.")
  @Valid
  private List<@Valid WarehouseOffersDTO> warehouses = new ArrayList<>();
 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public GetWarehouseStocksDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Страница списка складов.
  * @return warehouses
  */
  @JsonProperty("warehouses")
  @NotNull
  public List<@Valid WarehouseOffersDTO> getWarehouses() {
    return warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
 public void setWarehouses(List<@Valid WarehouseOffersDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
  public GetWarehouseStocksDTO warehouses(List<@Valid WarehouseOffersDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouses</code> list.
   */
  public GetWarehouseStocksDTO addWarehousesItem(WarehouseOffersDTO warehousesItem) {
    this.warehouses.add(warehousesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

