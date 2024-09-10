package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Запрос информации о моделях.
 */
@ApiModel(description = "Запрос информации о моделях.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetModelsRequest   {
  @JsonProperty("models")
  
  private List<Long> models = new ArrayList<>();

  public GetModelsRequest models(List<Long> models) {
    this.models = models;
    return this;
  }

  public GetModelsRequest addModelsItem(Long modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Список моделей.
   * @return models
   */
  @ApiModelProperty(required = true, value = "Список моделей.")
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
    return Objects.equals(this.models, getModelsRequest.models);
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

