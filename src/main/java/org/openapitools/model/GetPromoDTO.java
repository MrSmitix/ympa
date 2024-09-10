package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об акции.
 */

@Schema(name = "GetPromoDTO", description = "Информация об акции.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoDTO {

  private String id;

  private String name;

  private PromoPeriodDTO period;

  private Boolean participating;

  private GetPromoAssortmentInfoDTO assortmentInfo;

  private GetPromoMechanicsInfoDTO mechanicsInfo;

  private GetPromoBestsellerInfoDTO bestsellerInfo;

  @Valid
  private JsonNullable<List<@Valid ChannelType>> channels = JsonNullable.<List<@Valid ChannelType>>undefined();

  private GetPromoConstraintsDTO constraints;

  public GetPromoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromoDTO(String id, String name, PromoPeriodDTO period, Boolean participating, GetPromoAssortmentInfoDTO assortmentInfo, GetPromoMechanicsInfoDTO mechanicsInfo, GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.id = id;
    this.name = name;
    this.period = period;
    this.participating = participating;
    this.assortmentInfo = assortmentInfo;
    this.mechanicsInfo = mechanicsInfo;
    this.bestsellerInfo = bestsellerInfo;
  }

  public GetPromoDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор акции.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор акции.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "name", description = "Название акции.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @NotNull @Valid 
  @Schema(name = "period", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("period")
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
   */
  @NotNull 
  @Schema(name = "participating", description = "Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("participating")
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
   */
  @NotNull @Valid 
  @Schema(name = "assortmentInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assortmentInfo")
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
   */
  @NotNull @Valid 
  @Schema(name = "mechanicsInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mechanicsInfo")
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
   */
  @NotNull @Valid 
  @Schema(name = "bestsellerInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bestsellerInfo")
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }

  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

  public GetPromoDTO channels(List<@Valid ChannelType> channels) {
    this.channels = JsonNullable.of(channels);
    return this;
  }

  public GetPromoDTO addChannelsItem(ChannelType channelsItem) {
    if (this.channels == null || !this.channels.isPresent()) {
      this.channels = JsonNullable.of(new ArrayList<>());
    }
    this.channels.get().add(channelsItem);
    return this;
  }

  /**
   * Список каналов продвижения товаров.
   * @return channels
   */
  @Valid 
  @Schema(name = "channels", description = "Список каналов продвижения товаров.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channels")
  public JsonNullable<List<@Valid ChannelType>> getChannels() {
    return channels;
  }

  public void setChannels(JsonNullable<List<@Valid ChannelType>> channels) {
    this.channels = channels;
  }

  public GetPromoDTO constraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   */
  @Valid 
  @Schema(name = "constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.channels, getPromoDTO.channels) &&
        Objects.equals(this.constraints, getPromoDTO.constraints);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, period, participating, assortmentInfo, mechanicsInfo, bestsellerInfo, hashCodeNullable(channels), constraints);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

