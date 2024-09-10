package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PriceSuggestDTO;

/**
 * Товар с ценами для продвижения.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceSuggestOfferDTO   {
  
  private Long marketSku;
  private String offerId;
  private List<PriceSuggestDTO> priceSuggestion;

  public PriceSuggestOfferDTO () {

  }

  public PriceSuggestOfferDTO (Long marketSku, String offerId, List<PriceSuggestDTO> priceSuggestion) {
    this.marketSku = marketSku;
    this.offerId = offerId;
    this.priceSuggestion = priceSuggestion;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("priceSuggestion")
  public List<PriceSuggestDTO> getPriceSuggestion() {
    return priceSuggestion;
  }
  public void setPriceSuggestion(List<PriceSuggestDTO> priceSuggestion) {
    this.priceSuggestion = priceSuggestion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceSuggestOfferDTO priceSuggestOfferDTO = (PriceSuggestOfferDTO) o;
    return Objects.equals(marketSku, priceSuggestOfferDTO.marketSku) &&
        Objects.equals(offerId, priceSuggestOfferDTO.offerId) &&
        Objects.equals(priceSuggestion, priceSuggestOfferDTO.priceSuggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, offerId, priceSuggestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceSuggestOfferDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    priceSuggestion: ").append(toIndentedString(priceSuggestion)).append("\n");
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
