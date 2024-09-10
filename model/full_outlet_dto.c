#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "full_outlet_dto.h"


char* full_outlet_dto_type_ToString(_api__full_outlet_dto__e type) {
    char* typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    return typeArray[type];
}

_api__full_outlet_dto__e full_outlet_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* full_outlet_dto_visibility_ToString(_api__full_outlet_dto__e visibility) {
    char* visibilityArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    return visibilityArray[visibility];
}

_api__full_outlet_dto__e full_outlet_dto_visibility_FromString(char* visibility){
    int stringToReturn = 0;
    char *visibilityArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    size_t sizeofArray = sizeof(visibilityArray) / sizeof(visibilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(visibility, visibilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* full_outlet_dto_status_ToString(_api__full_outlet_dto__e status) {
    char* statusArray[] =  { "NULL", "AT_MODERATION", "FAILED", "MODERATED", "NONMODERATED", "UNKNOWN" };
    return statusArray[status];
}

_api__full_outlet_dto__e full_outlet_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "AT_MODERATION", "FAILED", "MODERATED", "NONMODERATED", "UNKNOWN" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

full_outlet_dto_t *full_outlet_dto_create(
    char *name,
    outlet_type_t *type,
    char *coords,
    int is_main,
    char *shop_outlet_code,
    outlet_visibility_type_t *visibility,
    outlet_address_dto_t *address,
    list_t *phones,
    outlet_working_schedule_dto_t *working_schedule,
    list_t *delivery_rules,
    long storage_period,
    long id,
    outlet_status_type_t *status,
    region_dto_t *region,
    char *shop_outlet_id,
    char *working_time,
    char *moderation_reason
    ) {
    full_outlet_dto_t *full_outlet_dto_local_var = malloc(sizeof(full_outlet_dto_t));
    if (!full_outlet_dto_local_var) {
        return NULL;
    }
    full_outlet_dto_local_var->name = name;
    full_outlet_dto_local_var->type = type;
    full_outlet_dto_local_var->coords = coords;
    full_outlet_dto_local_var->is_main = is_main;
    full_outlet_dto_local_var->shop_outlet_code = shop_outlet_code;
    full_outlet_dto_local_var->visibility = visibility;
    full_outlet_dto_local_var->address = address;
    full_outlet_dto_local_var->phones = phones;
    full_outlet_dto_local_var->working_schedule = working_schedule;
    full_outlet_dto_local_var->delivery_rules = delivery_rules;
    full_outlet_dto_local_var->storage_period = storage_period;
    full_outlet_dto_local_var->id = id;
    full_outlet_dto_local_var->status = status;
    full_outlet_dto_local_var->region = region;
    full_outlet_dto_local_var->shop_outlet_id = shop_outlet_id;
    full_outlet_dto_local_var->working_time = working_time;
    full_outlet_dto_local_var->moderation_reason = moderation_reason;

    return full_outlet_dto_local_var;
}


void full_outlet_dto_free(full_outlet_dto_t *full_outlet_dto) {
    if(NULL == full_outlet_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (full_outlet_dto->name) {
        free(full_outlet_dto->name);
        full_outlet_dto->name = NULL;
    }
    if (full_outlet_dto->type) {
        outlet_type_free(full_outlet_dto->type);
        full_outlet_dto->type = NULL;
    }
    if (full_outlet_dto->coords) {
        free(full_outlet_dto->coords);
        full_outlet_dto->coords = NULL;
    }
    if (full_outlet_dto->shop_outlet_code) {
        free(full_outlet_dto->shop_outlet_code);
        full_outlet_dto->shop_outlet_code = NULL;
    }
    if (full_outlet_dto->visibility) {
        outlet_visibility_type_free(full_outlet_dto->visibility);
        full_outlet_dto->visibility = NULL;
    }
    if (full_outlet_dto->address) {
        outlet_address_dto_free(full_outlet_dto->address);
        full_outlet_dto->address = NULL;
    }
    if (full_outlet_dto->phones) {
        list_ForEach(listEntry, full_outlet_dto->phones) {
            free(listEntry->data);
        }
        list_freeList(full_outlet_dto->phones);
        full_outlet_dto->phones = NULL;
    }
    if (full_outlet_dto->working_schedule) {
        outlet_working_schedule_dto_free(full_outlet_dto->working_schedule);
        full_outlet_dto->working_schedule = NULL;
    }
    if (full_outlet_dto->delivery_rules) {
        list_ForEach(listEntry, full_outlet_dto->delivery_rules) {
            outlet_delivery_rule_dto_free(listEntry->data);
        }
        list_freeList(full_outlet_dto->delivery_rules);
        full_outlet_dto->delivery_rules = NULL;
    }
    if (full_outlet_dto->status) {
        outlet_status_type_free(full_outlet_dto->status);
        full_outlet_dto->status = NULL;
    }
    if (full_outlet_dto->region) {
        region_dto_free(full_outlet_dto->region);
        full_outlet_dto->region = NULL;
    }
    if (full_outlet_dto->shop_outlet_id) {
        free(full_outlet_dto->shop_outlet_id);
        full_outlet_dto->shop_outlet_id = NULL;
    }
    if (full_outlet_dto->working_time) {
        free(full_outlet_dto->working_time);
        full_outlet_dto->working_time = NULL;
    }
    if (full_outlet_dto->moderation_reason) {
        free(full_outlet_dto->moderation_reason);
        full_outlet_dto->moderation_reason = NULL;
    }
    free(full_outlet_dto);
}

cJSON *full_outlet_dto_convertToJSON(full_outlet_dto_t *full_outlet_dto) {
    cJSON *item = cJSON_CreateObject();

    // full_outlet_dto->name
    if (!full_outlet_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", full_outlet_dto->name) == NULL) {
    goto fail; //String
    }


    // full_outlet_dto->type
    if (_api__full_outlet_dto__NULL == full_outlet_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = outlet_type_convertToJSON(full_outlet_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // full_outlet_dto->coords
    if(full_outlet_dto->coords) {
    if(cJSON_AddStringToObject(item, "coords", full_outlet_dto->coords) == NULL) {
    goto fail; //String
    }
    }


    // full_outlet_dto->is_main
    if(full_outlet_dto->is_main) {
    if(cJSON_AddBoolToObject(item, "isMain", full_outlet_dto->is_main) == NULL) {
    goto fail; //Bool
    }
    }


    // full_outlet_dto->shop_outlet_code
    if(full_outlet_dto->shop_outlet_code) {
    if(cJSON_AddStringToObject(item, "shopOutletCode", full_outlet_dto->shop_outlet_code) == NULL) {
    goto fail; //String
    }
    }


    // full_outlet_dto->visibility
    if(full_outlet_dto->visibility != _api__full_outlet_dto__NULL) {
    cJSON *visibility_local_JSON = outlet_visibility_type_convertToJSON(full_outlet_dto->visibility);
    if(visibility_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "visibility", visibility_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // full_outlet_dto->address
    if (!full_outlet_dto->address) {
        goto fail;
    }
    cJSON *address_local_JSON = outlet_address_dto_convertToJSON(full_outlet_dto->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // full_outlet_dto->phones
    if (!full_outlet_dto->phones) {
        goto fail;
    }
    cJSON *phones = cJSON_AddArrayToObject(item, "phones");
    if(phones == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *phonesListEntry;
    list_ForEach(phonesListEntry, full_outlet_dto->phones) {
    if(cJSON_AddStringToObject(phones, "", (char*)phonesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // full_outlet_dto->working_schedule
    if (!full_outlet_dto->working_schedule) {
        goto fail;
    }
    cJSON *working_schedule_local_JSON = outlet_working_schedule_dto_convertToJSON(full_outlet_dto->working_schedule);
    if(working_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workingSchedule", working_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // full_outlet_dto->delivery_rules
    if(full_outlet_dto->delivery_rules) {
    cJSON *delivery_rules = cJSON_AddArrayToObject(item, "deliveryRules");
    if(delivery_rules == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *delivery_rulesListEntry;
    if (full_outlet_dto->delivery_rules) {
    list_ForEach(delivery_rulesListEntry, full_outlet_dto->delivery_rules) {
    cJSON *itemLocal = outlet_delivery_rule_dto_convertToJSON(delivery_rulesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(delivery_rules, itemLocal);
    }
    }
    }


    // full_outlet_dto->storage_period
    if(full_outlet_dto->storage_period) {
    if(cJSON_AddNumberToObject(item, "storagePeriod", full_outlet_dto->storage_period) == NULL) {
    goto fail; //Numeric
    }
    }


    // full_outlet_dto->id
    if(full_outlet_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", full_outlet_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // full_outlet_dto->status
    if(full_outlet_dto->status != _api__full_outlet_dto__NULL) {
    cJSON *status_local_JSON = outlet_status_type_convertToJSON(full_outlet_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // full_outlet_dto->region
    if(full_outlet_dto->region) {
    cJSON *region_local_JSON = region_dto_convertToJSON(full_outlet_dto->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // full_outlet_dto->shop_outlet_id
    if(full_outlet_dto->shop_outlet_id) {
    if(cJSON_AddStringToObject(item, "shopOutletId", full_outlet_dto->shop_outlet_id) == NULL) {
    goto fail; //String
    }
    }


    // full_outlet_dto->working_time
    if(full_outlet_dto->working_time) {
    if(cJSON_AddStringToObject(item, "workingTime", full_outlet_dto->working_time) == NULL) {
    goto fail; //String
    }
    }


    // full_outlet_dto->moderation_reason
    if(full_outlet_dto->moderation_reason) {
    if(cJSON_AddStringToObject(item, "moderationReason", full_outlet_dto->moderation_reason) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

full_outlet_dto_t *full_outlet_dto_parseFromJSON(cJSON *full_outlet_dtoJSON){

    full_outlet_dto_t *full_outlet_dto_local_var = NULL;

    // define the local variable for full_outlet_dto->type
    outlet_type_t *type_local_nonprim = NULL;

    // define the local variable for full_outlet_dto->visibility
    outlet_visibility_type_t *visibility_local_nonprim = NULL;

    // define the local variable for full_outlet_dto->address
    outlet_address_dto_t *address_local_nonprim = NULL;

    // define the local list for full_outlet_dto->phones
    list_t *phonesList = NULL;

    // define the local variable for full_outlet_dto->working_schedule
    outlet_working_schedule_dto_t *working_schedule_local_nonprim = NULL;

    // define the local list for full_outlet_dto->delivery_rules
    list_t *delivery_rulesList = NULL;

    // define the local variable for full_outlet_dto->status
    outlet_status_type_t *status_local_nonprim = NULL;

    // define the local variable for full_outlet_dto->region
    region_dto_t *region_local_nonprim = NULL;

    // full_outlet_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // full_outlet_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = outlet_type_parseFromJSON(type); //custom

    // full_outlet_dto->coords
    cJSON *coords = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "coords");
    if (coords) { 
    if(!cJSON_IsString(coords) && !cJSON_IsNull(coords))
    {
    goto end; //String
    }
    }

    // full_outlet_dto->is_main
    cJSON *is_main = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "isMain");
    if (is_main) { 
    if(!cJSON_IsBool(is_main))
    {
    goto end; //Bool
    }
    }

    // full_outlet_dto->shop_outlet_code
    cJSON *shop_outlet_code = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "shopOutletCode");
    if (shop_outlet_code) { 
    if(!cJSON_IsString(shop_outlet_code) && !cJSON_IsNull(shop_outlet_code))
    {
    goto end; //String
    }
    }

    // full_outlet_dto->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "visibility");
    if (visibility) { 
    visibility_local_nonprim = outlet_visibility_type_parseFromJSON(visibility); //custom
    }

    // full_outlet_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "address");
    if (!address) {
        goto end;
    }

    
    address_local_nonprim = outlet_address_dto_parseFromJSON(address); //nonprimitive

    // full_outlet_dto->phones
    cJSON *phones = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "phones");
    if (!phones) {
        goto end;
    }

    
    cJSON *phones_local = NULL;
    if(!cJSON_IsArray(phones)) {
        goto end;//primitive container
    }
    phonesList = list_createList();

    cJSON_ArrayForEach(phones_local, phones)
    {
        if(!cJSON_IsString(phones_local))
        {
            goto end;
        }
        list_addElement(phonesList , strdup(phones_local->valuestring));
    }

    // full_outlet_dto->working_schedule
    cJSON *working_schedule = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "workingSchedule");
    if (!working_schedule) {
        goto end;
    }

    
    working_schedule_local_nonprim = outlet_working_schedule_dto_parseFromJSON(working_schedule); //nonprimitive

    // full_outlet_dto->delivery_rules
    cJSON *delivery_rules = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "deliveryRules");
    if (delivery_rules) { 
    cJSON *delivery_rules_local_nonprimitive = NULL;
    if(!cJSON_IsArray(delivery_rules)){
        goto end; //nonprimitive container
    }

    delivery_rulesList = list_createList();

    cJSON_ArrayForEach(delivery_rules_local_nonprimitive,delivery_rules )
    {
        if(!cJSON_IsObject(delivery_rules_local_nonprimitive)){
            goto end;
        }
        outlet_delivery_rule_dto_t *delivery_rulesItem = outlet_delivery_rule_dto_parseFromJSON(delivery_rules_local_nonprimitive);

        list_addElement(delivery_rulesList, delivery_rulesItem);
    }
    }

    // full_outlet_dto->storage_period
    cJSON *storage_period = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "storagePeriod");
    if (storage_period) { 
    if(!cJSON_IsNumber(storage_period))
    {
    goto end; //Numeric
    }
    }

    // full_outlet_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // full_outlet_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = outlet_status_type_parseFromJSON(status); //custom
    }

    // full_outlet_dto->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "region");
    if (region) { 
    region_local_nonprim = region_dto_parseFromJSON(region); //nonprimitive
    }

    // full_outlet_dto->shop_outlet_id
    cJSON *shop_outlet_id = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "shopOutletId");
    if (shop_outlet_id) { 
    if(!cJSON_IsString(shop_outlet_id) && !cJSON_IsNull(shop_outlet_id))
    {
    goto end; //String
    }
    }

    // full_outlet_dto->working_time
    cJSON *working_time = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "workingTime");
    if (working_time) { 
    if(!cJSON_IsString(working_time) && !cJSON_IsNull(working_time))
    {
    goto end; //String
    }
    }

    // full_outlet_dto->moderation_reason
    cJSON *moderation_reason = cJSON_GetObjectItemCaseSensitive(full_outlet_dtoJSON, "moderationReason");
    if (moderation_reason) { 
    if(!cJSON_IsString(moderation_reason) && !cJSON_IsNull(moderation_reason))
    {
    goto end; //String
    }
    }


    full_outlet_dto_local_var = full_outlet_dto_create (
        strdup(name->valuestring),
        type_local_nonprim,
        coords && !cJSON_IsNull(coords) ? strdup(coords->valuestring) : NULL,
        is_main ? is_main->valueint : 0,
        shop_outlet_code && !cJSON_IsNull(shop_outlet_code) ? strdup(shop_outlet_code->valuestring) : NULL,
        visibility ? visibility_local_nonprim : NULL,
        address_local_nonprim,
        phonesList,
        working_schedule_local_nonprim,
        delivery_rules ? delivery_rulesList : NULL,
        storage_period ? storage_period->valuedouble : 0,
        id ? id->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        region ? region_local_nonprim : NULL,
        shop_outlet_id && !cJSON_IsNull(shop_outlet_id) ? strdup(shop_outlet_id->valuestring) : NULL,
        working_time && !cJSON_IsNull(working_time) ? strdup(working_time->valuestring) : NULL,
        moderation_reason && !cJSON_IsNull(moderation_reason) ? strdup(moderation_reason->valuestring) : NULL
        );

    return full_outlet_dto_local_var;
end:
    if (type_local_nonprim) {
        outlet_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (visibility_local_nonprim) {
        outlet_visibility_type_free(visibility_local_nonprim);
        visibility_local_nonprim = NULL;
    }
    if (address_local_nonprim) {
        outlet_address_dto_free(address_local_nonprim);
        address_local_nonprim = NULL;
    }
    if (phonesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, phonesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(phonesList);
        phonesList = NULL;
    }
    if (working_schedule_local_nonprim) {
        outlet_working_schedule_dto_free(working_schedule_local_nonprim);
        working_schedule_local_nonprim = NULL;
    }
    if (delivery_rulesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, delivery_rulesList) {
            outlet_delivery_rule_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(delivery_rulesList);
        delivery_rulesList = NULL;
    }
    if (status_local_nonprim) {
        outlet_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (region_local_nonprim) {
        region_dto_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    return NULL;

}
