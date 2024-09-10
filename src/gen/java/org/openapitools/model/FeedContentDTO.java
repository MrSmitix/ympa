package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedContentErrorDTO;
import org.openapitools.model.FeedStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о проверке содержимого прайс-листа, загруженного на Маркет.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedContentDTO   {
  
  private Long rejectedOffersCount;
  private FeedStatusType status;
  private Long totalOffersCount;
  private FeedContentErrorDTO error;

  /**
   * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  @Valid
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  /**
   * Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  @Valid
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

