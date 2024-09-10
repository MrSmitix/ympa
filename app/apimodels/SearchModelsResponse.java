package apimodels;

import apimodels.CurrencyType;
import apimodels.FlippingPagerDTO;
import apimodels.ModelDTO;
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
 * SearchModelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SearchModelsResponse   {
  @JsonProperty("models")
  @NotNull
@Valid

  private List<@Valid ModelDTO> models = new ArrayList<>();

  @JsonProperty("currency")
  @Valid

  private CurrencyType currency;

  @JsonProperty("regionId")
  
  private Long regionId;

  @JsonProperty("pager")
  @Valid

  private FlippingPagerDTO pager;

  public SearchModelsResponse models(List<@Valid ModelDTO> models) {
    this.models = models;
    return this;
  }

  public SearchModelsResponse addModelsItem(ModelDTO modelsItem) {
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
  public List<@Valid ModelDTO> getModels() {
    return models;
  }

  public void setModels(List<@Valid ModelDTO> models) {
    this.models = models;
  }

  public SearchModelsResponse currency(CurrencyType currency) {
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

  public SearchModelsResponse regionId(Long regionId) {
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

  public SearchModelsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

   /**
   * Get pager
   * @return pager
  **/
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
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
    return Objects.equals(models, searchModelsResponse.models) &&
        Objects.equals(currency, searchModelsResponse.currency) &&
        Objects.equals(regionId, searchModelsResponse.regionId) &&
        Objects.equals(pager, searchModelsResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, currency, regionId, pager);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

