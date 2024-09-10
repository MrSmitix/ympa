package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ScrollingPagerDTO;
import org.openapitools.server.model.WarehouseOffersDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список складов с информацией об остатках на каждом из них.
 */
public class GetWarehouseStocksDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid WarehouseOffersDTO> warehouses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetWarehouseStocksDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetWarehouseStocksDTO.
     *
     * @param paging paging
     * @param warehouses Страница списка складов.
     */
    public GetWarehouseStocksDTO(
        ScrollingPagerDTO paging, 
        List<@Valid WarehouseOffersDTO> warehouses
    ) {
        this.paging = paging;
        this.warehouses = warehouses;
    }



    /**
     * Get paging
     * @return paging
     */
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
     * Страница списка складов.
     * @return warehouses
     */
    public List<@Valid WarehouseOffersDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<@Valid WarehouseOffersDTO> warehouses) {
        this.warehouses = warehouses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetWarehouseStocksDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
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

