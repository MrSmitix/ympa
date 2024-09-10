package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос на изменение информации по остаткам товаров.
 */
@ApiModel(description="Запрос на изменение информации по остаткам товаров.")

public class UpdateStocksRequest  {
  
 /**
  * Данные об остатках товаров. 
  */
  @ApiModelProperty(required = true, value = "Данные об остатках товаров. ")
  @Valid
  private Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();
 /**
  * Данные об остатках товаров. 
  * @return skus
  */
  @JsonProperty("skus")
  @NotNull
 @Size(min=1,max=2000)  public Set<@Valid UpdateStockDTO> getSkus() {
    return skus;
  }

  /**
   * Sets the <code>skus</code> property.
   */
 @JsonDeserialize(as = LinkedHashSet.class)
 public void setSkus(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
  }

  /**
   * Sets the <code>skus</code> property.
   */
  public UpdateStocksRequest skus(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  /**
   * Adds a new item to the <code>skus</code> list.
   */
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

