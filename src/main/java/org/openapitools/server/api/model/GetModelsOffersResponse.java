package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.EnrichedModelDTO;

/**
 * Ответ на запрос списка предложений для моделей.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetModelsOffersResponse   {
  
  private List<EnrichedModelDTO> models = new ArrayList<>();
  private CurrencyType currency;
  private Long regionId;

  public GetModelsOffersResponse () {

  }

  public GetModelsOffersResponse (List<EnrichedModelDTO> models, CurrencyType currency, Long regionId) {
    this.models = models;
    this.currency = currency;
    this.regionId = regionId;
  }

    
  @JsonProperty("models")
  public List<EnrichedModelDTO> getModels() {
    return models;
  }
  public void setModels(List<EnrichedModelDTO> models) {
    this.models = models;
  }

    
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

    
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
    return Objects.equals(models, getModelsOffersResponse.models) &&
        Objects.equals(currency, getModelsOffersResponse.currency) &&
        Objects.equals(regionId, getModelsOffersResponse.regionId);
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
