#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_price_by_offer_ids_list_response_dto.h"



offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto_create(
    list_t *offers,
    scrolling_pager_dto_t *paging
    ) {
    offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto_local_var = malloc(sizeof(offer_price_by_offer_ids_list_response_dto_t));
    if (!offer_price_by_offer_ids_list_response_dto_local_var) {
        return NULL;
    }
    offer_price_by_offer_ids_list_response_dto_local_var->offers = offers;
    offer_price_by_offer_ids_list_response_dto_local_var->paging = paging;

    return offer_price_by_offer_ids_list_response_dto_local_var;
}


void offer_price_by_offer_ids_list_response_dto_free(offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto) {
    if(NULL == offer_price_by_offer_ids_list_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_price_by_offer_ids_list_response_dto->offers) {
        list_ForEach(listEntry, offer_price_by_offer_ids_list_response_dto->offers) {
            offer_price_by_offer_ids_response_dto_free(listEntry->data);
        }
        list_freeList(offer_price_by_offer_ids_list_response_dto->offers);
        offer_price_by_offer_ids_list_response_dto->offers = NULL;
    }
    if (offer_price_by_offer_ids_list_response_dto->paging) {
        scrolling_pager_dto_free(offer_price_by_offer_ids_list_response_dto->paging);
        offer_price_by_offer_ids_list_response_dto->paging = NULL;
    }
    free(offer_price_by_offer_ids_list_response_dto);
}

cJSON *offer_price_by_offer_ids_list_response_dto_convertToJSON(offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_price_by_offer_ids_list_response_dto->offers
    if (!offer_price_by_offer_ids_list_response_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (offer_price_by_offer_ids_list_response_dto->offers) {
    list_ForEach(offersListEntry, offer_price_by_offer_ids_list_response_dto->offers) {
    cJSON *itemLocal = offer_price_by_offer_ids_response_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }


    // offer_price_by_offer_ids_list_response_dto->paging
    if(offer_price_by_offer_ids_list_response_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(offer_price_by_offer_ids_list_response_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto_parseFromJSON(cJSON *offer_price_by_offer_ids_list_response_dtoJSON){

    offer_price_by_offer_ids_list_response_dto_t *offer_price_by_offer_ids_list_response_dto_local_var = NULL;

    // define the local list for offer_price_by_offer_ids_list_response_dto->offers
    list_t *offersList = NULL;

    // define the local variable for offer_price_by_offer_ids_list_response_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // offer_price_by_offer_ids_list_response_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(offer_price_by_offer_ids_list_response_dtoJSON, "offers");
    if (!offers) {
        goto end;
    }

    
    cJSON *offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offers)){
        goto end; //nonprimitive container
    }

    offersList = list_createList();

    cJSON_ArrayForEach(offers_local_nonprimitive,offers )
    {
        if(!cJSON_IsObject(offers_local_nonprimitive)){
            goto end;
        }
        offer_price_by_offer_ids_response_dto_t *offersItem = offer_price_by_offer_ids_response_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }

    // offer_price_by_offer_ids_list_response_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(offer_price_by_offer_ids_list_response_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    offer_price_by_offer_ids_list_response_dto_local_var = offer_price_by_offer_ids_list_response_dto_create (
        offersList,
        paging ? paging_local_nonprim : NULL
        );

    return offer_price_by_offer_ids_list_response_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            offer_price_by_offer_ids_response_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
