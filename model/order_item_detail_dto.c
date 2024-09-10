#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_item_detail_dto.h"


char* order_item_detail_dto_item_status_ToString(_api__order_item_detail_dto__e item_status) {
    char* item_statusArray[] =  { "NULL", "REJECTED", "RETURNED" };
    return item_statusArray[item_status];
}

_api__order_item_detail_dto__e order_item_detail_dto_item_status_FromString(char* item_status){
    int stringToReturn = 0;
    char *item_statusArray[] =  { "NULL", "REJECTED", "RETURNED" };
    size_t sizeofArray = sizeof(item_statusArray) / sizeof(item_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_status, item_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

order_item_detail_dto_t *order_item_detail_dto_create(
    long item_count,
    order_item_status_type_t *item_status,
    char *update_date
    ) {
    order_item_detail_dto_t *order_item_detail_dto_local_var = malloc(sizeof(order_item_detail_dto_t));
    if (!order_item_detail_dto_local_var) {
        return NULL;
    }
    order_item_detail_dto_local_var->item_count = item_count;
    order_item_detail_dto_local_var->item_status = item_status;
    order_item_detail_dto_local_var->update_date = update_date;

    return order_item_detail_dto_local_var;
}


void order_item_detail_dto_free(order_item_detail_dto_t *order_item_detail_dto) {
    if(NULL == order_item_detail_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_item_detail_dto->item_status) {
        order_item_status_type_free(order_item_detail_dto->item_status);
        order_item_detail_dto->item_status = NULL;
    }
    if (order_item_detail_dto->update_date) {
        free(order_item_detail_dto->update_date);
        order_item_detail_dto->update_date = NULL;
    }
    free(order_item_detail_dto);
}

cJSON *order_item_detail_dto_convertToJSON(order_item_detail_dto_t *order_item_detail_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_item_detail_dto->item_count
    if(order_item_detail_dto->item_count) {
    if(cJSON_AddNumberToObject(item, "itemCount", order_item_detail_dto->item_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // order_item_detail_dto->item_status
    if(order_item_detail_dto->item_status != _api__order_item_detail_dto__NULL) {
    cJSON *item_status_local_JSON = order_item_status_type_convertToJSON(order_item_detail_dto->item_status);
    if(item_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "itemStatus", item_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // order_item_detail_dto->update_date
    if(order_item_detail_dto->update_date) {
    if(cJSON_AddStringToObject(item, "updateDate", order_item_detail_dto->update_date) == NULL) {
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

order_item_detail_dto_t *order_item_detail_dto_parseFromJSON(cJSON *order_item_detail_dtoJSON){

    order_item_detail_dto_t *order_item_detail_dto_local_var = NULL;

    // define the local variable for order_item_detail_dto->item_status
    order_item_status_type_t *item_status_local_nonprim = NULL;

    // order_item_detail_dto->item_count
    cJSON *item_count = cJSON_GetObjectItemCaseSensitive(order_item_detail_dtoJSON, "itemCount");
    if (item_count) { 
    if(!cJSON_IsNumber(item_count))
    {
    goto end; //Numeric
    }
    }

    // order_item_detail_dto->item_status
    cJSON *item_status = cJSON_GetObjectItemCaseSensitive(order_item_detail_dtoJSON, "itemStatus");
    if (item_status) { 
    item_status_local_nonprim = order_item_status_type_parseFromJSON(item_status); //custom
    }

    // order_item_detail_dto->update_date
    cJSON *update_date = cJSON_GetObjectItemCaseSensitive(order_item_detail_dtoJSON, "updateDate");
    if (update_date) { 
    if(!cJSON_IsString(update_date) && !cJSON_IsNull(update_date))
    {
    goto end; //String
    }
    }


    order_item_detail_dto_local_var = order_item_detail_dto_create (
        item_count ? item_count->valuedouble : 0,
        item_status ? item_status_local_nonprim : NULL,
        update_date && !cJSON_IsNull(update_date) ? strdup(update_date->valuestring) : NULL
        );

    return order_item_detail_dto_local_var;
end:
    if (item_status_local_nonprim) {
        order_item_status_type_free(item_status_local_nonprim);
        item_status_local_nonprim = NULL;
    }
    return NULL;

}
