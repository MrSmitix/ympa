#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_subsidy_dto.h"


char* order_item_subsidy_dto_type_ToString(_api__order_item_subsidy_dto__e type) {
    char* typeArray[] =  { "NULL", "YANDEX_CASHBACK", "SUBSIDY" };
    return typeArray[type];
}

_api__order_item_subsidy_dto__e order_item_subsidy_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "YANDEX_CASHBACK", "SUBSIDY" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_item_subsidy_dto_t *order_item_subsidy_dto_create(
    order_item_subsidy_type_t *type,
    double amount
    ) {
    order_item_subsidy_dto_t *order_item_subsidy_dto_local_var = malloc(sizeof(order_item_subsidy_dto_t));
    if (!order_item_subsidy_dto_local_var) {
        return NULL;
    }
    order_item_subsidy_dto_local_var->type = type;
    order_item_subsidy_dto_local_var->amount = amount;

    return order_item_subsidy_dto_local_var;
}


void order_item_subsidy_dto_free(order_item_subsidy_dto_t *order_item_subsidy_dto) {
    if(NULL == order_item_subsidy_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_subsidy_dto->type) {
        order_item_subsidy_type_free(order_item_subsidy_dto->type);
        order_item_subsidy_dto->type = NULL;
    }
    free(order_item_subsidy_dto);
}

cJSON *order_item_subsidy_dto_convertToJSON(order_item_subsidy_dto_t *order_item_subsidy_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_subsidy_dto->type
    if(order_item_subsidy_dto->type != _api__order_item_subsidy_dto__NULL) {
    cJSON *type_local_JSON = order_item_subsidy_type_convertToJSON(order_item_subsidy_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_item_subsidy_dto->amount
    if(order_item_subsidy_dto->amount) {
    if(cJSON_AddNumberToObject(item, "amount", order_item_subsidy_dto->amount) == NULL) {
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

order_item_subsidy_dto_t *order_item_subsidy_dto_parseFromJSON(cJSON *order_item_subsidy_dtoJSON){

    order_item_subsidy_dto_t *order_item_subsidy_dto_local_var = NULL;

    // define the local variable for order_item_subsidy_dto->type
    order_item_subsidy_type_t *type_local_nonprim = NULL;

    // order_item_subsidy_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(order_item_subsidy_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = order_item_subsidy_type_parseFromJSON(type); //custom
    }

    // order_item_subsidy_dto->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(order_item_subsidy_dtoJSON, "amount");
    if (amount) { 
    if(!cJSON_IsNumber(amount))
    {
    goto end; //Numeric
    }
    }


    order_item_subsidy_dto_local_var = order_item_subsidy_dto_create (
        type ? type_local_nonprim : NULL,
        amount ? amount->valuedouble : 0
        );

    return order_item_subsidy_dto_local_var;
end:
    if (type_local_nonprim) {
        order_item_subsidy_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
