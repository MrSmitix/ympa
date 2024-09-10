#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_delivery_date_dto.h"



order_delivery_date_dto_t *order_delivery_date_dto_create(
    char *to_date
    ) {
    order_delivery_date_dto_t *order_delivery_date_dto_local_var = malloc(sizeof(order_delivery_date_dto_t));
    if (!order_delivery_date_dto_local_var) {
        return NULL;
    }
    order_delivery_date_dto_local_var->to_date = to_date;

    return order_delivery_date_dto_local_var;
}


void order_delivery_date_dto_free(order_delivery_date_dto_t *order_delivery_date_dto) {
    if(NULL == order_delivery_date_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_delivery_date_dto->to_date) {
        free(order_delivery_date_dto->to_date);
        order_delivery_date_dto->to_date = NULL;
    }
    free(order_delivery_date_dto);
}

cJSON *order_delivery_date_dto_convertToJSON(order_delivery_date_dto_t *order_delivery_date_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_delivery_date_dto->to_date
    if (!order_delivery_date_dto->to_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "toDate", order_delivery_date_dto->to_date) == NULL) {
    goto fail; //Date
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_delivery_date_dto_t *order_delivery_date_dto_parseFromJSON(cJSON *order_delivery_date_dtoJSON){

    order_delivery_date_dto_t *order_delivery_date_dto_local_var = NULL;

    // order_delivery_date_dto->to_date
    cJSON *to_date = cJSON_GetObjectItemCaseSensitive(order_delivery_date_dtoJSON, "toDate");
    if (!to_date) {
        goto end;
    }

    
    if(!cJSON_IsString(to_date))
    {
    goto end; //Date
    }


    order_delivery_date_dto_local_var = order_delivery_date_dto_create (
        strdup(to_date->valuestring)
        );

    return order_delivery_date_dto_local_var;
end:
    return NULL;

}
