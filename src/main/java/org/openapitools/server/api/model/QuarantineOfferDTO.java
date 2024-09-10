package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BasePriceDTO;
import org.openapitools.server.api.model.PriceQuarantineVerdictDTO;

/**
 * Товар в карантине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuarantineOfferDTO   {
  
  private String offerId;
  private BasePriceDTO currentPrice;
  private BasePriceDTO lastValidPrice;
  private List<PriceQuarantineVerdictDTO> verdicts;

  public QuarantineOfferDTO () {

  }

  public QuarantineOfferDTO (String offerId, BasePriceDTO currentPrice, BasePriceDTO lastValidPrice, List<PriceQuarantineVerdictDTO> verdicts) {
    this.offerId = offerId;
    this.currentPrice = currentPrice;
    this.lastValidPrice = lastValidPrice;
    this.verdicts = verdicts;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("currentPrice")
  public BasePriceDTO getCurrentPrice() {
    return currentPrice;
  }
  public void setCurrentPrice(BasePriceDTO currentPrice) {
    this.currentPrice = currentPrice;
  }

    
  @JsonProperty("lastValidPrice")
  public BasePriceDTO getLastValidPrice() {
    return lastValidPrice;
  }
  public void setLastValidPrice(BasePriceDTO lastValidPrice) {
    this.lastValidPrice = lastValidPrice;
  }

    
  @JsonProperty("verdicts")
  public List<PriceQuarantineVerdictDTO> getVerdicts() {
    return verdicts;
  }
  public void setVerdicts(List<PriceQuarantineVerdictDTO> verdicts) {
    this.verdicts = verdicts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineOfferDTO quarantineOfferDTO = (QuarantineOfferDTO) o;
    return Objects.equals(offerId, quarantineOfferDTO.offerId) &&
        Objects.equals(currentPrice, quarantineOfferDTO.currentPrice) &&
        Objects.equals(lastValidPrice, quarantineOfferDTO.lastValidPrice) &&
        Objects.equals(verdicts, quarantineOfferDTO.verdicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, currentPrice, lastValidPrice, verdicts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    lastValidPrice: ").append(toIndentedString(lastValidPrice)).append("\n");
    sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
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
