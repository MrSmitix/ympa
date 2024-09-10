package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.AddOffersToArchiveDTO;
import org.openapitools.model.ApiResponseStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результат архивации товаров.
 **/
@ApiModel(description="Результат архивации товаров.")

public class AddOffersToArchiveResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private AddOffersToArchiveDTO result;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public AddOffersToArchiveResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public AddOffersToArchiveDTO getResult() {
    return result;
  }

  public void setResult(AddOffersToArchiveDTO result) {
    this.result = result;
  }

  public AddOffersToArchiveResponse result(AddOffersToArchiveDTO result) {
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
    AddOffersToArchiveResponse addOffersToArchiveResponse = (AddOffersToArchiveResponse) o;
    return Objects.equals(this.status, addOffersToArchiveResponse.status) &&
        Objects.equals(this.result, addOffersToArchiveResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOffersToArchiveResponse {\n");
    
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

