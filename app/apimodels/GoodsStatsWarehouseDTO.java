package apimodels;

import apimodels.WarehouseStockDTO;
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
 * Информация о складе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsStatsWarehouseDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("stocks")
  @NotNull
@Valid

  private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();

  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор склада.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GoodsStatsWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название склада.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoodsStatsWarehouseDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  public GoodsStatsWarehouseDTO addStocksItem(WarehouseStockDTO stocksItem) {
    if (this.stocks == null) {
      this.stocks = new ArrayList<>();
    }
    this.stocks.add(stocksItem);
    return this;
  }

   /**
   * Информация об остатках товаров на складе.
   * @return stocks
  **/
  public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

