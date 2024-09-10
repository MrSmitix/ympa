package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TurnoverDTO;
import org.openapitools.vertxweb.server.model.WarehouseStockDTO;

/**
 * Информация об остатках товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseOfferDTO   {
  
  private String offerId;
  private TurnoverDTO turnoverSummary;
  private List<WarehouseStockDTO> stocks = new ArrayList<>();
  private OffsetDateTime updatedAt;

  public WarehouseOfferDTO () {

  }

  public WarehouseOfferDTO (String offerId, TurnoverDTO turnoverSummary, List<WarehouseStockDTO> stocks, OffsetDateTime updatedAt) {
    this.offerId = offerId;
    this.turnoverSummary = turnoverSummary;
    this.stocks = stocks;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("turnoverSummary")
  public TurnoverDTO getTurnoverSummary() {
    return turnoverSummary;
  }
  public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
  }

    
  @JsonProperty("stocks")
  public List<WarehouseStockDTO> getStocks() {
    return stocks;
  }
  public void setStocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseOfferDTO warehouseOfferDTO = (WarehouseOfferDTO) o;
    return Objects.equals(offerId, warehouseOfferDTO.offerId) &&
        Objects.equals(turnoverSummary, warehouseOfferDTO.turnoverSummary) &&
        Objects.equals(stocks, warehouseOfferDTO.stocks) &&
        Objects.equals(updatedAt, warehouseOfferDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, turnoverSummary, stocks, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    turnoverSummary: ").append(toIndentedString(turnoverSummary)).append("\n");
    sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
