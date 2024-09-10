package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.server.model.WarningPromoOfferUpdateDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */
public class UpdatePromoOffersResultDTO   {

    private List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers;
    private List<@Valid WarningPromoOfferUpdateDTO> warningOffers;

    /**
     * Default constructor.
     */
    public UpdatePromoOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePromoOffersResultDTO.
     *
     * @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
     * @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
     */
    public UpdatePromoOffersResultDTO(
        List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers, 
        List<@Valid WarningPromoOfferUpdateDTO> warningOffers
    ) {
        this.rejectedOffers = rejectedOffers;
        this.warningOffers = warningOffers;
    }



    /**
     * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
     * @return rejectedOffers
     */
    public List<@Valid RejectedPromoOfferUpdateDTO> getRejectedOffers() {
        return rejectedOffers;
    }

    public void setRejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
        this.rejectedOffers = rejectedOffers;
    }

    /**
     * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
     * @return warningOffers
     */
    public List<@Valid WarningPromoOfferUpdateDTO> getWarningOffers() {
        return warningOffers;
    }

    public void setWarningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
        this.warningOffers = warningOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePromoOffersResultDTO {\n");
        
        sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
        sb.append("    warningOffers: ").append(toIndentedString(warningOffers)).append("\n");
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

