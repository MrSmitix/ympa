#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_offers_result_dto.h"



get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offers
    ) {
    get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_local_var = malloc(sizeof(get_campaign_offers_result_dto_t));
    if (!get_campaign_offers_result_dto_local_var) {
        return NULL;
    }
    get_campaign_offers_result_dto_local_var->paging = paging;
    get_campaign_offers_result_dto_local_var->offers = offers;

    return get_campaign_offers_result_dto_local_var;
}


void get_campaign_offers_result_dto_free(get_campaign_offers_result_dto_t *get_campaign_offers_result_dto) {
    if(NULL == get_campaign_offers_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_offers_result_dto->paging) {
        scrolling_pager_dto_free(get_campaign_offers_result_dto->paging);
        get_campaign_offers_result_dto->paging = NULL;
    }
    if (get_campaign_offers_result_dto->offers) {
        list_ForEach(listEntry, get_campaign_offers_result_dto->offers) {
            get_campaign_offer_dto_free(listEntry->data);
        }
        list_freeList(get_campaign_offers_result_dto->offers);
        get_campaign_offers_result_dto->offers = NULL;
    }
    free(get_campaign_offers_result_dto);
}

cJSON *get_campaign_offers_result_dto_convertToJSON(get_campaign_offers_result_dto_t *get_campaign_offers_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_offers_result_dto->paging
    if(get_campaign_offers_result_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(get_campaign_offers_result_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_campaign_offers_result_dto->offers
    if (!get_campaign_offers_result_dto->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (get_campaign_offers_result_dto->offers) {
    list_ForEach(offersListEntry, get_campaign_offers_result_dto->offers) {
    cJSON *itemLocal = get_campaign_offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_parseFromJSON(cJSON *get_campaign_offers_result_dtoJSON){

    get_campaign_offers_result_dto_t *get_campaign_offers_result_dto_local_var = NULL;

    // define the local variable for get_campaign_offers_result_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for get_campaign_offers_result_dto->offers
    list_t *offersList = NULL;

    // get_campaign_offers_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // get_campaign_offers_result_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(get_campaign_offers_result_dtoJSON, "offers");
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
        get_campaign_offer_dto_t *offersItem = get_campaign_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    get_campaign_offers_result_dto_local_var = get_campaign_offers_result_dto_create (
        paging ? paging_local_nonprim : NULL,
        offersList
        );

    return get_campaign_offers_result_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            get_campaign_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
