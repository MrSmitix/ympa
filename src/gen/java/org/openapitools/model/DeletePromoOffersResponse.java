package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.DeletePromoOffersResultDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Результат удаления товаров из акции.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Результат удаления товаров из акции.")
public class DeletePromoOffersResponse   {
  
  private ApiResponseStatusType status;

  private DeletePromoOffersResultDTO result;

  /**
   **/
  public DeletePromoOffersResponse status(ApiResponseStatusType status) {
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
  public DeletePromoOffersResponse result(DeletePromoOffersResultDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public DeletePromoOffersResultDTO getResult() {
    return result;
  }
  public void setResult(DeletePromoOffersResultDTO result) {
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
    DeletePromoOffersResponse deletePromoOffersResponse = (DeletePromoOffersResponse) o;
    return Objects.equals(this.status, deletePromoOffersResponse.status) &&
        Objects.equals(this.result, deletePromoOffersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePromoOffersResponse {\n");
    
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

