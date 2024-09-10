package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.WarehouseStockDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о складе.
 */
@ApiModel(description = "Информация о складе.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsWarehouseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("stocks")
  
  private List<WarehouseStockDTO> stocks = new ArrayList<>();

  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор склада.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор склада.")
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
   */
  @ApiModelProperty(value = "Название склада.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoodsStatsWarehouseDTO stocks(List<WarehouseStockDTO> stocks) {
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
   */
  @ApiModelProperty(required = true, value = "Информация об остатках товаров на складе.")
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
    return Objects.equals(this.id, goodsStatsWarehouseDTO.id) &&
        Objects.equals(this.name, goodsStatsWarehouseDTO.name) &&
        Objects.equals(this.stocks, goodsStatsWarehouseDTO.stocks);
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

