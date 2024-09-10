package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedParameterDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос на обновление изменение параметров прайс-листа.
 */
@ApiModel(description="Запрос на обновление изменение параметров прайс-листа.")

public class SetFeedParamsRequest  {
  
 /**
  * Параметры прайс-листа.  Обязательный параметр. 
  */
  @ApiModelProperty(required = true, value = "Параметры прайс-листа.  Обязательный параметр. ")
  @Valid
  private List<@Valid FeedParameterDTO> parameters = new ArrayList<>();
 /**
  * Параметры прайс-листа.  Обязательный параметр. 
  * @return parameters
  */
  @JsonProperty("parameters")
  @NotNull
  public List<@Valid FeedParameterDTO> getParameters() {
    return parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
 public void setParameters(List<@Valid FeedParameterDTO> parameters) {
    this.parameters = parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
  public SetFeedParamsRequest parameters(List<@Valid FeedParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Adds a new item to the <code>parameters</code> list.
   */
  public SetFeedParamsRequest addParametersItem(FeedParameterDTO parametersItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

