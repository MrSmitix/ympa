package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.EnrichedModelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ на запрос списка предложений для моделей.
 **/
@ApiModel(description="Ответ на запрос списка предложений для моделей.")

public class GetModelsOffersResponse  {
  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @Valid
 /**
   * Список моделей товаров.
  **/
  private List<@Valid EnrichedModelDTO> models = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CurrencyType currency;

  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
 /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  **/
  private Long regionId;
 /**
   * Список моделей товаров.
   * @return models
  **/
  @JsonProperty("models")
  @NotNull
  public List<@Valid EnrichedModelDTO> getModels() {
    return models;
  }

  public void setModels(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
  }

  public GetModelsOffersResponse models(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
    return this;
  }

  public GetModelsOffersResponse addModelsItem(EnrichedModelDTO modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public GetModelsOffersResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   * @return regionId
  **/
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public GetModelsOffersResponse regionId(Long regionId) {
    this.regionId = regionId;
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
    GetModelsOffersResponse getModelsOffersResponse = (GetModelsOffersResponse) o;
    return Objects.equals(this.models, getModelsOffersResponse.models) &&
        Objects.equals(this.currency, getModelsOffersResponse.currency) &&
        Objects.equals(this.regionId, getModelsOffersResponse.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, currency, regionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetModelsOffersResponse {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

