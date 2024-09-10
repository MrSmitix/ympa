#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_region_response.h"



get_campaign_region_response_t *get_campaign_region_response_create(
    region_dto_t *region
    ) {
    get_campaign_region_response_t *get_campaign_region_response_local_var = malloc(sizeof(get_campaign_region_response_t));
    if (!get_campaign_region_response_local_var) {
        return NULL;
    }
    get_campaign_region_response_local_var->region = region;

    return get_campaign_region_response_local_var;
}


void get_campaign_region_response_free(get_campaign_region_response_t *get_campaign_region_response) {
    if(NULL == get_campaign_region_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_region_response->region) {
        region_dto_free(get_campaign_region_response->region);
        get_campaign_region_response->region = NULL;
    }
    free(get_campaign_region_response);
}

cJSON *get_campaign_region_response_convertToJSON(get_campaign_region_response_t *get_campaign_region_response) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_region_response->region
    if(get_campaign_region_response->region) {
    cJSON *region_local_JSON = region_dto_convertToJSON(get_campaign_region_response->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
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

get_campaign_region_response_t *get_campaign_region_response_parseFromJSON(cJSON *get_campaign_region_responseJSON){

    get_campaign_region_response_t *get_campaign_region_response_local_var = NULL;

    // define the local variable for get_campaign_region_response->region
    region_dto_t *region_local_nonprim = NULL;

    // get_campaign_region_response->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(get_campaign_region_responseJSON, "region");
    if (region) { 
    region_local_nonprim = region_dto_parseFromJSON(region); //nonprimitive
    }


    get_campaign_region_response_local_var = get_campaign_region_response_create (
        region ? region_local_nonprim : NULL
        );

    return get_campaign_region_response_local_var;
end:
    if (region_local_nonprim) {
        region_dto_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    return NULL;

}
