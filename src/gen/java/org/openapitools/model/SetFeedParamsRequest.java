package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedParameterDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Запрос на обновление изменение параметров прайс-листа.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Запрос на обновление изменение параметров прайс-листа.")
public class SetFeedParamsRequest   {
  
  private List<@Valid FeedParameterDTO> parameters = new ArrayList<>();

  /**
   * Параметры прайс-листа.  Обязательный параметр. 
   **/
  public SetFeedParamsRequest parameters(List<@Valid FeedParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Параметры прайс-листа.  Обязательный параметр. ")
  @JsonProperty("parameters")
  @NotNull
  public List<@Valid FeedParameterDTO> getParameters() {
    return parameters;
  }
  public void setParameters(List<@Valid FeedParameterDTO> parameters) {
    this.parameters = parameters;
  }

  public SetFeedParamsRequest addParametersItem(FeedParameterDTO parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
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
    SetFeedParamsRequest setFeedParamsRequest = (SetFeedParamsRequest) o;
    return Objects.equals(this.parameters, setFeedParamsRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFeedParamsRequest {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

