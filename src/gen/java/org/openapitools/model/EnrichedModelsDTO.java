package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedModelDTO;
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
@JsonTypeName("EnrichedModelsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedModelsDTO   {
  private @Valid List<@Valid EnrichedModelDTO> models = new ArrayList<>();

  /**
   * Список моделей товаров.
   **/
  public EnrichedModelsDTO models(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @JsonProperty("models")
  @NotNull @Valid public List<@Valid EnrichedModelDTO> getModels() {
    return models;
  }

  @JsonProperty("models")
  public void setModels(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
  }

  public EnrichedModelsDTO addModelsItem(EnrichedModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }

    this.models.add(modelsItem);
    return this;
  }

  public EnrichedModelsDTO removeModelsItem(EnrichedModelDTO modelsItem) {
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
    EnrichedModelsDTO enrichedModelsDTO = (EnrichedModelsDTO) o;
    return Objects.equals(this.models, enrichedModelsDTO.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedModelsDTO {\n");
    
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

