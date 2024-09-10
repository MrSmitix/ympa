package apimodels;

import apimodels.OfferPriceResponseDTO;
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
 * Список цен на товары.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferPriceListResponseDTO   {
  @JsonProperty("offers")
  @NotNull
@Valid

  private List<@Valid OfferPriceResponseDTO> offers = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("total")
  
  private Integer total;

  public OfferPriceListResponseDTO offers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferPriceListResponseDTO addOffersItem(OfferPriceResponseDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Страница списка.
   * @return offers
  **/
  public List<@Valid OfferPriceResponseDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid OfferPriceResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceListResponseDTO paging(ScrollingPagerDTO paging) {
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

  public OfferPriceListResponseDTO total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Количество всех цен магазина, измененных через API.
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceListResponseDTO offerPriceListResponseDTO = (OfferPriceListResponseDTO) o;
    return Objects.equals(offers, offerPriceListResponseDTO.offers) &&
        Objects.equals(paging, offerPriceListResponseDTO.paging) &&
        Objects.equals(total, offerPriceListResponseDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging, total);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

