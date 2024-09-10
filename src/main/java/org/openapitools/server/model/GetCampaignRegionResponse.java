package org.openapitools.server.model;

import org.openapitools.server.model.RegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос региона магазина.
 */
public class GetCampaignRegionResponse   {

    private RegionDTO region;

    /**
     * Default constructor.
     */
    public GetCampaignRegionResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignRegionResponse.
     *
     * @param region region
     */
    public GetCampaignRegionResponse(
        RegionDTO region
    ) {
        this.region = region;
    }



    /**
     * Get region
     * @return region
     */
    public RegionDTO getRegion() {
        return region;
    }

    public void setRegion(RegionDTO region) {
        this.region = region;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignRegionResponse {\n");
        
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

