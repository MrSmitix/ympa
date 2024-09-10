package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedContentErrorDTO;
import org.openapitools.model.FeedStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
@ApiModel(description="Информация о проверке содержимого прайс-листа, загруженного на Маркет.")

public class FeedContentDTO  {
  
 /**
  * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
  */
  @ApiModelProperty(value = "Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. ")
  private Long rejectedOffersCount;

  @ApiModelProperty(value = "")
  @Valid
  private FeedStatusType status;

 /**
  * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
  */
  @ApiModelProperty(value = "Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. ")
  private Long totalOffersCount;

  @ApiModelProperty(value = "")
  @Valid
  private FeedContentErrorDTO error;
 /**
  * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
  * @return rejectedOffersCount
  */
  @JsonProperty("rejectedOffersCount")
  public Long getRejectedOffersCount() {
    return rejectedOffersCount;
  }

  /**
   * Sets the <code>rejectedOffersCount</code> property.
   */
 public void setRejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
  }

  /**
   * Sets the <code>rejectedOffersCount</code> property.
   */
  public FeedContentDTO rejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public FeedContentDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
  * @return totalOffersCount
  */
  @JsonProperty("totalOffersCount")
  public Long getTotalOffersCount() {
    return totalOffersCount;
  }

  /**
   * Sets the <code>totalOffersCount</code> property.
   */
 public void setTotalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  /**
   * Sets the <code>totalOffersCount</code> property.
   */
  public FeedContentDTO totalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  public FeedContentErrorDTO getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(FeedContentErrorDTO error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
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

