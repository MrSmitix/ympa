#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_mapping_entries_dto.h"



offer_mapping_entries_dto_t *offer_mapping_entries_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_mapping_entries
    ) {
    offer_mapping_entries_dto_t *offer_mapping_entries_dto_local_var = malloc(sizeof(offer_mapping_entries_dto_t));
    if (!offer_mapping_entries_dto_local_var) {
        return NULL;
    }
    offer_mapping_entries_dto_local_var->paging = paging;
    offer_mapping_entries_dto_local_var->offer_mapping_entries = offer_mapping_entries;

    return offer_mapping_entries_dto_local_var;
}


void offer_mapping_entries_dto_free(offer_mapping_entries_dto_t *offer_mapping_entries_dto) {
    if(NULL == offer_mapping_entries_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_mapping_entries_dto->paging) {
        scrolling_pager_dto_free(offer_mapping_entries_dto->paging);
        offer_mapping_entries_dto->paging = NULL;
    }
    if (offer_mapping_entries_dto->offer_mapping_entries) {
        list_ForEach(listEntry, offer_mapping_entries_dto->offer_mapping_entries) {
            offer_mapping_entry_dto_free(listEntry->data);
        }
        list_freeList(offer_mapping_entries_dto->offer_mapping_entries);
        offer_mapping_entries_dto->offer_mapping_entries = NULL;
    }
    free(offer_mapping_entries_dto);
}

cJSON *offer_mapping_entries_dto_convertToJSON(offer_mapping_entries_dto_t *offer_mapping_entries_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_mapping_entries_dto->paging
    if(offer_mapping_entries_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(offer_mapping_entries_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_mapping_entries_dto->offer_mapping_entries
    if (!offer_mapping_entries_dto->offer_mapping_entries) {
        goto fail;
    }
    cJSON *offer_mapping_entries = cJSON_AddArrayToObject(item, "offerMappingEntries");
    if(offer_mapping_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_mapping_entriesListEntry;
    if (offer_mapping_entries_dto->offer_mapping_entries) {
    list_ForEach(offer_mapping_entriesListEntry, offer_mapping_entries_dto->offer_mapping_entries) {
    cJSON *itemLocal = offer_mapping_entry_dto_convertToJSON(offer_mapping_entriesListEntry->data);
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

offer_mapping_entries_dto_t *offer_mapping_entries_dto_parseFromJSON(cJSON *offer_mapping_entries_dtoJSON){

    offer_mapping_entries_dto_t *offer_mapping_entries_dto_local_var = NULL;

    // define the local variable for offer_mapping_entries_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for offer_mapping_entries_dto->offer_mapping_entries
    list_t *offer_mapping_entriesList = NULL;

    // offer_mapping_entries_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(offer_mapping_entries_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // offer_mapping_entries_dto->offer_mapping_entries
    cJSON *offer_mapping_entries = cJSON_GetObjectItemCaseSensitive(offer_mapping_entries_dtoJSON, "offerMappingEntries");
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
        offer_mapping_entry_dto_t *offer_mapping_entriesItem = offer_mapping_entry_dto_parseFromJSON(offer_mapping_entries_local_nonprimitive);

        list_addElement(offer_mapping_entriesList, offer_mapping_entriesItem);
    }


    offer_mapping_entries_dto_local_var = offer_mapping_entries_dto_create (
        paging ? paging_local_nonprim : NULL,
        offer_mapping_entriesList
        );

    return offer_mapping_entries_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (offer_mapping_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_mapping_entriesList) {
            offer_mapping_entry_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_mapping_entriesList);
        offer_mapping_entriesList = NULL;
    }
    return NULL;

}
