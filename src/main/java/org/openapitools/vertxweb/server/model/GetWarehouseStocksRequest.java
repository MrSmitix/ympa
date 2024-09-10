package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Фильтры для запроса остатков. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWarehouseStocksRequest   {
  
  private Boolean withTurnover = false;
  private Boolean archived;
  private Set<String> offerIds;

  public GetWarehouseStocksRequest () {

  }

  public GetWarehouseStocksRequest (Boolean withTurnover, Boolean archived, Set<String> offerIds) {
    this.withTurnover = withTurnover;
    this.archived = archived;
    this.offerIds = offerIds;
  }

    
  @JsonProperty("withTurnover")
  public Boolean getWithTurnover() {
    return withTurnover;
  }
  public void setWithTurnover(Boolean withTurnover) {
    this.withTurnover = withTurnover;
  }

    
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

    
  @JsonProperty("offerIds")
  public Set<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(Set<String> offerIds) {
    this.offerIds = offerIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarehouseStocksRequest getWarehouseStocksRequest = (GetWarehouseStocksRequest) o;
    return Objects.equals(withTurnover, getWarehouseStocksRequest.withTurnover) &&
        Objects.equals(archived, getWarehouseStocksRequest.archived) &&
        Objects.equals(offerIds, getWarehouseStocksRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withTurnover, archived, offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarehouseStocksRequest {\n");
    
    sb.append("    withTurnover: ").append(toIndentedString(withTurnover)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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
