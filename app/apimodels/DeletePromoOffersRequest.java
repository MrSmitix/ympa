package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeletePromoOffersRequest   {
  @JsonProperty("promoId")
  @NotNull

  private String promoId;

  @JsonProperty("deleteAllOffers")
  
  private Boolean deleteAllOffers;

  @JsonProperty("offerIds")
  @Size(min=1,max=500)

  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  public DeletePromoOffersRequest promoId(String promoId) {
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

  public DeletePromoOffersRequest deleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
    return this;
  }

   /**
   * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
   * @return deleteAllOffers
  **/
  public Boolean getDeleteAllOffers() {
    return deleteAllOffers;
  }

  public void setDeleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
  }

  public DeletePromoOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public DeletePromoOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Товары, которые нужно убрать из акции.
   * @return offerIds
  **/
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePromoOffersRequest deletePromoOffersRequest = (DeletePromoOffersRequest) o;
    return Objects.equals(promoId, deletePromoOffersRequest.promoId) &&
        Objects.equals(deleteAllOffers, deletePromoOffersRequest.deleteAllOffers) &&
        Objects.equals(offerIds, deletePromoOffersRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, deleteAllOffers, offerIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePromoOffersRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    deleteAllOffers: ").append(toIndentedString(deleteAllOffers)).append("\n");
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

