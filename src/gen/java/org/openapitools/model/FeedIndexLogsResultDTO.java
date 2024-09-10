package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedIndexLogsFeedDTO;
import org.openapitools.model.FeedIndexLogsRecordDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результат выполнения запроса отчета по индексации прайс-листа.
 **/
@ApiModel(description="Результат выполнения запроса отчета по индексации прайс-листа.")

public class FeedIndexLogsResultDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsFeedDTO feed;

  @ApiModelProperty(required = true, value = "Список отчетов по индексации прайс-листа.")
  @Valid
 /**
   * Список отчетов по индексации прайс-листа.
  **/
  private List<@Valid FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();

  @ApiModelProperty(value = "Количество отчетов на всех страницах выходных данных.")
 /**
   * Количество отчетов на всех страницах выходных данных.
  **/
  private Long total;
 /**
   * Get feed
   * @return feed
  **/
  @JsonProperty("feed")
  public FeedIndexLogsFeedDTO getFeed() {
    return feed;
  }

  public void setFeed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
  }

  public FeedIndexLogsResultDTO feed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
    return this;
  }

 /**
   * Список отчетов по индексации прайс-листа.
   * @return indexLogRecords
  **/
  @JsonProperty("indexLogRecords")
  @NotNull
  public List<@Valid FeedIndexLogsRecordDTO> getIndexLogRecords() {
    return indexLogRecords;
  }

  public void setIndexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

  public FeedIndexLogsResultDTO indexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
    return this;
  }

  public FeedIndexLogsResultDTO addIndexLogRecordsItem(FeedIndexLogsRecordDTO indexLogRecordsItem) {
    this.indexLogRecords.add(indexLogRecordsItem);
    return this;
  }

 /**
   * Количество отчетов на всех страницах выходных данных.
   * @return total
  **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public FeedIndexLogsResultDTO total(Long total) {
    this.total = total;
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
    FeedIndexLogsResultDTO feedIndexLogsResultDTO = (FeedIndexLogsResultDTO) o;
    return Objects.equals(this.feed, feedIndexLogsResultDTO.feed) &&
        Objects.equals(this.indexLogRecords, feedIndexLogsResultDTO.indexLogRecords) &&
        Objects.equals(this.total, feedIndexLogsResultDTO.total);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

