#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_promo_offers_result_dto.h"



get_promo_offers_result_dto_t *get_promo_offers_result_dto_create(
    list_t *offers,
    forward_scrolling_pager_dto_t *paging
    ) {
    get_promo_offers_result_dto_t *get_promo_offers_result_dto_local_var = malloc(sizeof(get_promo_offers_result_dto_t));
    if (!get_promo_offers_result_dto_local_var) {
        return NULL;
    }
    get_promo_offers_result_dto_local_var->offers = offers;
    get_promo_offers_result_dto_local_var->paging = paging;

    return get_promo_offers_result_dto_local_var;
}


void get_promo_offers_result_dto_free(get_promo_offers_result_dto_t *get_promo_offers_result_dto) {
    if(NULL == get_promo_offers_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_promo_offers_result_dto->offers) {
        list_ForEach(listEntry, get_promo_offers_result_dto->offers) {
            get_promo_offer_dto_free(listEntry->data);
        }
        list_freeList(get_promo_offers_result_dto->offers);
        get_promo_offers_result_dto->offers = NULL;
    }
    if (get_promo_offers_result_dto->paging) {
        forward_scrolling_pager_dto_free(get_promo_offers_result_dto->paging);
        get_promo_offers_result_dto->paging = NULL;
    }
    free(get_promo_offers_result_dto);
}

cJSON *get_promo_offers_result_dto_convertToJSON(get_promo_offers_result_dto_t *get_promo_offers_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_promo_offers_result_dto->offers
    if (!get_promo_offers_result_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (get_promo_offers_result_dto->offers) {
    list_ForEach(offersListEntry, get_promo_offers_result_dto->offers) {
    cJSON *itemLocal = get_promo_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }


    // get_promo_offers_result_dto->paging
    if(get_promo_offers_result_dto->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(get_promo_offers_result_dto->paging);
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

get_promo_offers_result_dto_t *get_promo_offers_result_dto_parseFromJSON(cJSON *get_promo_offers_result_dtoJSON){

    get_promo_offers_result_dto_t *get_promo_offers_result_dto_local_var = NULL;

    // define the local list for get_promo_offers_result_dto->offers
    list_t *offersList = NULL;

    // define the local variable for get_promo_offers_result_dto->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // get_promo_offers_result_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(get_promo_offers_result_dtoJSON, "offers");
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
        get_promo_offer_dto_t *offersItem = get_promo_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }

    // get_promo_offers_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_promo_offers_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    get_promo_offers_result_dto_local_var = get_promo_offers_result_dto_create (
        offersList,
        paging ? paging_local_nonprim : NULL
        );

    return get_promo_offers_result_dto_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            get_promo_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
