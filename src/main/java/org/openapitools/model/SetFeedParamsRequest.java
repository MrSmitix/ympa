package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedParameterDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на обновление изменение параметров прайс-листа.
 */

@Schema(name = "SetFeedParamsRequest", description = "Запрос на обновление изменение параметров прайс-листа.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetFeedParamsRequest {

  @Valid
  private List<@Valid FeedParameterDTO> parameters = new ArrayList<>();

  public SetFeedParamsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetFeedParamsRequest(List<@Valid FeedParameterDTO> parameters) {
    this.parameters = parameters;
  }

  public SetFeedParamsRequest parameters(List<@Valid FeedParameterDTO> parameters) {
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
  @NotNull @Valid 
  @Schema(name = "parameters", description = "Параметры прайс-листа.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parameters")
  public List<@Valid FeedParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid FeedParameterDTO> parameters) {
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

