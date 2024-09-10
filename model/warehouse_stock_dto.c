#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "warehouse_stock_dto.h"


char* warehouse_stock_dto_type_ToString(_api__warehouse_stock_dto__e type) {
    char* typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    return typeArray[type];
}

_api__warehouse_stock_dto__e warehouse_stock_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

warehouse_stock_dto_t *warehouse_stock_dto_create(
    warehouse_stock_type_t *type,
    long count
    ) {
    warehouse_stock_dto_t *warehouse_stock_dto_local_var = malloc(sizeof(warehouse_stock_dto_t));
    if (!warehouse_stock_dto_local_var) {
        return NULL;
    }
    warehouse_stock_dto_local_var->type = type;
    warehouse_stock_dto_local_var->count = count;

    return warehouse_stock_dto_local_var;
}


void warehouse_stock_dto_free(warehouse_stock_dto_t *warehouse_stock_dto) {
    if(NULL == warehouse_stock_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (warehouse_stock_dto->type) {
        warehouse_stock_type_free(warehouse_stock_dto->type);
        warehouse_stock_dto->type = NULL;
    }
    free(warehouse_stock_dto);
}

cJSON *warehouse_stock_dto_convertToJSON(warehouse_stock_dto_t *warehouse_stock_dto) {
    cJSON *item = cJSON_CreateObject();

    // warehouse_stock_dto->type
    if (_api__warehouse_stock_dto__NULL == warehouse_stock_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = warehouse_stock_type_convertToJSON(warehouse_stock_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // warehouse_stock_dto->count
    if (!warehouse_stock_dto->count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "count", warehouse_stock_dto->count) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

warehouse_stock_dto_t *warehouse_stock_dto_parseFromJSON(cJSON *warehouse_stock_dtoJSON){

    warehouse_stock_dto_t *warehouse_stock_dto_local_var = NULL;

    // define the local variable for warehouse_stock_dto->type
    warehouse_stock_type_t *type_local_nonprim = NULL;

    // warehouse_stock_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(warehouse_stock_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = warehouse_stock_type_parseFromJSON(type); //custom

    // warehouse_stock_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(warehouse_stock_dtoJSON, "count");
    if (!count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }


    warehouse_stock_dto_local_var = warehouse_stock_dto_create (
        type_local_nonprim,
        count->valuedouble
        );

    return warehouse_stock_dto_local_var;
end:
    if (type_local_nonprim) {
        warehouse_stock_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
