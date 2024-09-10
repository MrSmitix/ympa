package apimodels;

import apimodels.OfferPriceByOfferIdsResponseDTO;
import apimodels.ScrollingPagerDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список цен.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferPriceByOfferIdsListResponseDTO   {
  @JsonProperty("offers")
  @NotNull
@Valid

  private List<@Valid OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  public OfferPriceByOfferIdsListResponseDTO offers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferPriceByOfferIdsListResponseDTO addOffersItem(OfferPriceByOfferIdsResponseDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Страница списка цен.
   * @return offers
  **/
  public List<@Valid OfferPriceByOfferIdsResponseDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceByOfferIdsListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceByOfferIdsListResponseDTO offerPriceByOfferIdsListResponseDTO = (OfferPriceByOfferIdsListResponseDTO) o;
    return Objects.equals(offers, offerPriceByOfferIdsListResponseDTO.offers) &&
        Objects.equals(paging, offerPriceByOfferIdsListResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceByOfferIdsListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

