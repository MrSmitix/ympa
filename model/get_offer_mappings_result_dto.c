#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_offer_mappings_result_dto.h"



get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_create(
    scrolling_pager_dto_t *paging,
    list_t *offer_mappings
    ) {
    get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_local_var = malloc(sizeof(get_offer_mappings_result_dto_t));
    if (!get_offer_mappings_result_dto_local_var) {
        return NULL;
    }
    get_offer_mappings_result_dto_local_var->paging = paging;
    get_offer_mappings_result_dto_local_var->offer_mappings = offer_mappings;

    return get_offer_mappings_result_dto_local_var;
}


void get_offer_mappings_result_dto_free(get_offer_mappings_result_dto_t *get_offer_mappings_result_dto) {
    if(NULL == get_offer_mappings_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_offer_mappings_result_dto->paging) {
        scrolling_pager_dto_free(get_offer_mappings_result_dto->paging);
        get_offer_mappings_result_dto->paging = NULL;
    }
    if (get_offer_mappings_result_dto->offer_mappings) {
        list_ForEach(listEntry, get_offer_mappings_result_dto->offer_mappings) {
            get_offer_mapping_dto_free(listEntry->data);
        }
        list_freeList(get_offer_mappings_result_dto->offer_mappings);
        get_offer_mappings_result_dto->offer_mappings = NULL;
    }
    free(get_offer_mappings_result_dto);
}

cJSON *get_offer_mappings_result_dto_convertToJSON(get_offer_mappings_result_dto_t *get_offer_mappings_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_offer_mappings_result_dto->paging
    if(get_offer_mappings_result_dto->paging) {
    cJSON *paging_local_JSON = scrolling_pager_dto_convertToJSON(get_offer_mappings_result_dto->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_offer_mappings_result_dto->offer_mappings
    if (!get_offer_mappings_result_dto->offer_mappings) {
        goto fail;
    }
    cJSON *offer_mappings = cJSON_AddArrayToObject(item, "offerMappings");
    if(offer_mappings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *offer_mappingsListEntry;
    if (get_offer_mappings_result_dto->offer_mappings) {
    list_ForEach(offer_mappingsListEntry, get_offer_mappings_result_dto->offer_mappings) {
    cJSON *itemLocal = get_offer_mapping_dto_convertToJSON(offer_mappingsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(offer_mappings, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_parseFromJSON(cJSON *get_offer_mappings_result_dtoJSON){

    get_offer_mappings_result_dto_t *get_offer_mappings_result_dto_local_var = NULL;

    // define the local variable for get_offer_mappings_result_dto->paging
    scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // define the local list for get_offer_mappings_result_dto->offer_mappings
    list_t *offer_mappingsList = NULL;

    // get_offer_mappings_result_dto->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_offer_mappings_result_dtoJSON, "paging");
    if (paging) { 
    paging_local_nonprim = scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }

    // get_offer_mappings_result_dto->offer_mappings
    cJSON *offer_mappings = cJSON_GetObjectItemCaseSensitive(get_offer_mappings_result_dtoJSON, "offerMappings");
    if (!offer_mappings) {
        goto end;
    }

    
    cJSON *offer_mappings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(offer_mappings)){
        goto end; //nonprimitive container
    }

    offer_mappingsList = list_createList();

    cJSON_ArrayForEach(offer_mappings_local_nonprimitive,offer_mappings )
    {
        if(!cJSON_IsObject(offer_mappings_local_nonprimitive)){
            goto end;
        }
        get_offer_mapping_dto_t *offer_mappingsItem = get_offer_mapping_dto_parseFromJSON(offer_mappings_local_nonprimitive);

        list_addElement(offer_mappingsList, offer_mappingsItem);
    }


    get_offer_mappings_result_dto_local_var = get_offer_mappings_result_dto_create (
        paging ? paging_local_nonprim : NULL,
        offer_mappingsList
        );

    return get_offer_mappings_result_dto_local_var;
end:
    if (paging_local_nonprim) {
        scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    if (offer_mappingsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, offer_mappingsList) {
            get_offer_mapping_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(offer_mappingsList);
        offer_mappingsList = NULL;
    }
    return NULL;

}
