package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о складе.
 **/
@ApiModel(description="Информация о складе.")

public class GoodsStatsWarehouseDTO  {
  
  @ApiModelProperty(value = "Идентификатор склада.")
 /**
   * Идентификатор склада.
  **/
  private Long id;

  @ApiModelProperty(value = "Название склада.")
 /**
   * Название склада.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "Информация об остатках товаров на складе.")
  @Valid
 /**
   * Информация об остатках товаров на складе.
  **/
  private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();
 /**
   * Идентификатор склада.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название склада.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoodsStatsWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Информация об остатках товаров на складе.
   * @return stocks
  **/
  @JsonProperty("stocks")
  @NotNull
  public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  public GoodsStatsWarehouseDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  public GoodsStatsWarehouseDTO addStocksItem(WarehouseStockDTO stocksItem) {
    this.stocks.add(stocksItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

