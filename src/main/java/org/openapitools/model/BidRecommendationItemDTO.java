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



/**
 * Рекомендованная ставка и возможная доля показов.
 */

@ApiModel(description = "Рекомендованная ставка и возможная доля показов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BidRecommendationItemDTO   {
  
  private Integer bid;
  private Long showPercent;

  /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   */
  public BidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Доля показов. 
   * minimum: 0
   * maximum: 100
   */
  public BidRecommendationItemDTO showPercent(Long showPercent) {
    this.showPercent = showPercent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Доля показов. ")
  @JsonProperty("showPercent")
  public Long getShowPercent() {
    return showPercent;
  }
  public void setShowPercent(Long showPercent) {
    this.showPercent = showPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidRecommendationItemDTO bidRecommendationItemDTO = (BidRecommendationItemDTO) o;
    return Objects.equals(bid, bidRecommendationItemDTO.bid) &&
        Objects.equals(showPercent, bidRecommendationItemDTO.showPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, showPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidRecommendationItemDTO {\n");
    
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    showPercent: ").append(toIndentedString(showPercent)).append("\n");
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

