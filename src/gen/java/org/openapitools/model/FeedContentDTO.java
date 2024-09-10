package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedContentErrorDTO;
import org.openapitools.model.FeedStatusType;



/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 **/

@ApiModel(description = "Информация о проверке содержимого прайс-листа, загруженного на Маркет.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedContentDTO   {
  @JsonProperty("rejectedOffersCount")
  private Long rejectedOffersCount;

  @JsonProperty("status")
  private FeedStatusType status;

  @JsonProperty("totalOffersCount")
  private Long totalOffersCount;

  @JsonProperty("error")
  private FeedContentErrorDTO error;

  /**
   * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
   **/
  public FeedContentDTO rejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. ")
  @JsonProperty("rejectedOffersCount")
  public Long getRejectedOffersCount() {
    return rejectedOffersCount;
  }
  public void setRejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
  }

  /**
   **/
  public FeedContentDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  /**
   * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
   **/
  public FeedContentDTO totalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. ")
  @JsonProperty("totalOffersCount")
  public Long getTotalOffersCount() {
    return totalOffersCount;
  }
  public void setTotalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  /**
   **/
  public FeedContentDTO error(FeedContentErrorDTO error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

