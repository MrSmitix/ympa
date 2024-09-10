package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ModelPriceDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Модель товара.
 */

@Schema(name = "ModelDTO", description = "Модель товара.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelDTO {

  private Long id;

  private String name;

  private ModelPriceDTO prices;

  public ModelDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор модели товара.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор модели товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ModelDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название модели товара.
   * @return name
   */
  
  @Schema(name = "name", description = "Название модели товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelDTO prices(ModelPriceDTO prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
   */
  @Valid 
  @Schema(name = "prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }

  public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDTO modelDTO = (ModelDTO) o;
    return Objects.equals(this.id, modelDTO.id) &&
        Objects.equals(this.name, modelDTO.name) &&
        Objects.equals(this.prices, modelDTO.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

