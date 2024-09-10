package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.BasePriceDTO;
import org.openapitools.server.api.model.GetPriceDTO;
import org.openapitools.server.api.model.PriceCompetitivenessType;

/**
 * Информация о состоянии цены на товар.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferForRecommendationDTO   {
  
  private String offerId;
  private BasePriceDTO price;
  private GetPriceDTO cofinancePrice;
  private PriceCompetitivenessType competitiveness;
  private Long shows;

  public OfferForRecommendationDTO () {

  }

  public OfferForRecommendationDTO (String offerId, BasePriceDTO price, GetPriceDTO cofinancePrice, PriceCompetitivenessType competitiveness, Long shows) {
    this.offerId = offerId;
    this.price = price;
    this.cofinancePrice = cofinancePrice;
    this.competitiveness = competitiveness;
    this.shows = shows;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("price")
  public BasePriceDTO getPrice() {
    return price;
  }
  public void setPrice(BasePriceDTO price) {
    this.price = price;
  }

    
  @JsonProperty("cofinancePrice")
  public GetPriceDTO getCofinancePrice() {
    return cofinancePrice;
  }
  public void setCofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }

    
  @JsonProperty("competitiveness")
  public PriceCompetitivenessType getCompetitiveness() {
    return competitiveness;
  }
  public void setCompetitiveness(PriceCompetitivenessType competitiveness) {
    this.competitiveness = competitiveness;
  }

    
  @JsonProperty("shows")
  public Long getShows() {
    return shows;
  }
  public void setShows(Long shows) {
    this.shows = shows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferForRecommendationDTO offerForRecommendationDTO = (OfferForRecommendationDTO) o;
    return Objects.equals(offerId, offerForRecommendationDTO.offerId) &&
        Objects.equals(price, offerForRecommendationDTO.price) &&
        Objects.equals(cofinancePrice, offerForRecommendationDTO.cofinancePrice) &&
        Objects.equals(competitiveness, offerForRecommendationDTO.competitiveness) &&
        Objects.equals(shows, offerForRecommendationDTO.shows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, price, cofinancePrice, competitiveness, shows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferForRecommendationDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cofinancePrice: ").append(toIndentedString(cofinancePrice)).append("\n");
    sb.append("    competitiveness: ").append(toIndentedString(competitiveness)).append("\n");
    sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
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
