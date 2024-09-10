#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_price_dto.h"


char* orders_stats_price_dto_type_ToString(_api__orders_stats_price_dto__e type) {
    char* typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE" };
    return typeArray[type];
}

_api__orders_stats_price_dto__e orders_stats_price_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "BUYER", "CASHBACK", "MARKETPLACE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

orders_stats_price_dto_t *orders_stats_price_dto_create(
    orders_stats_price_type_t *type,
    double cost_per_item,
    double total
    ) {
    orders_stats_price_dto_t *orders_stats_price_dto_local_var = malloc(sizeof(orders_stats_price_dto_t));
    if (!orders_stats_price_dto_local_var) {
        return NULL;
    }
    orders_stats_price_dto_local_var->type = type;
    orders_stats_price_dto_local_var->cost_per_item = cost_per_item;
    orders_stats_price_dto_local_var->total = total;

    return orders_stats_price_dto_local_var;
}


void orders_stats_price_dto_free(orders_stats_price_dto_t *orders_stats_price_dto) {
    if(NULL == orders_stats_price_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_price_dto->type) {
        orders_stats_price_type_free(orders_stats_price_dto->type);
        orders_stats_price_dto->type = NULL;
    }
    free(orders_stats_price_dto);
}

cJSON *orders_stats_price_dto_convertToJSON(orders_stats_price_dto_t *orders_stats_price_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_price_dto->type
    if(orders_stats_price_dto->type != _api__orders_stats_price_dto__NULL) {
    cJSON *type_local_JSON = orders_stats_price_type_convertToJSON(orders_stats_price_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_price_dto->cost_per_item
    if(orders_stats_price_dto->cost_per_item) {
    if(cJSON_AddNumberToObject(item, "costPerItem", orders_stats_price_dto->cost_per_item) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_price_dto->total
    if(orders_stats_price_dto->total) {
    if(cJSON_AddNumberToObject(item, "total", orders_stats_price_dto->total) == NULL) {
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

orders_stats_price_dto_t *orders_stats_price_dto_parseFromJSON(cJSON *orders_stats_price_dtoJSON){

    orders_stats_price_dto_t *orders_stats_price_dto_local_var = NULL;

    // define the local variable for orders_stats_price_dto->type
    orders_stats_price_type_t *type_local_nonprim = NULL;

    // orders_stats_price_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(orders_stats_price_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = orders_stats_price_type_parseFromJSON(type); //custom
    }

    // orders_stats_price_dto->cost_per_item
    cJSON *cost_per_item = cJSON_GetObjectItemCaseSensitive(orders_stats_price_dtoJSON, "costPerItem");
    if (cost_per_item) { 
    if(!cJSON_IsNumber(cost_per_item))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_price_dto->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(orders_stats_price_dtoJSON, "total");
    if (total) { 
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }
    }


    orders_stats_price_dto_local_var = orders_stats_price_dto_create (
        type ? type_local_nonprim : NULL,
        cost_per_item ? cost_per_item->valuedouble : 0,
        total ? total->valuedouble : 0
        );

    return orders_stats_price_dto_local_var;
end:
    if (type_local_nonprim) {
        orders_stats_price_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
