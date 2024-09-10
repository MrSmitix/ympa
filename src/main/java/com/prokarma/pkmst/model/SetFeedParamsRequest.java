package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FeedParameterDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос на обновление изменение параметров прайс-листа.
 */
@ApiModel(description = "Запрос на обновление изменение параметров прайс-листа.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetFeedParamsRequest   {
  @JsonProperty("parameters")
  
  private List<FeedParameterDTO> parameters = new ArrayList<>();

  public SetFeedParamsRequest parameters(List<FeedParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  public SetFeedParamsRequest addParametersItem(FeedParameterDTO parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Параметры прайс-листа.  Обязательный параметр. 
   * @return parameters
   */
  @ApiModelProperty(required = true, value = "Параметры прайс-листа.  Обязательный параметр. ")
  public List<FeedParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<FeedParameterDTO> parameters) {
    this.parameters = parameters;
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

