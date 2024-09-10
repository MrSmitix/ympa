package apimodels;

import apimodels.ChannelType;
import apimodels.GetPromoAssortmentInfoDTO;
import apimodels.GetPromoBestsellerInfoDTO;
import apimodels.GetPromoConstraintsDTO;
import apimodels.GetPromoMechanicsInfoDTO;
import apimodels.PromoPeriodDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об акции.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromoDTO   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("period")
  @NotNull
@Valid

  private PromoPeriodDTO period;

  @JsonProperty("participating")
  @NotNull

  private Boolean participating;

  @JsonProperty("assortmentInfo")
  @NotNull
@Valid

  private GetPromoAssortmentInfoDTO assortmentInfo;

  @JsonProperty("mechanicsInfo")
  @NotNull
@Valid

  private GetPromoMechanicsInfoDTO mechanicsInfo;

  @JsonProperty("bestsellerInfo")
  @NotNull
@Valid

  private GetPromoBestsellerInfoDTO bestsellerInfo;

  @JsonProperty("channels")
  @Valid

  private List<@Valid ChannelType> channels = null;

  @JsonProperty("constraints")
  @Valid

  private GetPromoConstraintsDTO constraints;

  public GetPromoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор акции.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetPromoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название акции.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetPromoDTO period(PromoPeriodDTO period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  public PromoPeriodDTO getPeriod() {
    return period;
  }

  public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

  public GetPromoDTO participating(Boolean participating) {
    this.participating = participating;
    return this;
  }

   /**
   * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
   * @return participating
  **/
  public Boolean getParticipating() {
    return participating;
  }

  public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

  public GetPromoDTO assortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
    return this;
  }

   /**
   * Get assortmentInfo
   * @return assortmentInfo
  **/
  public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }

  public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

  public GetPromoDTO mechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
    return this;
  }

   /**
   * Get mechanicsInfo
   * @return mechanicsInfo
  **/
  public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }

  public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

  public GetPromoDTO bestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
    return this;
  }

   /**
   * Get bestsellerInfo
   * @return bestsellerInfo
  **/
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }

  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  public GetPromoDTO channels(List<@Valid ChannelType> channels) {
    this.channels = channels;
    return this;
  }

  public GetPromoDTO addChannelsItem(ChannelType channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Список каналов продвижения товаров.
   * @return channels
  **/
  public List<@Valid ChannelType> getChannels() {
    return channels;
  }

  public void setChannels(List<@Valid ChannelType> channels) {
    this.channels = channels;
  }

  public GetPromoDTO constraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

