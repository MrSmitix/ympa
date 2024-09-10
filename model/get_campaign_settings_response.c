#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_campaign_settings_response.h"



get_campaign_settings_response_t *get_campaign_settings_response_create(
    campaign_settings_dto_t *settings
    ) {
    get_campaign_settings_response_t *get_campaign_settings_response_local_var = malloc(sizeof(get_campaign_settings_response_t));
    if (!get_campaign_settings_response_local_var) {
        return NULL;
    }
    get_campaign_settings_response_local_var->settings = settings;

    return get_campaign_settings_response_local_var;
}


void get_campaign_settings_response_free(get_campaign_settings_response_t *get_campaign_settings_response) {
    if(NULL == get_campaign_settings_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_campaign_settings_response->settings) {
        campaign_settings_dto_free(get_campaign_settings_response->settings);
        get_campaign_settings_response->settings = NULL;
    }
    free(get_campaign_settings_response);
}

cJSON *get_campaign_settings_response_convertToJSON(get_campaign_settings_response_t *get_campaign_settings_response) {
    cJSON *item = cJSON_CreateObject();

    // get_campaign_settings_response->settings
    if(get_campaign_settings_response->settings) {
    cJSON *settings_local_JSON = campaign_settings_dto_convertToJSON(get_campaign_settings_response->settings);
    if(settings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "settings", settings_local_JSON);
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

get_campaign_settings_response_t *get_campaign_settings_response_parseFromJSON(cJSON *get_campaign_settings_responseJSON){

    get_campaign_settings_response_t *get_campaign_settings_response_local_var = NULL;

    // define the local variable for get_campaign_settings_response->settings
    campaign_settings_dto_t *settings_local_nonprim = NULL;

    // get_campaign_settings_response->settings
    cJSON *settings = cJSON_GetObjectItemCaseSensitive(get_campaign_settings_responseJSON, "settings");
    if (settings) { 
    settings_local_nonprim = campaign_settings_dto_parseFromJSON(settings); //nonprimitive
    }


    get_campaign_settings_response_local_var = get_campaign_settings_response_create (
        settings ? settings_local_nonprim : NULL
        );

    return get_campaign_settings_response_local_var;
end:
    if (settings_local_nonprim) {
        campaign_settings_dto_free(settings_local_nonprim);
        settings_local_nonprim = NULL;
    }
    return NULL;

}
