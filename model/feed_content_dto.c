#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_content_dto.h"


char* feed_content_dto_status_ToString(_api__feed_content_dto__e status) {
    char* statusArray[] =  { "NULL", "ERROR", "NA", "OK" };
    return statusArray[status];
}

_api__feed_content_dto__e feed_content_dto_status_FromString(char* status){
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

feed_content_dto_t *feed_content_dto_create(
    long rejected_offers_count,
    feed_status_type_t *status,
    long total_offers_count,
    feed_content_error_dto_t *error
    ) {
    feed_content_dto_t *feed_content_dto_local_var = malloc(sizeof(feed_content_dto_t));
    if (!feed_content_dto_local_var) {
        return NULL;
    }
    feed_content_dto_local_var->rejected_offers_count = rejected_offers_count;
    feed_content_dto_local_var->status = status;
    feed_content_dto_local_var->total_offers_count = total_offers_count;
    feed_content_dto_local_var->error = error;

    return feed_content_dto_local_var;
}


void feed_content_dto_free(feed_content_dto_t *feed_content_dto) {
    if(NULL == feed_content_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_content_dto->status) {
        feed_status_type_free(feed_content_dto->status);
        feed_content_dto->status = NULL;
    }
    if (feed_content_dto->error) {
        feed_content_error_dto_free(feed_content_dto->error);
        feed_content_dto->error = NULL;
    }
    free(feed_content_dto);
}

cJSON *feed_content_dto_convertToJSON(feed_content_dto_t *feed_content_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_content_dto->rejected_offers_count
    if(feed_content_dto->rejected_offers_count) {
    if(cJSON_AddNumberToObject(item, "rejectedOffersCount", feed_content_dto->rejected_offers_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_content_dto->status
    if(feed_content_dto->status != _api__feed_content_dto__NULL) {
    cJSON *status_local_JSON = feed_status_type_convertToJSON(feed_content_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_content_dto->total_offers_count
    if(feed_content_dto->total_offers_count) {
    if(cJSON_AddNumberToObject(item, "totalOffersCount", feed_content_dto->total_offers_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_content_dto->error
    if(feed_content_dto->error) {
    cJSON *error_local_JSON = feed_content_error_dto_convertToJSON(feed_content_dto->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
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

feed_content_dto_t *feed_content_dto_parseFromJSON(cJSON *feed_content_dtoJSON){

    feed_content_dto_t *feed_content_dto_local_var = NULL;

    // define the local variable for feed_content_dto->status
    feed_status_type_t *status_local_nonprim = NULL;

    // define the local variable for feed_content_dto->error
    feed_content_error_dto_t *error_local_nonprim = NULL;

    // feed_content_dto->rejected_offers_count
    cJSON *rejected_offers_count = cJSON_GetObjectItemCaseSensitive(feed_content_dtoJSON, "rejectedOffersCount");
    if (rejected_offers_count) { 
    if(!cJSON_IsNumber(rejected_offers_count))
    {
    goto end; //Numeric
    }
    }

    // feed_content_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feed_content_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = feed_status_type_parseFromJSON(status); //custom
    }

    // feed_content_dto->total_offers_count
    cJSON *total_offers_count = cJSON_GetObjectItemCaseSensitive(feed_content_dtoJSON, "totalOffersCount");
    if (total_offers_count) { 
    if(!cJSON_IsNumber(total_offers_count))
    {
    goto end; //Numeric
    }
    }

    // feed_content_dto->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(feed_content_dtoJSON, "error");
    if (error) { 
    error_local_nonprim = feed_content_error_dto_parseFromJSON(error); //nonprimitive
    }


    feed_content_dto_local_var = feed_content_dto_create (
        rejected_offers_count ? rejected_offers_count->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        total_offers_count ? total_offers_count->valuedouble : 0,
        error ? error_local_nonprim : NULL
        );

    return feed_content_dto_local_var;
end:
    if (status_local_nonprim) {
        feed_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (error_local_nonprim) {
        feed_content_error_dto_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
