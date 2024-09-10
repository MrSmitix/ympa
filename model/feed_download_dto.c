#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_download_dto.h"


char* feed_download_dto_status_ToString(_api__feed_download_dto__e status) {
    char* statusArray[] =  { "NULL", "ERROR", "NA", "OK" };
    return statusArray[status];
}

_api__feed_download_dto__e feed_download_dto_status_FromString(char* status){
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

feed_download_dto_t *feed_download_dto_create(
    feed_status_type_t *status,
    feed_download_error_dto_t *error
    ) {
    feed_download_dto_t *feed_download_dto_local_var = malloc(sizeof(feed_download_dto_t));
    if (!feed_download_dto_local_var) {
        return NULL;
    }
    feed_download_dto_local_var->status = status;
    feed_download_dto_local_var->error = error;

    return feed_download_dto_local_var;
}


void feed_download_dto_free(feed_download_dto_t *feed_download_dto) {
    if(NULL == feed_download_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_download_dto->status) {
        feed_status_type_free(feed_download_dto->status);
        feed_download_dto->status = NULL;
    }
    if (feed_download_dto->error) {
        feed_download_error_dto_free(feed_download_dto->error);
        feed_download_dto->error = NULL;
    }
    free(feed_download_dto);
}

cJSON *feed_download_dto_convertToJSON(feed_download_dto_t *feed_download_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_download_dto->status
    if(feed_download_dto->status != _api__feed_download_dto__NULL) {
    cJSON *status_local_JSON = feed_status_type_convertToJSON(feed_download_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_download_dto->error
    if(feed_download_dto->error) {
    cJSON *error_local_JSON = feed_download_error_dto_convertToJSON(feed_download_dto->error);
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

feed_download_dto_t *feed_download_dto_parseFromJSON(cJSON *feed_download_dtoJSON){

    feed_download_dto_t *feed_download_dto_local_var = NULL;

    // define the local variable for feed_download_dto->status
    feed_status_type_t *status_local_nonprim = NULL;

    // define the local variable for feed_download_dto->error
    feed_download_error_dto_t *error_local_nonprim = NULL;

    // feed_download_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feed_download_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = feed_status_type_parseFromJSON(status); //custom
    }

    // feed_download_dto->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(feed_download_dtoJSON, "error");
    if (error) { 
    error_local_nonprim = feed_download_error_dto_parseFromJSON(error); //nonprimitive
    }


    feed_download_dto_local_var = feed_download_dto_create (
        status ? status_local_nonprim : NULL,
        error ? error_local_nonprim : NULL
        );

    return feed_download_dto_local_var;
end:
    if (status_local_nonprim) {
        feed_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (error_local_nonprim) {
        feed_download_error_dto_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
