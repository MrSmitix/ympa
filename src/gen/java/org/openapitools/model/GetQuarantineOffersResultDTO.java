package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuarantineOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров в карантине.
 **/
@ApiModel(description="Список товаров в карантине.")

public class GetQuarantineOffersResultDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

  @ApiModelProperty(required = true, value = "Страница списка товаров в карантине.")
  @Valid
 /**
   * Страница списка товаров в карантине.
  **/
  private List<@Valid QuarantineOfferDTO> offers = new ArrayList<>();
 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetQuarantineOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Страница списка товаров в карантине.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
  public List<@Valid QuarantineOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid QuarantineOfferDTO> offers) {
    this.offers = offers;
  }

  public GetQuarantineOffersResultDTO offers(List<@Valid QuarantineOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetQuarantineOffersResultDTO addOffersItem(QuarantineOfferDTO offersItem) {
    this.offers.add(offersItem);
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
    GetQuarantineOffersResultDTO getQuarantineOffersResultDTO = (GetQuarantineOffersResultDTO) o;
    return Objects.equals(this.paging, getQuarantineOffersResultDTO.paging) &&
        Objects.equals(this.offers, getQuarantineOffersResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuarantineOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

