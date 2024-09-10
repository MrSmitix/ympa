package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 */
public class DeletePromoOffersRequest   {

    private String promoId;
    private Boolean deleteAllOffers;
    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

    /**
     * Default constructor.
     */
    public DeletePromoOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePromoOffersRequest.
     *
     * @param promoId Идентификатор акции.
     * @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
     * @param offerIds Товары, которые нужно убрать из акции.
     */
    public DeletePromoOffersRequest(
        String promoId, 
        Boolean deleteAllOffers, 
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds
    ) {
        this.promoId = promoId;
        this.deleteAllOffers = deleteAllOffers;
        this.offerIds = offerIds;
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
     * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
     * @return deleteAllOffers
     */
    public Boolean getDeleteAllOffers() {
        return deleteAllOffers;
    }

    public void setDeleteAllOffers(Boolean deleteAllOffers) {
        this.deleteAllOffers = deleteAllOffers;
    }

    /**
     * Товары, которые нужно убрать из акции.
     * @return offerIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePromoOffersRequest {\n");
        
        sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
        sb.append("    deleteAllOffers: ").append(toIndentedString(deleteAllOffers)).append("\n");
        sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

