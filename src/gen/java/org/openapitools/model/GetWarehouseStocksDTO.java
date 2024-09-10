package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.model.WarehouseOffersDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Список складов с информацией об остатках на каждом из них.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetWarehouseStocksDTO   {
  
  private ScrollingPagerDTO paging;
  private List<@Valid WarehouseOffersDTO> warehouses = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Страница списка складов.
   **/
  
  @ApiModelProperty(required = true, value = "Страница списка складов.")
  @JsonProperty("warehouses")
  @NotNull
  @Valid
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

