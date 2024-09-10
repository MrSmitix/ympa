#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_response.h"



get_campaign_response_t *get_campaign_response_create(
    campaign_dto_t *campaign
    ) {
    get_campaign_response_t *get_campaign_response_local_var = malloc(sizeof(get_campaign_response_t));
    if (!get_campaign_response_local_var) {
        return NULL;
    }
    get_campaign_response_local_var->campaign = campaign;

    return get_campaign_response_local_var;
}


void get_campaign_response_free(get_campaign_response_t *get_campaign_response) {
    if(NULL == get_campaign_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_response->campaign) {
        campaign_dto_free(get_campaign_response->campaign);
        get_campaign_response->campaign = NULL;
    }
    free(get_campaign_response);
}

cJSON *get_campaign_response_convertToJSON(get_campaign_response_t *get_campaign_response) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_response->campaign
    if(get_campaign_response->campaign) {
    cJSON *campaign_local_JSON = campaign_dto_convertToJSON(get_campaign_response->campaign);
    if(campaign_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "campaign", campaign_local_JSON);
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

get_campaign_response_t *get_campaign_response_parseFromJSON(cJSON *get_campaign_responseJSON){

    get_campaign_response_t *get_campaign_response_local_var = NULL;

    // define the local variable for get_campaign_response->campaign
    campaign_dto_t *campaign_local_nonprim = NULL;

    // get_campaign_response->campaign
    cJSON *campaign = cJSON_GetObjectItemCaseSensitive(get_campaign_responseJSON, "campaign");
    if (campaign) { 
    campaign_local_nonprim = campaign_dto_parseFromJSON(campaign); //nonprimitive
    }


    get_campaign_response_local_var = get_campaign_response_create (
        campaign ? campaign_local_nonprim : NULL
        );

    return get_campaign_response_local_var;
end:
    if (campaign_local_nonprim) {
        campaign_dto_free(campaign_local_nonprim);
        campaign_local_nonprim = NULL;
    }
    return NULL;

}
