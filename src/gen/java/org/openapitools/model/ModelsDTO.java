package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ModelDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список моделей товаров.
 **/
@ApiModel(description="Список моделей товаров.")

public class ModelsDTO  {
  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
 /**
   * Список моделей товаров.
  **/
  private List<ModelDTO> models = new ArrayList<>();
 /**
   * Список моделей товаров.
   * @return models
  **/
  @JsonProperty("models")
  public List<ModelDTO> getModels() {
    return models;
  }

  public void setModels(List<ModelDTO> models) {
    this.models = models;
  }

  public ModelsDTO models(List<ModelDTO> models) {
    this.models = models;
    return this;
  }

  public ModelsDTO addModelsItem(ModelDTO modelsItem) {
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
    ModelsDTO modelsDTO = (ModelsDTO) o;
    return Objects.equals(this.models, modelsDTO.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDTO {\n");
    
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

