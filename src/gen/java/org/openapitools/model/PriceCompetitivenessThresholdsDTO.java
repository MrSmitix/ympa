package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.BasePriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */
@ApiModel(description="Максимальные значения цены, при которых она является привлекательной или умеренной.")

public class PriceCompetitivenessThresholdsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BasePriceDTO optimalPrice;

  @ApiModelProperty(value = "")
  @Valid
  private BasePriceDTO averagePrice;
 /**
  * Get optimalPrice
  * @return optimalPrice
  */
  @JsonProperty("optimalPrice")
  public BasePriceDTO getOptimalPrice() {
    return optimalPrice;
  }

  /**
   * Sets the <code>optimalPrice</code> property.
   */
 public void setOptimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
  }

  /**
   * Sets the <code>optimalPrice</code> property.
   */
  public PriceCompetitivenessThresholdsDTO optimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
    return this;
  }

 /**
  * Get averagePrice
  * @return averagePrice
  */
  @JsonProperty("averagePrice")
  public BasePriceDTO getAveragePrice() {
    return averagePrice;
  }

  /**
   * Sets the <code>averagePrice</code> property.
   */
 public void setAveragePrice(BasePriceDTO averagePrice) {
    this.averagePrice = averagePrice;
  }

  /**
   * Sets the <code>averagePrice</code> property.
   */
  public PriceCompetitivenessThresholdsDTO averagePrice(BasePriceDTO averagePrice) {
    this.averagePrice = averagePrice;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

