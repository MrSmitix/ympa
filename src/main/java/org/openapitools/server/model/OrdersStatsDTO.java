package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.OrdersStatsOrderDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация по заказам.
 */
public class OrdersStatsDTO   {

    private List<@Valid OrdersStatsOrderDTO> orders = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public OrdersStatsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsDTO.
     *
     * @param orders Список заказов.
     * @param paging paging
     */
    public OrdersStatsDTO(
        List<@Valid OrdersStatsOrderDTO> orders, 
        ForwardScrollingPagerDTO paging
    ) {
        this.orders = orders;
        this.paging = paging;
    }



    /**
     * Список заказов.
     * @return orders
     */
    public List<@Valid OrdersStatsOrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<@Valid OrdersStatsOrderDTO> orders) {
        this.orders = orders;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsDTO {\n");
        
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

