package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdatePromoOfferDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */
@ApiModel(description = "Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersRequest   {
  @JsonProperty("promoId")
  private String promoId;

  @JsonProperty("offers")
  
  private List<UpdatePromoOfferDTO> offers = new ArrayList<>();

  public UpdatePromoOffersRequest promoId(String promoId) {
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

  public UpdatePromoOffersRequest offers(List<UpdatePromoOfferDTO> offers) {
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
   */
  @ApiModelProperty(required = true, value = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
  public List<UpdatePromoOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<UpdatePromoOfferDTO> offers) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

