#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tariff_dto.h"


char* tariff_dto_type_ToString(_api__tariff_dto__e type) {
    char* typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "STORAGE", "WITHDRAW", "SURPLUS", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "CROSSREGIONAL_DELIVERY_RETURN", "DISPOSAL", "SORTING_CENTER_STORAGE", "EXPRESS_DELIVERY", "FF_XDOC_SUPPLY_BOX", "FF_XDOC_SUPPLY_PALLET", "SORTING", "MIDDLE_MILE", "RETURN_PROCESSING", "EXPRESS_CANCELLED_BY_PARTNER", "DELIVERY_TO_CUSTOMER_RETURN", "CROSSBORDER_DELIVERY", "INTAKE_SORTING_BULKY_CARGO", "INTAKE_SORTING_SMALL_GOODS", "INTAKE_SORTING_DAILY", "FF_STORAGE_BILLING", "CANCELLED_ORDER_FEE_QI", "LATE_ORDER_EXECUTION_FEE_QI" };
    return typeArray[type];
}

_api__tariff_dto__e tariff_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "STORAGE", "WITHDRAW", "SURPLUS", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "CROSSREGIONAL_DELIVERY_RETURN", "DISPOSAL", "SORTING_CENTER_STORAGE", "EXPRESS_DELIVERY", "FF_XDOC_SUPPLY_BOX", "FF_XDOC_SUPPLY_PALLET", "SORTING", "MIDDLE_MILE", "RETURN_PROCESSING", "EXPRESS_CANCELLED_BY_PARTNER", "DELIVERY_TO_CUSTOMER_RETURN", "CROSSBORDER_DELIVERY", "INTAKE_SORTING_BULKY_CARGO", "INTAKE_SORTING_SMALL_GOODS", "INTAKE_SORTING_DAILY", "FF_STORAGE_BILLING", "CANCELLED_ORDER_FEE_QI", "LATE_ORDER_EXECUTION_FEE_QI" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

tariff_dto_t *tariff_dto_create(
    tariff_type_t *type,
    double percent,
    double amount,
    list_t *parameters
    ) {
    tariff_dto_t *tariff_dto_local_var = malloc(sizeof(tariff_dto_t));
    if (!tariff_dto_local_var) {
        return NULL;
    }
    tariff_dto_local_var->type = type;
    tariff_dto_local_var->percent = percent;
    tariff_dto_local_var->amount = amount;
    tariff_dto_local_var->parameters = parameters;

    return tariff_dto_local_var;
}


void tariff_dto_free(tariff_dto_t *tariff_dto) {
    if(NULL == tariff_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (tariff_dto->type) {
        tariff_type_free(tariff_dto->type);
        tariff_dto->type = NULL;
    }
    if (tariff_dto->parameters) {
        list_ForEach(listEntry, tariff_dto->parameters) {
            tariff_parameter_dto_free(listEntry->data);
        }
        list_freeList(tariff_dto->parameters);
        tariff_dto->parameters = NULL;
    }
    free(tariff_dto);
}

cJSON *tariff_dto_convertToJSON(tariff_dto_t *tariff_dto) {
    cJSON *item = cJSON_CreateObject();

    // tariff_dto->type
    if (_api__tariff_dto__NULL == tariff_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = tariff_type_convertToJSON(tariff_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // tariff_dto->percent
    if(tariff_dto->percent) {
    if(cJSON_AddNumberToObject(item, "percent", tariff_dto->percent) == NULL) {
    goto fail; //Numeric
    }
    }


    // tariff_dto->amount
    if (!tariff_dto->amount) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "amount", tariff_dto->amount) == NULL) {
    goto fail; //Numeric
    }


    // tariff_dto->parameters
    if (!tariff_dto->parameters) {
        goto fail;
    }
    cJSON *parameters = cJSON_AddArrayToObject(item, "parameters");
    if(parameters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parametersListEntry;
    if (tariff_dto->parameters) {
    list_ForEach(parametersListEntry, tariff_dto->parameters) {
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

tariff_dto_t *tariff_dto_parseFromJSON(cJSON *tariff_dtoJSON){

    tariff_dto_t *tariff_dto_local_var = NULL;

    // define the local variable for tariff_dto->type
    tariff_type_t *type_local_nonprim = NULL;

    // define the local list for tariff_dto->parameters
    list_t *parametersList = NULL;

    // tariff_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(tariff_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = tariff_type_parseFromJSON(type); //custom

    // tariff_dto->percent
    cJSON *percent = cJSON_GetObjectItemCaseSensitive(tariff_dtoJSON, "percent");
    if (percent) { 
    if(!cJSON_IsNumber(percent))
    {
    goto end; //Numeric
    }
    }

    // tariff_dto->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(tariff_dtoJSON, "amount");
    if (!amount) {
        goto end;
    }

    
    if(!cJSON_IsNumber(amount))
    {
    goto end; //Numeric
    }

    // tariff_dto->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(tariff_dtoJSON, "parameters");
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


    tariff_dto_local_var = tariff_dto_create (
        type_local_nonprim,
        percent ? percent->valuedouble : 0,
        amount->valuedouble,
        parametersList
        );

    return tariff_dto_local_var;
end:
    if (type_local_nonprim) {
        tariff_type_free(type_local_nonprim);
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
