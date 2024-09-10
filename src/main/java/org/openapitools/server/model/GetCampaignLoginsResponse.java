package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос списка логинов, связанных с магазином.
 */
public class GetCampaignLoginsResponse   {

    private List<String> logins = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetCampaignLoginsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignLoginsResponse.
     *
     * @param logins Список логинов.
     */
    public GetCampaignLoginsResponse(
        List<String> logins
    ) {
        this.logins = logins;
    }



    /**
     * Список логинов.
     * @return logins
     */
    public List<String> getLogins() {
        return logins;
    }

    public void setLogins(List<String> logins) {
        this.logins = logins;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignLoginsResponse {\n");
        
        sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
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

