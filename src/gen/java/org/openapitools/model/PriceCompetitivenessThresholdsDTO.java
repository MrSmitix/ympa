package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasePriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 **/
@ApiModel(description = "Максимальные значения цены, при которых она является привлекательной или умеренной.")
@JsonTypeName("PriceCompetitivenessThresholdsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceCompetitivenessThresholdsDTO   {
  private BasePriceDTO optimalPrice;
  private BasePriceDTO averagePrice;

  /**
   **/
  public PriceCompetitivenessThresholdsDTO optimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optimalPrice")
  @Valid public BasePriceDTO getOptimalPrice() {
    return optimalPrice;
  }

  @JsonProperty("optimalPrice")
  public void setOptimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
  }

  /**
   **/
  public PriceCompetitivenessThresholdsDTO averagePrice(BasePriceDTO averagePrice) {
    this.averagePrice = averagePrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("averagePrice")
  @Valid public BasePriceDTO getAveragePrice() {
    return averagePrice;
  }

  @JsonProperty("averagePrice")
  public void setAveragePrice(BasePriceDTO averagePrice) {
    this.averagePrice = averagePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO = (PriceCompetitivenessThresholdsDTO) o;
    return Objects.equals(this.optimalPrice, priceCompetitivenessThresholdsDTO.optimalPrice) &&
        Objects.equals(this.averagePrice, priceCompetitivenessThresholdsDTO.averagePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimalPrice, averagePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceCompetitivenessThresholdsDTO {\n");
    
    sb.append("    optimalPrice: ").append(toIndentedString(optimalPrice)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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

