package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о товарах в акции.
 **/

@ApiModel(description = "Информация о товарах в акции.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoAssortmentInfoDTO   {
  @JsonProperty("activeOffers")
  private Integer activeOffers;

  @JsonProperty("potentialOffers")
  private Integer potentialOffers;

  @JsonProperty("processing")
  private Boolean processing;

  /**
   * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   **/
  public GetPromoAssortmentInfoDTO activeOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  @JsonProperty("activeOffers")
  public Integer getActiveOffers() {
    return activeOffers;
  }
  public void setActiveOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
  }

  /**
   * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
   **/
  public GetPromoAssortmentInfoDTO potentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. ")
  @JsonProperty("potentialOffers")
  public Integer getPotentialOffers() {
    return potentialOffers;
  }
  public void setPotentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
  }

  /**
   * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
   **/
  public GetPromoAssortmentInfoDTO processing(Boolean processing) {
    this.processing = processing;
    return this;
  }

  
  @ApiModelProperty(value = "Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. ")
  @JsonProperty("processing")
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
    return Objects.equals(activeOffers, getPromoAssortmentInfoDTO.activeOffers) &&
        Objects.equals(potentialOffers, getPromoAssortmentInfoDTO.potentialOffers) &&
        Objects.equals(processing, getPromoAssortmentInfoDTO.processing);
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

