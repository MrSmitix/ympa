#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_status_change_delivery_dates_dto.h"



order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_create(
    char *real_delivery_date
    ) {
    order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_local_var = malloc(sizeof(order_status_change_delivery_dates_dto_t));
    if (!order_status_change_delivery_dates_dto_local_var) {
        return NULL;
    }
    order_status_change_delivery_dates_dto_local_var->real_delivery_date = real_delivery_date;

    return order_status_change_delivery_dates_dto_local_var;
}


void order_status_change_delivery_dates_dto_free(order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto) {
    if(NULL == order_status_change_delivery_dates_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_status_change_delivery_dates_dto->real_delivery_date) {
        free(order_status_change_delivery_dates_dto->real_delivery_date);
        order_status_change_delivery_dates_dto->real_delivery_date = NULL;
    }
    free(order_status_change_delivery_dates_dto);
}

cJSON *order_status_change_delivery_dates_dto_convertToJSON(order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_status_change_delivery_dates_dto->real_delivery_date
    if(order_status_change_delivery_dates_dto->real_delivery_date) {
    if(cJSON_AddStringToObject(item, "realDeliveryDate", order_status_change_delivery_dates_dto->real_delivery_date) == NULL) {
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

order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_parseFromJSON(cJSON *order_status_change_delivery_dates_dtoJSON){

    order_status_change_delivery_dates_dto_t *order_status_change_delivery_dates_dto_local_var = NULL;

    // order_status_change_delivery_dates_dto->real_delivery_date
    cJSON *real_delivery_date = cJSON_GetObjectItemCaseSensitive(order_status_change_delivery_dates_dtoJSON, "realDeliveryDate");
    if (real_delivery_date) { 
    if(!cJSON_IsString(real_delivery_date))
    {
    goto end; //Date
    }
    }


    order_status_change_delivery_dates_dto_local_var = order_status_change_delivery_dates_dto_create (
        real_delivery_date ? strdup(real_delivery_date->valuestring) : NULL
        );

    return order_status_change_delivery_dates_dto_local_var;
end:
    return NULL;

}
