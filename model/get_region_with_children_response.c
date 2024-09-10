#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_region_with_children_response.h"



get_region_with_children_response_t *get_region_with_children_response_create(
    flipping_pager_dto_t *pager,
    region_dto_t *regions
    ) {
    get_region_with_children_response_t *get_region_with_children_response_local_var = malloc(sizeof(get_region_with_children_response_t));
    if (!get_region_with_children_response_local_var) {
        return NULL;
    }
    get_region_with_children_response_local_var->pager = pager;
    get_region_with_children_response_local_var->regions = regions;

    return get_region_with_children_response_local_var;
}


void get_region_with_children_response_free(get_region_with_children_response_t *get_region_with_children_response) {
    if(NULL == get_region_with_children_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_region_with_children_response->pager) {
        flipping_pager_dto_free(get_region_with_children_response->pager);
        get_region_with_children_response->pager = NULL;
    }
    if (get_region_with_children_response->regions) {
        region_dto_free(get_region_with_children_response->regions);
        get_region_with_children_response->regions = NULL;
    }
    free(get_region_with_children_response);
}

cJSON *get_region_with_children_response_convertToJSON(get_region_with_children_response_t *get_region_with_children_response) {
    cJSON *item = cJSON_CreateObject();

    // get_region_with_children_response->pager
    if(get_region_with_children_response->pager) {
    cJSON *pager_local_JSON = flipping_pager_dto_convertToJSON(get_region_with_children_response->pager);
    if(pager_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pager", pager_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_region_with_children_response->regions
    if(get_region_with_children_response->regions) {
    cJSON *regions_local_JSON = region_dto_convertToJSON(get_region_with_children_response->regions);
    if(regions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "regions", regions_local_JSON);
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

get_region_with_children_response_t *get_region_with_children_response_parseFromJSON(cJSON *get_region_with_children_responseJSON){

    get_region_with_children_response_t *get_region_with_children_response_local_var = NULL;

    // define the local variable for get_region_with_children_response->pager
    flipping_pager_dto_t *pager_local_nonprim = NULL;

    // define the local variable for get_region_with_children_response->regions
    region_dto_t *regions_local_nonprim = NULL;

    // get_region_with_children_response->pager
    cJSON *pager = cJSON_GetObjectItemCaseSensitive(get_region_with_children_responseJSON, "pager");
    if (pager) { 
    pager_local_nonprim = flipping_pager_dto_parseFromJSON(pager); //nonprimitive
    }

    // get_region_with_children_response->regions
    cJSON *regions = cJSON_GetObjectItemCaseSensitive(get_region_with_children_responseJSON, "regions");
    if (regions) { 
    regions_local_nonprim = region_dto_parseFromJSON(regions); //nonprimitive
    }


    get_region_with_children_response_local_var = get_region_with_children_response_create (
        pager ? pager_local_nonprim : NULL,
        regions ? regions_local_nonprim : NULL
        );

    return get_region_with_children_response_local_var;
end:
    if (pager_local_nonprim) {
        flipping_pager_dto_free(pager_local_nonprim);
        pager_local_nonprim = NULL;
    }
    if (regions_local_nonprim) {
        region_dto_free(regions_local_nonprim);
        regions_local_nonprim = NULL;
    }
    return NULL;

}
