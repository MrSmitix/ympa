package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос информации о моделях.
 */

@Schema(name = "GetModelsRequest", description = "Запрос информации о моделях.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetModelsRequest {

  @Valid
  private List<@Min(0L)Long> models = new ArrayList<>();

  public GetModelsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetModelsRequest(List<@Min(0L)Long> models) {
    this.models = models;
  }

  public GetModelsRequest models(List<@Min(0L)Long> models) {
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
  @NotNull @Size(min = 1) 
  @Schema(name = "models", description = "Список моделей.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("models")
  public List<@Min(0L)Long> getModels() {
    return models;
  }

  public void setModels(List<@Min(0L)Long> models) {
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

