#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_prices_by_offer_ids_request.h"



get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_create(
    list_t *offer_ids
    ) {
    get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_local_var = malloc(sizeof(get_prices_by_offer_ids_request_t));
    if (!get_prices_by_offer_ids_request_local_var) {
        return NULL;
    }
    get_prices_by_offer_ids_request_local_var->offer_ids = offer_ids;

    return get_prices_by_offer_ids_request_local_var;
}


void get_prices_by_offer_ids_request_free(get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request) {
    if(NULL == get_prices_by_offer_ids_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_prices_by_offer_ids_request->offer_ids) {
        list_ForEach(listEntry, get_prices_by_offer_ids_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(get_prices_by_offer_ids_request->offer_ids);
        get_prices_by_offer_ids_request->offer_ids = NULL;
    }
    free(get_prices_by_offer_ids_request);
}

cJSON *get_prices_by_offer_ids_request_convertToJSON(get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request) {
    cJSON *item = cJSON_CreateObject();

    // get_prices_by_offer_ids_request->offer_ids
    if(get_prices_by_offer_ids_request->offer_ids) {
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, get_prices_by_offer_ids_request->offer_ids) {
    if(cJSON_AddStringToObject(offer_ids, "", (char*)offer_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_parseFromJSON(cJSON *get_prices_by_offer_ids_requestJSON){

    get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request_local_var = NULL;

    // define the local list for get_prices_by_offer_ids_request->offer_ids
    list_t *offer_idsList = NULL;

    // get_prices_by_offer_ids_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(get_prices_by_offer_ids_requestJSON, "offerIds");
    if (offer_ids) { 
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
    }


    get_prices_by_offer_ids_request_local_var = get_prices_by_offer_ids_request_create (
        offer_ids ? offer_idsList : NULL
        );

    return get_prices_by_offer_ids_request_local_var;
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
