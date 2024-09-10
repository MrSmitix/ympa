#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_publication_dto.h"


char* feed_publication_dto_status_ToString(_api__feed_publication_dto__e status) {
    char* statusArray[] =  { "NULL", "ERROR", "NA", "OK" };
    return statusArray[status];
}

_api__feed_publication_dto__e feed_publication_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ERROR", "NA", "OK" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feed_publication_dto_t *feed_publication_dto_create(
    feed_status_type_t *status,
    feed_publication_full_dto_t *full,
    feed_publication_price_and_stock_update_dto_t *price_and_stock_update
    ) {
    feed_publication_dto_t *feed_publication_dto_local_var = malloc(sizeof(feed_publication_dto_t));
    if (!feed_publication_dto_local_var) {
        return NULL;
    }
    feed_publication_dto_local_var->status = status;
    feed_publication_dto_local_var->full = full;
    feed_publication_dto_local_var->price_and_stock_update = price_and_stock_update;

    return feed_publication_dto_local_var;
}


void feed_publication_dto_free(feed_publication_dto_t *feed_publication_dto) {
    if(NULL == feed_publication_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_publication_dto->status) {
        feed_status_type_free(feed_publication_dto->status);
        feed_publication_dto->status = NULL;
    }
    if (feed_publication_dto->full) {
        feed_publication_full_dto_free(feed_publication_dto->full);
        feed_publication_dto->full = NULL;
    }
    if (feed_publication_dto->price_and_stock_update) {
        feed_publication_price_and_stock_update_dto_free(feed_publication_dto->price_and_stock_update);
        feed_publication_dto->price_and_stock_update = NULL;
    }
    free(feed_publication_dto);
}

cJSON *feed_publication_dto_convertToJSON(feed_publication_dto_t *feed_publication_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_publication_dto->status
    if(feed_publication_dto->status != _api__feed_publication_dto__NULL) {
    cJSON *status_local_JSON = feed_status_type_convertToJSON(feed_publication_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_publication_dto->full
    if(feed_publication_dto->full) {
    cJSON *full_local_JSON = feed_publication_full_dto_convertToJSON(feed_publication_dto->full);
    if(full_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "full", full_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_publication_dto->price_and_stock_update
    if(feed_publication_dto->price_and_stock_update) {
    cJSON *price_and_stock_update_local_JSON = feed_publication_price_and_stock_update_dto_convertToJSON(feed_publication_dto->price_and_stock_update);
    if(price_and_stock_update_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priceAndStockUpdate", price_and_stock_update_local_JSON);
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

feed_publication_dto_t *feed_publication_dto_parseFromJSON(cJSON *feed_publication_dtoJSON){

    feed_publication_dto_t *feed_publication_dto_local_var = NULL;

    // define the local variable for feed_publication_dto->status
    feed_status_type_t *status_local_nonprim = NULL;

    // define the local variable for feed_publication_dto->full
    feed_publication_full_dto_t *full_local_nonprim = NULL;

    // define the local variable for feed_publication_dto->price_and_stock_update
    feed_publication_price_and_stock_update_dto_t *price_and_stock_update_local_nonprim = NULL;

    // feed_publication_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feed_publication_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = feed_status_type_parseFromJSON(status); //custom
    }

    // feed_publication_dto->full
    cJSON *full = cJSON_GetObjectItemCaseSensitive(feed_publication_dtoJSON, "full");
    if (full) { 
    full_local_nonprim = feed_publication_full_dto_parseFromJSON(full); //nonprimitive
    }

    // feed_publication_dto->price_and_stock_update
    cJSON *price_and_stock_update = cJSON_GetObjectItemCaseSensitive(feed_publication_dtoJSON, "priceAndStockUpdate");
    if (price_and_stock_update) { 
    price_and_stock_update_local_nonprim = feed_publication_price_and_stock_update_dto_parseFromJSON(price_and_stock_update); //nonprimitive
    }


    feed_publication_dto_local_var = feed_publication_dto_create (
        status ? status_local_nonprim : NULL,
        full ? full_local_nonprim : NULL,
        price_and_stock_update ? price_and_stock_update_local_nonprim : NULL
        );

    return feed_publication_dto_local_var;
end:
    if (status_local_nonprim) {
        feed_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (full_local_nonprim) {
        feed_publication_full_dto_free(full_local_nonprim);
        full_local_nonprim = NULL;
    }
    if (price_and_stock_update_local_nonprim) {
        feed_publication_price_and_stock_update_dto_free(price_and_stock_update_local_nonprim);
        price_and_stock_update_local_nonprim = NULL;
    }
    return NULL;

}
