#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_offers_response.h"



get_offers_response_t *get_offers_response_create(
    list_t *offers,
    flipping_pager_dto_t *pager
    ) {
    get_offers_response_t *get_offers_response_local_var = malloc(sizeof(get_offers_response_t));
    if (!get_offers_response_local_var) {
        return NULL;
    }
    get_offers_response_local_var->offers = offers;
    get_offers_response_local_var->pager = pager;

    return get_offers_response_local_var;
}


void get_offers_response_free(get_offers_response_t *get_offers_response) {
    if(NULL == get_offers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_offers_response->offers) {
        list_ForEach(listEntry, get_offers_response->offers) {
            offer_dto_free(listEntry->data);
        }
        list_freeList(get_offers_response->offers);
        get_offers_response->offers = NULL;
    }
    if (get_offers_response->pager) {
        flipping_pager_dto_free(get_offers_response->pager);
        get_offers_response->pager = NULL;
    }
    free(get_offers_response);
}

cJSON *get_offers_response_convertToJSON(get_offers_response_t *get_offers_response) {
    cJSON *item = cJSON_CreateObject();

    // get_offers_response->offers
    if (!get_offers_response->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (get_offers_response->offers) {
    list_ForEach(offersListEntry, get_offers_response->offers) {
    cJSON *itemLocal = offer_dto_convertToJSON(offersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offers, itemLocal);
    }
    }


    // get_offers_response->pager
    if(get_offers_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(get_offers_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
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

get_offers_response_t *get_offers_response_parseFromJSON(cJSON *get_offers_responseJSON){

    get_offers_response_t *get_offers_response_local_var = NULL;

    // define the local list for get_offers_response->offers
    list_t *offersList = NULL;

    // define the local variable for get_offers_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // get_offers_response->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(get_offers_responseJSON, "offers");
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
        offer_dto_t *offersItem = offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }

    // get_offers_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(get_offers_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }


    get_offers_response_local_var = get_offers_response_create (
        offersList,
        pager ? pager_local_nonprim : NULL
        );

    return get_offers_response_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    return NULL;

}
