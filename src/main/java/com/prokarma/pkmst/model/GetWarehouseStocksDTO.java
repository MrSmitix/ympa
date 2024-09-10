package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
import com.prokarma.pkmst.model.WarehouseOffersDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список складов с информацией об остатках на каждом из них.
 */
@ApiModel(description = "Список складов с информацией об остатках на каждом из них.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetWarehouseStocksDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("warehouses")
  
  private List<WarehouseOffersDTO> warehouses = new ArrayList<>();

  public GetWarehouseStocksDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetWarehouseStocksDTO warehouses(List<WarehouseOffersDTO> warehouses) {
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
  @ApiModelProperty(required = true, value = "Страница списка складов.")
  public List<WarehouseOffersDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<WarehouseOffersDTO> warehouses) {
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

