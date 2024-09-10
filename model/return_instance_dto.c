#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_instance_dto.h"


char* return_instance_dto_stock_type_ToString(_api__return_instance_dto__e stock_type) {
    char* stock_typeArray[] =  { "NULL", "FIT", "DEFECT", "ANOMALY", "SURPLUS", "EXPIRED", "MISGRADING", "UNDEFINED", "INCORRECT_IMEI", "INCORRECT_SERIAL_NUMBER", "INCORRECT_CIS", "PART_MISSING", "NON_COMPLIENT", "NOT_ACCEPTABLE", "SERVICE", "MARKDOWN", "DEMO", "REPAIR", "FIRMWARE", "UNKNOWN" };
    return stock_typeArray[stock_type];
}

_api__return_instance_dto__e return_instance_dto_stock_type_FromString(char* stock_type){
    int stringToReturn = 0;
    char *stock_typeArray[] =  { "NULL", "FIT", "DEFECT", "ANOMALY", "SURPLUS", "EXPIRED", "MISGRADING", "UNDEFINED", "INCORRECT_IMEI", "INCORRECT_SERIAL_NUMBER", "INCORRECT_CIS", "PART_MISSING", "NON_COMPLIENT", "NOT_ACCEPTABLE", "SERVICE", "MARKDOWN", "DEMO", "REPAIR", "FIRMWARE", "UNKNOWN" };
    size_t sizeofArray = sizeof(stock_typeArray) / sizeof(stock_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(stock_type, stock_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_instance_dto_status_ToString(_api__return_instance_dto__e status) {
    char* statusArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "RECEIVED_ON_FULFILLMENT", "CANCELLED", "LOST", "UTILIZED", "PREPARED_FOR_UTILIZATION", "EXPROPRIATED", "NOT_IN_DEMAND" };
    return statusArray[status];
}

_api__return_instance_dto__e return_instance_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "CREATED", "RECEIVED", "IN_TRANSIT", "READY_FOR_PICKUP", "PICKED", "RECEIVED_ON_FULFILLMENT", "CANCELLED", "LOST", "UTILIZED", "PREPARED_FOR_UTILIZATION", "EXPROPRIATED", "NOT_IN_DEMAND" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

return_instance_dto_t *return_instance_dto_create(
    return_instance_stock_type_t *stock_type,
    return_instance_status_type_t *status,
    char *cis,
    char *imei
    ) {
    return_instance_dto_t *return_instance_dto_local_var = malloc(sizeof(return_instance_dto_t));
    if (!return_instance_dto_local_var) {
        return NULL;
    }
    return_instance_dto_local_var->stock_type = stock_type;
    return_instance_dto_local_var->status = status;
    return_instance_dto_local_var->cis = cis;
    return_instance_dto_local_var->imei = imei;

    return return_instance_dto_local_var;
}


void return_instance_dto_free(return_instance_dto_t *return_instance_dto) {
    if(NULL == return_instance_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (return_instance_dto->stock_type) {
        return_instance_stock_type_free(return_instance_dto->stock_type);
        return_instance_dto->stock_type = NULL;
    }
    if (return_instance_dto->status) {
        return_instance_status_type_free(return_instance_dto->status);
        return_instance_dto->status = NULL;
    }
    if (return_instance_dto->cis) {
        free(return_instance_dto->cis);
        return_instance_dto->cis = NULL;
    }
    if (return_instance_dto->imei) {
        free(return_instance_dto->imei);
        return_instance_dto->imei = NULL;
    }
    free(return_instance_dto);
}

cJSON *return_instance_dto_convertToJSON(return_instance_dto_t *return_instance_dto) {
    cJSON *item = cJSON_CreateObject();

    // return_instance_dto->stock_type
    if(return_instance_dto->stock_type != _api__return_instance_dto__NULL) {
    cJSON *stock_type_local_JSON = return_instance_stock_type_convertToJSON(return_instance_dto->stock_type);
    if(stock_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "stockType", stock_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_instance_dto->status
    if(return_instance_dto->status != _api__return_instance_dto__NULL) {
    cJSON *status_local_JSON = return_instance_status_type_convertToJSON(return_instance_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_instance_dto->cis
    if(return_instance_dto->cis) {
    if(cJSON_AddStringToObject(item, "cis", return_instance_dto->cis) == NULL) {
    goto fail; //String
    }
    }


    // return_instance_dto->imei
    if(return_instance_dto->imei) {
    if(cJSON_AddStringToObject(item, "imei", return_instance_dto->imei) == NULL) {
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

return_instance_dto_t *return_instance_dto_parseFromJSON(cJSON *return_instance_dtoJSON){

    return_instance_dto_t *return_instance_dto_local_var = NULL;

    // define the local variable for return_instance_dto->stock_type
    return_instance_stock_type_t *stock_type_local_nonprim = NULL;

    // define the local variable for return_instance_dto->status
    return_instance_status_type_t *status_local_nonprim = NULL;

    // return_instance_dto->stock_type
    cJSON *stock_type = cJSON_GetObjectItemCaseSensitive(return_instance_dtoJSON, "stockType");
    if (stock_type) { 
    stock_type_local_nonprim = return_instance_stock_type_parseFromJSON(stock_type); //custom
    }

    // return_instance_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(return_instance_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = return_instance_status_type_parseFromJSON(status); //custom
    }

    // return_instance_dto->cis
    cJSON *cis = cJSON_GetObjectItemCaseSensitive(return_instance_dtoJSON, "cis");
    if (cis) { 
    if(!cJSON_IsString(cis) && !cJSON_IsNull(cis))
    {
    goto end; //String
    }
    }

    // return_instance_dto->imei
    cJSON *imei = cJSON_GetObjectItemCaseSensitive(return_instance_dtoJSON, "imei");
    if (imei) { 
    if(!cJSON_IsString(imei) && !cJSON_IsNull(imei))
    {
    goto end; //String
    }
    }


    return_instance_dto_local_var = return_instance_dto_create (
        stock_type ? stock_type_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        cis && !cJSON_IsNull(cis) ? strdup(cis->valuestring) : NULL,
        imei && !cJSON_IsNull(imei) ? strdup(imei->valuestring) : NULL
        );

    return return_instance_dto_local_var;
end:
    if (stock_type_local_nonprim) {
        return_instance_stock_type_free(stock_type_local_nonprim);
        stock_type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        return_instance_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
