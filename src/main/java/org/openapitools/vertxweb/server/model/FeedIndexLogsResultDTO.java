package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.FeedIndexLogsFeedDTO;
import org.openapitools.vertxweb.server.model.FeedIndexLogsRecordDTO;

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedIndexLogsResultDTO   {
  
  private FeedIndexLogsFeedDTO feed;
  private List<FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();
  private Long total;

  public FeedIndexLogsResultDTO () {

  }

  public FeedIndexLogsResultDTO (FeedIndexLogsFeedDTO feed, List<FeedIndexLogsRecordDTO> indexLogRecords, Long total) {
    this.feed = feed;
    this.indexLogRecords = indexLogRecords;
    this.total = total;
  }

    
  @JsonProperty("feed")
  public FeedIndexLogsFeedDTO getFeed() {
    return feed;
  }
  public void setFeed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
  }

    
  @JsonProperty("indexLogRecords")
  public List<FeedIndexLogsRecordDTO> getIndexLogRecords() {
    return indexLogRecords;
  }
  public void setIndexLogRecords(List<FeedIndexLogsRecordDTO> indexLogRecords) {
    this.indexLogRecords = indexLogRecords;
  }

    
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
