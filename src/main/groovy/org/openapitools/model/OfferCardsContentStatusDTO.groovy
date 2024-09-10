package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OfferCardDTO;

@Canonical
class OfferCardsContentStatusDTO {
    /* Страница списка товаров с информацией о состоянии карточек. */
    List<OfferCardDTO> offerCards = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
