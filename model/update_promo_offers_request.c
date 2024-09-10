#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_promo_offers_request.h"



update_promo_offers_request_t *update_promo_offers_request_create(
    char *promo_id,
    list_t *offers
    ) {
    update_promo_offers_request_t *update_promo_offers_request_local_var = malloc(sizeof(update_promo_offers_request_t));
    if (!update_promo_offers_request_local_var) {
        return NULL;
    }
    update_promo_offers_request_local_var->promo_id = promo_id;
    update_promo_offers_request_local_var->offers = offers;

    return update_promo_offers_request_local_var;
}


void update_promo_offers_request_free(update_promo_offers_request_t *update_promo_offers_request) {
    if(NULL == update_promo_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_promo_offers_request->promo_id) {
        free(update_promo_offers_request->promo_id);
        update_promo_offers_request->promo_id = NULL;
    }
    if (update_promo_offers_request->offers) {
        list_ForEach(listEntry, update_promo_offers_request->offers) {
            update_promo_offer_dto_free(listEntry->data);
        }
        list_freeList(update_promo_offers_request->offers);
        update_promo_offers_request->offers = NULL;
    }
    free(update_promo_offers_request);
}

cJSON *update_promo_offers_request_convertToJSON(update_promo_offers_request_t *update_promo_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // update_promo_offers_request->promo_id
    if (!update_promo_offers_request->promo_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "promoId", update_promo_offers_request->promo_id) == NULL) {
    goto fail; //String
    }


    // update_promo_offers_request->offers
    if (!update_promo_offers_request->offers) {
        goto fail;
    }
    cJSON *offers = cJSON_AddArrayToObject(item, "offers");
    if(offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offersListEntry;
    if (update_promo_offers_request->offers) {
    list_ForEach(offersListEntry, update_promo_offers_request->offers) {
    cJSON *itemLocal = update_promo_offer_dto_convertToJSON(offersListEntry->data);
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

update_promo_offers_request_t *update_promo_offers_request_parseFromJSON(cJSON *update_promo_offers_requestJSON){

    update_promo_offers_request_t *update_promo_offers_request_local_var = NULL;

    // define the local list for update_promo_offers_request->offers
    list_t *offersList = NULL;

    // update_promo_offers_request->promo_id
    cJSON *promo_id = cJSON_GetObjectItemCaseSensitive(update_promo_offers_requestJSON, "promoId");
    if (!promo_id) {
        goto end;
    }

    
    if(!cJSON_IsString(promo_id))
    {
    goto end; //String
    }

    // update_promo_offers_request->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(update_promo_offers_requestJSON, "offers");
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
        update_promo_offer_dto_t *offersItem = update_promo_offer_dto_parseFromJSON(offers_local_nonprimitive);

        list_addElement(offersList, offersItem);
    }


    update_promo_offers_request_local_var = update_promo_offers_request_create (
        strdup(promo_id->valuestring),
        offersList
        );

    return update_promo_offers_request_local_var;
end:
    if (offersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offersList) {
            update_promo_offer_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offersList);
        offersList = NULL;
    }
    return NULL;

}
