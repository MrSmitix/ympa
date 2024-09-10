package org.openapitools.server.model;

import org.openapitools.server.model.UpdatePromoOfferDiscountParamsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара, который участвует в акции.
 */
public class UpdatePromoOfferParamsDTO   {

    private UpdatePromoOfferDiscountParamsDTO discountParams;

    /**
     * Default constructor.
     */
    public UpdatePromoOfferParamsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePromoOfferParamsDTO.
     *
     * @param discountParams discountParams
     */
    public UpdatePromoOfferParamsDTO(
        UpdatePromoOfferDiscountParamsDTO discountParams
    ) {
        this.discountParams = discountParams;
    }



    /**
     * Get discountParams
     * @return discountParams
     */
    public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
        return discountParams;
    }

    public void setDiscountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
        this.discountParams = discountParams;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePromoOfferParamsDTO {\n");
        
        sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
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

