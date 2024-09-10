package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о складе.
 */
@ApiModel(description="Информация о складе.")

public class GoodsStatsWarehouseDTO  {
  
 /**
  * Идентификатор склада.
  */
  @ApiModelProperty(value = "Идентификатор склада.")
  private Long id;

 /**
  * Название склада.
  */
  @ApiModelProperty(value = "Название склада.")
  private String name;

 /**
  * Информация об остатках товаров на складе.
  */
  @ApiModelProperty(required = true, value = "Информация об остатках товаров на складе.")
  @Valid
  private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();
 /**
  * Идентификатор склада.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название склада.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public GoodsStatsWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Информация об остатках товаров на складе.
  * @return stocks
  */
  @JsonProperty("stocks")
  @NotNull
  public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  /**
   * Sets the <code>stocks</code> property.
   */
 public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  /**
   * Sets the <code>stocks</code> property.
   */
  public GoodsStatsWarehouseDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  /**
   * Adds a new item to the <code>stocks</code> list.
   */
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

