package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionDTO;
import org.openapitools.model.ReturnInstanceDTO;
import org.openapitools.model.TrackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров в возврате.
 **/
@ApiModel(description="Список товаров в возврате.")

public class ReturnItemDTO  {
  
  @ApiModelProperty(value = "SKU на Маркете.")
 /**
   * SKU на Маркете.
  **/
  private Long marketSku;

  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String shopSku;

  @ApiModelProperty(required = true, value = "Количество единиц товара.")
 /**
   * Количество единиц товара.
  **/
  private Long count;

  @ApiModelProperty(value = "Список решений по возврату.")
  @Valid
 /**
   * Список решений по возврату.
  **/
  private List<@Valid ReturnDecisionDTO> decisions;

  @ApiModelProperty(value = "Список логистических позиций возврата.")
  @Valid
 /**
   * Список логистических позиций возврата.
  **/
  private List<@Valid ReturnInstanceDTO> instances;

  @ApiModelProperty(value = "Список трек-кодов для почтовых отправлений.")
  @Valid
 /**
   * Список трек-кодов для почтовых отправлений.
  **/
  private List<@Valid TrackDTO> tracks;
 /**
   * SKU на Маркете.
   * @return marketSku
  **/
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public ReturnItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  @JsonProperty("shopSku")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public ReturnItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

 /**
   * Количество единиц товара.
   * @return count
  **/
  @JsonProperty("count")
  @NotNull
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ReturnItemDTO count(Long count) {
    this.count = count;
    return this;
  }

 /**
   * Список решений по возврату.
   * @return decisions
  **/
  @JsonProperty("decisions")
  public List<@Valid ReturnDecisionDTO> getDecisions() {
    return decisions;
  }

  public void setDecisions(List<@Valid ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
  }

  public ReturnItemDTO decisions(List<@Valid ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
    return this;
  }

  public ReturnItemDTO addDecisionsItem(ReturnDecisionDTO decisionsItem) {
    this.decisions.add(decisionsItem);
    return this;
  }

 /**
   * Список логистических позиций возврата.
   * @return instances
  **/
  @JsonProperty("instances")
  public List<@Valid ReturnInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid ReturnInstanceDTO> instances) {
    this.instances = instances;
  }

  public ReturnItemDTO instances(List<@Valid ReturnInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public ReturnItemDTO addInstancesItem(ReturnInstanceDTO instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

 /**
   * Список трек-кодов для почтовых отправлений.
   * @return tracks
  **/
  @JsonProperty("tracks")
  public List<@Valid TrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<@Valid TrackDTO> tracks) {
    this.tracks = tracks;
  }

  public ReturnItemDTO tracks(List<@Valid TrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  public ReturnItemDTO addTracksItem(TrackDTO tracksItem) {
    this.tracks.add(tracksItem);
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
    ReturnItemDTO returnItemDTO = (ReturnItemDTO) o;
    return Objects.equals(this.marketSku, returnItemDTO.marketSku) &&
        Objects.equals(this.shopSku, returnItemDTO.shopSku) &&
        Objects.equals(this.count, returnItemDTO.count) &&
        Objects.equals(this.decisions, returnItemDTO.decisions) &&
        Objects.equals(this.instances, returnItemDTO.instances) &&
        Objects.equals(this.tracks, returnItemDTO.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, shopSku, count, decisions, instances, tracks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnItemDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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

