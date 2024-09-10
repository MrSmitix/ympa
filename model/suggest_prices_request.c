#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "suggest_prices_request.h"



suggest_prices_request_t *suggest_prices_request_create(
    list_t *offers
    ) {
    suggest_prices_request_t *suggest_prices_request_local_var = malloc(sizeof(suggest_prices_request_t));
    if (!suggest_prices_request_local_var) {
        return NULL;
    }
    suggest_prices_request_local_var->offers = offers;

    return suggest_prices_request_local_var;
}


void suggest_prices_request_free(suggest_prices_request_t *suggest_prices_request) {
    if(NULL == suggest_prices_request){
        return ;
    }
    listEntry_t *listEntry;
    if (suggest_prices_request->offers) {
        list_ForEach(listEntry, suggest_prices_request->offers) {
            suggest_offer_price_dto_free(listEntry->data);
        }
        list_freeList(suggest_prices_request->offers);
        suggest_prices_request->offers = NULL;
    }
    free(suggest_prices_request);
}

cJSON *suggest_prices_request_convertToJSON(suggest_prices_request_t *suggest_prices_request) {
    cJSON *item = cJSON_CreateObject();

    // suggest_prices_request->offers
    if (!suggest_prices_request->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (suggest_prices_request->offers) {
    list_ForEach(offersListEntry, suggest_prices_request->offers) {
    cJSON *itemLocal = suggest_offer_price_dto_convertToJSON(offersListEntry->data);
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

suggest_prices_request_t *suggest_prices_request_parseFromJSON(cJSON *suggest_prices_requestJSON){

    suggest_prices_request_t *suggest_prices_request_local_var = NULL;

    // define the local list for suggest_prices_request->offers
    list_t *offersList = NULL;

    // suggest_prices_request->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(suggest_prices_requestJSON, "offers");
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
        suggest_offer_price_dto_t *offersItem = suggest_offer_price_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    suggest_prices_request_local_var = suggest_prices_request_create (
        offersList
        );

    return suggest_prices_request_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            suggest_offer_price_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
