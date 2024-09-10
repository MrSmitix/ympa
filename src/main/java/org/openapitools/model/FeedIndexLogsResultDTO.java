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
import org.openapitools.model.FeedIndexLogsFeedDTO;
import org.openapitools.model.FeedIndexLogsRecordDTO;



/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

@ApiModel(description = "Результат выполнения запроса отчета по индексации прайс-листа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsResultDTO   {
  
  private FeedIndexLogsFeedDTO feed;
  private List<FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();
  private Long total;

  /**
   */
  public FeedIndexLogsResultDTO feed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feed")
  public FeedIndexLogsFeedDTO getFeed() {
    return feed;
  }
  public void setFeed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
  }

  /**
   * Список отчетов по индексации прайс-листа.
   */
  public FeedIndexLogsResultDTO indexLogRecords(List<FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список отчетов по индексации прайс-листа.")
  @JsonProperty("indexLogRecords")
  public List<FeedIndexLogsRecordDTO> getIndexLogRecords() {
    return indexLogRecords;
  }
  public void setIndexLogRecords(List<FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

  /**
   * Количество отчетов на всех страницах выходных данных.
   */
  public FeedIndexLogsResultDTO total(Long total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Количество отчетов на всех страницах выходных данных.")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedIndexLogsResultDTO feedIndexLogsResultDTO = (FeedIndexLogsResultDTO) o;
    return Objects.equals(feed, feedIndexLogsResultDTO.feed) &&
        Objects.equals(indexLogRecords, feedIndexLogsResultDTO.indexLogRecords) &&
        Objects.equals(total, feedIndexLogsResultDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feed, indexLogRecords, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedIndexLogsResultDTO {\n");
    
    sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
    sb.append("    indexLogRecords: ").append(toIndentedString(indexLogRecords)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

