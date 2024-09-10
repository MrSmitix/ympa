package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.QualityRatingDetailsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GetQualityRatingDetailsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetQualityRatingDetailsResponse   {
  private ApiResponseStatusType status;
  private QualityRatingDetailsDTO result;

  /**
   **/
  public GetQualityRatingDetailsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   **/
  public GetQualityRatingDetailsResponse result(QualityRatingDetailsDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  @Valid public QualityRatingDetailsDTO getResult() {
    return result;
  }

  @JsonProperty("result")
  public void setResult(QualityRatingDetailsDTO result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQualityRatingDetailsResponse getQualityRatingDetailsResponse = (GetQualityRatingDetailsResponse) o;
    return Objects.equals(this.status, getQualityRatingDetailsResponse.status) &&
        Objects.equals(this.result, getQualityRatingDetailsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQualityRatingDetailsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

