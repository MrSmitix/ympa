#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_hidden_offers_request.h"



delete_hidden_offers_request_t *delete_hidden_offers_request_create(
    list_t *hidden_offers
    ) {
    delete_hidden_offers_request_t *delete_hidden_offers_request_local_var = malloc(sizeof(delete_hidden_offers_request_t));
    if (!delete_hidden_offers_request_local_var) {
        return NULL;
    }
    delete_hidden_offers_request_local_var->hidden_offers = hidden_offers;

    return delete_hidden_offers_request_local_var;
}


void delete_hidden_offers_request_free(delete_hidden_offers_request_t *delete_hidden_offers_request) {
    if(NULL == delete_hidden_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_hidden_offers_request->hidden_offers) {
        list_ForEach(listEntry, delete_hidden_offers_request->hidden_offers) {
            hidden_offer_dto_free(listEntry->data);
        }
        list_freeList(delete_hidden_offers_request->hidden_offers);
        delete_hidden_offers_request->hidden_offers = NULL;
    }
    free(delete_hidden_offers_request);
}

cJSON *delete_hidden_offers_request_convertToJSON(delete_hidden_offers_request_t *delete_hidden_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // delete_hidden_offers_request->hidden_offers
    if (!delete_hidden_offers_request->hidden_offers) {
        goto fail;
    }
    cJSON *hidden_offers = cJSON_AddArrayToObject(item, "hiddenOffers");
    if(hidden_offers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *hidden_offersListEntry;
    if (delete_hidden_offers_request->hidden_offers) {
    list_ForEach(hidden_offersListEntry, delete_hidden_offers_request->hidden_offers) {
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

delete_hidden_offers_request_t *delete_hidden_offers_request_parseFromJSON(cJSON *delete_hidden_offers_requestJSON){

    delete_hidden_offers_request_t *delete_hidden_offers_request_local_var = NULL;

    // define the local list for delete_hidden_offers_request->hidden_offers
    list_t *hidden_offersList = NULL;

    // delete_hidden_offers_request->hidden_offers
    cJSON *hidden_offers = cJSON_GetObjectItemCaseSensitive(delete_hidden_offers_requestJSON, "hiddenOffers");
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


    delete_hidden_offers_request_local_var = delete_hidden_offers_request_create (
        hidden_offersList
        );

    return delete_hidden_offers_request_local_var;
end:
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
