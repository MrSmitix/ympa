package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.FeedContentErrorDTO;
import com.prokarma.pkmst.model.FeedStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
@ApiModel(description = "Информация о проверке содержимого прайс-листа, загруженного на Маркет.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedContentDTO   {
  @JsonProperty("rejectedOffersCount")
  private Long rejectedOffersCount;

  @JsonProperty("status")
  private FeedStatusType status;

  @JsonProperty("totalOffersCount")
  private Long totalOffersCount;

  @JsonProperty("error")
  private FeedContentErrorDTO error;

  public FeedContentDTO rejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
    return this;
  }

  /**
   * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
   * @return rejectedOffersCount
   */
  @ApiModelProperty(value = "Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. ")
  public Long getRejectedOffersCount() {
    return rejectedOffersCount;
  }

  public void setRejectedOffersCount(Long rejectedOffersCount) {
    this.rejectedOffersCount = rejectedOffersCount;
  }

  public FeedContentDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedContentDTO totalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

  /**
   * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
   * @return totalOffersCount
   */
  @ApiModelProperty(value = "Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. ")
  public Long getTotalOffersCount() {
    return totalOffersCount;
  }

  public void setTotalOffersCount(Long totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  public FeedContentDTO error(FeedContentErrorDTO error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

