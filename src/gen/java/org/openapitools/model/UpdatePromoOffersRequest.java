package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePromoOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 */
@ApiModel(description="Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. ")

public class UpdatePromoOffersRequest  {
  
 /**
  * Идентификатор акции.
  */
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  private String promoId;

 /**
  * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  */
  @ApiModelProperty(required = true, value = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
  @Valid
  private List<@Valid UpdatePromoOfferDTO> offers = new ArrayList<>();
 /**
  * Идентификатор акции.
  * @return promoId
  */
  @JsonProperty("promoId")
  @NotNull
  public String getPromoId() {
    return promoId;
  }

  /**
   * Sets the <code>promoId</code> property.
   */
 public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   * Sets the <code>promoId</code> property.
   */
  public UpdatePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

 /**
  * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdatePromoOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid UpdatePromoOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public UpdatePromoOffersRequest offers(List<@Valid UpdatePromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
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

