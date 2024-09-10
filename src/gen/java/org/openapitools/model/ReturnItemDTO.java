package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionDTO;
import org.openapitools.model.ReturnInstanceDTO;
import org.openapitools.model.TrackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров в возврате.
 **/
@ApiModel(description = "Список товаров в возврате.")
@JsonTypeName("ReturnItemDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnItemDTO   {
  private Long marketSku;
  private String shopSku;
  private Long count;
  private @Valid List<@Valid ReturnDecisionDTO> decisions;
  private @Valid List<@Valid ReturnInstanceDTO> instances;
  private @Valid List<@Valid TrackDTO> tracks;

  /**
   * SKU на Маркете.
   **/
  public ReturnItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  @JsonProperty("marketSku")
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public ReturnItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
  @NotNull  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getShopSku() {
    return shopSku;
  }

  @JsonProperty("shopSku")
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Количество единиц товара.
   **/
  public ReturnItemDTO count(Long count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество единиц товара.")
  @JsonProperty("count")
  @NotNull public Long getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   * Список решений по возврату.
   **/
  public ReturnItemDTO decisions(List<@Valid ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
    return this;
  }

  
  @ApiModelProperty(value = "Список решений по возврату.")
  @JsonProperty("decisions")
  @Valid public List<@Valid ReturnDecisionDTO> getDecisions() {
    return decisions;
  }

  @JsonProperty("decisions")
  public void setDecisions(List<@Valid ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
  }

  public ReturnItemDTO addDecisionsItem(ReturnDecisionDTO decisionsItem) {
    if (this.decisions == null) {
      this.decisions = new ArrayList<>();
    }

    this.decisions.add(decisionsItem);
    return this;
  }

  public ReturnItemDTO removeDecisionsItem(ReturnDecisionDTO decisionsItem) {
    if (decisionsItem != null && this.decisions != null) {
      this.decisions.remove(decisionsItem);
    }

    return this;
  }
  /**
   * Список логистических позиций возврата.
   **/
  public ReturnItemDTO instances(List<@Valid ReturnInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(value = "Список логистических позиций возврата.")
  @JsonProperty("instances")
  @Valid public List<@Valid ReturnInstanceDTO> getInstances() {
    return instances;
  }

  @JsonProperty("instances")
  public void setInstances(List<@Valid ReturnInstanceDTO> instances) {
    this.instances = instances;
  }

  public ReturnItemDTO addInstancesItem(ReturnInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }

    this.instances.add(instancesItem);
    return this;
  }

  public ReturnItemDTO removeInstancesItem(ReturnInstanceDTO instancesItem) {
    if (instancesItem != null && this.instances != null) {
      this.instances.remove(instancesItem);
    }

    return this;
  }
  /**
   * Список трек-кодов для почтовых отправлений.
   **/
  public ReturnItemDTO tracks(List<@Valid TrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "Список трек-кодов для почтовых отправлений.")
  @JsonProperty("tracks")
  @Valid public List<@Valid TrackDTO> getTracks() {
    return tracks;
  }

  @JsonProperty("tracks")
  public void setTracks(List<@Valid TrackDTO> tracks) {
    this.tracks = tracks;
  }

  public ReturnItemDTO addTracksItem(TrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }

    this.tracks.add(tracksItem);
    return this;
  }

  public ReturnItemDTO removeTracksItem(TrackDTO tracksItem) {
    if (tracksItem != null && this.tracks != null) {
      this.tracks.remove(tracksItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

