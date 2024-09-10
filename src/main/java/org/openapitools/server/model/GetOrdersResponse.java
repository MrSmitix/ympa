package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FlippingPagerDTO;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.OrderDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Модель для ответа API списка информации по заказам.
 */
public class GetOrdersResponse   {

    private FlippingPagerDTO pager;
    private List<@Valid OrderDTO> orders = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GetOrdersResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOrdersResponse.
     *
     * @param pager pager
     * @param orders Модель заказа. 
     * @param paging paging
     */
    public GetOrdersResponse(
        FlippingPagerDTO pager, 
        List<@Valid OrderDTO> orders, 
        ForwardScrollingPagerDTO paging
    ) {
        this.pager = pager;
        this.orders = orders;
        this.paging = paging;
    }



    /**
     * Get pager
     * @return pager
     */
    public FlippingPagerDTO getPager() {
        return pager;
    }

    public void setPager(FlippingPagerDTO pager) {
        this.pager = pager;
    }

    /**
     * Модель заказа. 
     * @return orders
     */
    public List<@Valid OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<@Valid OrderDTO> orders) {
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
        sb.append("class GetOrdersResponse {\n");
        
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

