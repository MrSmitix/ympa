package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.ModelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос информации о моделях.
 */
@ApiModel(description="Ответ на запрос информации о моделях.")

public class GetModelsResponse  {
  
 /**
  * Список моделей товаров.
  */
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @Valid
  private List<@Valid ModelDTO> models = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CurrencyType currency;

 /**
  * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  */
  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
  private Long regionId;
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
  public GetModelsResponse models(List<@Valid ModelDTO> models) {
    this.models = models;
    return this;
  }

  /**
   * Adds a new item to the <code>models</code> list.
   */
  public GetModelsResponse addModelsItem(ModelDTO modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public GetModelsResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  * @return regionId
  */
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
 public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
  public GetModelsResponse regionId(Long regionId) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

