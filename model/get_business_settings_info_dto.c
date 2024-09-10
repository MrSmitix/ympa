#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_business_settings_info_dto.h"



get_business_settings_info_dto_t *get_business_settings_info_dto_create(
    business_dto_t *info,
    business_settings_dto_t *settings
    ) {
    get_business_settings_info_dto_t *get_business_settings_info_dto_local_var = malloc(sizeof(get_business_settings_info_dto_t));
    if (!get_business_settings_info_dto_local_var) {
        return NULL;
    }
    get_business_settings_info_dto_local_var->info = info;
    get_business_settings_info_dto_local_var->settings = settings;

    return get_business_settings_info_dto_local_var;
}


void get_business_settings_info_dto_free(get_business_settings_info_dto_t *get_business_settings_info_dto) {
    if(NULL == get_business_settings_info_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (get_business_settings_info_dto->info) {
        business_dto_free(get_business_settings_info_dto->info);
        get_business_settings_info_dto->info = NULL;
    }
    if (get_business_settings_info_dto->settings) {
        business_settings_dto_free(get_business_settings_info_dto->settings);
        get_business_settings_info_dto->settings = NULL;
    }
    free(get_business_settings_info_dto);
}

cJSON *get_business_settings_info_dto_convertToJSON(get_business_settings_info_dto_t *get_business_settings_info_dto) {
    cJSON *item = cJSON_CreateObject();

    // get_business_settings_info_dto->info
    if(get_business_settings_info_dto->info) {
    cJSON *info_local_JSON = business_dto_convertToJSON(get_business_settings_info_dto->info);
    if(info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "info", info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_business_settings_info_dto->settings
    if(get_business_settings_info_dto->settings) {
    cJSON *settings_local_JSON = business_settings_dto_convertToJSON(get_business_settings_info_dto->settings);
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

get_business_settings_info_dto_t *get_business_settings_info_dto_parseFromJSON(cJSON *get_business_settings_info_dtoJSON){

    get_business_settings_info_dto_t *get_business_settings_info_dto_local_var = NULL;

    // define the local variable for get_business_settings_info_dto->info
    business_dto_t *info_local_nonprim = NULL;

    // define the local variable for get_business_settings_info_dto->settings
    business_settings_dto_t *settings_local_nonprim = NULL;

    // get_business_settings_info_dto->info
    cJSON *info = cJSON_GetObjectItemCaseSensitive(get_business_settings_info_dtoJSON, "info");
    if (info) { 
    info_local_nonprim = business_dto_parseFromJSON(info); //nonprimitive
    }

    // get_business_settings_info_dto->settings
    cJSON *settings = cJSON_GetObjectItemCaseSensitive(get_business_settings_info_dtoJSON, "settings");
    if (settings) { 
    settings_local_nonprim = business_settings_dto_parseFromJSON(settings); //nonprimitive
    }


    get_business_settings_info_dto_local_var = get_business_settings_info_dto_create (
        info ? info_local_nonprim : NULL,
        settings ? settings_local_nonprim : NULL
        );

    return get_business_settings_info_dto_local_var;
end:
    if (info_local_nonprim) {
        business_dto_free(info_local_nonprim);
        info_local_nonprim = NULL;
    }
    if (settings_local_nonprim) {
        business_settings_dto_free(settings_local_nonprim);
        settings_local_nonprim = NULL;
    }
    return NULL;

}
