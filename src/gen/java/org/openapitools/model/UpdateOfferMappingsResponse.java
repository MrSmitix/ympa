package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.UpdateOfferMappingResultDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Описывает проблемы, возникшие при сохранении товара.
 */
@ApiModel(description="Описывает проблемы, возникшие при сохранении товара.")

public class UpdateOfferMappingsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

 /**
  * Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  */
  @ApiModelProperty(value = "Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
  @Valid
  private List<@Valid UpdateOfferMappingResultDTO> results;
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
  public UpdateOfferMappingsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  * @return results
  */
  @JsonProperty("results")
  public List<@Valid UpdateOfferMappingResultDTO> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid UpdateOfferMappingResultDTO> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public UpdateOfferMappingsResponse results(List<@Valid UpdateOfferMappingResultDTO> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public UpdateOfferMappingsResponse addResultsItem(UpdateOfferMappingResultDTO resultsItem) {
    this.results.add(resultsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

