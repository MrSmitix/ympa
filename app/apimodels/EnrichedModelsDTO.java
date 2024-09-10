package apimodels;

import apimodels.EnrichedModelDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список моделей товаров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnrichedModelsDTO   {
  @JsonProperty("models")
  @NotNull
@Valid

  private List<@Valid EnrichedModelDTO> models = new ArrayList<>();

  public EnrichedModelsDTO models(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
    return this;
  }

  public EnrichedModelsDTO addModelsItem(EnrichedModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Список моделей товаров.
   * @return models
  **/
  public List<@Valid EnrichedModelDTO> getModels() {
    return models;
  }

  public void setModels(List<@Valid EnrichedModelDTO> models) {
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
    EnrichedModelsDTO enrichedModelsDTO = (EnrichedModelsDTO) o;
    return Objects.equals(models, enrichedModelsDTO.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

