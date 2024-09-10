package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация об акции.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoDTO   {
  
  private String id;
  private String name;
  private PromoPeriodDTO period;
  private Boolean participating;
  private GetPromoAssortmentInfoDTO assortmentInfo;
  private GetPromoMechanicsInfoDTO mechanicsInfo;
  private GetPromoBestsellerInfoDTO bestsellerInfo;
  private List<@Valid ChannelType> channels;
  private GetPromoConstraintsDTO constraints;

  /**
   * Идентификатор акции.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Название акции.
   **/
  
  @ApiModelProperty(required = true, value = "Название акции.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("period")
  @NotNull
  public PromoPeriodDTO getPeriod() {
    return period;
  }
  public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

  /**
   * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   **/
  
  @ApiModelProperty(required = true, value = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
  @JsonProperty("participating")
  @NotNull
  public Boolean getParticipating() {
    return participating;
  }
  public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("assortmentInfo")
  @NotNull
  public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }
  public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mechanicsInfo")
  @NotNull
  public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }
  public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bestsellerInfo")
  @NotNull
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }
  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  /**
   * Список каналов продвижения товаров.
   **/
  
  @ApiModelProperty(value = "Список каналов продвижения товаров.")
  @JsonProperty("channels")
  public List<@Valid ChannelType> getChannels() {
    return channels;
  }
  public void setChannels(List<@Valid ChannelType> channels) {
    this.channels = channels;
  }

  /**
   **/
  
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

