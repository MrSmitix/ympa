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
import org.openapitools.model.ReturnDecisionDTO;
import org.openapitools.model.ReturnInstanceDTO;
import org.openapitools.model.TrackDTO;



/**
 * Список товаров в возврате.
 */

@ApiModel(description = "Список товаров в возврате.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnItemDTO   {
  
  private Long marketSku;
  private String shopSku;
  private Long count;
  private List<ReturnDecisionDTO> decisions;
  private List<ReturnInstanceDTO> instances;
  private List<TrackDTO> tracks;

  /**
   * SKU на Маркете.
   */
  public ReturnItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   */
  public ReturnItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Количество единиц товара.
   */
  public ReturnItemDTO count(Long count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество единиц товара.")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   * Список решений по возврату.
   */
  public ReturnItemDTO decisions(List<ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
    return this;
  }

  
  @ApiModelProperty(value = "Список решений по возврату.")
  @JsonProperty("decisions")
  public List<ReturnDecisionDTO> getDecisions() {
    return decisions;
  }
  public void setDecisions(List<ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
  }

  /**
   * Список логистических позиций возврата.
   */
  public ReturnItemDTO instances(List<ReturnInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(value = "Список логистических позиций возврата.")
  @JsonProperty("instances")
  public List<ReturnInstanceDTO> getInstances() {
    return instances;
  }
  public void setInstances(List<ReturnInstanceDTO> instances) {
    this.instances = instances;
  }

  /**
   * Список трек-кодов для почтовых отправлений.
   */
  public ReturnItemDTO tracks(List<TrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "Список трек-кодов для почтовых отправлений.")
  @JsonProperty("tracks")
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
    return Objects.equals(marketSku, returnItemDTO.marketSku) &&
        Objects.equals(shopSku, returnItemDTO.shopSku) &&
        Objects.equals(count, returnItemDTO.count) &&
        Objects.equals(decisions, returnItemDTO.decisions) &&
        Objects.equals(instances, returnItemDTO.instances) &&
        Objects.equals(tracks, returnItemDTO.tracks);
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

