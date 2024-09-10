#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_quarantine_verdict_dto.h"


char* price_quarantine_verdict_dto_type_ToString(_api__price_quarantine_verdict_dto__e type) {
    char* typeArray[] =  { "NULL", "PRICE_CHANGE", "LOW_PRICE", "LOW_PRICE_PROMO" };
    return typeArray[type];
}

_api__price_quarantine_verdict_dto__e price_quarantine_verdict_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "PRICE_CHANGE", "LOW_PRICE", "LOW_PRICE_PROMO" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_create(
    price_quarantine_verdict_type_t *type,
    list_t *params
    ) {
    price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_local_var = malloc(sizeof(price_quarantine_verdict_dto_t));
    if (!price_quarantine_verdict_dto_local_var) {
        return NULL;
    }
    price_quarantine_verdict_dto_local_var->type = type;
    price_quarantine_verdict_dto_local_var->params = params;

    return price_quarantine_verdict_dto_local_var;
}


void price_quarantine_verdict_dto_free(price_quarantine_verdict_dto_t *price_quarantine_verdict_dto) {
    if(NULL == price_quarantine_verdict_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (price_quarantine_verdict_dto->type) {
        price_quarantine_verdict_type_free(price_quarantine_verdict_dto->type);
        price_quarantine_verdict_dto->type = NULL;
    }
    if (price_quarantine_verdict_dto->params) {
        list_ForEach(listEntry, price_quarantine_verdict_dto->params) {
            price_quarantine_verdict_parameter_dto_free(listEntry->data);
        }
        list_freeList(price_quarantine_verdict_dto->params);
        price_quarantine_verdict_dto->params = NULL;
    }
    free(price_quarantine_verdict_dto);
}

cJSON *price_quarantine_verdict_dto_convertToJSON(price_quarantine_verdict_dto_t *price_quarantine_verdict_dto) {
    cJSON *item = cJSON_CreateObject();

    // price_quarantine_verdict_dto->type
    if(price_quarantine_verdict_dto->type != _api__price_quarantine_verdict_dto__NULL) {
    cJSON *type_local_JSON = price_quarantine_verdict_type_convertToJSON(price_quarantine_verdict_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // price_quarantine_verdict_dto->params
    if (!price_quarantine_verdict_dto->params) {
        goto fail;
    }
    cJSON *params = cJSON_AddArrayToObject(item, "params");
    if(params == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *paramsListEntry;
    if (price_quarantine_verdict_dto->params) {
    list_ForEach(paramsListEntry, price_quarantine_verdict_dto->params) {
    cJSON *itemLocal = price_quarantine_verdict_parameter_dto_convertToJSON(paramsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(params, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_parseFromJSON(cJSON *price_quarantine_verdict_dtoJSON){

    price_quarantine_verdict_dto_t *price_quarantine_verdict_dto_local_var = NULL;

    // define the local variable for price_quarantine_verdict_dto->type
    price_quarantine_verdict_type_t *type_local_nonprim = NULL;

    // define the local list for price_quarantine_verdict_dto->params
    list_t *paramsList = NULL;

    // price_quarantine_verdict_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = price_quarantine_verdict_type_parseFromJSON(type); //custom
    }

    // price_quarantine_verdict_dto->params
    cJSON *params = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_dtoJSON, "params");
    if (!params) {
        goto end;
    }

    
    cJSON *params_local_nonprimitive = NULL;
    if(!cJSON_IsArray(params)){
        goto end; //nonprimitive container
    }

    paramsList = list_createList();

    cJSON_ArrayForEach(params_local_nonprimitive,params )
    {
        if(!cJSON_IsObject(params_local_nonprimitive)){
            goto end;
        }
        price_quarantine_verdict_parameter_dto_t *paramsItem = price_quarantine_verdict_parameter_dto_parseFromJSON(params_local_nonprimitive);

        list_addElement(paramsList, paramsItem);
    }


    price_quarantine_verdict_dto_local_var = price_quarantine_verdict_dto_create (
        type ? type_local_nonprim : NULL,
        paramsList
        );

    return price_quarantine_verdict_dto_local_var;
end:
    if (type_local_nonprim) {
        price_quarantine_verdict_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (paramsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, paramsList) {
            price_quarantine_verdict_parameter_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(paramsList);
        paramsList = NULL;
    }
    return NULL;

}
