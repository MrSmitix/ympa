#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_quarantine_verdict_parameter_dto.h"


char* price_quarantine_verdict_parameter_dto_name_ToString(_api__price_quarantine_verdict_parameter_dto__e name) {
    char* nameArray[] =  { "NULL", "CURRENT_PRICE", "LAST_VALID_PRICE", "MIN_PRICE", "CURRENCY" };
    return nameArray[name];
}

_api__price_quarantine_verdict_parameter_dto__e price_quarantine_verdict_parameter_dto_name_FromString(char* name){
    int stringToReturn = 0;
    char *nameArray[] =  { "NULL", "CURRENT_PRICE", "LAST_VALID_PRICE", "MIN_PRICE", "CURRENCY" };
    size_t sizeofArray = sizeof(nameArray) / sizeof(nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(name, nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_create(
    price_quarantine_verdict_param_name_type_t *name,
    char *value
    ) {
    price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_local_var = malloc(sizeof(price_quarantine_verdict_parameter_dto_t));
    if (!price_quarantine_verdict_parameter_dto_local_var) {
        return NULL;
    }
    price_quarantine_verdict_parameter_dto_local_var->name = name;
    price_quarantine_verdict_parameter_dto_local_var->value = value;

    return price_quarantine_verdict_parameter_dto_local_var;
}


void price_quarantine_verdict_parameter_dto_free(price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto) {
    if(NULL == price_quarantine_verdict_parameter_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_quarantine_verdict_parameter_dto->name) {
        price_quarantine_verdict_param_name_type_free(price_quarantine_verdict_parameter_dto->name);
        price_quarantine_verdict_parameter_dto->name = NULL;
    }
    if (price_quarantine_verdict_parameter_dto->value) {
        free(price_quarantine_verdict_parameter_dto->value);
        price_quarantine_verdict_parameter_dto->value = NULL;
    }
    free(price_quarantine_verdict_parameter_dto);
}

cJSON *price_quarantine_verdict_parameter_dto_convertToJSON(price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_quarantine_verdict_parameter_dto->name
    if (_api__price_quarantine_verdict_parameter_dto__NULL == price_quarantine_verdict_parameter_dto->name) {
        goto fail;
    }
    cJSON *name_local_JSON = price_quarantine_verdict_param_name_type_convertToJSON(price_quarantine_verdict_parameter_dto->name);
    if(name_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // price_quarantine_verdict_parameter_dto->value
    if (!price_quarantine_verdict_parameter_dto->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", price_quarantine_verdict_parameter_dto->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_parseFromJSON(cJSON *price_quarantine_verdict_parameter_dtoJSON){

    price_quarantine_verdict_parameter_dto_t *price_quarantine_verdict_parameter_dto_local_var = NULL;

    // define the local variable for price_quarantine_verdict_parameter_dto->name
    price_quarantine_verdict_param_name_type_t *name_local_nonprim = NULL;

    // price_quarantine_verdict_parameter_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_parameter_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    name_local_nonprim = price_quarantine_verdict_param_name_type_parseFromJSON(name); //custom

    // price_quarantine_verdict_parameter_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_parameter_dtoJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    price_quarantine_verdict_parameter_dto_local_var = price_quarantine_verdict_parameter_dto_create (
        name_local_nonprim,
        strdup(value->valuestring)
        );

    return price_quarantine_verdict_parameter_dto_local_var;
end:
    if (name_local_nonprim) {
        price_quarantine_verdict_param_name_type_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    return NULL;

}
