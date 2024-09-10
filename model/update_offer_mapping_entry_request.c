#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_offer_mapping_entry_request.h"



update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_create(
    list_t *offer_mapping_entries
    ) {
    update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_local_var = malloc(sizeof(update_offer_mapping_entry_request_t));
    if (!update_offer_mapping_entry_request_local_var) {
        return NULL;
    }
    update_offer_mapping_entry_request_local_var->offer_mapping_entries = offer_mapping_entries;

    return update_offer_mapping_entry_request_local_var;
}


void update_offer_mapping_entry_request_free(update_offer_mapping_entry_request_t *update_offer_mapping_entry_request) {
    if(NULL == update_offer_mapping_entry_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_offer_mapping_entry_request->offer_mapping_entries) {
        list_ForEach(listEntry, update_offer_mapping_entry_request->offer_mapping_entries) {
            update_offer_mapping_entry_dto_free(listEntry->data);
        }
        list_freeList(update_offer_mapping_entry_request->offer_mapping_entries);
        update_offer_mapping_entry_request->offer_mapping_entries = NULL;
    }
    free(update_offer_mapping_entry_request);
}

cJSON *update_offer_mapping_entry_request_convertToJSON(update_offer_mapping_entry_request_t *update_offer_mapping_entry_request) {
    cJSON *item = cJSON_CreateObject();

    // update_offer_mapping_entry_request->offer_mapping_entries
    if (!update_offer_mapping_entry_request->offer_mapping_entries) {
        goto fail;
    }
    cJSON *offer_mapping_entries = cJSON_AddArrayToObject(item, "offerMappingEntries");
    if(offer_mapping_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_mapping_entriesListEntry;
    if (update_offer_mapping_entry_request->offer_mapping_entries) {
    list_ForEach(offer_mapping_entriesListEntry, update_offer_mapping_entry_request->offer_mapping_entries) {
    cJSON *itemLocal = update_offer_mapping_entry_dto_convertToJSON(offer_mapping_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offer_mapping_entries, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_parseFromJSON(cJSON *update_offer_mapping_entry_requestJSON){

    update_offer_mapping_entry_request_t *update_offer_mapping_entry_request_local_var = NULL;

    // define the local list for update_offer_mapping_entry_request->offer_mapping_entries
    list_t *offer_mapping_entriesList = NULL;

    // update_offer_mapping_entry_request->offer_mapping_entries
    cJSON *offer_mapping_entries = cJSON_GetObjectItemCaseSensitive(update_offer_mapping_entry_requestJSON, "offerMappingEntries");
    if (!offer_mapping_entries) {
        goto end;
    }

    
    cJSON *offer_mapping_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offer_mapping_entries)){
        goto end; //nonprimitive container
    }

    offer_mapping_entriesList = list_createList();

    cJSON_ArrayForEach(offer_mapping_entries_local_nonprimitive,offer_mapping_entries )
    {
        if(!cJSON_IsObject(offer_mapping_entries_local_nonprimitive)){
            goto end;
        }
        update_offer_mapping_entry_dto_t *offer_mapping_entriesItem = update_offer_mapping_entry_dto_parseFromJSON(offer_mapping_entries_local_nonprimitive);

        list_addElement(offer_mapping_entriesList, offer_mapping_entriesItem);
    }


    update_offer_mapping_entry_request_local_var = update_offer_mapping_entry_request_create (
        offer_mapping_entriesList
        );

    return update_offer_mapping_entry_request_local_var;
end:
    if (offer_mapping_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_mapping_entriesList) {
            update_offer_mapping_entry_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_mapping_entriesList);
        offer_mapping_entriesList = NULL;
    }
    return NULL;

}
