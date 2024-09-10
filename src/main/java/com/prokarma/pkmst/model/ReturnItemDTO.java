package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ReturnDecisionDTO;
import com.prokarma.pkmst.model.ReturnInstanceDTO;
import com.prokarma.pkmst.model.TrackDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список товаров в возврате.
 */
@ApiModel(description = "Список товаров в возврате.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnItemDTO   {
  @JsonProperty("marketSku")
  private Long marketSku;

  @JsonProperty("shopSku")
  private String shopSku;

  @JsonProperty("count")
  private Long count;

  @JsonProperty("decisions")
  
  private List<ReturnDecisionDTO> decisions = null;

  @JsonProperty("instances")
  
  private List<ReturnInstanceDTO> instances = null;

  @JsonProperty("tracks")
  
  private List<TrackDTO> tracks = null;

  public ReturnItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   */
  @ApiModelProperty(value = "SKU на Маркете.")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public ReturnItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public ReturnItemDTO count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Количество единиц товара.
   * @return count
   */
  @ApiModelProperty(required = true, value = "Количество единиц товара.")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ReturnItemDTO decisions(List<ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
    return this;
  }

  public ReturnItemDTO addDecisionsItem(ReturnDecisionDTO decisionsItem) {
    if (this.decisions == null) {
      this.decisions = new ArrayList<>();
    }
    this.decisions.add(decisionsItem);
    return this;
  }

  /**
   * Список решений по возврату.
   * @return decisions
   */
  @ApiModelProperty(value = "Список решений по возврату.")
  public List<ReturnDecisionDTO> getDecisions() {
    return decisions;
  }

  public void setDecisions(List<ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
  }

  public ReturnItemDTO instances(List<ReturnInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public ReturnItemDTO addInstancesItem(ReturnInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

  /**
   * Список логистических позиций возврата.
   * @return instances
   */
  @ApiModelProperty(value = "Список логистических позиций возврата.")
  public List<ReturnInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<ReturnInstanceDTO> instances) {
    this.instances = instances;
  }

  public ReturnItemDTO tracks(List<TrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  public ReturnItemDTO addTracksItem(TrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

  /**
   * Список трек-кодов для почтовых отправлений.
   * @return tracks
   */
  @ApiModelProperty(value = "Список трек-кодов для почтовых отправлений.")
  public List<TrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<TrackDTO> tracks) {
    this.tracks = tracks;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

