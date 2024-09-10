#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_placement_dto.h"


char* feed_placement_dto_status_ToString(_api__feed_placement_dto__e status) {
    char* statusArray[] =  { "NULL", "ERROR", "NA", "OK" };
    return statusArray[status];
}

_api__feed_placement_dto__e feed_placement_dto_status_FromString(char* status){
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

feed_placement_dto_t *feed_placement_dto_create(
    feed_status_type_t *status,
    int total_offers_count
    ) {
    feed_placement_dto_t *feed_placement_dto_local_var = malloc(sizeof(feed_placement_dto_t));
    if (!feed_placement_dto_local_var) {
        return NULL;
    }
    feed_placement_dto_local_var->status = status;
    feed_placement_dto_local_var->total_offers_count = total_offers_count;

    return feed_placement_dto_local_var;
}


void feed_placement_dto_free(feed_placement_dto_t *feed_placement_dto) {
    if(NULL == feed_placement_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_placement_dto->status) {
        feed_status_type_free(feed_placement_dto->status);
        feed_placement_dto->status = NULL;
    }
    free(feed_placement_dto);
}

cJSON *feed_placement_dto_convertToJSON(feed_placement_dto_t *feed_placement_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_placement_dto->status
    if(feed_placement_dto->status != _api__feed_placement_dto__NULL) {
    cJSON *status_local_JSON = feed_status_type_convertToJSON(feed_placement_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_placement_dto->total_offers_count
    if(feed_placement_dto->total_offers_count) {
    if(cJSON_AddNumberToObject(item, "totalOffersCount", feed_placement_dto->total_offers_count) == NULL) {
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

feed_placement_dto_t *feed_placement_dto_parseFromJSON(cJSON *feed_placement_dtoJSON){

    feed_placement_dto_t *feed_placement_dto_local_var = NULL;

    // define the local variable for feed_placement_dto->status
    feed_status_type_t *status_local_nonprim = NULL;

    // feed_placement_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feed_placement_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = feed_status_type_parseFromJSON(status); //custom
    }

    // feed_placement_dto->total_offers_count
    cJSON *total_offers_count = cJSON_GetObjectItemCaseSensitive(feed_placement_dtoJSON, "totalOffersCount");
    if (total_offers_count) { 
    if(!cJSON_IsNumber(total_offers_count))
    {
    goto end; //Numeric
    }
    }


    feed_placement_dto_local_var = feed_placement_dto_create (
        status ? status_local_nonprim : NULL,
        total_offers_count ? total_offers_count->valuedouble : 0
        );

    return feed_placement_dto_local_var;
end:
    if (status_local_nonprim) {
        feed_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
