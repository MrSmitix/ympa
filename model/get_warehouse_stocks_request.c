#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_warehouse_stocks_request.h"



get_warehouse_stocks_request_t *get_warehouse_stocks_request_create(
    int with_turnover,
    int archived,
    list_t *offer_ids
    ) {
    get_warehouse_stocks_request_t *get_warehouse_stocks_request_local_var = malloc(sizeof(get_warehouse_stocks_request_t));
    if (!get_warehouse_stocks_request_local_var) {
        return NULL;
    }
    get_warehouse_stocks_request_local_var->with_turnover = with_turnover;
    get_warehouse_stocks_request_local_var->archived = archived;
    get_warehouse_stocks_request_local_var->offer_ids = offer_ids;

    return get_warehouse_stocks_request_local_var;
}


void get_warehouse_stocks_request_free(get_warehouse_stocks_request_t *get_warehouse_stocks_request) {
    if(NULL == get_warehouse_stocks_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_warehouse_stocks_request->offer_ids) {
        list_ForEach(listEntry, get_warehouse_stocks_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(get_warehouse_stocks_request->offer_ids);
        get_warehouse_stocks_request->offer_ids = NULL;
    }
    free(get_warehouse_stocks_request);
}

cJSON *get_warehouse_stocks_request_convertToJSON(get_warehouse_stocks_request_t *get_warehouse_stocks_request) {
    cJSON *item = cJSON_CreateObject();

    // get_warehouse_stocks_request->with_turnover
    if(get_warehouse_stocks_request->with_turnover) {
    if(cJSON_AddBoolToObject(item, "withTurnover", get_warehouse_stocks_request->with_turnover) == NULL) {
    goto fail; //Bool
    }
    }


    // get_warehouse_stocks_request->archived
    if(get_warehouse_stocks_request->archived) {
    if(cJSON_AddBoolToObject(item, "archived", get_warehouse_stocks_request->archived) == NULL) {
    goto fail; //Bool
    }
    }


    // get_warehouse_stocks_request->offer_ids
    if(get_warehouse_stocks_request->offer_ids) {
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, get_warehouse_stocks_request->offer_ids) {
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

get_warehouse_stocks_request_t *get_warehouse_stocks_request_parseFromJSON(cJSON *get_warehouse_stocks_requestJSON){

    get_warehouse_stocks_request_t *get_warehouse_stocks_request_local_var = NULL;

    // define the local list for get_warehouse_stocks_request->offer_ids
    list_t *offer_idsList = NULL;

    // get_warehouse_stocks_request->with_turnover
    cJSON *with_turnover = cJSON_GetObjectItemCaseSensitive(get_warehouse_stocks_requestJSON, "withTurnover");
    if (with_turnover) { 
    if(!cJSON_IsBool(with_turnover))
    {
    goto end; //Bool
    }
    }

    // get_warehouse_stocks_request->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(get_warehouse_stocks_requestJSON, "archived");
    if (archived) { 
    if(!cJSON_IsBool(archived))
    {
    goto end; //Bool
    }
    }

    // get_warehouse_stocks_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(get_warehouse_stocks_requestJSON, "offerIds");
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


    get_warehouse_stocks_request_local_var = get_warehouse_stocks_request_create (
        with_turnover ? with_turnover->valueint : 0,
        archived ? archived->valueint : 0,
        offer_ids ? offer_idsList : NULL
        );

    return get_warehouse_stocks_request_local_var;
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
