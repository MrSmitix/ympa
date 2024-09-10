package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на изменение информации по остаткам товаров.
 **/
@ApiModel(description="Запрос на изменение информации по остаткам товаров.")

public class UpdateStocksRequest  {
  
  @ApiModelProperty(required = true, value = "Данные об остатках товаров. ")
 /**
   * Данные об остатках товаров. 
  **/
  private Set<UpdateStockDTO> skus = new LinkedHashSet<>();
 /**
   * Данные об остатках товаров. 
   * @return skus
  **/
  @JsonProperty("skus")
  public Set<UpdateStockDTO> getSkus() {
    return skus;
  }

  public void setSkus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
  }

  public UpdateStocksRequest skus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  public UpdateStocksRequest addSkusItem(UpdateStockDTO skusItem) {
    this.skus.add(skusItem);
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
    UpdateStocksRequest updateStocksRequest = (UpdateStocksRequest) o;
    return Objects.equals(this.skus, updateStocksRequest.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStocksRequest {\n");
    
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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

