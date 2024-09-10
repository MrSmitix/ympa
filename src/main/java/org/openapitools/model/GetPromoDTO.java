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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChannelType;
import org.openapitools.model.GetPromoAssortmentInfoDTO;
import org.openapitools.model.GetPromoBestsellerInfoDTO;
import org.openapitools.model.GetPromoConstraintsDTO;
import org.openapitools.model.GetPromoMechanicsInfoDTO;
import org.openapitools.model.PromoPeriodDTO;



/**
 * Информация об акции.
 */

@ApiModel(description = "Информация об акции.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoDTO   {
  
  private String id;
  private String name;
  private PromoPeriodDTO period;
  private Boolean participating;
  private GetPromoAssortmentInfoDTO assortmentInfo;
  private GetPromoMechanicsInfoDTO mechanicsInfo;
  private GetPromoBestsellerInfoDTO bestsellerInfo;
  private List<ChannelType> channels;
  private GetPromoConstraintsDTO constraints;

  /**
   * Идентификатор акции.
   */
  public GetPromoDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Название акции.
   */
  public GetPromoDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название акции.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public GetPromoDTO period(PromoPeriodDTO period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("period")
  public PromoPeriodDTO getPeriod() {
    return period;
  }
  public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

  /**
   * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   */
  public GetPromoDTO participating(Boolean participating) {
    this.participating = participating;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  @JsonProperty("participating")
  public Boolean getParticipating() {
    return participating;
  }
  public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

  /**
   */
  public GetPromoDTO assortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("assortmentInfo")
  public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }
  public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

  /**
   */
  public GetPromoDTO mechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mechanicsInfo")
  public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }
  public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

  /**
   */
  public GetPromoDTO bestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bestsellerInfo")
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }
  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  /**
   * Список каналов продвижения товаров.
   */
  public GetPromoDTO channels(List<ChannelType> channels) {
    this.channels = channels;
    return this;
  }

  
  @ApiModelProperty(value = "Список каналов продвижения товаров.")
  @JsonProperty("channels")
  public List<ChannelType> getChannels() {
    return channels;
  }
  public void setChannels(List<ChannelType> channels) {
    this.channels = channels;
  }

  /**
   */
  public GetPromoDTO constraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  public GetPromoConstraintsDTO getConstraints() {
    return constraints;
  }
  public void setConstraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoDTO getPromoDTO = (GetPromoDTO) o;
    return Objects.equals(id, getPromoDTO.id) &&
        Objects.equals(name, getPromoDTO.name) &&
        Objects.equals(period, getPromoDTO.period) &&
        Objects.equals(participating, getPromoDTO.participating) &&
        Objects.equals(assortmentInfo, getPromoDTO.assortmentInfo) &&
        Objects.equals(mechanicsInfo, getPromoDTO.mechanicsInfo) &&
        Objects.equals(bestsellerInfo, getPromoDTO.bestsellerInfo) &&
        Objects.equals(channels, getPromoDTO.channels) &&
        Objects.equals(constraints, getPromoDTO.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, period, participating, assortmentInfo, mechanicsInfo, bestsellerInfo, channels, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    participating: ").append(toIndentedString(participating)).append("\n");
    sb.append("    assortmentInfo: ").append(toIndentedString(assortmentInfo)).append("\n");
    sb.append("    mechanicsInfo: ").append(toIndentedString(mechanicsInfo)).append("\n");
    sb.append("    bestsellerInfo: ").append(toIndentedString(bestsellerInfo)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

