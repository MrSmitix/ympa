package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Запрос информации о моделях.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetModelsRequest   {
  
  private List<Long> models = new ArrayList<>();

  public GetModelsRequest () {

  }

  public GetModelsRequest (List<Long> models) {
    this.models = models;
  }

    
  @JsonProperty("models")
  public List<Long> getModels() {
    return models;
  }
  public void setModels(List<Long> models) {
    this.models = models;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetModelsRequest getModelsRequest = (GetModelsRequest) o;
    return Objects.equals(models, getModelsRequest.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetModelsRequest {\n");
    
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
