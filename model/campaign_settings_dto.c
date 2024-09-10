#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_dto.h"



campaign_settings_dto_t *campaign_settings_dto_create(
    long country_region,
    char *shop_name,
    int show_in_context,
    int show_in_premium,
    int use_open_stat,
    campaign_settings_local_region_dto_t *local_region
    ) {
    campaign_settings_dto_t *campaign_settings_dto_local_var = malloc(sizeof(campaign_settings_dto_t));
    if (!campaign_settings_dto_local_var) {
        return NULL;
    }
    campaign_settings_dto_local_var->country_region = country_region;
    campaign_settings_dto_local_var->shop_name = shop_name;
    campaign_settings_dto_local_var->show_in_context = show_in_context;
    campaign_settings_dto_local_var->show_in_premium = show_in_premium;
    campaign_settings_dto_local_var->use_open_stat = use_open_stat;
    campaign_settings_dto_local_var->local_region = local_region;

    return campaign_settings_dto_local_var;
}


void campaign_settings_dto_free(campaign_settings_dto_t *campaign_settings_dto) {
    if(NULL == campaign_settings_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_settings_dto->shop_name) {
        free(campaign_settings_dto->shop_name);
        campaign_settings_dto->shop_name = NULL;
    }
    if (campaign_settings_dto->local_region) {
        campaign_settings_local_region_dto_free(campaign_settings_dto->local_region);
        campaign_settings_dto->local_region = NULL;
    }
    free(campaign_settings_dto);
}

cJSON *campaign_settings_dto_convertToJSON(campaign_settings_dto_t *campaign_settings_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_settings_dto->country_region
    if(campaign_settings_dto->country_region) {
    if(cJSON_AddNumberToObject(item, "countryRegion", campaign_settings_dto->country_region) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_settings_dto->shop_name
    if(campaign_settings_dto->shop_name) {
    if(cJSON_AddStringToObject(item, "shopName", campaign_settings_dto->shop_name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_settings_dto->show_in_context
    if(campaign_settings_dto->show_in_context) {
    if(cJSON_AddBoolToObject(item, "showInContext", campaign_settings_dto->show_in_context) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_settings_dto->show_in_premium
    if(campaign_settings_dto->show_in_premium) {
    if(cJSON_AddBoolToObject(item, "showInPremium", campaign_settings_dto->show_in_premium) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_settings_dto->use_open_stat
    if(campaign_settings_dto->use_open_stat) {
    if(cJSON_AddBoolToObject(item, "useOpenStat", campaign_settings_dto->use_open_stat) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_settings_dto->local_region
    if(campaign_settings_dto->local_region) {
    cJSON *local_region_local_JSON = campaign_settings_local_region_dto_convertToJSON(campaign_settings_dto->local_region);
    if(local_region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "localRegion", local_region_local_JSON);
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

campaign_settings_dto_t *campaign_settings_dto_parseFromJSON(cJSON *campaign_settings_dtoJSON){

    campaign_settings_dto_t *campaign_settings_dto_local_var = NULL;

    // define the local variable for campaign_settings_dto->local_region
    campaign_settings_local_region_dto_t *local_region_local_nonprim = NULL;

    // campaign_settings_dto->country_region
    cJSON *country_region = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "countryRegion");
    if (country_region) { 
    if(!cJSON_IsNumber(country_region))
    {
    goto end; //Numeric
    }
    }

    // campaign_settings_dto->shop_name
    cJSON *shop_name = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "shopName");
    if (shop_name) { 
    if(!cJSON_IsString(shop_name) && !cJSON_IsNull(shop_name))
    {
    goto end; //String
    }
    }

    // campaign_settings_dto->show_in_context
    cJSON *show_in_context = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "showInContext");
    if (show_in_context) { 
    if(!cJSON_IsBool(show_in_context))
    {
    goto end; //Bool
    }
    }

    // campaign_settings_dto->show_in_premium
    cJSON *show_in_premium = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "showInPremium");
    if (show_in_premium) { 
    if(!cJSON_IsBool(show_in_premium))
    {
    goto end; //Bool
    }
    }

    // campaign_settings_dto->use_open_stat
    cJSON *use_open_stat = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "useOpenStat");
    if (use_open_stat) { 
    if(!cJSON_IsBool(use_open_stat))
    {
    goto end; //Bool
    }
    }

    // campaign_settings_dto->local_region
    cJSON *local_region = cJSON_GetObjectItemCaseSensitive(campaign_settings_dtoJSON, "localRegion");
    if (local_region) { 
    local_region_local_nonprim = campaign_settings_local_region_dto_parseFromJSON(local_region); //nonprimitive
    }


    campaign_settings_dto_local_var = campaign_settings_dto_create (
        country_region ? country_region->valuedouble : 0,
        shop_name && !cJSON_IsNull(shop_name) ? strdup(shop_name->valuestring) : NULL,
        show_in_context ? show_in_context->valueint : 0,
        show_in_premium ? show_in_premium->valueint : 0,
        use_open_stat ? use_open_stat->valueint : 0,
        local_region ? local_region_local_nonprim : NULL
        );

    return campaign_settings_dto_local_var;
end:
    if (local_region_local_nonprim) {
        campaign_settings_local_region_dto_free(local_region_local_nonprim);
        local_region_local_nonprim = NULL;
    }
    return NULL;

}
