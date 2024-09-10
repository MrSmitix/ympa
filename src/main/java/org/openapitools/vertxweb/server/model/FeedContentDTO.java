package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FeedContentErrorDTO;
import org.openapitools.vertxweb.server.model.FeedStatusType;

/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedContentDTO   {
  
  private Long rejectedOffersCount;
  private FeedStatusType status;
  private Long totalOffersCount;
  private FeedContentErrorDTO error;

  public FeedContentDTO () {

  }

  public FeedContentDTO (Long rejectedOffersCount, FeedStatusType status, Long totalOffersCount, FeedContentErrorDTO error) {
    this.rejectedOffersCount = rejectedOffersCount;
    this.status = status;
    this.totalOffersCount = totalOffersCount;
    this.error = error;
  }

    
  @JsonProperty("rejectedOffersCount")
  public Long getRejectedOffersCount() {
    return rejectedOffersCount;
  }
  public void setRejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
  }

    
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("totalOffersCount")
  public Long getTotalOffersCount() {
    return totalOffersCount;
  }
  public void setTotalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

    
  @JsonProperty("error")
  public FeedContentErrorDTO getError() {
    return error;
  }
  public void setError(FeedContentErrorDTO error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedContentDTO feedContentDTO = (FeedContentDTO) o;
    return Objects.equals(rejectedOffersCount, feedContentDTO.rejectedOffersCount) &&
        Objects.equals(status, feedContentDTO.status) &&
        Objects.equals(totalOffersCount, feedContentDTO.totalOffersCount) &&
        Objects.equals(error, feedContentDTO.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedOffersCount, status, totalOffersCount, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedContentDTO {\n");
    
    sb.append("    rejectedOffersCount: ").append(toIndentedString(rejectedOffersCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
