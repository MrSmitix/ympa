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
import org.openapitools.client.model.HiddenOfferDTO;
import org.openapitools.client.model.ScrollingPagerDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Список скрытых вами товаров. 
 **/
@ApiModel(description = "Список скрытых вами товаров. ")
public class GetHiddenOffersResultDTO {
  
  @SerializedName("paging")
  private ScrollingPagerDTO paging = null;
  @SerializedName("hiddenOffers")
  private List<HiddenOfferDTO> hiddenOffers = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Список скрытых товаров.
   **/
  @ApiModelProperty(required = true, value = "Список скрытых товаров.")
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }
  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHiddenOffersResultDTO getHiddenOffersResultDTO = (GetHiddenOffersResultDTO) o;
    return (this.paging == null ? getHiddenOffersResultDTO.paging == null : this.paging.equals(getHiddenOffersResultDTO.paging)) &&
        (this.hiddenOffers == null ? getHiddenOffersResultDTO.hiddenOffers == null : this.hiddenOffers.equals(getHiddenOffersResultDTO.hiddenOffers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.paging == null ? 0: this.paging.hashCode());
    result = 31 * result + (this.hiddenOffers == null ? 0: this.hiddenOffers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHiddenOffersResultDTO {\n");
    
    sb.append("  paging: ").append(paging).append("\n");
    sb.append("  hiddenOffers: ").append(hiddenOffers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
