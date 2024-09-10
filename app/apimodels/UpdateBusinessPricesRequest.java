package apimodels;

import apimodels.UpdateBusinessOfferPriceDTO;
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
 * Запрос на установку базовых цен на товары.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateBusinessPricesRequest   {
  @JsonProperty("offers")
  @NotNull
@Size(min=1,max=500)
@Valid

  private List<@Valid UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

  public UpdateBusinessPricesRequest offers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateBusinessPricesRequest addOffersItem(UpdateBusinessOfferPriceDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Список товаров с ценами.
   * @return offers
  **/
  public List<@Valid UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
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
    UpdateBusinessPricesRequest updateBusinessPricesRequest = (UpdateBusinessPricesRequest) o;
    return Objects.equals(offers, updateBusinessPricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessPricesRequest {\n");
    
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

