#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "change_outlet_request.h"


char* change_outlet_request_type_ToString(_api__change_outlet_request__e type) {
    char* typeArray[] =  { "NULL", "DEPOT", "MIXED", "RETAIL", "NOT_DEFINED" };
    return typeArray[type];
}

_api__change_outlet_request__e change_outlet_request_type_FromString(char* type){
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
char* change_outlet_request_visibility_ToString(_api__change_outlet_request__e visibility) {
    char* visibilityArray[] =  { "NULL", "HIDDEN", "VISIBLE", "UNKNOWN" };
    return visibilityArray[visibility];
}

_api__change_outlet_request__e change_outlet_request_visibility_FromString(char* visibility){
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

change_outlet_request_t *change_outlet_request_create(
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
    change_outlet_request_t *change_outlet_request_local_var = malloc(sizeof(change_outlet_request_t));
    if (!change_outlet_request_local_var) {
        return NULL;
    }
    change_outlet_request_local_var->name = name;
    change_outlet_request_local_var->type = type;
    change_outlet_request_local_var->coords = coords;
    change_outlet_request_local_var->is_main = is_main;
    change_outlet_request_local_var->shop_outlet_code = shop_outlet_code;
    change_outlet_request_local_var->visibility = visibility;
    change_outlet_request_local_var->address = address;
    change_outlet_request_local_var->phones = phones;
    change_outlet_request_local_var->working_schedule = working_schedule;
    change_outlet_request_local_var->delivery_rules = delivery_rules;
    change_outlet_request_local_var->storage_period = storage_period;

    return change_outlet_request_local_var;
}


void change_outlet_request_free(change_outlet_request_t *change_outlet_request) {
    if(NULL == change_outlet_request){
        return ;
    }
    listEntry_t *listEntry;
    if (change_outlet_request->name) {
        free(change_outlet_request->name);
        change_outlet_request->name = NULL;
    }
    if (change_outlet_request->type) {
        outlet_type_free(change_outlet_request->type);
        change_outlet_request->type = NULL;
    }
    if (change_outlet_request->coords) {
        free(change_outlet_request->coords);
        change_outlet_request->coords = NULL;
    }
    if (change_outlet_request->shop_outlet_code) {
        free(change_outlet_request->shop_outlet_code);
        change_outlet_request->shop_outlet_code = NULL;
    }
    if (change_outlet_request->visibility) {
        outlet_visibility_type_free(change_outlet_request->visibility);
        change_outlet_request->visibility = NULL;
    }
    if (change_outlet_request->address) {
        outlet_address_dto_free(change_outlet_request->address);
        change_outlet_request->address = NULL;
    }
    if (change_outlet_request->phones) {
        list_ForEach(listEntry, change_outlet_request->phones) {
            free(listEntry->data);
        }
        list_freeList(change_outlet_request->phones);
        change_outlet_request->phones = NULL;
    }
    if (change_outlet_request->working_schedule) {
        outlet_working_schedule_dto_free(change_outlet_request->working_schedule);
        change_outlet_request->working_schedule = NULL;
    }
    if (change_outlet_request->delivery_rules) {
        list_ForEach(listEntry, change_outlet_request->delivery_rules) {
            outlet_delivery_rule_dto_free(listEntry->data);
        }
        list_freeList(change_outlet_request->delivery_rules);
        change_outlet_request->delivery_rules = NULL;
    }
    free(change_outlet_request);
}

cJSON *change_outlet_request_convertToJSON(change_outlet_request_t *change_outlet_request) {
    cJSON *item = cJSON_CreateObject();

    // change_outlet_request->name
    if (!change_outlet_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", change_outlet_request->name) == NULL) {
    goto fail; //String
    }


    // change_outlet_request->type
    if (_api__change_outlet_request__NULL == change_outlet_request->type) {
        goto fail;
    }
    cJSON *type_local_JSON = outlet_type_convertToJSON(change_outlet_request->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // change_outlet_request->coords
    if(change_outlet_request->coords) {
    if(cJSON_AddStringToObject(item, "coords", change_outlet_request->coords) == NULL) {
    goto fail; //String
    }
    }


    // change_outlet_request->is_main
    if(change_outlet_request->is_main) {
    if(cJSON_AddBoolToObject(item, "isMain", change_outlet_request->is_main) == NULL) {
    goto fail; //Bool
    }
    }


    // change_outlet_request->shop_outlet_code
    if(change_outlet_request->shop_outlet_code) {
    if(cJSON_AddStringToObject(item, "shopOutletCode", change_outlet_request->shop_outlet_code) == NULL) {
    goto fail; //String
    }
    }


    // change_outlet_request->visibility
    if(change_outlet_request->visibility != _api__change_outlet_request__NULL) {
    cJSON *visibility_local_JSON = outlet_visibility_type_convertToJSON(change_outlet_request->visibility);
    if(visibility_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "visibility", visibility_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // change_outlet_request->address
    if (!change_outlet_request->address) {
        goto fail;
    }
    cJSON *address_local_JSON = outlet_address_dto_convertToJSON(change_outlet_request->address);
    if(address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "address", address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // change_outlet_request->phones
    if (!change_outlet_request->phones) {
        goto fail;
    }
    cJSON *phones = cJSON_AddArrayToObject(item, "phones");
    if(phones == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *phonesListEntry;
    list_ForEach(phonesListEntry, change_outlet_request->phones) {
    if(cJSON_AddStringToObject(phones, "", (char*)phonesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // change_outlet_request->working_schedule
    if (!change_outlet_request->working_schedule) {
        goto fail;
    }
    cJSON *working_schedule_local_JSON = outlet_working_schedule_dto_convertToJSON(change_outlet_request->working_schedule);
    if(working_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workingSchedule", working_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // change_outlet_request->delivery_rules
    if(change_outlet_request->delivery_rules) {
    cJSON *delivery_rules = cJSON_AddArrayToObject(item, "deliveryRules");
    if(delivery_rules == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *delivery_rulesListEntry;
    if (change_outlet_request->delivery_rules) {
    list_ForEach(delivery_rulesListEntry, change_outlet_request->delivery_rules) {
    cJSON *itemLocal = outlet_delivery_rule_dto_convertToJSON(delivery_rulesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(delivery_rules, itemLocal);
    }
    }
    }


    // change_outlet_request->storage_period
    if(change_outlet_request->storage_period) {
    if(cJSON_AddNumberToObject(item, "storagePeriod", change_outlet_request->storage_period) == NULL) {
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

change_outlet_request_t *change_outlet_request_parseFromJSON(cJSON *change_outlet_requestJSON){

    change_outlet_request_t *change_outlet_request_local_var = NULL;

    // define the local variable for change_outlet_request->type
    outlet_type_t *type_local_nonprim = NULL;

    // define the local variable for change_outlet_request->visibility
    outlet_visibility_type_t *visibility_local_nonprim = NULL;

    // define the local variable for change_outlet_request->address
    outlet_address_dto_t *address_local_nonprim = NULL;

    // define the local list for change_outlet_request->phones
    list_t *phonesList = NULL;

    // define the local variable for change_outlet_request->working_schedule
    outlet_working_schedule_dto_t *working_schedule_local_nonprim = NULL;

    // define the local list for change_outlet_request->delivery_rules
    list_t *delivery_rulesList = NULL;

    // change_outlet_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // change_outlet_request->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = outlet_type_parseFromJSON(type); //custom

    // change_outlet_request->coords
    cJSON *coords = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "coords");
    if (coords) { 
    if(!cJSON_IsString(coords) && !cJSON_IsNull(coords))
    {
    goto end; //String
    }
    }

    // change_outlet_request->is_main
    cJSON *is_main = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "isMain");
    if (is_main) { 
    if(!cJSON_IsBool(is_main))
    {
    goto end; //Bool
    }
    }

    // change_outlet_request->shop_outlet_code
    cJSON *shop_outlet_code = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "shopOutletCode");
    if (shop_outlet_code) { 
    if(!cJSON_IsString(shop_outlet_code) && !cJSON_IsNull(shop_outlet_code))
    {
    goto end; //String
    }
    }

    // change_outlet_request->visibility
    cJSON *visibility = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "visibility");
    if (visibility) { 
    visibility_local_nonprim = outlet_visibility_type_parseFromJSON(visibility); //custom
    }

    // change_outlet_request->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "address");
    if (!address) {
        goto end;
    }

    
    address_local_nonprim = outlet_address_dto_parseFromJSON(address); //nonprimitive

    // change_outlet_request->phones
    cJSON *phones = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "phones");
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

    // change_outlet_request->working_schedule
    cJSON *working_schedule = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "workingSchedule");
    if (!working_schedule) {
        goto end;
    }

    
    working_schedule_local_nonprim = outlet_working_schedule_dto_parseFromJSON(working_schedule); //nonprimitive

    // change_outlet_request->delivery_rules
    cJSON *delivery_rules = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "deliveryRules");
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

    // change_outlet_request->storage_period
    cJSON *storage_period = cJSON_GetObjectItemCaseSensitive(change_outlet_requestJSON, "storagePeriod");
    if (storage_period) { 
    if(!cJSON_IsNumber(storage_period))
    {
    goto end; //Numeric
    }
    }


    change_outlet_request_local_var = change_outlet_request_create (
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

    return change_outlet_request_local_var;
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
