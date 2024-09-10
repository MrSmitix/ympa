package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Рекомендованная ставка и возможная доля показов.
 */
public class BidRecommendationItemDTO   {

    private Integer bid;
    private Long showPercent;

    /**
     * Default constructor.
     */
    public BidRecommendationItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create BidRecommendationItemDTO.
     *
     * @param bid Значение ставки.
     * @param showPercent Доля показов. 
     */
    public BidRecommendationItemDTO(
        Integer bid, 
        Long showPercent
    ) {
        this.bid = bid;
        this.showPercent = showPercent;
    }



    /**
     * Значение ставки.
     * minimum: 0
     * maximum: 9999
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * Доля показов. 
     * minimum: 0
     * maximum: 100
     * @return showPercent
     */
    public Long getShowPercent() {
        return showPercent;
    }

    public void setShowPercent(Long showPercent) {
        this.showPercent = showPercent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidRecommendationItemDTO {\n");
        
        sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
        sb.append("    showPercent: ").append(toIndentedString(showPercent)).append("\n");
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

