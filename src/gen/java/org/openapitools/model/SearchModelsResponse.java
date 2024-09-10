package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ModelDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchModelsResponse  {
  
  @ApiModelProperty(required = true, value = "Список моделей товаров.")
 /**
   * Список моделей товаров.
  **/
  private List<ModelDTO> models = new ArrayList<>();

  @ApiModelProperty(value = "")
  private CurrencyType currency;

  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
 /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  **/
  private Long regionId;

  @ApiModelProperty(value = "")
  private FlippingPagerDTO pager;
 /**
   * Список моделей товаров.
   * @return models
  **/
  @JsonProperty("models")
  public List<ModelDTO> getModels() {
    return models;
  }

  public void setModels(List<ModelDTO> models) {
    this.models = models;
  }

  public SearchModelsResponse models(List<ModelDTO> models) {
    this.models = models;
    return this;
  }

  public SearchModelsResponse addModelsItem(ModelDTO modelsItem) {
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

  public SearchModelsResponse currency(CurrencyType currency) {
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

  public SearchModelsResponse regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public SearchModelsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
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
    SearchModelsResponse searchModelsResponse = (SearchModelsResponse) o;
    return Objects.equals(this.models, searchModelsResponse.models) &&
        Objects.equals(this.currency, searchModelsResponse.currency) &&
        Objects.equals(this.regionId, searchModelsResponse.regionId) &&
        Objects.equals(this.pager, searchModelsResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, currency, regionId, pager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchModelsResponse {\n");
    
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

