package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.ModelDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос информации о моделях.
 */

@Schema(name = "GetModelsResponse", description = "Ответ на запрос информации о моделях.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetModelsResponse {

  @Valid
  private List<@Valid ModelDTO> models = new ArrayList<>();

  private CurrencyType currency;

  private Long regionId;

  public GetModelsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetModelsResponse(List<@Valid ModelDTO> models) {
    this.models = models;
  }

  public GetModelsResponse models(List<@Valid ModelDTO> models) {
    this.models = models;
    return this;
  }

  public GetModelsResponse addModelsItem(ModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Список моделей товаров.
   * @return models
   */
  @NotNull @Valid 
  @Schema(name = "models", description = "Список моделей товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("models")
  public List<@Valid ModelDTO> getModels() {
    return models;
  }

  public void setModels(List<@Valid ModelDTO> models) {
    this.models = models;
  }

  public GetModelsResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public GetModelsResponse regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   * @return regionId
   */
  
  @Schema(name = "regionId", description = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetModelsResponse getModelsResponse = (GetModelsResponse) o;
    return Objects.equals(this.models, getModelsResponse.models) &&
        Objects.equals(this.currency, getModelsResponse.currency) &&
        Objects.equals(this.regionId, getModelsResponse.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, currency, regionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetModelsResponse {\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

