package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedContentErrorDTO;
import org.openapitools.model.FeedStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 **/
@ApiModel(description="Информация о проверке содержимого прайс-листа, загруженного на Маркет.")

public class FeedContentDTO  {
  
  @ApiModelProperty(value = "Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. ")
 /**
   * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
  **/
  private Long rejectedOffersCount;

  @ApiModelProperty(value = "")
  private FeedStatusType status;

  @ApiModelProperty(value = "Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. ")
 /**
   * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
  **/
  private Long totalOffersCount;

  @ApiModelProperty(value = "")
  private FeedContentErrorDTO error;
 /**
   * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
   * @return rejectedOffersCount
  **/
  @JsonProperty("rejectedOffersCount")
  public Long getRejectedOffersCount() {
    return rejectedOffersCount;
  }

  public void setRejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
  }

  public FeedContentDTO rejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedContentDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
   * @return totalOffersCount
  **/
  @JsonProperty("totalOffersCount")
  public Long getTotalOffersCount() {
    return totalOffersCount;
  }

  public void setTotalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  public FeedContentDTO totalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public FeedContentErrorDTO getError() {
    return error;
  }

  public void setError(FeedContentErrorDTO error) {
    this.error = error;
  }

  public FeedContentDTO error(FeedContentErrorDTO error) {
    this.error = error;
    return this;
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
    return Objects.equals(this.rejectedOffersCount, feedContentDTO.rejectedOffersCount) &&
        Objects.equals(this.status, feedContentDTO.status) &&
        Objects.equals(this.totalOffersCount, feedContentDTO.totalOffersCount) &&
        Objects.equals(this.error, feedContentDTO.error);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

