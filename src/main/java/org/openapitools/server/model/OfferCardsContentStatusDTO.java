package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.OfferCardDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров с информацией о состоянии карточек.
 */
public class OfferCardsContentStatusDTO   {

    private List<@Valid OfferCardDTO> offerCards = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public OfferCardsContentStatusDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferCardsContentStatusDTO.
     *
     * @param offerCards Страница списка товаров с информацией о состоянии карточек.
     * @param paging paging
     */
    public OfferCardsContentStatusDTO(
        List<@Valid OfferCardDTO> offerCards, 
        ForwardScrollingPagerDTO paging
    ) {
        this.offerCards = offerCards;
        this.paging = paging;
    }



    /**
     * Страница списка товаров с информацией о состоянии карточек.
     * @return offerCards
     */
    public List<@Valid OfferCardDTO> getOfferCards() {
        return offerCards;
    }

    public void setOfferCards(List<@Valid OfferCardDTO> offerCards) {
        this.offerCards = offerCards;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferCardsContentStatusDTO {\n");
        
        sb.append("    offerCards: ").append(toIndentedString(offerCards)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

