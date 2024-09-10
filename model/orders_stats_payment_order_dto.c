#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_payment_order_dto.h"



orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_create(
    char *id,
    char *date
    ) {
    orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_local_var = malloc(sizeof(orders_stats_payment_order_dto_t));
    if (!orders_stats_payment_order_dto_local_var) {
        return NULL;
    }
    orders_stats_payment_order_dto_local_var->id = id;
    orders_stats_payment_order_dto_local_var->date = date;

    return orders_stats_payment_order_dto_local_var;
}


void orders_stats_payment_order_dto_free(orders_stats_payment_order_dto_t *orders_stats_payment_order_dto) {
    if(NULL == orders_stats_payment_order_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_payment_order_dto->id) {
        free(orders_stats_payment_order_dto->id);
        orders_stats_payment_order_dto->id = NULL;
    }
    if (orders_stats_payment_order_dto->date) {
        free(orders_stats_payment_order_dto->date);
        orders_stats_payment_order_dto->date = NULL;
    }
    free(orders_stats_payment_order_dto);
}

cJSON *orders_stats_payment_order_dto_convertToJSON(orders_stats_payment_order_dto_t *orders_stats_payment_order_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_payment_order_dto->id
    if(orders_stats_payment_order_dto->id) {
    if(cJSON_AddStringToObject(item, "id", orders_stats_payment_order_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // orders_stats_payment_order_dto->date
    if(orders_stats_payment_order_dto->date) {
    if(cJSON_AddStringToObject(item, "date", orders_stats_payment_order_dto->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_parseFromJSON(cJSON *orders_stats_payment_order_dtoJSON){

    orders_stats_payment_order_dto_t *orders_stats_payment_order_dto_local_var = NULL;

    // orders_stats_payment_order_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_order_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // orders_stats_payment_order_dto->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(orders_stats_payment_order_dtoJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    orders_stats_payment_order_dto_local_var = orders_stats_payment_order_dto_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        date ? strdup(date->valuestring) : NULL
        );

    return orders_stats_payment_order_dto_local_var;
end:
    return NULL;

}
