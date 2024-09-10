#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_bids_recommendations_request.h"



get_bids_recommendations_request_t *get_bids_recommendations_request_create(
    list_t *skus
    ) {
    get_bids_recommendations_request_t *get_bids_recommendations_request_local_var = malloc(sizeof(get_bids_recommendations_request_t));
    if (!get_bids_recommendations_request_local_var) {
        return NULL;
    }
    get_bids_recommendations_request_local_var->skus = skus;

    return get_bids_recommendations_request_local_var;
}


void get_bids_recommendations_request_free(get_bids_recommendations_request_t *get_bids_recommendations_request) {
    if(NULL == get_bids_recommendations_request){
        return ;
    }
    listEntry_t *listEntry;
    if (get_bids_recommendations_request->skus) {
        list_ForEach(listEntry, get_bids_recommendations_request->skus) {
            free(listEntry->data);
        }
        list_freeList(get_bids_recommendations_request->skus);
        get_bids_recommendations_request->skus = NULL;
    }
    free(get_bids_recommendations_request);
}

cJSON *get_bids_recommendations_request_convertToJSON(get_bids_recommendations_request_t *get_bids_recommendations_request) {
    cJSON *item = cJSON_CreateObject();

    // get_bids_recommendations_request->skus
    if (!get_bids_recommendations_request->skus) {
        goto fail;
    }
    cJSON *skus = cJSON_AddArrayToObject(item, "skus");
    if(skus == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *skusListEntry;
    list_ForEach(skusListEntry, get_bids_recommendations_request->skus) {
    if(cJSON_AddStringToObject(skus, "", (char*)skusListEntry->data) == NULL)
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

get_bids_recommendations_request_t *get_bids_recommendations_request_parseFromJSON(cJSON *get_bids_recommendations_requestJSON){

    get_bids_recommendations_request_t *get_bids_recommendations_request_local_var = NULL;

    // define the local list for get_bids_recommendations_request->skus
    list_t *skusList = NULL;

    // get_bids_recommendations_request->skus
    cJSON *skus = cJSON_GetObjectItemCaseSensitive(get_bids_recommendations_requestJSON, "skus");
    if (!skus) {
        goto end;
    }

    
    cJSON *skus_local = NULL;
    if(!cJSON_IsArray(skus)) {
        goto end;//primitive container
    }
    skusList = list_createList();

    cJSON_ArrayForEach(skus_local, skus)
    {
        if(!cJSON_IsString(skus_local))
        {
            goto end;
        }
        list_addElement(skusList , strdup(skus_local->valuestring));
    }


    get_bids_recommendations_request_local_var = get_bids_recommendations_request_create (
        skusList
        );

    return get_bids_recommendations_request_local_var;
end:
    if (skusList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, skusList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(skusList);
        skusList = NULL;
    }
    return NULL;

}
