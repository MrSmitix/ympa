#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_dto.h"


char* outlet_dto_type_ToString(_api__outlet_dto__e type) {
    char* typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    return typeArray[type];
}

_api__outlet_dto__e outlet_dto_type_FromString(char* type){
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
char* outlet_dto_visibility_ToString(_api__outlet_dto__e visibility) {
    char* visibilityArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    return visibilityArray[visibility];
}

_api__outlet_dto__e outlet_dto_visibility_FromString(char* visibility){
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

outlet_dto_t *outlet_dto_create(
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
    long storage_period
    ) {
    outlet_dto_t *outlet_dto_local_var = malloc(sizeof(outlet_dto_t));
    if (!outlet_dto_local_var) {
        return NULL;
    }
    outlet_dto_local_var->name = name;
    outlet_dto_local_var->type = type;
    outlet_dto_local_var->coords = coords;
    outlet_dto_local_var->is_main = is_main;
    outlet_dto_local_var->shop_outlet_code = shop_outlet_code;
    outlet_dto_local_var->visibility = visibility;
    outlet_dto_local_var->address = address;
    outlet_dto_local_var->phones = phones;
    outlet_dto_local_var->working_schedule = working_schedule;
    outlet_dto_local_var->delivery_rules = delivery_rules;
    outlet_dto_local_var->storage_period = storage_period;

    return outlet_dto_local_var;
}


void outlet_dto_free(outlet_dto_t *outlet_dto) {
    if(NULL == outlet_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_dto->name) {
        free(outlet_dto->name);
        outlet_dto->name = NULL;
    }
    if (outlet_dto->type) {
        outlet_type_free(outlet_dto->type);
        outlet_dto->type = NULL;
    }
    if (outlet_dto->coords) {
        free(outlet_dto->coords);
        outlet_dto->coords = NULL;
    }
    if (outlet_dto->shop_outlet_code) {
        free(outlet_dto->shop_outlet_code);
        outlet_dto->shop_outlet_code = NULL;
    }
    if (outlet_dto->visibility) {
        outlet_visibility_type_free(outlet_dto->visibility);
        outlet_dto->visibility = NULL;
    }
    if (outlet_dto->address) {
        outlet_address_dto_free(outlet_dto->address);
        outlet_dto->address = NULL;
    }
    if (outlet_dto->phones) {
        list_ForEach(listEntry, outlet_dto->phones) {
            free(listEntry->data);
        }
        list_freeList(outlet_dto->phones);
        outlet_dto->phones = NULL;
    }
    if (outlet_dto->working_schedule) {
        outlet_working_schedule_dto_free(outlet_dto->working_schedule);
        outlet_dto->working_schedule = NULL;
    }
    if (outlet_dto->delivery_rules) {
        list_ForEach(listEntry, outlet_dto->delivery_rules) {
            outlet_delivery_rule_dto_free(listEntry->data);
        }
        list_freeList(outlet_dto->delivery_rules);
        outlet_dto->delivery_rules = NULL;
    }
    free(outlet_dto);
}

cJSON *outlet_dto_convertToJSON(outlet_dto_t *outlet_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_dto->name
    if (!outlet_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", outlet_dto->name) == NULL) {
    goto fail; //String
    }


    // outlet_dto->type
    if (_api__outlet_dto__NULL == outlet_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = outlet_type_convertToJSON(outlet_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // outlet_dto->coords
    if(outlet_dto->coords) {
    if(cJSON_AddStringToObject(item, "coords", outlet_dto->coords) == NULL) {
    goto fail; //String
    }
    }


    // outlet_dto->is_main
    if(outlet_dto->is_main) {
    if(cJSON_AddBoolToObject(item, "isMain", outlet_dto->is_main) == NULL) {
    goto fail; //Bool
    }
    }


    // outlet_dto->shop_outlet_code
    if(outlet_dto->shop_outlet_code) {
    if(cJSON_AddStringToObject(item, "shopOutletCode", outlet_dto->shop_outlet_code) == NULL) {
    goto fail; //String
    }
    }


    // outlet_dto->visibility
    if(outlet_dto->visibility != _api__outlet_dto__NULL) {
    cJSON *visibility_local_JSON = outlet_visibility_type_convertToJSON(outlet_dto->visibility);
    if(visibility_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "visibility", visibility_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // outlet_dto->address
    if (!outlet_dto->address) {
        goto fail;
    }
    cJSON *address_local_JSON = outlet_address_dto_convertToJSON(outlet_dto->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // outlet_dto->phones
    if (!outlet_dto->phones) {
        goto fail;
    }
    cJSON *phones = cJSON_AddArrayToObject(item, "phones");
    if(phones == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *phonesListEntry;
    list_ForEach(phonesListEntry, outlet_dto->phones) {
    if(cJSON_AddStringToObject(phones, "", (char*)phonesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // outlet_dto->working_schedule
    if (!outlet_dto->working_schedule) {
        goto fail;
    }
    cJSON *working_schedule_local_JSON = outlet_working_schedule_dto_convertToJSON(outlet_dto->working_schedule);
    if(working_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workingSchedule", working_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // outlet_dto->delivery_rules
    if(outlet_dto->delivery_rules) {
    cJSON *delivery_rules = cJSON_AddArrayToObject(item, "deliveryRules");
    if(delivery_rules == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *delivery_rulesListEntry;
    if (outlet_dto->delivery_rules) {
    list_ForEach(delivery_rulesListEntry, outlet_dto->delivery_rules) {
    cJSON *itemLocal = outlet_delivery_rule_dto_convertToJSON(delivery_rulesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(delivery_rules, itemLocal);
    }
    }
    }


    // outlet_dto->storage_period
    if(outlet_dto->storage_period) {
    if(cJSON_AddNumberToObject(item, "storagePeriod", outlet_dto->storage_period) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

outlet_dto_t *outlet_dto_parseFromJSON(cJSON *outlet_dtoJSON){

    outlet_dto_t *outlet_dto_local_var = NULL;

    // define the local variable for outlet_dto->type
    outlet_type_t *type_local_nonprim = NULL;

    // define the local variable for outlet_dto->visibility
    outlet_visibility_type_t *visibility_local_nonprim = NULL;

    // define the local variable for outlet_dto->address
    outlet_address_dto_t *address_local_nonprim = NULL;

    // define the local list for outlet_dto->phones
    list_t *phonesList = NULL;

    // define the local variable for outlet_dto->working_schedule
    outlet_working_schedule_dto_t *working_schedule_local_nonprim = NULL;

    // define the local list for outlet_dto->delivery_rules
    list_t *delivery_rulesList = NULL;

    // outlet_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // outlet_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = outlet_type_parseFromJSON(type); //custom

    // outlet_dto->coords
    cJSON *coords = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "coords");
    if (coords) { 
    if(!cJSON_IsString(coords) && !cJSON_IsNull(coords))
    {
    goto end; //String
    }
    }

    // outlet_dto->is_main
    cJSON *is_main = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "isMain");
    if (is_main) { 
    if(!cJSON_IsBool(is_main))
    {
    goto end; //Bool
    }
    }

    // outlet_dto->shop_outlet_code
    cJSON *shop_outlet_code = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "shopOutletCode");
    if (shop_outlet_code) { 
    if(!cJSON_IsString(shop_outlet_code) && !cJSON_IsNull(shop_outlet_code))
    {
    goto end; //String
    }
    }

    // outlet_dto->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "visibility");
    if (visibility) { 
    visibility_local_nonprim = outlet_visibility_type_parseFromJSON(visibility); //custom
    }

    // outlet_dto->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "address");
    if (!address) {
        goto end;
    }

    
    address_local_nonprim = outlet_address_dto_parseFromJSON(address); //nonprimitive

    // outlet_dto->phones
    cJSON *phones = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "phones");
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

    // outlet_dto->working_schedule
    cJSON *working_schedule = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "workingSchedule");
    if (!working_schedule) {
        goto end;
    }

    
    working_schedule_local_nonprim = outlet_working_schedule_dto_parseFromJSON(working_schedule); //nonprimitive

    // outlet_dto->delivery_rules
    cJSON *delivery_rules = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "deliveryRules");
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

    // outlet_dto->storage_period
    cJSON *storage_period = cJSON_GetObjectItemCaseSensitive(outlet_dtoJSON, "storagePeriod");
    if (storage_period) { 
    if(!cJSON_IsNumber(storage_period))
    {
    goto end; //Numeric
    }
    }


    outlet_dto_local_var = outlet_dto_create (
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
        storage_period ? storage_period->valuedouble : 0
        );

    return outlet_dto_local_var;
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
    return NULL;

}
