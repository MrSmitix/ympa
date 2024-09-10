package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об акции.
 **/
@ApiModel(description = "Информация об акции.")
@JsonTypeName("GetPromoDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoDTO   {
  private String id;
  private String name;
  private PromoPeriodDTO period;
  private Boolean participating;
  private GetPromoAssortmentInfoDTO assortmentInfo;
  private GetPromoMechanicsInfoDTO mechanicsInfo;
  private GetPromoBestsellerInfoDTO bestsellerInfo;
  private @Valid List<@Valid ChannelType> channels;
  private GetPromoConstraintsDTO constraints;

  /**
   * Идентификатор акции.
   **/
  public GetPromoDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Название акции.
   **/
  public GetPromoDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название акции.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public GetPromoDTO period(PromoPeriodDTO period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("period")
  @NotNull @Valid public PromoPeriodDTO getPeriod() {
    return period;
  }

  @JsonProperty("period")
  public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

  /**
   * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   **/
  public GetPromoDTO participating(Boolean participating) {
    this.participating = participating;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  @JsonProperty("participating")
  @NotNull public Boolean getParticipating() {
    return participating;
  }

  @JsonProperty("participating")
  public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

  /**
   **/
  public GetPromoDTO assortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("assortmentInfo")
  @NotNull @Valid public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }

  @JsonProperty("assortmentInfo")
  public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

  /**
   **/
  public GetPromoDTO mechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mechanicsInfo")
  @NotNull @Valid public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }

  @JsonProperty("mechanicsInfo")
  public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

  /**
   **/
  public GetPromoDTO bestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bestsellerInfo")
  @NotNull @Valid public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }

  @JsonProperty("bestsellerInfo")
  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  /**
   * Список каналов продвижения товаров.
   **/
  public GetPromoDTO channels(List<@Valid ChannelType> channels) {
    this.channels = channels;
    return this;
  }

  
  @ApiModelProperty(value = "Список каналов продвижения товаров.")
  @JsonProperty("channels")
  public List<ChannelType> getChannels() {
    return channels;
  }

  @JsonProperty("channels")
  public void setChannels(List<@Valid ChannelType> channels) {
    this.channels = channels;
  }

  public GetPromoDTO addChannelsItem(ChannelType channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }

    this.channels.add(channelsItem);
    return this;
  }

  public GetPromoDTO removeChannelsItem(ChannelType channelsItem) {
    if (channelsItem != null && this.channels != null) {
      this.channels.remove(channelsItem);
    }

    return this;
  }
  /**
   **/
  public GetPromoDTO constraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  @Valid public GetPromoConstraintsDTO getConstraints() {
    return constraints;
  }

  @JsonProperty("constraints")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

