package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товарах в акции.
 */
@ApiModel(description="Информация о товарах в акции.")

public class GetPromoAssortmentInfoDTO  {
  
 /**
  * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  */
  @ApiModelProperty(required = true, value = "Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  private Integer activeOffers;

 /**
  * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
  */
  @ApiModelProperty(value = "Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. ")
  private Integer potentialOffers;

 /**
  * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
  */
  @ApiModelProperty(value = "Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. ")
  private Boolean processing;
 /**
  * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  * @return activeOffers
  */
  @JsonProperty("activeOffers")
  @NotNull
  public Integer getActiveOffers() {
    return activeOffers;
  }

  /**
   * Sets the <code>activeOffers</code> property.
   */
 public void setActiveOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
  }

  /**
   * Sets the <code>activeOffers</code> property.
   */
  public GetPromoAssortmentInfoDTO activeOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
    return this;
  }

 /**
  * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
  * @return potentialOffers
  */
  @JsonProperty("potentialOffers")
  public Integer getPotentialOffers() {
    return potentialOffers;
  }

  /**
   * Sets the <code>potentialOffers</code> property.
   */
 public void setPotentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
  }

  /**
   * Sets the <code>potentialOffers</code> property.
   */
  public GetPromoAssortmentInfoDTO potentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
    return this;
  }

 /**
  * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
  * @return processing
  */
  @JsonProperty("processing")
  public Boolean getProcessing() {
    return processing;
  }

  /**
   * Sets the <code>processing</code> property.
   */
 public void setProcessing(Boolean processing) {
    this.processing = processing;
  }

  /**
   * Sets the <code>processing</code> property.
   */
  public GetPromoAssortmentInfoDTO processing(Boolean processing) {
    this.processing = processing;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

