#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculated_tariff_dto.h"


char* calculated_tariff_dto_type_ToString(_api__calculated_tariff_dto__e type) {
    char* typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "EXPRESS_DELIVERY", "SORTING", "MIDDLE_MILE" };
    return typeArray[type];
}

_api__calculated_tariff_dto__e calculated_tariff_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "EXPRESS_DELIVERY", "SORTING", "MIDDLE_MILE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

calculated_tariff_dto_t *calculated_tariff_dto_create(
    calculated_tariff_type_t *type,
    double amount,
    list_t *parameters
    ) {
    calculated_tariff_dto_t *calculated_tariff_dto_local_var = malloc(sizeof(calculated_tariff_dto_t));
    if (!calculated_tariff_dto_local_var) {
        return NULL;
    }
    calculated_tariff_dto_local_var->type = type;
    calculated_tariff_dto_local_var->amount = amount;
    calculated_tariff_dto_local_var->parameters = parameters;

    return calculated_tariff_dto_local_var;
}


void calculated_tariff_dto_free(calculated_tariff_dto_t *calculated_tariff_dto) {
    if(NULL == calculated_tariff_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (calculated_tariff_dto->type) {
        calculated_tariff_type_free(calculated_tariff_dto->type);
        calculated_tariff_dto->type = NULL;
    }
    if (calculated_tariff_dto->parameters) {
        list_ForEach(listEntry, calculated_tariff_dto->parameters) {
            tariff_parameter_dto_free(listEntry->data);
        }
        list_freeList(calculated_tariff_dto->parameters);
        calculated_tariff_dto->parameters = NULL;
    }
    free(calculated_tariff_dto);
}

cJSON *calculated_tariff_dto_convertToJSON(calculated_tariff_dto_t *calculated_tariff_dto) {
    cJSON *item = cJSON_CreateObject();

    // calculated_tariff_dto->type
    if (_api__calculated_tariff_dto__NULL == calculated_tariff_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = calculated_tariff_type_convertToJSON(calculated_tariff_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // calculated_tariff_dto->amount
    if(calculated_tariff_dto->amount) {
    if(cJSON_AddNumberToObject(item, "amount", calculated_tariff_dto->amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // calculated_tariff_dto->parameters
    if (!calculated_tariff_dto->parameters) {
        goto fail;
    }
    cJSON *parameters = cJSON_AddArrayToObject(item, "parameters");
    if(parameters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parametersListEntry;
    if (calculated_tariff_dto->parameters) {
    list_ForEach(parametersListEntry, calculated_tariff_dto->parameters) {
    cJSON *itemLocal = tariff_parameter_dto_convertToJSON(parametersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameters, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

calculated_tariff_dto_t *calculated_tariff_dto_parseFromJSON(cJSON *calculated_tariff_dtoJSON){

    calculated_tariff_dto_t *calculated_tariff_dto_local_var = NULL;

    // define the local variable for calculated_tariff_dto->type
    calculated_tariff_type_t *type_local_nonprim = NULL;

    // define the local list for calculated_tariff_dto->parameters
    list_t *parametersList = NULL;

    // calculated_tariff_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(calculated_tariff_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = calculated_tariff_type_parseFromJSON(type); //custom

    // calculated_tariff_dto->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(calculated_tariff_dtoJSON, "amount");
    if (amount) { 
    if(!cJSON_IsNumber(amount))
    {
    goto end; //Numeric
    }
    }

    // calculated_tariff_dto->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(calculated_tariff_dtoJSON, "parameters");
    if (!parameters) {
        goto end;
    }

    
    cJSON *parameters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameters)){
        goto end; //nonprimitive container
    }

    parametersList = list_createList();

    cJSON_ArrayForEach(parameters_local_nonprimitive,parameters )
    {
        if(!cJSON_IsObject(parameters_local_nonprimitive)){
            goto end;
        }
        tariff_parameter_dto_t *parametersItem = tariff_parameter_dto_parseFromJSON(parameters_local_nonprimitive);

        list_addElement(parametersList, parametersItem);
    }


    calculated_tariff_dto_local_var = calculated_tariff_dto_create (
        type_local_nonprim,
        amount ? amount->valuedouble : 0,
        parametersList
        );

    return calculated_tariff_dto_local_var;
end:
    if (type_local_nonprim) {
        calculated_tariff_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (parametersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parametersList) {
            tariff_parameter_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parametersList);
        parametersList = NULL;
    }
    return NULL;

}
