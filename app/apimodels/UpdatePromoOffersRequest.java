package apimodels;

import apimodels.UpdatePromoOfferDTO;
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
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePromoOffersRequest   {
  @JsonProperty("promoId")
  @NotNull

  private String promoId;

  @JsonProperty("offers")
  @NotNull
@Size(min=1,max=500)
@Valid

  private List<@Valid UpdatePromoOfferDTO> offers = new ArrayList<>();

  public UpdatePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

   /**
   * Идентификатор акции.
   * @return promoId
  **/
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public UpdatePromoOffersRequest offers(List<@Valid UpdatePromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdatePromoOffersRequest addOffersItem(UpdatePromoOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
   * @return offers
  **/
  public List<@Valid UpdatePromoOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid UpdatePromoOfferDTO> offers) {
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
    UpdatePromoOffersRequest updatePromoOffersRequest = (UpdatePromoOffersRequest) o;
    return Objects.equals(promoId, updatePromoOffersRequest.promoId) &&
        Objects.equals(offers, updatePromoOffersRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, offers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
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

