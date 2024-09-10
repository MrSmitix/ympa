#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_hidden_offers_result_dto.h"



get_hidden_offers_result_dto_t *get_hidden_offers_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *hidden_offers
    ) {
    get_hidden_offers_result_dto_t *get_hidden_offers_result_dto_local_var = malloc(sizeof(get_hidden_offers_result_dto_t));
    if (!get_hidden_offers_result_dto_local_var) {
        return NULL;
    }
    get_hidden_offers_result_dto_local_var->paging = paging;
    get_hidden_offers_result_dto_local_var->hidden_offers = hidden_offers;

    return get_hidden_offers_result_dto_local_var;
}


void get_hidden_offers_result_dto_free(get_hidden_offers_result_dto_t *get_hidden_offers_result_dto) {
    if(NULL == get_hidden_offers_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_hidden_offers_result_dto->paging) {
        scrolling_pager_dto_free(get_hidden_offers_result_dto->paging);
        get_hidden_offers_result_dto->paging = NULL;
    }
    if (get_hidden_offers_result_dto->hidden_offers) {
        list_ForEach(listEntry, get_hidden_offers_result_dto->hidden_offers) {
            hidden_offer_dto_free(listEntry->data);
        }
        list_freeList(get_hidden_offers_result_dto->hidden_offers);
        get_hidden_offers_result_dto->hidden_offers = NULL;
    }
    free(get_hidden_offers_result_dto);
}

cJSON *get_hidden_offers_result_dto_convertToJSON(get_hidden_offers_result_dto_t *get_hidden_offers_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_hidden_offers_result_dto->paging
    if(get_hidden_offers_result_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(get_hidden_offers_result_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_hidden_offers_result_dto->hidden_offers
    if (!get_hidden_offers_result_dto->hidden_offers) {
        goto fail;
    }
    cJSON *hidden_offers = cJSON_AddArrayToObject(item, "hiddenOffers");
    if(hidden_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *hidden_offersListEntry;
    if (get_hidden_offers_result_dto->hidden_offers) {
    list_ForEach(hidden_offersListEntry, get_hidden_offers_result_dto->hidden_offers) {
    cJSON *itemLocal = hidden_offer_dto_convertToJSON(hidden_offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(hidden_offers, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_hidden_offers_result_dto_t *get_hidden_offers_result_dto_parseFromJSON(cJSON *get_hidden_offers_result_dtoJSON){

    get_hidden_offers_result_dto_t *get_hidden_offers_result_dto_local_var = NULL;

    // define the local variable for get_hidden_offers_result_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for get_hidden_offers_result_dto->hidden_offers
    list_t *hidden_offersList = NULL;

    // get_hidden_offers_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_hidden_offers_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // get_hidden_offers_result_dto->hidden_offers
    cJSON *hidden_offers = cJSON_GetObjectItemCaseSensitive(get_hidden_offers_result_dtoJSON, "hiddenOffers");
    if (!hidden_offers) {
        goto end;
    }

    
    cJSON *hidden_offers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(hidden_offers)){
        goto end; //nonprimitive container
    }

    hidden_offersList = list_createList();

    cJSON_ArrayForEach(hidden_offers_local_nonprimitive,hidden_offers )
    {
        if(!cJSON_IsObject(hidden_offers_local_nonprimitive)){
            goto end;
        }
        hidden_offer_dto_t *hidden_offersItem = hidden_offer_dto_parseFromJSON(hidden_offers_local_nonprimitive);

        list_addElement(hidden_offersList, hidden_offersItem);
    }


    get_hidden_offers_result_dto_local_var = get_hidden_offers_result_dto_create (
        paging ? paging_local_nonprim : NULL,
        hidden_offersList
        );

    return get_hidden_offers_result_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (hidden_offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hidden_offersList) {
            hidden_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hidden_offersList);
        hidden_offersList = NULL;
    }
    return NULL;

}
