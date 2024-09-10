package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ReturnDecisionDTO;
import org.openapitools.server.api.model.ReturnInstanceDTO;
import org.openapitools.server.api.model.TrackDTO;

/**
 * Список товаров в возврате.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnItemDTO   {
  
  private Long marketSku;
  private String shopSku;
  private Long count;
  private List<ReturnDecisionDTO> decisions;
  private List<ReturnInstanceDTO> instances;
  private List<TrackDTO> tracks;

  public ReturnItemDTO () {

  }

  public ReturnItemDTO (Long marketSku, String shopSku, Long count, List<ReturnDecisionDTO> decisions, List<ReturnInstanceDTO> instances, List<TrackDTO> tracks) {
    this.marketSku = marketSku;
    this.shopSku = shopSku;
    this.count = count;
    this.decisions = decisions;
    this.instances = instances;
    this.tracks = tracks;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

    
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

    
  @JsonProperty("decisions")
  public List<ReturnDecisionDTO> getDecisions() {
    return decisions;
  }
  public void setDecisions(List<ReturnDecisionDTO> decisions) {
    this.decisions = decisions;
  }

    
  @JsonProperty("instances")
  public List<ReturnInstanceDTO> getInstances() {
    return instances;
  }
  public void setInstances(List<ReturnInstanceDTO> instances) {
    this.instances = instances;
  }

    
  @JsonProperty("tracks")
  public List<TrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<TrackDTO> tracks) {
    this.tracks = tracks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnItemDTO returnItemDTO = (ReturnItemDTO) o;
    return Objects.equals(marketSku, returnItemDTO.marketSku) &&
        Objects.equals(shopSku, returnItemDTO.shopSku) &&
        Objects.equals(count, returnItemDTO.count) &&
        Objects.equals(decisions, returnItemDTO.decisions) &&
        Objects.equals(instances, returnItemDTO.instances) &&
        Objects.equals(tracks, returnItemDTO.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, shopSku, count, decisions, instances, tracks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnItemDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
