/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о товарах в акции.
 */
@ApiModel(description = "Информация о товарах в акции.")
@JsonPropertyOrder({
  GetPromoAssortmentInfoDTO.JSON_PROPERTY_ACTIVE_OFFERS,
  GetPromoAssortmentInfoDTO.JSON_PROPERTY_POTENTIAL_OFFERS,
  GetPromoAssortmentInfoDTO.JSON_PROPERTY_PROCESSING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoAssortmentInfoDTO   {
  public static final String JSON_PROPERTY_ACTIVE_OFFERS = "activeOffers";
  @JsonProperty(JSON_PROPERTY_ACTIVE_OFFERS)
  private Integer activeOffers;

  public static final String JSON_PROPERTY_POTENTIAL_OFFERS = "potentialOffers";
  @JsonProperty(JSON_PROPERTY_POTENTIAL_OFFERS)
  private Integer potentialOffers;

  public static final String JSON_PROPERTY_PROCESSING = "processing";
  @JsonProperty(JSON_PROPERTY_PROCESSING)
  private Boolean processing;

  public GetPromoAssortmentInfoDTO activeOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
    return this;
  }

  /**
   * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   * @return activeOffers
   **/
  @JsonProperty(value = "activeOffers")
  @ApiModelProperty(required = true, value = "Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  @NotNull 
  public Integer getActiveOffers() {
    return activeOffers;
  }

  public void setActiveOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
  }

  public GetPromoAssortmentInfoDTO potentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
    return this;
  }

  /**
   * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
   * @return potentialOffers
   **/
  @JsonProperty(value = "potentialOffers")
  @ApiModelProperty(value = "Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. ")
  
  public Integer getPotentialOffers() {
    return potentialOffers;
  }

  public void setPotentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
  }

  public GetPromoAssortmentInfoDTO processing(Boolean processing) {
    this.processing = processing;
    return this;
  }

  /**
   * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
   * @return processing
   **/
  @JsonProperty(value = "processing")
  @ApiModelProperty(value = "Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. ")
  
  public Boolean getProcessing() {
    return processing;
  }

  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO = (GetPromoAssortmentInfoDTO) o;
    return Objects.equals(this.activeOffers, getPromoAssortmentInfoDTO.activeOffers) &&
        Objects.equals(this.potentialOffers, getPromoAssortmentInfoDTO.potentialOffers) &&
        Objects.equals(this.processing, getPromoAssortmentInfoDTO.processing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOffers, potentialOffers, processing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoAssortmentInfoDTO {\n");
    
    sb.append("    activeOffers: ").append(toIndentedString(activeOffers)).append("\n");
    sb.append("    potentialOffers: ").append(toIndentedString(potentialOffers)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
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

