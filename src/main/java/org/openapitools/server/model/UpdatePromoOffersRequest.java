package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdatePromoOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 */
public class UpdatePromoOffersRequest   {

    private String promoId;
    private List<@Valid UpdatePromoOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdatePromoOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePromoOffersRequest.
     *
     * @param promoId Идентификатор акции.
     * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
     */
    public UpdatePromoOffersRequest(
        String promoId, 
        List<@Valid UpdatePromoOfferDTO> offers
    ) {
        this.promoId = promoId;
        this.offers = offers;
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
     * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
     * @return offers
     */
    public List<@Valid UpdatePromoOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid UpdatePromoOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePromoOffersRequest {\n");
        
        sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

