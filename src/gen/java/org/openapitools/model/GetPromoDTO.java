package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об акции.
 */
@ApiModel(description="Информация об акции.")

public class GetPromoDTO  {
  
 /**
  * Идентификатор акции.
  */
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  private String id;

 /**
  * Название акции.
  */
  @ApiModelProperty(required = true, value = "Название акции.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PromoPeriodDTO period;

 /**
  * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  */
  @ApiModelProperty(required = true, value = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  private Boolean participating;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GetPromoAssortmentInfoDTO assortmentInfo;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GetPromoMechanicsInfoDTO mechanicsInfo;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GetPromoBestsellerInfoDTO bestsellerInfo;

 /**
  * Список каналов продвижения товаров.
  */
  @ApiModelProperty(value = "Список каналов продвижения товаров.")
  @Valid
  private List<@Valid ChannelType> channels;

  @ApiModelProperty(value = "")
  @Valid
  private GetPromoConstraintsDTO constraints;
 /**
  * Идентификатор акции.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public GetPromoDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Название акции.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public GetPromoDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get period
  * @return period
  */
  @JsonProperty("period")
  @NotNull
  public PromoPeriodDTO getPeriod() {
    return period;
  }

  /**
   * Sets the <code>period</code> property.
   */
 public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

  /**
   * Sets the <code>period</code> property.
   */
  public GetPromoDTO period(PromoPeriodDTO period) {
    this.period = period;
    return this;
  }

 /**
  * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  * @return participating
  */
  @JsonProperty("participating")
  @NotNull
  public Boolean getParticipating() {
    return participating;
  }

  /**
   * Sets the <code>participating</code> property.
   */
 public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

  /**
   * Sets the <code>participating</code> property.
   */
  public GetPromoDTO participating(Boolean participating) {
    this.participating = participating;
    return this;
  }

 /**
  * Get assortmentInfo
  * @return assortmentInfo
  */
  @JsonProperty("assortmentInfo")
  @NotNull
  public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }

  /**
   * Sets the <code>assortmentInfo</code> property.
   */
 public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

  /**
   * Sets the <code>assortmentInfo</code> property.
   */
  public GetPromoDTO assortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
    return this;
  }

 /**
  * Get mechanicsInfo
  * @return mechanicsInfo
  */
  @JsonProperty("mechanicsInfo")
  @NotNull
  public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }

  /**
   * Sets the <code>mechanicsInfo</code> property.
   */
 public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

  /**
   * Sets the <code>mechanicsInfo</code> property.
   */
  public GetPromoDTO mechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
    return this;
  }

 /**
  * Get bestsellerInfo
  * @return bestsellerInfo
  */
  @JsonProperty("bestsellerInfo")
  @NotNull
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }

  /**
   * Sets the <code>bestsellerInfo</code> property.
   */
 public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  /**
   * Sets the <code>bestsellerInfo</code> property.
   */
  public GetPromoDTO bestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
    return this;
  }

 /**
  * Список каналов продвижения товаров.
  * @return channels
  */
  @JsonProperty("channels")
  public List<@Valid ChannelType> getChannels() {
    return channels;
  }

  /**
   * Sets the <code>channels</code> property.
   */
 public void setChannels(List<@Valid ChannelType> channels) {
    this.channels = channels;
  }

  /**
   * Sets the <code>channels</code> property.
   */
  public GetPromoDTO channels(List<@Valid ChannelType> channels) {
    this.channels = channels;
    return this;
  }

  /**
   * Adds a new item to the <code>channels</code> list.
   */
  public GetPromoDTO addChannelsItem(ChannelType channelsItem) {
    this.channels.add(channelsItem);
    return this;
  }

 /**
  * Get constraints
  * @return constraints
  */
  @JsonProperty("constraints")
  public GetPromoConstraintsDTO getConstraints() {
    return constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
 public void setConstraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
  public GetPromoDTO constraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
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
    GetPromoDTO getPromoDTO = (GetPromoDTO) o;
    return Objects.equals(this.id, getPromoDTO.id) &&
        Objects.equals(this.name, getPromoDTO.name) &&
        Objects.equals(this.period, getPromoDTO.period) &&
        Objects.equals(this.participating, getPromoDTO.participating) &&
        Objects.equals(this.assortmentInfo, getPromoDTO.assortmentInfo) &&
        Objects.equals(this.mechanicsInfo, getPromoDTO.mechanicsInfo) &&
        Objects.equals(this.bestsellerInfo, getPromoDTO.bestsellerInfo) &&
        Objects.equals(this.channels, getPromoDTO.channels) &&
        Objects.equals(this.constraints, getPromoDTO.constraints);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

