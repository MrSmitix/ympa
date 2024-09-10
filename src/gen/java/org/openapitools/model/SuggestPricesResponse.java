package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.SuggestPricesResultDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос списка цен для продвижения.
 */
@ApiModel(description="Ответ на запрос списка цен для продвижения.")

public class SuggestPricesResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private SuggestPricesResultDTO result;
 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public SuggestPricesResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  public SuggestPricesResultDTO getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
 public void setResult(SuggestPricesResultDTO result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public SuggestPricesResponse result(SuggestPricesResultDTO result) {
    this.result = result;
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
    SuggestPricesResponse suggestPricesResponse = (SuggestPricesResponse) o;
    return Objects.equals(this.status, suggestPricesResponse.status) &&
        Objects.equals(this.result, suggestPricesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

