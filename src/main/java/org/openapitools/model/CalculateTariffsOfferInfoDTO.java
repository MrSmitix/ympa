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
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculatedTariffDTO;



/**
 * Стоимость услуг.
 */

@ApiModel(description = "Стоимость услуг.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferInfoDTO   {
  
  private CalculateTariffsOfferDTO offer;
  private List<CalculatedTariffDTO> tariffs = new ArrayList<>();

  /**
   */
  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offer")
  public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

  /**
   * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   */
  public CalculateTariffsOfferInfoDTO tariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  @JsonProperty("tariffs")
  public List<CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }
  public void setTariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO = (CalculateTariffsOfferInfoDTO) o;
    return Objects.equals(offer, calculateTariffsOfferInfoDTO.offer) &&
        Objects.equals(tariffs, calculateTariffsOfferInfoDTO.tariffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, tariffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsOfferInfoDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
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

