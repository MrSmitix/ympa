#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_settings_local_region_dto.h"


char* campaign_settings_local_region_dto_type_ToString(_api__campaign_settings_local_region_dto__e type) {
    char* typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    return typeArray[type];
}

_api__campaign_settings_local_region_dto__e campaign_settings_local_region_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* campaign_settings_local_region_dto_delivery_options_source_ToString(_api__campaign_settings_local_region_dto__e delivery_options_source) {
    char* delivery_options_sourceArray[] =  { "NULL", "WEB", "YML" };
    return delivery_options_sourceArray[delivery_options_source];
}

_api__campaign_settings_local_region_dto__e campaign_settings_local_region_dto_delivery_options_source_FromString(char* delivery_options_source){
    int stringToReturn = 0;
    char *delivery_options_sourceArray[] =  { "NULL", "WEB", "YML" };
    size_t sizeofArray = sizeof(delivery_options_sourceArray) / sizeof(delivery_options_sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(delivery_options_source, delivery_options_sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_create(
    long id,
    char *name,
    region_type_t *type,
    campaign_settings_schedule_source_type_t *delivery_options_source,
    campaign_settings_delivery_dto_t *delivery
    ) {
    campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_local_var = malloc(sizeof(campaign_settings_local_region_dto_t));
    if (!campaign_settings_local_region_dto_local_var) {
        return NULL;
    }
    campaign_settings_local_region_dto_local_var->id = id;
    campaign_settings_local_region_dto_local_var->name = name;
    campaign_settings_local_region_dto_local_var->type = type;
    campaign_settings_local_region_dto_local_var->delivery_options_source = delivery_options_source;
    campaign_settings_local_region_dto_local_var->delivery = delivery;

    return campaign_settings_local_region_dto_local_var;
}


void campaign_settings_local_region_dto_free(campaign_settings_local_region_dto_t *campaign_settings_local_region_dto) {
    if(NULL == campaign_settings_local_region_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_settings_local_region_dto->name) {
        free(campaign_settings_local_region_dto->name);
        campaign_settings_local_region_dto->name = NULL;
    }
    if (campaign_settings_local_region_dto->type) {
        region_type_free(campaign_settings_local_region_dto->type);
        campaign_settings_local_region_dto->type = NULL;
    }
    if (campaign_settings_local_region_dto->delivery_options_source) {
        campaign_settings_schedule_source_type_free(campaign_settings_local_region_dto->delivery_options_source);
        campaign_settings_local_region_dto->delivery_options_source = NULL;
    }
    if (campaign_settings_local_region_dto->delivery) {
        campaign_settings_delivery_dto_free(campaign_settings_local_region_dto->delivery);
        campaign_settings_local_region_dto->delivery = NULL;
    }
    free(campaign_settings_local_region_dto);
}

cJSON *campaign_settings_local_region_dto_convertToJSON(campaign_settings_local_region_dto_t *campaign_settings_local_region_dto) {
    cJSON *item = cJSON_CreateObject();

    // campaign_settings_local_region_dto->id
    if(campaign_settings_local_region_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", campaign_settings_local_region_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_settings_local_region_dto->name
    if(campaign_settings_local_region_dto->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_settings_local_region_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_settings_local_region_dto->type
    if(campaign_settings_local_region_dto->type != _api__campaign_settings_local_region_dto__NULL) {
    cJSON *type_local_JSON = region_type_convertToJSON(campaign_settings_local_region_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_settings_local_region_dto->delivery_options_source
    if(campaign_settings_local_region_dto->delivery_options_source != _api__campaign_settings_local_region_dto__NULL) {
    cJSON *delivery_options_source_local_JSON = campaign_settings_schedule_source_type_convertToJSON(campaign_settings_local_region_dto->delivery_options_source);
    if(delivery_options_source_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "deliveryOptionsSource", delivery_options_source_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_settings_local_region_dto->delivery
    if(campaign_settings_local_region_dto->delivery) {
    cJSON *delivery_local_JSON = campaign_settings_delivery_dto_convertToJSON(campaign_settings_local_region_dto->delivery);
    if(delivery_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delivery", delivery_local_JSON);
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

campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_parseFromJSON(cJSON *campaign_settings_local_region_dtoJSON){

    campaign_settings_local_region_dto_t *campaign_settings_local_region_dto_local_var = NULL;

    // define the local variable for campaign_settings_local_region_dto->type
    region_type_t *type_local_nonprim = NULL;

    // define the local variable for campaign_settings_local_region_dto->delivery_options_source
    campaign_settings_schedule_source_type_t *delivery_options_source_local_nonprim = NULL;

    // define the local variable for campaign_settings_local_region_dto->delivery
    campaign_settings_delivery_dto_t *delivery_local_nonprim = NULL;

    // campaign_settings_local_region_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_settings_local_region_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // campaign_settings_local_region_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_settings_local_region_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_settings_local_region_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(campaign_settings_local_region_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = region_type_parseFromJSON(type); //custom
    }

    // campaign_settings_local_region_dto->delivery_options_source
    cJSON *delivery_options_source = cJSON_GetObjectItemCaseSensitive(campaign_settings_local_region_dtoJSON, "deliveryOptionsSource");
    if (delivery_options_source) { 
    delivery_options_source_local_nonprim = campaign_settings_schedule_source_type_parseFromJSON(delivery_options_source); //custom
    }

    // campaign_settings_local_region_dto->delivery
    cJSON *delivery = cJSON_GetObjectItemCaseSensitive(campaign_settings_local_region_dtoJSON, "delivery");
    if (delivery) { 
    delivery_local_nonprim = campaign_settings_delivery_dto_parseFromJSON(delivery); //nonprimitive
    }


    campaign_settings_local_region_dto_local_var = campaign_settings_local_region_dto_create (
        id ? id->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        type ? type_local_nonprim : NULL,
        delivery_options_source ? delivery_options_source_local_nonprim : NULL,
        delivery ? delivery_local_nonprim : NULL
        );

    return campaign_settings_local_region_dto_local_var;
end:
    if (type_local_nonprim) {
        region_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (delivery_options_source_local_nonprim) {
        campaign_settings_schedule_source_type_free(delivery_options_source_local_nonprim);
        delivery_options_source_local_nonprim = NULL;
    }
    if (delivery_local_nonprim) {
        campaign_settings_delivery_dto_free(delivery_local_nonprim);
        delivery_local_nonprim = NULL;
    }
    return NULL;

}
