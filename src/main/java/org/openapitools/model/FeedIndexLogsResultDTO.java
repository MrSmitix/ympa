package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedIndexLogsFeedDTO;
import org.openapitools.model.FeedIndexLogsRecordDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

@Schema(name = "FeedIndexLogsResultDTO", description = "Результат выполнения запроса отчета по индексации прайс-листа.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsResultDTO {

  private FeedIndexLogsFeedDTO feed;

  @Valid
  private List<@Valid FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();

  private Long total;

  public FeedIndexLogsResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeedIndexLogsResultDTO(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

  public FeedIndexLogsResultDTO feed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
    return this;
  }

  /**
   * Get feed
   * @return feed
   */
  @Valid 
  @Schema(name = "feed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feed")
  public FeedIndexLogsFeedDTO getFeed() {
    return feed;
  }

  public void setFeed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
  }

  public FeedIndexLogsResultDTO indexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
    return this;
  }

  public FeedIndexLogsResultDTO addIndexLogRecordsItem(FeedIndexLogsRecordDTO indexLogRecordsItem) {
    if (this.indexLogRecords == null) {
      this.indexLogRecords = new ArrayList<>();
    }
    this.indexLogRecords.add(indexLogRecordsItem);
    return this;
  }

  /**
   * Список отчетов по индексации прайс-листа.
   * @return indexLogRecords
   */
  @NotNull @Valid 
  @Schema(name = "indexLogRecords", description = "Список отчетов по индексации прайс-листа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("indexLogRecords")
  public List<@Valid FeedIndexLogsRecordDTO> getIndexLogRecords() {
    return indexLogRecords;
  }

  public void setIndexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

  public FeedIndexLogsResultDTO total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Количество отчетов на всех страницах выходных данных.
   * @return total
   */
  
  @Schema(name = "total", description = "Количество отчетов на всех страницах выходных данных.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

