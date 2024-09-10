#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_business_prices_request.h"



update_business_prices_request_t *update_business_prices_request_create(
    list_t *offers
    ) {
    update_business_prices_request_t *update_business_prices_request_local_var = malloc(sizeof(update_business_prices_request_t));
    if (!update_business_prices_request_local_var) {
        return NULL;
    }
    update_business_prices_request_local_var->offers = offers;

    return update_business_prices_request_local_var;
}


void update_business_prices_request_free(update_business_prices_request_t *update_business_prices_request) {
    if(NULL == update_business_prices_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_business_prices_request->offers) {
        list_ForEach(listEntry, update_business_prices_request->offers) {
            update_business_offer_price_dto_free(listEntry->data);
        }
        list_freeList(update_business_prices_request->offers);
        update_business_prices_request->offers = NULL;
    }
    free(update_business_prices_request);
}

cJSON *update_business_prices_request_convertToJSON(update_business_prices_request_t *update_business_prices_request) {
    cJSON *item = cJSON_CreateObject();

    // update_business_prices_request->offers
    if (!update_business_prices_request->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (update_business_prices_request->offers) {
    list_ForEach(offersListEntry, update_business_prices_request->offers) {
    cJSON *itemLocal = update_business_offer_price_dto_convertToJSON(offersListEntry->data);
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

update_business_prices_request_t *update_business_prices_request_parseFromJSON(cJSON *update_business_prices_requestJSON){

    update_business_prices_request_t *update_business_prices_request_local_var = NULL;

    // define the local list for update_business_prices_request->offers
    list_t *offersList = NULL;

    // update_business_prices_request->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(update_business_prices_requestJSON, "offers");
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
        update_business_offer_price_dto_t *offersItem = update_business_offer_price_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    update_business_prices_request_local_var = update_business_prices_request_create (
        offersList
        );

    return update_business_prices_request_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            update_business_offer_price_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
