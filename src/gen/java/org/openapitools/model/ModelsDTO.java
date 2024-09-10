package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ModelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список моделей товаров.
 */
@ApiModel(description="Список моделей товаров.")

public class ModelsDTO  {
  
 /**
  * Список моделей товаров.
  */
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @Valid
  private List<@Valid ModelDTO> models = new ArrayList<>();
 /**
  * Список моделей товаров.
  * @return models
  */
  @JsonProperty("models")
  @NotNull
  public List<@Valid ModelDTO> getModels() {
    return models;
  }

  /**
   * Sets the <code>models</code> property.
   */
 public void setModels(List<@Valid ModelDTO> models) {
    this.models = models;
  }

  /**
   * Sets the <code>models</code> property.
   */
  public ModelsDTO models(List<@Valid ModelDTO> models) {
    this.models = models;
    return this;
  }

  /**
   * Adds a new item to the <code>models</code> list.
   */
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

