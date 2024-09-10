package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на изменение информации по остаткам товаров.
 */

@Schema(name = "UpdateStocksRequest", description = "Запрос на изменение информации по остаткам товаров.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateStocksRequest {

  @Valid
  private Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();

  public UpdateStocksRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateStocksRequest(Set<@Valid UpdateStockDTO> skus) {
    this.skus = skus;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 2000) 
  @Schema(name = "skus", description = "Данные об остатках товаров. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("skus")
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

