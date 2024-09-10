package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
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
 * Ответ на запрос информации о моделях.
 **/
@ApiModel(description = "Ответ на запрос информации о моделях.")
@JsonTypeName("GetModelsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetModelsResponse   {
  private @Valid List<@Valid ModelDTO> models = new ArrayList<>();
  private CurrencyType currency;
  private Long regionId;

  /**
   * Список моделей товаров.
   **/
  public GetModelsResponse models(List<@Valid ModelDTO> models) {
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

  public GetModelsResponse addModelsItem(ModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }

    this.models.add(modelsItem);
    return this;
  }

  public GetModelsResponse removeModelsItem(ModelDTO modelsItem) {
    if (modelsItem != null && this.models != null) {
      this.models.remove(modelsItem);
    }

    return this;
  }
  /**
   **/
  public GetModelsResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   **/
  public GetModelsResponse regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  @JsonProperty("regionId")
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

