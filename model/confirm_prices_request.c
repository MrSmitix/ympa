#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "confirm_prices_request.h"



confirm_prices_request_t *confirm_prices_request_create(
    list_t *offer_ids
    ) {
    confirm_prices_request_t *confirm_prices_request_local_var = malloc(sizeof(confirm_prices_request_t));
    if (!confirm_prices_request_local_var) {
        return NULL;
    }
    confirm_prices_request_local_var->offer_ids = offer_ids;

    return confirm_prices_request_local_var;
}


void confirm_prices_request_free(confirm_prices_request_t *confirm_prices_request) {
    if(NULL == confirm_prices_request){
        return ;
    }
    listEntry_t *listEntry;
    if (confirm_prices_request->offer_ids) {
        list_ForEach(listEntry, confirm_prices_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(confirm_prices_request->offer_ids);
        confirm_prices_request->offer_ids = NULL;
    }
    free(confirm_prices_request);
}

cJSON *confirm_prices_request_convertToJSON(confirm_prices_request_t *confirm_prices_request) {
    cJSON *item = cJSON_CreateObject();

    // confirm_prices_request->offer_ids
    if (!confirm_prices_request->offer_ids) {
        goto fail;
    }
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, confirm_prices_request->offer_ids) {
    if(cJSON_AddStringToObject(offer_ids, "", (char*)offer_idsListEntry->data) == NULL)
    {
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

confirm_prices_request_t *confirm_prices_request_parseFromJSON(cJSON *confirm_prices_requestJSON){

    confirm_prices_request_t *confirm_prices_request_local_var = NULL;

    // define the local list for confirm_prices_request->offer_ids
    list_t *offer_idsList = NULL;

    // confirm_prices_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(confirm_prices_requestJSON, "offerIds");
    if (!offer_ids) {
        goto end;
    }

    
    cJSON *offer_ids_local = NULL;
    if(!cJSON_IsArray(offer_ids)) {
        goto end;//primitive container
    }
    offer_idsList = list_createList();

    cJSON_ArrayForEach(offer_ids_local, offer_ids)
    {
        if(!cJSON_IsString(offer_ids_local))
        {
            goto end;
        }
        list_addElement(offer_idsList , strdup(offer_ids_local->valuestring));
    }


    confirm_prices_request_local_var = confirm_prices_request_create (
        offer_idsList
        );

    return confirm_prices_request_local_var;
end:
    if (offer_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_idsList);
        offer_idsList = NULL;
    }
    return NULL;

}
