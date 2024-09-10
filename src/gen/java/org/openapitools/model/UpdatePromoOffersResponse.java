package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.UpdatePromoOffersResultDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Результат добавления товаров в акцию.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Результат добавления товаров в акцию.")
public class UpdatePromoOffersResponse   {
  
  private ApiResponseStatusType status;

  private UpdatePromoOffersResultDTO result;

  /**
   **/
  public UpdatePromoOffersResponse status(ApiResponseStatusType status) {
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
  public UpdatePromoOffersResponse result(UpdatePromoOffersResultDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public UpdatePromoOffersResultDTO getResult() {
    return result;
  }
  public void setResult(UpdatePromoOffersResultDTO result) {
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
    UpdatePromoOffersResponse updatePromoOffersResponse = (UpdatePromoOffersResponse) o;
    return Objects.equals(this.status, updatePromoOffersResponse.status) &&
        Objects.equals(this.result, updatePromoOffersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersResponse {\n");
    
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

