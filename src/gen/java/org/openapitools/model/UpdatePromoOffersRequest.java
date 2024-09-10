package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePromoOfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 **/
@ApiModel(description="Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. ")

public class UpdatePromoOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
 /**
   * Идентификатор акции.
  **/
  private String promoId;

  @ApiModelProperty(required = true, value = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
 /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  **/
  private List<UpdatePromoOfferDTO> offers = new ArrayList<>();
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

  public UpdatePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

 /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<UpdatePromoOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<UpdatePromoOfferDTO> offers) {
    this.offers = offers;
  }

  public UpdatePromoOffersRequest offers(List<UpdatePromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdatePromoOffersRequest addOffersItem(UpdatePromoOfferDTO offersItem) {
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
    UpdatePromoOffersRequest updatePromoOffersRequest = (UpdatePromoOffersRequest) o;
    return Objects.equals(this.promoId, updatePromoOffersRequest.promoId) &&
        Objects.equals(this.offers, updatePromoOffersRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, offers);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

