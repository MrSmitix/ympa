#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_status_change_delivery_dto.h"



order_status_change_delivery_dto_t *order_status_change_delivery_dto_create(
    order_status_change_delivery_dates_dto_t *dates
    ) {
    order_status_change_delivery_dto_t *order_status_change_delivery_dto_local_var = malloc(sizeof(order_status_change_delivery_dto_t));
    if (!order_status_change_delivery_dto_local_var) {
        return NULL;
    }
    order_status_change_delivery_dto_local_var->dates = dates;

    return order_status_change_delivery_dto_local_var;
}


void order_status_change_delivery_dto_free(order_status_change_delivery_dto_t *order_status_change_delivery_dto) {
    if(NULL == order_status_change_delivery_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_status_change_delivery_dto->dates) {
        order_status_change_delivery_dates_dto_free(order_status_change_delivery_dto->dates);
        order_status_change_delivery_dto->dates = NULL;
    }
    free(order_status_change_delivery_dto);
}

cJSON *order_status_change_delivery_dto_convertToJSON(order_status_change_delivery_dto_t *order_status_change_delivery_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_status_change_delivery_dto->dates
    if(order_status_change_delivery_dto->dates) {
    cJSON *dates_local_JSON = order_status_change_delivery_dates_dto_convertToJSON(order_status_change_delivery_dto->dates);
    if(dates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dates", dates_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_status_change_delivery_dto_t *order_status_change_delivery_dto_parseFromJSON(cJSON *order_status_change_delivery_dtoJSON){

    order_status_change_delivery_dto_t *order_status_change_delivery_dto_local_var = NULL;

    // define the local variable for order_status_change_delivery_dto->dates
    order_status_change_delivery_dates_dto_t *dates_local_nonprim = NULL;

    // order_status_change_delivery_dto->dates
    cJSON *dates = cJSON_GetObjectItemCaseSensitive(order_status_change_delivery_dtoJSON, "dates");
    if (dates) { 
    dates_local_nonprim = order_status_change_delivery_dates_dto_parseFromJSON(dates); //nonprimitive
    }


    order_status_change_delivery_dto_local_var = order_status_change_delivery_dto_create (
        dates ? dates_local_nonprim : NULL
        );

    return order_status_change_delivery_dto_local_var;
end:
    if (dates_local_nonprim) {
        order_status_change_delivery_dates_dto_free(dates_local_nonprim);
        dates_local_nonprim = NULL;
    }
    return NULL;

}
