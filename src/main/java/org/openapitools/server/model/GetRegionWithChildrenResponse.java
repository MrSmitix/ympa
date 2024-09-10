package org.openapitools.server.model;

import org.openapitools.server.model.FlippingPagerDTO;
import org.openapitools.server.model.RegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetRegionWithChildrenResponse   {

    private FlippingPagerDTO pager;
    private RegionDTO regions;

    /**
     * Default constructor.
     */
    public GetRegionWithChildrenResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetRegionWithChildrenResponse.
     *
     * @param pager pager
     * @param regions regions
     */
    public GetRegionWithChildrenResponse(
        FlippingPagerDTO pager, 
        RegionDTO regions
    ) {
        this.pager = pager;
        this.regions = regions;
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
     * Get regions
     * @return regions
     */
    public RegionDTO getRegions() {
        return regions;
    }

    public void setRegions(RegionDTO regions) {
        this.regions = regions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRegionWithChildrenResponse {\n");
        
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

