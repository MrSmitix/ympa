package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ModelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список моделей товаров.
 **/
@ApiModel(description = "Список моделей товаров.")
@JsonTypeName("ModelsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelsDTO   {
  private @Valid List<@Valid ModelDTO> models = new ArrayList<>();

  /**
   * Список моделей товаров.
   **/
  public ModelsDTO models(List<@Valid ModelDTO> models) {
    this.models = models;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @JsonProperty("models")
  @NotNull @Valid public List<@Valid ModelDTO> getModels() {
    return models;
  }

  @JsonProperty("models")
  public void setModels(List<@Valid ModelDTO> models) {
    this.models = models;
  }

  public ModelsDTO addModelsItem(ModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }

    this.models.add(modelsItem);
    return this;
  }

  public ModelsDTO removeModelsItem(ModelDTO modelsItem) {
    if (modelsItem != null && this.models != null) {
      this.models.remove(modelsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

