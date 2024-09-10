#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_regions_response.h"



get_regions_response_t *get_regions_response_create(
    list_t *regions,
    forward_scrolling_pager_dto_t *paging
    ) {
    get_regions_response_t *get_regions_response_local_var = malloc(sizeof(get_regions_response_t));
    if (!get_regions_response_local_var) {
        return NULL;
    }
    get_regions_response_local_var->regions = regions;
    get_regions_response_local_var->paging = paging;

    return get_regions_response_local_var;
}


void get_regions_response_free(get_regions_response_t *get_regions_response) {
    if(NULL == get_regions_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_regions_response->regions) {
        list_ForEach(listEntry, get_regions_response->regions) {
            region_dto_free(listEntry->data);
        }
        list_freeList(get_regions_response->regions);
        get_regions_response->regions = NULL;
    }
    if (get_regions_response->paging) {
        forward_scrolling_pager_dto_free(get_regions_response->paging);
        get_regions_response->paging = NULL;
    }
    free(get_regions_response);
}

cJSON *get_regions_response_convertToJSON(get_regions_response_t *get_regions_response) {
    cJSON *item = cJSON_CreateObject();

    // get_regions_response->regions
    if (!get_regions_response->regions) {
        goto fail;
    }
    cJSON *regions = cJSON_AddArrayToObject(item, "regions");
    if(regions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *regionsListEntry;
    if (get_regions_response->regions) {
    list_ForEach(regionsListEntry, get_regions_response->regions) {
    cJSON *itemLocal = region_dto_convertToJSON(regionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(regions, itemLocal);
    }
    }


    // get_regions_response->paging
    if(get_regions_response->paging) {
    cJSON *paging_local_JSON = forward_scrolling_pager_dto_convertToJSON(get_regions_response->paging);
    if(paging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paging", paging_local_JSON);
    if(item->child == NULL) {
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

get_regions_response_t *get_regions_response_parseFromJSON(cJSON *get_regions_responseJSON){

    get_regions_response_t *get_regions_response_local_var = NULL;

    // define the local list for get_regions_response->regions
    list_t *regionsList = NULL;

    // define the local variable for get_regions_response->paging
    forward_scrolling_pager_dto_t *paging_local_nonprim = NULL;

    // get_regions_response->regions
    cJSON *regions = cJSON_GetObjectItemCaseSensitive(get_regions_responseJSON, "regions");
    if (!regions) {
        goto end;
    }

    
    cJSON *regions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(regions)){
        goto end; //nonprimitive container
    }

    regionsList = list_createList();

    cJSON_ArrayForEach(regions_local_nonprimitive,regions )
    {
        if(!cJSON_IsObject(regions_local_nonprimitive)){
            goto end;
        }
        region_dto_t *regionsItem = region_dto_parseFromJSON(regions_local_nonprimitive);

        list_addElement(regionsList, regionsItem);
    }

    // get_regions_response->paging
    cJSON *paging = cJSON_GetObjectItemCaseSensitive(get_regions_responseJSON, "paging");
    if (paging) { 
    paging_local_nonprim = forward_scrolling_pager_dto_parseFromJSON(paging); //nonprimitive
    }


    get_regions_response_local_var = get_regions_response_create (
        regionsList,
        paging ? paging_local_nonprim : NULL
        );

    return get_regions_response_local_var;
end:
    if (regionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, regionsList) {
            region_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(regionsList);
        regionsList = NULL;
    }
    if (paging_local_nonprim) {
        forward_scrolling_pager_dto_free(paging_local_nonprim);
        paging_local_nonprim = NULL;
    }
    return NULL;

}
