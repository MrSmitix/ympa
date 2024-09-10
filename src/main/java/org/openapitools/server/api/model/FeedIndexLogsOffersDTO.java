package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о предложениях прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedIndexLogsOffersDTO   {
  
  private Long rejectedCount;
  private Long totalCount;

  public FeedIndexLogsOffersDTO () {

  }

  public FeedIndexLogsOffersDTO (Long rejectedCount, Long totalCount) {
    this.rejectedCount = rejectedCount;
    this.totalCount = totalCount;
  }

    
  @JsonProperty("rejectedCount")
  public Long getRejectedCount() {
    return rejectedCount;
  }
  public void setRejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
  }

    
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedIndexLogsOffersDTO feedIndexLogsOffersDTO = (FeedIndexLogsOffersDTO) o;
    return Objects.equals(rejectedCount, feedIndexLogsOffersDTO.rejectedCount) &&
        Objects.equals(totalCount, feedIndexLogsOffersDTO.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedIndexLogsOffersDTO {\n");
    
    sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
