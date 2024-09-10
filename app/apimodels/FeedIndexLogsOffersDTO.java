package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о предложениях прайс-листа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedIndexLogsOffersDTO   {
  @JsonProperty("rejectedCount")
  
  private Long rejectedCount;

  @JsonProperty("totalCount")
  
  private Long totalCount;

  public FeedIndexLogsOffersDTO rejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
    return this;
  }

   /**
   * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
   * @return rejectedCount
  **/
  public Long getRejectedCount() {
    return rejectedCount;
  }

  public void setRejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
  }

  public FeedIndexLogsOffersDTO totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Количество предложений в прайс-листе.
   * @return totalCount
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

