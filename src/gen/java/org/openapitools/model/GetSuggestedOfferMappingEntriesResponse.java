package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OfferMappingSuggestionsListDTO;



/**
 * Ответ со списком рекомендованных карточек товара.
 **/

@ApiModel(description = "Ответ со списком рекомендованных карточек товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingEntriesResponse   {
  @JsonProperty("status")
  private ApiResponseStatusType status;

  @JsonProperty("result")
  private OfferMappingSuggestionsListDTO result;

  /**
   **/
  public GetSuggestedOfferMappingEntriesResponse status(ApiResponseStatusType status) {
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
  public GetSuggestedOfferMappingEntriesResponse result(OfferMappingSuggestionsListDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public OfferMappingSuggestionsListDTO getResult() {
    return result;
  }
  public void setResult(OfferMappingSuggestionsListDTO result) {
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
    GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntriesResponse = (GetSuggestedOfferMappingEntriesResponse) o;
    return Objects.equals(status, getSuggestedOfferMappingEntriesResponse.status) &&
        Objects.equals(result, getSuggestedOfferMappingEntriesResponse.result);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

