package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.FlippingPagerDTO;
import org.openapitools.vertxweb.server.model.ModelDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchModelsResponse   {
  
  private List<ModelDTO> models = new ArrayList<>();
  private CurrencyType currency;
  private Long regionId;
  private FlippingPagerDTO pager;

  public SearchModelsResponse () {

  }

  public SearchModelsResponse (List<ModelDTO> models, CurrencyType currency, Long regionId, FlippingPagerDTO pager) {
    this.models = models;
    this.currency = currency;
    this.regionId = regionId;
    this.pager = pager;
  }

    
  @JsonProperty("models")
  public List<ModelDTO> getModels() {
    return models;
  }
  public void setModels(List<ModelDTO> models) {
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

    
  @JsonProperty("pager")
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
