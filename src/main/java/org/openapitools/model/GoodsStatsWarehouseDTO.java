/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseStockDTO;



/**
 * Информация о складе.
 */

@ApiModel(description = "Информация о складе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsWarehouseDTO   {
  
  private Long id;
  private String name;
  private List<WarehouseStockDTO> stocks = new ArrayList<>();

  /**
   * Идентификатор склада.
   */
  public GoodsStatsWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор склада.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название склада.
   */
  public GoodsStatsWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название склада.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Информация об остатках товаров на складе.
   */
  public GoodsStatsWarehouseDTO stocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация об остатках товаров на складе.")
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

