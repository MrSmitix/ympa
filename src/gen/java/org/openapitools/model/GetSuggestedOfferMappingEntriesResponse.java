package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OfferMappingSuggestionsListDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ со списком рекомендованных карточек товара.
 **/
@ApiModel(description="Ответ со списком рекомендованных карточек товара.")

public class GetSuggestedOfferMappingEntriesResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private OfferMappingSuggestionsListDTO result;
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

  public GetSuggestedOfferMappingEntriesResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public OfferMappingSuggestionsListDTO getResult() {
    return result;
  }

  public void setResult(OfferMappingSuggestionsListDTO result) {
    this.result = result;
  }

  public GetSuggestedOfferMappingEntriesResponse result(OfferMappingSuggestionsListDTO result) {
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
    GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntriesResponse = (GetSuggestedOfferMappingEntriesResponse) o;
    return Objects.equals(this.status, getSuggestedOfferMappingEntriesResponse.status) &&
        Objects.equals(this.result, getSuggestedOfferMappingEntriesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingEntriesResponse {\n");
    
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

