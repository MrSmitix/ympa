package apimodels;

import apimodels.UpdateStockDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Запрос на изменение информации по остаткам товаров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateStocksRequest   {
  @JsonProperty("skus")
  @NotNull
@Size(min=1,max=2000)
@Valid

  private Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();

  public UpdateStocksRequest skus(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  public UpdateStocksRequest addSkusItem(UpdateStockDTO skusItem) {
    if (this.skus == null) {
      this.skus = new LinkedHashSet<>();
    }
    this.skus.add(skusItem);
    return this;
  }

   /**
   * Данные об остатках товаров. 
   * @return skus
  **/
  public Set<@Valid UpdateStockDTO> getSkus() {
    return skus;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSkus(Set<@Valid UpdateStockDTO> skus) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

