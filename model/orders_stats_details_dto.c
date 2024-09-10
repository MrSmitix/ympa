#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "orders_stats_details_dto.h"


char* orders_stats_details_dto_item_status_ToString(_api__orders_stats_details_dto__e item_status) {
    char* item_statusArray[] =  { "NULL", "REJECTED", "RETURNED" };
    return item_statusArray[item_status];
}

_api__orders_stats_details_dto__e orders_stats_details_dto_item_status_FromString(char* item_status){
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
char* orders_stats_details_dto_stock_type_ToString(_api__orders_stats_details_dto__e stock_type) {
    char* stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    return stock_typeArray[stock_type];
}

_api__orders_stats_details_dto__e orders_stats_details_dto_stock_type_FromString(char* stock_type){
    int stringToReturn = 0;
    char *stock_typeArray[] =  { "NULL", "FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED" };
    size_t sizeofArray = sizeof(stock_typeArray) / sizeof(stock_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(stock_type, stock_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

orders_stats_details_dto_t *orders_stats_details_dto_create(
    orders_stats_item_status_type_t *item_status,
    long item_count,
    char *update_date,
    orders_stats_stock_type_t *stock_type
    ) {
    orders_stats_details_dto_t *orders_stats_details_dto_local_var = malloc(sizeof(orders_stats_details_dto_t));
    if (!orders_stats_details_dto_local_var) {
        return NULL;
    }
    orders_stats_details_dto_local_var->item_status = item_status;
    orders_stats_details_dto_local_var->item_count = item_count;
    orders_stats_details_dto_local_var->update_date = update_date;
    orders_stats_details_dto_local_var->stock_type = stock_type;

    return orders_stats_details_dto_local_var;
}


void orders_stats_details_dto_free(orders_stats_details_dto_t *orders_stats_details_dto) {
    if(NULL == orders_stats_details_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (orders_stats_details_dto->item_status) {
        orders_stats_item_status_type_free(orders_stats_details_dto->item_status);
        orders_stats_details_dto->item_status = NULL;
    }
    if (orders_stats_details_dto->update_date) {
        free(orders_stats_details_dto->update_date);
        orders_stats_details_dto->update_date = NULL;
    }
    if (orders_stats_details_dto->stock_type) {
        orders_stats_stock_type_free(orders_stats_details_dto->stock_type);
        orders_stats_details_dto->stock_type = NULL;
    }
    free(orders_stats_details_dto);
}

cJSON *orders_stats_details_dto_convertToJSON(orders_stats_details_dto_t *orders_stats_details_dto) {
    cJSON *item = cJSON_CreateObject();

    // orders_stats_details_dto->item_status
    if(orders_stats_details_dto->item_status != _api__orders_stats_details_dto__NULL) {
    cJSON *item_status_local_JSON = orders_stats_item_status_type_convertToJSON(orders_stats_details_dto->item_status);
    if(item_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "itemStatus", item_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // orders_stats_details_dto->item_count
    if(orders_stats_details_dto->item_count) {
    if(cJSON_AddNumberToObject(item, "itemCount", orders_stats_details_dto->item_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // orders_stats_details_dto->update_date
    if(orders_stats_details_dto->update_date) {
    if(cJSON_AddStringToObject(item, "updateDate", orders_stats_details_dto->update_date) == NULL) {
    goto fail; //Date
    }
    }


    // orders_stats_details_dto->stock_type
    if(orders_stats_details_dto->stock_type != _api__orders_stats_details_dto__NULL) {
    cJSON *stock_type_local_JSON = orders_stats_stock_type_convertToJSON(orders_stats_details_dto->stock_type);
    if(stock_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "stockType", stock_type_local_JSON);
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

orders_stats_details_dto_t *orders_stats_details_dto_parseFromJSON(cJSON *orders_stats_details_dtoJSON){

    orders_stats_details_dto_t *orders_stats_details_dto_local_var = NULL;

    // define the local variable for orders_stats_details_dto->item_status
    orders_stats_item_status_type_t *item_status_local_nonprim = NULL;

    // define the local variable for orders_stats_details_dto->stock_type
    orders_stats_stock_type_t *stock_type_local_nonprim = NULL;

    // orders_stats_details_dto->item_status
    cJSON *item_status = cJSON_GetObjectItemCaseSensitive(orders_stats_details_dtoJSON, "itemStatus");
    if (item_status) { 
    item_status_local_nonprim = orders_stats_item_status_type_parseFromJSON(item_status); //custom
    }

    // orders_stats_details_dto->item_count
    cJSON *item_count = cJSON_GetObjectItemCaseSensitive(orders_stats_details_dtoJSON, "itemCount");
    if (item_count) { 
    if(!cJSON_IsNumber(item_count))
    {
    goto end; //Numeric
    }
    }

    // orders_stats_details_dto->update_date
    cJSON *update_date = cJSON_GetObjectItemCaseSensitive(orders_stats_details_dtoJSON, "updateDate");
    if (update_date) { 
    if(!cJSON_IsString(update_date))
    {
    goto end; //Date
    }
    }

    // orders_stats_details_dto->stock_type
    cJSON *stock_type = cJSON_GetObjectItemCaseSensitive(orders_stats_details_dtoJSON, "stockType");
    if (stock_type) { 
    stock_type_local_nonprim = orders_stats_stock_type_parseFromJSON(stock_type); //custom
    }


    orders_stats_details_dto_local_var = orders_stats_details_dto_create (
        item_status ? item_status_local_nonprim : NULL,
        item_count ? item_count->valuedouble : 0,
        update_date ? strdup(update_date->valuestring) : NULL,
        stock_type ? stock_type_local_nonprim : NULL
        );

    return orders_stats_details_dto_local_var;
end:
    if (item_status_local_nonprim) {
        orders_stats_item_status_type_free(item_status_local_nonprim);
        item_status_local_nonprim = NULL;
    }
    if (stock_type_local_nonprim) {
        orders_stats_stock_type_free(stock_type_local_nonprim);
        stock_type_local_nonprim = NULL;
    }
    return NULL;

}
