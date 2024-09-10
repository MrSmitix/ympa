package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.vertxweb.server.model.UpdateStockDTO;

/**
 * Запрос на изменение информации по остаткам товаров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateStocksRequest   {
  
  private Set<UpdateStockDTO> skus = new LinkedHashSet<>();

  public UpdateStocksRequest () {

  }

  public UpdateStocksRequest (Set<UpdateStockDTO> skus) {
    this.skus = skus;
  }

    
  @JsonProperty("skus")
  public Set<UpdateStockDTO> getSkus() {
    return skus;
  }
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
