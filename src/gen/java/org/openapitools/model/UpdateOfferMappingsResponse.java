package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.UpdateOfferMappingResultDTO;

/**
 * Описывает проблемы, возникшие при сохранении товара.
 */
@ApiModel(description = "Описывает проблемы, возникшие при сохранении товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingsResponse   {
  @JsonProperty("status")
  private ApiResponseStatusType status;

  @JsonProperty("results")
  private List<@Valid UpdateOfferMappingResultDTO> results = null;

  public UpdateOfferMappingsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public UpdateOfferMappingsResponse results(List<@Valid UpdateOfferMappingResultDTO> results) {
    this.results = results;
    return this;
  }

  public UpdateOfferMappingsResponse addResultsItem(UpdateOfferMappingResultDTO resultsItem) {
    if (this.results == null) {
      this.results = ;
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
   * @return results
  **/
  @ApiModelProperty(value = "Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
  public List<@Valid UpdateOfferMappingResultDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid UpdateOfferMappingResultDTO> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingsResponse updateOfferMappingsResponse = (UpdateOfferMappingsResponse) o;
    return Objects.equals(this.status, updateOfferMappingsResponse.status) &&
        Objects.equals(this.results, updateOfferMappingsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

