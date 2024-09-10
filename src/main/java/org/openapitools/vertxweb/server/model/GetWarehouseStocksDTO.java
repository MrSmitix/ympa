package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.WarehouseOffersDTO;

/**
 * Список складов с информацией об остатках на каждом из них.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWarehouseStocksDTO   {
  
  private ScrollingPagerDTO paging;
  private List<WarehouseOffersDTO> warehouses = new ArrayList<>();

  public GetWarehouseStocksDTO () {

  }

  public GetWarehouseStocksDTO (ScrollingPagerDTO paging, List<WarehouseOffersDTO> warehouses) {
    this.paging = paging;
    this.warehouses = warehouses;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("warehouses")
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
    return Objects.equals(paging, getWarehouseStocksDTO.paging) &&
        Objects.equals(warehouses, getWarehouseStocksDTO.warehouses);
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
