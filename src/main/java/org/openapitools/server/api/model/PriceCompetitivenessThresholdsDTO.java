package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BasePriceDTO;

/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceCompetitivenessThresholdsDTO   {
  
  private BasePriceDTO optimalPrice;
  private BasePriceDTO averagePrice;

  public PriceCompetitivenessThresholdsDTO () {

  }

  public PriceCompetitivenessThresholdsDTO (BasePriceDTO optimalPrice, BasePriceDTO averagePrice) {
    this.optimalPrice = optimalPrice;
    this.averagePrice = averagePrice;
  }

    
  @JsonProperty("optimalPrice")
  public BasePriceDTO getOptimalPrice() {
    return optimalPrice;
  }
  public void setOptimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
  }

    
  @JsonProperty("averagePrice")
  public BasePriceDTO getAveragePrice() {
    return averagePrice;
  }
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
    return Objects.equals(optimalPrice, priceCompetitivenessThresholdsDTO.optimalPrice) &&
        Objects.equals(averagePrice, priceCompetitivenessThresholdsDTO.averagePrice);
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
