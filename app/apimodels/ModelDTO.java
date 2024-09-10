package apimodels;

import apimodels.ModelPriceDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Модель товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModelDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("prices")
  @Valid

  private ModelPriceDTO prices;

  public ModelDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор модели товара.
   * @return id
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, modelDTO.id) &&
        Objects.equals(name, modelDTO.name) &&
        Objects.equals(prices, modelDTO.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prices);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

