/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePromoOfferDTO;



/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 */

@ApiModel(description = "Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersRequest   {
  
  private String promoId;
  private List<UpdatePromoOfferDTO> offers = new ArrayList<>();

  /**
   * Идентификатор акции.
   */
  public UpdatePromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
   */
  public UpdatePromoOffersRequest offers(List<UpdatePromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
  @JsonProperty("offers")
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
    return Objects.equals(promoId, updatePromoOffersRequest.promoId) &&
        Objects.equals(offers, updatePromoOffersRequest.offers);
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

