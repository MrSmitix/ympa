package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignDTO;
import org.openapitools.server.model.FlippingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результаты поиска магазинов.
 */
public class GetCampaignsResponse   {

    private List<@Valid CampaignDTO> campaigns = new ArrayList<>();
    private FlippingPagerDTO pager;

    /**
     * Default constructor.
     */
    public GetCampaignsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignsResponse.
     *
     * @param campaigns Список с информацией по каждому магазину.
     * @param pager pager
     */
    public GetCampaignsResponse(
        List<@Valid CampaignDTO> campaigns, 
        FlippingPagerDTO pager
    ) {
        this.campaigns = campaigns;
        this.pager = pager;
    }



    /**
     * Список с информацией по каждому магазину.
     * @return campaigns
     */
    public List<@Valid CampaignDTO> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<@Valid CampaignDTO> campaigns) {
        this.campaigns = campaigns;
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
        sb.append("class GetCampaignsResponse {\n");
        
        sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
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

