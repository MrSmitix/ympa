#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_dates_dto.h"



order_delivery_dates_dto_t *order_delivery_dates_dto_create(
    char *from_date,
    char *to_date,
    char *from_time,
    char *to_time,
    char *real_delivery_date
    ) {
    order_delivery_dates_dto_t *order_delivery_dates_dto_local_var = malloc(sizeof(order_delivery_dates_dto_t));
    if (!order_delivery_dates_dto_local_var) {
        return NULL;
    }
    order_delivery_dates_dto_local_var->from_date = from_date;
    order_delivery_dates_dto_local_var->to_date = to_date;
    order_delivery_dates_dto_local_var->from_time = from_time;
    order_delivery_dates_dto_local_var->to_time = to_time;
    order_delivery_dates_dto_local_var->real_delivery_date = real_delivery_date;

    return order_delivery_dates_dto_local_var;
}


void order_delivery_dates_dto_free(order_delivery_dates_dto_t *order_delivery_dates_dto) {
    if(NULL == order_delivery_dates_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_delivery_dates_dto->from_date) {
        free(order_delivery_dates_dto->from_date);
        order_delivery_dates_dto->from_date = NULL;
    }
    if (order_delivery_dates_dto->to_date) {
        free(order_delivery_dates_dto->to_date);
        order_delivery_dates_dto->to_date = NULL;
    }
    if (order_delivery_dates_dto->from_time) {
        free(order_delivery_dates_dto->from_time);
        order_delivery_dates_dto->from_time = NULL;
    }
    if (order_delivery_dates_dto->to_time) {
        free(order_delivery_dates_dto->to_time);
        order_delivery_dates_dto->to_time = NULL;
    }
    if (order_delivery_dates_dto->real_delivery_date) {
        free(order_delivery_dates_dto->real_delivery_date);
        order_delivery_dates_dto->real_delivery_date = NULL;
    }
    free(order_delivery_dates_dto);
}

cJSON *order_delivery_dates_dto_convertToJSON(order_delivery_dates_dto_t *order_delivery_dates_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_delivery_dates_dto->from_date
    if(order_delivery_dates_dto->from_date) {
    if(cJSON_AddStringToObject(item, "fromDate", order_delivery_dates_dto->from_date) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dates_dto->to_date
    if(order_delivery_dates_dto->to_date) {
    if(cJSON_AddStringToObject(item, "toDate", order_delivery_dates_dto->to_date) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dates_dto->from_time
    if(order_delivery_dates_dto->from_time) {
    if(cJSON_AddStringToObject(item, "fromTime", order_delivery_dates_dto->from_time) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dates_dto->to_time
    if(order_delivery_dates_dto->to_time) {
    if(cJSON_AddStringToObject(item, "toTime", order_delivery_dates_dto->to_time) == NULL) {
    goto fail; //String
    }
    }


    // order_delivery_dates_dto->real_delivery_date
    if(order_delivery_dates_dto->real_delivery_date) {
    if(cJSON_AddStringToObject(item, "realDeliveryDate", order_delivery_dates_dto->real_delivery_date) == NULL) {
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

order_delivery_dates_dto_t *order_delivery_dates_dto_parseFromJSON(cJSON *order_delivery_dates_dtoJSON){

    order_delivery_dates_dto_t *order_delivery_dates_dto_local_var = NULL;

    // order_delivery_dates_dto->from_date
    cJSON *from_date = cJSON_GetObjectItemCaseSensitive(order_delivery_dates_dtoJSON, "fromDate");
    if (from_date) { 
    if(!cJSON_IsString(from_date) && !cJSON_IsNull(from_date))
    {
    goto end; //String
    }
    }

    // order_delivery_dates_dto->to_date
    cJSON *to_date = cJSON_GetObjectItemCaseSensitive(order_delivery_dates_dtoJSON, "toDate");
    if (to_date) { 
    if(!cJSON_IsString(to_date) && !cJSON_IsNull(to_date))
    {
    goto end; //String
    }
    }

    // order_delivery_dates_dto->from_time
    cJSON *from_time = cJSON_GetObjectItemCaseSensitive(order_delivery_dates_dtoJSON, "fromTime");
    if (from_time) { 
    if(!cJSON_IsString(from_time) && !cJSON_IsNull(from_time))
    {
    goto end; //String
    }
    }

    // order_delivery_dates_dto->to_time
    cJSON *to_time = cJSON_GetObjectItemCaseSensitive(order_delivery_dates_dtoJSON, "toTime");
    if (to_time) { 
    if(!cJSON_IsString(to_time) && !cJSON_IsNull(to_time))
    {
    goto end; //String
    }
    }

    // order_delivery_dates_dto->real_delivery_date
    cJSON *real_delivery_date = cJSON_GetObjectItemCaseSensitive(order_delivery_dates_dtoJSON, "realDeliveryDate");
    if (real_delivery_date) { 
    if(!cJSON_IsString(real_delivery_date) && !cJSON_IsNull(real_delivery_date))
    {
    goto end; //String
    }
    }


    order_delivery_dates_dto_local_var = order_delivery_dates_dto_create (
        from_date && !cJSON_IsNull(from_date) ? strdup(from_date->valuestring) : NULL,
        to_date && !cJSON_IsNull(to_date) ? strdup(to_date->valuestring) : NULL,
        from_time && !cJSON_IsNull(from_time) ? strdup(from_time->valuestring) : NULL,
        to_time && !cJSON_IsNull(to_time) ? strdup(to_time->valuestring) : NULL,
        real_delivery_date && !cJSON_IsNull(real_delivery_date) ? strdup(real_delivery_date->valuestring) : NULL
        );

    return order_delivery_dates_dto_local_var;
end:
    return NULL;

}
