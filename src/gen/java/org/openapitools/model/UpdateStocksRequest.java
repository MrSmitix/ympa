package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос на изменение информации по остаткам товаров.
 **/
@ApiModel(description = "Запрос на изменение информации по остаткам товаров.")
@JsonTypeName("UpdateStocksRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateStocksRequest   {
  private @Valid Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();

  /**
   * Данные об остатках товаров. 
   **/
  public UpdateStocksRequest skus(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Данные об остатках товаров. ")
  @JsonProperty("skus")
  @NotNull @Valid  @Size(min=1,max=2000)public Set<@Valid UpdateStockDTO> getSkus() {
    return skus;
  }

  @JsonProperty("skus")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSkus(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
  }

  public UpdateStocksRequest addSkusItem(UpdateStockDTO skusItem) {
    if (this.skus == null) {
      this.skus = new LinkedHashSet<>();
    }

    this.skus.add(skusItem);
    return this;
  }

  public UpdateStocksRequest removeSkusItem(UpdateStockDTO skusItem) {
    if (skusItem != null && this.skus != null) {
      this.skus.remove(skusItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

