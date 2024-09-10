package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Информация о предложениях прайс-листа.
 */
@ApiModel(description = "Информация о предложениях прайс-листа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
  @ApiModelProperty(value = "Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.")
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
  @ApiModelProperty(value = "Количество предложений в прайс-листе.")
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
    return Objects.equals(this.rejectedCount, feedIndexLogsOffersDTO.rejectedCount) &&
        Objects.equals(this.totalCount, feedIndexLogsOffersDTO.totalCount);
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

