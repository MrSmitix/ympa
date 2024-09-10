package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос информации о моделях.
 **/
@ApiModel(description="Запрос информации о моделях.")

public class GetModelsRequest  {
  
  @ApiModelProperty(required = true, value = "Список моделей.")
 /**
   * Список моделей.
  **/
  private List<@Min(0L)Long> models = new ArrayList<>();
 /**
   * Список моделей.
   * @return models
  **/
  @JsonProperty("models")
  @NotNull
 @Size(min=1)  public List<@Min(0L)Long> getModels() {
    return models;
  }

  public void setModels(List<@Min(0L)Long> models) {
    this.models = models;
  }

  public GetModelsRequest models(List<@Min(0L)Long> models) {
    this.models = models;
    return this;
  }

  public GetModelsRequest addModelsItem(Long modelsItem) {
    this.models.add(modelsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

