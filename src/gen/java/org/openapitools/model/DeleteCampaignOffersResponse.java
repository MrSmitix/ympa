package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.DeleteCampaignOffersDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Результат удаления товаров.
 */
@ApiModel(description="Результат удаления товаров.")

public class DeleteCampaignOffersResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private DeleteCampaignOffersDTO result;
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
  public DeleteCampaignOffersResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  public DeleteCampaignOffersDTO getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
 public void setResult(DeleteCampaignOffersDTO result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public DeleteCampaignOffersResponse result(DeleteCampaignOffersDTO result) {
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
    DeleteCampaignOffersResponse deleteCampaignOffersResponse = (DeleteCampaignOffersResponse) o;
    return Objects.equals(this.status, deleteCampaignOffersResponse.status) &&
        Objects.equals(this.result, deleteCampaignOffersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCampaignOffersResponse {\n");
    
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

