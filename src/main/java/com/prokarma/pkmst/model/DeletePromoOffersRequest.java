package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 */
@ApiModel(description = "Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeletePromoOffersRequest   {
  @JsonProperty("promoId")
  private String promoId;

  @JsonProperty("deleteAllOffers")
  private Boolean deleteAllOffers;

  @JsonProperty("offerIds")
  
  private List<String> offerIds = null;

  public DeletePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  /**
   * Идентификатор акции.
   * @return promoId
   */
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
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
   */
  @ApiModelProperty(value = "Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.")
  public Boolean getDeleteAllOffers() {
    return deleteAllOffers;
  }

  public void setDeleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
  }

  public DeletePromoOffersRequest offerIds(List<String> offerIds) {
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
   */
  @ApiModelProperty(value = "Товары, которые нужно убрать из акции.")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
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
    return Objects.equals(this.promoId, deletePromoOffersRequest.promoId) &&
        Objects.equals(this.deleteAllOffers, deletePromoOffersRequest.deleteAllOffers) &&
        Objects.equals(this.offerIds, deletePromoOffersRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, deleteAllOffers, offerIds);
  }

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

