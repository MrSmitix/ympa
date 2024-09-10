package apimodels;

import apimodels.ScrollingPagerDTO;
import apimodels.WarehouseOffersDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список складов с информацией об остатках на каждом из них.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetWarehouseStocksDTO   {
  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("warehouses")
  @NotNull
@Valid

  private List<@Valid WarehouseOffersDTO> warehouses = new ArrayList<>();

  public GetWarehouseStocksDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
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
  **/
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
    return Objects.equals(paging, getWarehouseStocksDTO.paging) &&
        Objects.equals(warehouses, getWarehouseStocksDTO.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, warehouses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

