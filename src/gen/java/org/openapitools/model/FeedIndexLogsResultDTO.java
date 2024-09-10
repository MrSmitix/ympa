package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedIndexLogsFeedDTO;
import org.openapitools.model.FeedIndexLogsRecordDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 **/
@ApiModel(description = "Результат выполнения запроса отчета по индексации прайс-листа.")
@JsonTypeName("FeedIndexLogsResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsResultDTO   {
  private FeedIndexLogsFeedDTO feed;
  private @Valid List<@Valid FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();
  private Long total;

  /**
   **/
  public FeedIndexLogsResultDTO feed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feed")
  @Valid public FeedIndexLogsFeedDTO getFeed() {
    return feed;
  }

  @JsonProperty("feed")
  public void setFeed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
  }

  /**
   * Список отчетов по индексации прайс-листа.
   **/
  public FeedIndexLogsResultDTO indexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список отчетов по индексации прайс-листа.")
  @JsonProperty("indexLogRecords")
  @NotNull @Valid public List<@Valid FeedIndexLogsRecordDTO> getIndexLogRecords() {
    return indexLogRecords;
  }

  @JsonProperty("indexLogRecords")
  public void setIndexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

  public FeedIndexLogsResultDTO addIndexLogRecordsItem(FeedIndexLogsRecordDTO indexLogRecordsItem) {
    if (this.indexLogRecords == null) {
      this.indexLogRecords = new ArrayList<>();
    }

    this.indexLogRecords.add(indexLogRecordsItem);
    return this;
  }

  public FeedIndexLogsResultDTO removeIndexLogRecordsItem(FeedIndexLogsRecordDTO indexLogRecordsItem) {
    if (indexLogRecordsItem != null && this.indexLogRecords != null) {
      this.indexLogRecords.remove(indexLogRecordsItem);
    }

    return this;
  }
  /**
   * Количество отчетов на всех страницах выходных данных.
   **/
  public FeedIndexLogsResultDTO total(Long total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Количество отчетов на всех страницах выходных данных.")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  @JsonProperty("total")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

