package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.FeedParameterDTO;

/**
 * Запрос на обновление изменение параметров прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetFeedParamsRequest   {
  
  private List<FeedParameterDTO> parameters = new ArrayList<>();

  public SetFeedParamsRequest () {

  }

  public SetFeedParamsRequest (List<FeedParameterDTO> parameters) {
    this.parameters = parameters;
  }

    
  @JsonProperty("parameters")
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
    return Objects.equals(parameters, setFeedParamsRequest.parameters);
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
