package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 **/
@ApiModel(description = "Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. ")
@JsonTypeName("DeletePromoOffersRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeletePromoOffersRequest   {
  private String promoId;
  private Boolean deleteAllOffers;
  private @Valid List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

  /**
   * Идентификатор акции.
   **/
  public DeletePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("promoId")
  @NotNull public String getPromoId() {
    return promoId;
  }

  @JsonProperty("promoId")
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
   **/
  public DeletePromoOffersRequest deleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.")
  @JsonProperty("deleteAllOffers")
  public Boolean getDeleteAllOffers() {
    return deleteAllOffers;
  }

  @JsonProperty("deleteAllOffers")
  public void setDeleteAllOffers(Boolean deleteAllOffers) {
    this.deleteAllOffers = deleteAllOffers;
  }

  /**
   * Товары, которые нужно убрать из акции.
   **/
  public DeletePromoOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(value = "Товары, которые нужно убрать из акции.")
  @JsonProperty("offerIds")
   @Size(min=1,max=500)public List< @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)String> getOfferIds() {
    return offerIds;
  }

  @JsonProperty("offerIds")
  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public DeletePromoOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }

    this.offerIds.add(offerIdsItem);
    return this;
  }

  public DeletePromoOffersRequest removeOfferIdsItem(String offerIdsItem) {
    if (offerIdsItem != null && this.offerIds != null) {
      this.offerIds.remove(offerIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

