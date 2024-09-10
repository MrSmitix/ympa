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
import org.openapitools.client.model.CalculateTariffsOfferDTO;
import org.openapitools.client.model.CalculateTariffsParametersDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CalculateTariffsRequest {
  
  @SerializedName("parameters")
  private CalculateTariffsParametersDTO parameters = null;
  @SerializedName("offers")
  private List<CalculateTariffsOfferDTO> offers = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }
  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  /**
   * Товары, для которых нужно рассчитать стоимость услуг.
   **/
  @ApiModelProperty(required = true, value = "Товары, для которых нужно рассчитать стоимость услуг.")
  public List<CalculateTariffsOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<CalculateTariffsOfferDTO> offers) {
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
    CalculateTariffsRequest calculateTariffsRequest = (CalculateTariffsRequest) o;
    return (this.parameters == null ? calculateTariffsRequest.parameters == null : this.parameters.equals(calculateTariffsRequest.parameters)) &&
        (this.offers == null ? calculateTariffsRequest.offers == null : this.offers.equals(calculateTariffsRequest.offers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.parameters == null ? 0: this.parameters.hashCode());
    result = 31 * result + (this.offers == null ? 0: this.offers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsRequest {\n");
    
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("  offers: ").append(offers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
