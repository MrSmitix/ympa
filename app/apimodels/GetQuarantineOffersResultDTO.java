package apimodels;

import apimodels.QuarantineOfferDTO;
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
 * Список товаров в карантине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetQuarantineOffersResultDTO   {
  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("offers")
  @NotNull
@Valid

  private List<@Valid QuarantineOfferDTO> offers = new ArrayList<>();

  public GetQuarantineOffersResultDTO paging(ScrollingPagerDTO paging) {
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

  public GetQuarantineOffersResultDTO offers(List<@Valid QuarantineOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetQuarantineOffersResultDTO addOffersItem(QuarantineOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Страница списка товаров в карантине.
   * @return offers
  **/
  public List<@Valid QuarantineOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid QuarantineOfferDTO> offers) {
    this.offers = offers;
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
    return Objects.equals(paging, getQuarantineOffersResultDTO.paging) &&
        Objects.equals(offers, getQuarantineOffersResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

