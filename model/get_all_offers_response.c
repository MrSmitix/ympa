#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_all_offers_response.h"



get_all_offers_response_t *get_all_offers_response_create(
    list_t *offers
    ) {
    get_all_offers_response_t *get_all_offers_response_local_var = malloc(sizeof(get_all_offers_response_t));
    if (!get_all_offers_response_local_var) {
        return NULL;
    }
    get_all_offers_response_local_var->offers = offers;

    return get_all_offers_response_local_var;
}


void get_all_offers_response_free(get_all_offers_response_t *get_all_offers_response) {
    if(NULL == get_all_offers_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_all_offers_response->offers) {
        list_ForEach(listEntry, get_all_offers_response->offers) {
            offer_dto_free(listEntry->data);
        }
        list_freeList(get_all_offers_response->offers);
        get_all_offers_response->offers = NULL;
    }
    free(get_all_offers_response);
}

cJSON *get_all_offers_response_convertToJSON(get_all_offers_response_t *get_all_offers_response) {
    cJSON *item = cJSON_CreateObject();

    // get_all_offers_response->offers
    if (!get_all_offers_response->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (get_all_offers_response->offers) {
    list_ForEach(offersListEntry, get_all_offers_response->offers) {
    cJSON *itemLocal = offer_dto_convertToJSON(offersListEntry->data);
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

get_all_offers_response_t *get_all_offers_response_parseFromJSON(cJSON *get_all_offers_responseJSON){

    get_all_offers_response_t *get_all_offers_response_local_var = NULL;

    // define the local list for get_all_offers_response->offers
    list_t *offersList = NULL;

    // get_all_offers_response->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(get_all_offers_responseJSON, "offers");
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


    get_all_offers_response_local_var = get_all_offers_response_create (
        offersList
        );

    return get_all_offers_response_local_var;
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
    return NULL;

}
