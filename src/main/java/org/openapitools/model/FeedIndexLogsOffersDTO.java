package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о предложениях прайс-листа.
 */

@Schema(name = "FeedIndexLogsOffersDTO", description = "Информация о предложениях прайс-листа.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsOffersDTO {

  private Long rejectedCount;

  private Long totalCount;

  public FeedIndexLogsOffersDTO rejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
    return this;
  }

  /**
   * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
   * @return rejectedCount
   */
  
  @Schema(name = "rejectedCount", description = "Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectedCount")
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
   */
  
  @Schema(name = "totalCount", description = "Количество предложений в прайс-листе.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

