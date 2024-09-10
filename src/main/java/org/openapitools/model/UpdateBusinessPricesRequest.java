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
import org.openapitools.model.UpdateBusinessOfferPriceDTO;



/**
 * Запрос на установку базовых цен на товары.
 */

@ApiModel(description = "Запрос на установку базовых цен на товары.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateBusinessPricesRequest   {
  
  private List<UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

  /**
   * Список товаров с ценами.
   */
  public UpdateBusinessPricesRequest offers(List<UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров с ценами.")
  @JsonProperty("offers")
  public List<UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<UpdateBusinessOfferPriceDTO> offers) {
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

