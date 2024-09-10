package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.RegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetRegionsResponse   {

    private List<@Valid RegionDTO> regions = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GetRegionsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetRegionsResponse.
     *
     * @param regions Регион доставки.
     * @param paging paging
     */
    public GetRegionsResponse(
        List<@Valid RegionDTO> regions, 
        ForwardScrollingPagerDTO paging
    ) {
        this.regions = regions;
        this.paging = paging;
    }



    /**
     * Регион доставки.
     * @return regions
     */
    public List<@Valid RegionDTO> getRegions() {
        return regions;
    }

    public void setRegions(List<@Valid RegionDTO> regions) {
        this.regions = regions;
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
        sb.append("class GetRegionsResponse {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

