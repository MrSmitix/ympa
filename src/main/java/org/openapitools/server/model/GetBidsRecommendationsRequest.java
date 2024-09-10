package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * description.
 */
public class GetBidsRecommendationsRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetBidsRecommendationsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetBidsRecommendationsRequest.
     *
     * @param skus Список товаров, для которых нужно получить рекомендации по ставкам. 
     */
    public GetBidsRecommendationsRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus
    ) {
        this.skus = skus;
    }



    /**
     * Список товаров, для которых нужно получить рекомендации по ставкам. 
     * @return skus
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getSkus() {
        return skus;
    }

    public void setSkus(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus) {
        this.skus = skus;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBidsRecommendationsRequest {\n");
        
        sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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

