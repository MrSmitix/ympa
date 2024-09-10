package apimodels;

import apimodels.BasePriceDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PriceCompetitivenessThresholdsDTO   {
  @JsonProperty("optimalPrice")
  @Valid

  private BasePriceDTO optimalPrice;

  @JsonProperty("averagePrice")
  @Valid

  private BasePriceDTO averagePrice;

  public PriceCompetitivenessThresholdsDTO optimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
    return this;
  }

   /**
   * Get optimalPrice
   * @return optimalPrice
  **/
  public BasePriceDTO getOptimalPrice() {
    return optimalPrice;
  }

  public void setOptimalPrice(BasePriceDTO optimalPrice) {
    this.optimalPrice = optimalPrice;
  }

  public PriceCompetitivenessThresholdsDTO averagePrice(BasePriceDTO averagePrice) {
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * Get averagePrice
   * @return averagePrice
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

