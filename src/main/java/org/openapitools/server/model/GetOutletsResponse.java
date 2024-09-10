package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FlippingPagerDTO;
import org.openapitools.server.model.FullOutletDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос информации о точках продаж.
 */
public class GetOutletsResponse   {

    private List<@Valid FullOutletDTO> outlets = new ArrayList<>();
    private ScrollingPagerDTO paging;
    private FlippingPagerDTO pager;

    /**
     * Default constructor.
     */
    public GetOutletsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOutletsResponse.
     *
     * @param outlets Информация о точках продаж.
     * @param paging paging
     * @param pager pager
     */
    public GetOutletsResponse(
        List<@Valid FullOutletDTO> outlets, 
        ScrollingPagerDTO paging, 
        FlippingPagerDTO pager
    ) {
        this.outlets = outlets;
        this.paging = paging;
        this.pager = pager;
    }



    /**
     * Информация о точках продаж.
     * @return outlets
     */
    public List<@Valid FullOutletDTO> getOutlets() {
        return outlets;
    }

    public void setOutlets(List<@Valid FullOutletDTO> outlets) {
        this.outlets = outlets;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOutletsResponse {\n");
        
        sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

