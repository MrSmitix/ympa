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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedStatusType;



/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */

@ApiModel(description = "Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedPlacementDTO   {
  
  private FeedStatusType status;
  private Integer totalOffersCount;

  /**
   */
  public FeedPlacementDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  /**
   * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
   */
  public FeedPlacementDTO totalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.")
  @JsonProperty("totalOffersCount")
  public Integer getTotalOffersCount() {
    return totalOffersCount;
  }
  public void setTotalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPlacementDTO feedPlacementDTO = (FeedPlacementDTO) o;
    return Objects.equals(status, feedPlacementDTO.status) &&
        Objects.equals(totalOffersCount, feedPlacementDTO.totalOffersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, totalOffersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPlacementDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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

