package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;



/**
 * Запрос на изменение информации по остаткам товаров.
 **/

@ApiModel(description = "Запрос на изменение информации по остаткам товаров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateStocksRequest   {
  @JsonProperty("skus")
  private Set<UpdateStockDTO> skus = new LinkedHashSet<>();

  /**
   * Данные об остатках товаров. 
   **/
  public UpdateStocksRequest skus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Данные об остатках товаров. ")
  @JsonProperty("skus")
  public Set<UpdateStockDTO> getSkus() {
    return skus;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSkus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
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
    return Objects.equals(skus, updateStocksRequest.skus);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

