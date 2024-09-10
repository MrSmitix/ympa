package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.PromoOfferParticipationStatusFilterType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */
public class GetPromoOffersRequest   {

    private String promoId;
    private PromoOfferParticipationStatusFilterType statusType;

    /**
     * Default constructor.
     */
    public GetPromoOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoOffersRequest.
     *
     * @param promoId Идентификатор акции.
     * @param statusType statusType
     */
    public GetPromoOffersRequest(
        String promoId, 
        PromoOfferParticipationStatusFilterType statusType
    ) {
        this.promoId = promoId;
        this.statusType = statusType;
    }



    /**
     * Идентификатор акции.
     * @return promoId
     */
    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    /**
     * Get statusType
     * @return statusType
     */
    public PromoOfferParticipationStatusFilterType getStatusType() {
        return statusType;
    }

    public void setStatusType(PromoOfferParticipationStatusFilterType statusType) {
        this.statusType = statusType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoOffersRequest {\n");
        
        sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
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

