package apimodels;

import apimodels.FeedIndexLogsFeedDTO;
import apimodels.FeedIndexLogsRecordDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedIndexLogsResultDTO   {
  @JsonProperty("feed")
  @Valid

  private FeedIndexLogsFeedDTO feed;

  @JsonProperty("indexLogRecords")
  @NotNull
@Valid

  private List<@Valid FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();

  @JsonProperty("total")
  
  private Long total;

  public FeedIndexLogsResultDTO feed(FeedIndexLogsFeedDTO feed) {
    this.feed = feed;
    return this;
  }

   /**
   * Get feed
   * @return feed
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

