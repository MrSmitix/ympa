package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.EnrichedModelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос списка предложений для моделей.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос списка предложений для моделей.")
public class GetModelsOffersResponse   {
  
  private List<@Valid EnrichedModelDTO> models = new ArrayList<>();

  private CurrencyType currency;

  private Long regionId;

  /**
   * Список моделей товаров.
   **/
  public GetModelsOffersResponse models(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
  @JsonProperty("models")
  @NotNull
  public List<@Valid EnrichedModelDTO> getModels() {
    return models;
  }
  public void setModels(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
  }

  public GetModelsOffersResponse addModelsItem(EnrichedModelDTO modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }


  /**
   **/
  public GetModelsOffersResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }


  /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   **/
  public GetModelsOffersResponse regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

