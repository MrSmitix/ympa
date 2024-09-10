package org.openapitools.server.model;

import org.openapitools.server.model.PromoOfferDiscountParamsDTO;
import org.openapitools.server.model.PromoOfferPromocodeParamsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */
public class PromoOfferParamsDTO   {

    private PromoOfferDiscountParamsDTO discountParams;
    private PromoOfferPromocodeParamsDTO promocodeParams;

    /**
     * Default constructor.
     */
    public PromoOfferParamsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoOfferParamsDTO.
     *
     * @param discountParams discountParams
     * @param promocodeParams promocodeParams
     */
    public PromoOfferParamsDTO(
        PromoOfferDiscountParamsDTO discountParams, 
        PromoOfferPromocodeParamsDTO promocodeParams
    ) {
        this.discountParams = discountParams;
        this.promocodeParams = promocodeParams;
    }



    /**
     * Get discountParams
     * @return discountParams
     */
    public PromoOfferDiscountParamsDTO getDiscountParams() {
        return discountParams;
    }

    public void setDiscountParams(PromoOfferDiscountParamsDTO discountParams) {
        this.discountParams = discountParams;
    }

    /**
     * Get promocodeParams
     * @return promocodeParams
     */
    public PromoOfferPromocodeParamsDTO getPromocodeParams() {
        return promocodeParams;
    }

    public void setPromocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
        this.promocodeParams = promocodeParams;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferParamsDTO {\n");
        
        sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
        sb.append("    promocodeParams: ").append(toIndentedString(promocodeParams)).append("\n");
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

