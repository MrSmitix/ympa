package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 **/
@ApiModel(description="Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. ")

public class DeletePromoOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
 /**
   * Идентификатор акции.
  **/
  private String promoId;

  @ApiModelProperty(value = "Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.")
 /**
   * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
  **/
  private Boolean deleteAllOffers;

  @ApiModelProperty(value = "Товары, которые нужно убрать из акции.")
 /**
   * Товары, которые нужно убрать из акции.
  **/
  private List<String> offerIds;
 /**
   * Идентификатор акции.
   * @return promoId
  **/
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public DeletePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

 /**
   * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
   * @return deleteAllOffers
  **/
  @JsonProperty("deleteAllOffers")
  public Boolean getDeleteAllOffers() {
    return deleteAllOffers;
  }

  public void setDeleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
  }

  public DeletePromoOffersRequest deleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
    return this;
  }

 /**
   * Товары, которые нужно убрать из акции.
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public DeletePromoOffersRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public DeletePromoOffersRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

