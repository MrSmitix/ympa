#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_campaign_offers_request.h"



delete_campaign_offers_request_t *delete_campaign_offers_request_create(
    list_t *offer_ids
    ) {
    delete_campaign_offers_request_t *delete_campaign_offers_request_local_var = malloc(sizeof(delete_campaign_offers_request_t));
    if (!delete_campaign_offers_request_local_var) {
        return NULL;
    }
    delete_campaign_offers_request_local_var->offer_ids = offer_ids;

    return delete_campaign_offers_request_local_var;
}


void delete_campaign_offers_request_free(delete_campaign_offers_request_t *delete_campaign_offers_request) {
    if(NULL == delete_campaign_offers_request){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_campaign_offers_request->offer_ids) {
        list_ForEach(listEntry, delete_campaign_offers_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(delete_campaign_offers_request->offer_ids);
        delete_campaign_offers_request->offer_ids = NULL;
    }
    free(delete_campaign_offers_request);
}

cJSON *delete_campaign_offers_request_convertToJSON(delete_campaign_offers_request_t *delete_campaign_offers_request) {
    cJSON *item = cJSON_CreateObject();

    // delete_campaign_offers_request->offer_ids
    if (!delete_campaign_offers_request->offer_ids) {
        goto fail;
    }
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, delete_campaign_offers_request->offer_ids) {
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

delete_campaign_offers_request_t *delete_campaign_offers_request_parseFromJSON(cJSON *delete_campaign_offers_requestJSON){

    delete_campaign_offers_request_t *delete_campaign_offers_request_local_var = NULL;

    // define the local list for delete_campaign_offers_request->offer_ids
    list_t *offer_idsList = NULL;

    // delete_campaign_offers_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(delete_campaign_offers_requestJSON, "offerIds");
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


    delete_campaign_offers_request_local_var = delete_campaign_offers_request_create (
        offer_idsList
        );

    return delete_campaign_offers_request_local_var;
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
