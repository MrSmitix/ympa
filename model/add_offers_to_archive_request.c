#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_offers_to_archive_request.h"



add_offers_to_archive_request_t *add_offers_to_archive_request_create(
    list_t *offer_ids
    ) {
    add_offers_to_archive_request_t *add_offers_to_archive_request_local_var = malloc(sizeof(add_offers_to_archive_request_t));
    if (!add_offers_to_archive_request_local_var) {
        return NULL;
    }
    add_offers_to_archive_request_local_var->offer_ids = offer_ids;

    return add_offers_to_archive_request_local_var;
}


void add_offers_to_archive_request_free(add_offers_to_archive_request_t *add_offers_to_archive_request) {
    if(NULL == add_offers_to_archive_request){
        return ;
    }
    listEntry_t *listEntry;
    if (add_offers_to_archive_request->offer_ids) {
        list_ForEach(listEntry, add_offers_to_archive_request->offer_ids) {
            free(listEntry->data);
        }
        list_freeList(add_offers_to_archive_request->offer_ids);
        add_offers_to_archive_request->offer_ids = NULL;
    }
    free(add_offers_to_archive_request);
}

cJSON *add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request_t *add_offers_to_archive_request) {
    cJSON *item = cJSON_CreateObject();

    // add_offers_to_archive_request->offer_ids
    if (!add_offers_to_archive_request->offer_ids) {
        goto fail;
    }
    cJSON *offer_ids = cJSON_AddArrayToObject(item, "offerIds");
    if(offer_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *offer_idsListEntry;
    list_ForEach(offer_idsListEntry, add_offers_to_archive_request->offer_ids) {
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

add_offers_to_archive_request_t *add_offers_to_archive_request_parseFromJSON(cJSON *add_offers_to_archive_requestJSON){

    add_offers_to_archive_request_t *add_offers_to_archive_request_local_var = NULL;

    // define the local list for add_offers_to_archive_request->offer_ids
    list_t *offer_idsList = NULL;

    // add_offers_to_archive_request->offer_ids
    cJSON *offer_ids = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_requestJSON, "offerIds");
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


    add_offers_to_archive_request_local_var = add_offers_to_archive_request_create (
        offer_idsList
        );

    return add_offers_to_archive_request_local_var;
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
