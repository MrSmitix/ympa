package apimodels;

import apimodels.CurrencyType;
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
 * Ответ на запрос списка предложений для моделей.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetModelsOffersResponse   {
  @JsonProperty("models")
  @NotNull
@Valid

  private List<@Valid EnrichedModelDTO> models = new ArrayList<>();

  @JsonProperty("currency")
  @Valid

  private CurrencyType currency;

  @JsonProperty("regionId")
  
  private Long regionId;

  public GetModelsOffersResponse models(List<@Valid EnrichedModelDTO> models) {
    this.models = models;
    return this;
  }

  public GetModelsOffersResponse addModelsItem(EnrichedModelDTO modelsItem) {
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

  public GetModelsOffersResponse currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public GetModelsOffersResponse regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   * @return regionId
  **/
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
    return Objects.equals(models, getModelsOffersResponse.models) &&
        Objects.equals(currency, getModelsOffersResponse.currency) &&
        Objects.equals(regionId, getModelsOffersResponse.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, currency, regionId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

