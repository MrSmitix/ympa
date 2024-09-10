package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.server.model.PromoOfferParamsDTO;
import org.openapitools.server.model.PromoOfferParticipationStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товар, который участвует или может участвовать в акции.
 */
public class GetPromoOfferDTO   {

    private String offerId;
    private PromoOfferParticipationStatusType status;
    private PromoOfferParamsDTO params;
    private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;

    /**
     * Default constructor.
     */
    public GetPromoOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoOfferDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param status status
     * @param params params
     * @param autoParticipatingDetails autoParticipatingDetails
     */
    public GetPromoOfferDTO(
        String offerId, 
        PromoOfferParticipationStatusType status, 
        PromoOfferParamsDTO params, 
        PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails
    ) {
        this.offerId = offerId;
        this.status = status;
        this.params = params;
        this.autoParticipatingDetails = autoParticipatingDetails;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * Get status
     * @return status
     */
    public PromoOfferParticipationStatusType getStatus() {
        return status;
    }

    public void setStatus(PromoOfferParticipationStatusType status) {
        this.status = status;
    }

    /**
     * Get params
     * @return params
     */
    public PromoOfferParamsDTO getParams() {
        return params;
    }

    public void setParams(PromoOfferParamsDTO params) {
        this.params = params;
    }

    /**
     * Get autoParticipatingDetails
     * @return autoParticipatingDetails
     */
    public PromoOfferAutoParticipatingDetailsDTO getAutoParticipatingDetails() {
        return autoParticipatingDetails;
    }

    public void setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
        this.autoParticipatingDetails = autoParticipatingDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoOfferDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    autoParticipatingDetails: ").append(toIndentedString(autoParticipatingDetails)).append("\n");
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

