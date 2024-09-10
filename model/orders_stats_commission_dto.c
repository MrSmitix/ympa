#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_commission_dto.h"


char* orders_stats_commission_dto_type_ToString(_api__orders_stats_commission_dto__e type) {
    char* typeArray[] =  { "NULL", "FEE", "FULFILLMENT", "LOYALTY_PARTICIPATION_FEE", "AUCTION_PROMOTION", "INSTALLMENT", "DELIVERY_TO_CUSTOMER", "EXPRESS_DELIVERY_TO_CUSTOMER", "AGENCY", "PAYMENT_TRANSFER", "RETURNED_ORDERS_STORAGE", "SORTING", "INTAKE_SORTING", "RETURN_PROCESSING", "ILLIQUID_GOODS_SALE" };
    return typeArray[type];
}

_api__orders_stats_commission_dto__e orders_stats_commission_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "FEE", "FULFILLMENT", "LOYALTY_PARTICIPATION_FEE", "AUCTION_PROMOTION", "INSTALLMENT", "DELIVERY_TO_CUSTOMER", "EXPRESS_DELIVERY_TO_CUSTOMER", "AGENCY", "PAYMENT_TRANSFER", "RETURNED_ORDERS_STORAGE", "SORTING", "INTAKE_SORTING", "RETURN_PROCESSING", "ILLIQUID_GOODS_SALE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

orders_stats_commission_dto_t *orders_stats_commission_dto_create(
    orders_stats_commission_type_t *type,
    double actual
    ) {
    orders_stats_commission_dto_t *orders_stats_commission_dto_local_var = malloc(sizeof(orders_stats_commission_dto_t));
    if (!orders_stats_commission_dto_local_var) {
        return NULL;
    }
    orders_stats_commission_dto_local_var->type = type;
    orders_stats_commission_dto_local_var->actual = actual;

    return orders_stats_commission_dto_local_var;
}


void orders_stats_commission_dto_free(orders_stats_commission_dto_t *orders_stats_commission_dto) {
    if(NULL == orders_stats_commission_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_commission_dto->type) {
        orders_stats_commission_type_free(orders_stats_commission_dto->type);
        orders_stats_commission_dto->type = NULL;
    }
    free(orders_stats_commission_dto);
}

cJSON *orders_stats_commission_dto_convertToJSON(orders_stats_commission_dto_t *orders_stats_commission_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_commission_dto->type
    if(orders_stats_commission_dto->type != _api__orders_stats_commission_dto__NULL) {
    cJSON *type_local_JSON = orders_stats_commission_type_convertToJSON(orders_stats_commission_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_commission_dto->actual
    if(orders_stats_commission_dto->actual) {
    if(cJSON_AddNumberToObject(item, "actual", orders_stats_commission_dto->actual) == NULL) {
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

orders_stats_commission_dto_t *orders_stats_commission_dto_parseFromJSON(cJSON *orders_stats_commission_dtoJSON){

    orders_stats_commission_dto_t *orders_stats_commission_dto_local_var = NULL;

    // define the local variable for orders_stats_commission_dto->type
    orders_stats_commission_type_t *type_local_nonprim = NULL;

    // orders_stats_commission_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(orders_stats_commission_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = orders_stats_commission_type_parseFromJSON(type); //custom
    }

    // orders_stats_commission_dto->actual
    cJSON *actual = cJSON_GetObjectItemCaseSensitive(orders_stats_commission_dtoJSON, "actual");
    if (actual) { 
    if(!cJSON_IsNumber(actual))
    {
    goto end; //Numeric
    }
    }


    orders_stats_commission_dto_local_var = orders_stats_commission_dto_create (
        type ? type_local_nonprim : NULL,
        actual ? actual->valuedouble : 0
        );

    return orders_stats_commission_dto_local_var;
end:
    if (type_local_nonprim) {
        orders_stats_commission_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
