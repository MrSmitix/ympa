package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.WarehouseStockDTO;

/**
 * Информация о складе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsStatsWarehouseDTO   {
  
  private Long id;
  private String name;
  private List<WarehouseStockDTO> stocks = new ArrayList<>();

  public GoodsStatsWarehouseDTO () {

  }

  public GoodsStatsWarehouseDTO (Long id, String name, List<WarehouseStockDTO> stocks) {
    this.id = id;
    this.name = name;
    this.stocks = stocks;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("stocks")
  public List<WarehouseStockDTO> getStocks() {
    return stocks;
  }
  public void setStocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsStatsWarehouseDTO goodsStatsWarehouseDTO = (GoodsStatsWarehouseDTO) o;
    return Objects.equals(id, goodsStatsWarehouseDTO.id) &&
        Objects.equals(name, goodsStatsWarehouseDTO.name) &&
        Objects.equals(stocks, goodsStatsWarehouseDTO.stocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsStatsWarehouseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
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
