package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о складе.
 **/
@ApiModel(description = "Информация о складе.")
@JsonTypeName("GoodsStatsWarehouseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsWarehouseDTO   {
  private Long id;
  private String name;
  private @Valid List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();

  /**
   * Идентификатор склада.
   **/
  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор склада.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название склада.
   **/
  public GoodsStatsWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название склада.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Информация об остатках товаров на складе.
   **/
  public GoodsStatsWarehouseDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация об остатках товаров на складе.")
  @JsonProperty("stocks")
  @NotNull @Valid public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  @JsonProperty("stocks")
  public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  public GoodsStatsWarehouseDTO addStocksItem(WarehouseStockDTO stocksItem) {
    if (this.stocks == null) {
      this.stocks = new ArrayList<>();
    }

    this.stocks.add(stocksItem);
    return this;
  }

  public GoodsStatsWarehouseDTO removeStocksItem(WarehouseStockDTO stocksItem) {
    if (stocksItem != null && this.stocks != null) {
      this.stocks.remove(stocksItem);
    }

    return this;
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

