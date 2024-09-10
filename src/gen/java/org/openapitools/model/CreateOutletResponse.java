package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OutletResponseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос о создании точки продаж.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос о создании точки продаж.")
public class CreateOutletResponse   {
  
  private ApiResponseStatusType status;

  private OutletResponseDTO result;

  /**
   **/
  public CreateOutletResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }


  /**
   **/
  public CreateOutletResponse result(OutletResponseDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public OutletResponseDTO getResult() {
    return result;
  }
  public void setResult(OutletResponseDTO result) {
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
    CreateOutletResponse createOutletResponse = (CreateOutletResponse) o;
    return Objects.equals(this.status, createOutletResponse.status) &&
        Objects.equals(this.result, createOutletResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOutletResponse {\n");
    
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

