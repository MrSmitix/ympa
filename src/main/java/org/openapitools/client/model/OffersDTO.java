/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.OfferDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Найденные предложения магазина.
 **/
@ApiModel(description = "Найденные предложения магазина.")
public class OffersDTO {
  
  @SerializedName("offers")
  private List<OfferDTO> offers = null;

  /**
   * Список предложений магазина.
   **/
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  public List<OfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferDTO> offers) {
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
    OffersDTO offersDTO = (OffersDTO) o;
    return (this.offers == null ? offersDTO.offers == null : this.offers.equals(offersDTO.offers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offers == null ? 0: this.offers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersDTO {\n");
    
    sb.append("  offers: ").append(offers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
