package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.WarehouseStockDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о складе.
 */
public class GoodsStatsWarehouseDTO   {

    private Long id;
    private String name;
    private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GoodsStatsWarehouseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsStatsWarehouseDTO.
     *
     * @param id Идентификатор склада.
     * @param name Название склада.
     * @param stocks Информация об остатках товаров на складе.
     */
    public GoodsStatsWarehouseDTO(
        Long id, 
        String name, 
        List<@Valid WarehouseStockDTO> stocks
    ) {
        this.id = id;
        this.name = name;
        this.stocks = stocks;
    }



    /**
     * Идентификатор склада.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название склада.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Информация об остатках товаров на складе.
     * @return stocks
     */
    public List<@Valid WarehouseStockDTO> getStocks() {
        return stocks;
    }

    public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
        this.stocks = stocks;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

