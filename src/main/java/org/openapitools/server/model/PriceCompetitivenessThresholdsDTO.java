package org.openapitools.server.model;

import org.openapitools.server.model.BasePriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */
public class PriceCompetitivenessThresholdsDTO   {

    private BasePriceDTO optimalPrice;
    private BasePriceDTO averagePrice;

    /**
     * Default constructor.
     */
    public PriceCompetitivenessThresholdsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceCompetitivenessThresholdsDTO.
     *
     * @param optimalPrice optimalPrice
     * @param averagePrice averagePrice
     */
    public PriceCompetitivenessThresholdsDTO(
        BasePriceDTO optimalPrice, 
        BasePriceDTO averagePrice
    ) {
        this.optimalPrice = optimalPrice;
        this.averagePrice = averagePrice;
    }



    /**
     * Get optimalPrice
     * @return optimalPrice
     */
    public BasePriceDTO getOptimalPrice() {
        return optimalPrice;
    }

    public void setOptimalPrice(BasePriceDTO optimalPrice) {
        this.optimalPrice = optimalPrice;
    }

    /**
     * Get averagePrice
     * @return averagePrice
     */
    public BasePriceDTO getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BasePriceDTO averagePrice) {
        this.averagePrice = averagePrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceCompetitivenessThresholdsDTO {\n");
        
        sb.append("    optimalPrice: ").append(toIndentedString(optimalPrice)).append("\n");
        sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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

