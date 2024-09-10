package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.UpdateOfferContentResultDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Описывает проблемы, которые появились при сохранении товара.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Описывает проблемы, которые появились при сохранении товара.")
public class UpdateOfferContentResponse   {
  
  private ApiResponseStatusType status;

  private List<@Valid UpdateOfferContentResultDTO> results;

  /**
   **/
  public UpdateOfferContentResponse status(ApiResponseStatusType status) {
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
   * Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
   **/
  public UpdateOfferContentResponse results(List<@Valid UpdateOfferContentResultDTO> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
  @JsonProperty("results")
  public List<@Valid UpdateOfferContentResultDTO> getResults() {
    return results;
  }
  public void setResults(List<@Valid UpdateOfferContentResultDTO> results) {
    this.results = results;
  }

  public UpdateOfferContentResponse addResultsItem(UpdateOfferContentResultDTO resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
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
    UpdateOfferContentResponse updateOfferContentResponse = (UpdateOfferContentResponse) o;
    return Objects.equals(this.status, updateOfferContentResponse.status) &&
        Objects.equals(this.results, updateOfferContentResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResponse {\n");
    
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

