#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_record_dto.h"


char* feed_index_logs_record_dto_index_type_ToString(_api__feed_index_logs_record_dto__e index_type) {
    char* index_typeArray[] =  { "NULL", "DIFF", "FAST_PRICE", "FULL" };
    return index_typeArray[index_type];
}

_api__feed_index_logs_record_dto__e feed_index_logs_record_dto_index_type_FromString(char* index_type){
    int stringToReturn = 0;
    char *index_typeArray[] =  { "NULL", "DIFF", "FAST_PRICE", "FULL" };
    size_t sizeofArray = sizeof(index_typeArray) / sizeof(index_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(index_type, index_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* feed_index_logs_record_dto_status_ToString(_api__feed_index_logs_record_dto__e status) {
    char* statusArray[] =  { "NULL", "ERROR", "OK", "WARNING" };
    return statusArray[status];
}

_api__feed_index_logs_record_dto__e feed_index_logs_record_dto_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ERROR", "OK", "WARNING" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feed_index_logs_record_dto_t *feed_index_logs_record_dto_create(
    char *download_time,
    char *file_time,
    long generation_id,
    feed_index_logs_index_type_t *index_type,
    char *published_time,
    feed_index_logs_status_type_t *status,
    feed_index_logs_error_dto_t *error,
    feed_index_logs_offers_dto_t *offers
    ) {
    feed_index_logs_record_dto_t *feed_index_logs_record_dto_local_var = malloc(sizeof(feed_index_logs_record_dto_t));
    if (!feed_index_logs_record_dto_local_var) {
        return NULL;
    }
    feed_index_logs_record_dto_local_var->download_time = download_time;
    feed_index_logs_record_dto_local_var->file_time = file_time;
    feed_index_logs_record_dto_local_var->generation_id = generation_id;
    feed_index_logs_record_dto_local_var->index_type = index_type;
    feed_index_logs_record_dto_local_var->published_time = published_time;
    feed_index_logs_record_dto_local_var->status = status;
    feed_index_logs_record_dto_local_var->error = error;
    feed_index_logs_record_dto_local_var->offers = offers;

    return feed_index_logs_record_dto_local_var;
}


void feed_index_logs_record_dto_free(feed_index_logs_record_dto_t *feed_index_logs_record_dto) {
    if(NULL == feed_index_logs_record_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_index_logs_record_dto->download_time) {
        free(feed_index_logs_record_dto->download_time);
        feed_index_logs_record_dto->download_time = NULL;
    }
    if (feed_index_logs_record_dto->file_time) {
        free(feed_index_logs_record_dto->file_time);
        feed_index_logs_record_dto->file_time = NULL;
    }
    if (feed_index_logs_record_dto->index_type) {
        feed_index_logs_index_type_free(feed_index_logs_record_dto->index_type);
        feed_index_logs_record_dto->index_type = NULL;
    }
    if (feed_index_logs_record_dto->published_time) {
        free(feed_index_logs_record_dto->published_time);
        feed_index_logs_record_dto->published_time = NULL;
    }
    if (feed_index_logs_record_dto->status) {
        feed_index_logs_status_type_free(feed_index_logs_record_dto->status);
        feed_index_logs_record_dto->status = NULL;
    }
    if (feed_index_logs_record_dto->error) {
        feed_index_logs_error_dto_free(feed_index_logs_record_dto->error);
        feed_index_logs_record_dto->error = NULL;
    }
    if (feed_index_logs_record_dto->offers) {
        feed_index_logs_offers_dto_free(feed_index_logs_record_dto->offers);
        feed_index_logs_record_dto->offers = NULL;
    }
    free(feed_index_logs_record_dto);
}

cJSON *feed_index_logs_record_dto_convertToJSON(feed_index_logs_record_dto_t *feed_index_logs_record_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_index_logs_record_dto->download_time
    if(feed_index_logs_record_dto->download_time) {
    if(cJSON_AddStringToObject(item, "downloadTime", feed_index_logs_record_dto->download_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feed_index_logs_record_dto->file_time
    if(feed_index_logs_record_dto->file_time) {
    if(cJSON_AddStringToObject(item, "fileTime", feed_index_logs_record_dto->file_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feed_index_logs_record_dto->generation_id
    if(feed_index_logs_record_dto->generation_id) {
    if(cJSON_AddNumberToObject(item, "generationId", feed_index_logs_record_dto->generation_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_index_logs_record_dto->index_type
    if(feed_index_logs_record_dto->index_type != _api__feed_index_logs_record_dto__NULL) {
    cJSON *index_type_local_JSON = feed_index_logs_index_type_convertToJSON(feed_index_logs_record_dto->index_type);
    if(index_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "indexType", index_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_index_logs_record_dto->published_time
    if(feed_index_logs_record_dto->published_time) {
    if(cJSON_AddStringToObject(item, "publishedTime", feed_index_logs_record_dto->published_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feed_index_logs_record_dto->status
    if(feed_index_logs_record_dto->status != _api__feed_index_logs_record_dto__NULL) {
    cJSON *status_local_JSON = feed_index_logs_status_type_convertToJSON(feed_index_logs_record_dto->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_index_logs_record_dto->error
    if(feed_index_logs_record_dto->error) {
    cJSON *error_local_JSON = feed_index_logs_error_dto_convertToJSON(feed_index_logs_record_dto->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_index_logs_record_dto->offers
    if(feed_index_logs_record_dto->offers) {
    cJSON *offers_local_JSON = feed_index_logs_offers_dto_convertToJSON(feed_index_logs_record_dto->offers);
    if(offers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offers", offers_local_JSON);
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

feed_index_logs_record_dto_t *feed_index_logs_record_dto_parseFromJSON(cJSON *feed_index_logs_record_dtoJSON){

    feed_index_logs_record_dto_t *feed_index_logs_record_dto_local_var = NULL;

    // define the local variable for feed_index_logs_record_dto->index_type
    feed_index_logs_index_type_t *index_type_local_nonprim = NULL;

    // define the local variable for feed_index_logs_record_dto->status
    feed_index_logs_status_type_t *status_local_nonprim = NULL;

    // define the local variable for feed_index_logs_record_dto->error
    feed_index_logs_error_dto_t *error_local_nonprim = NULL;

    // define the local variable for feed_index_logs_record_dto->offers
    feed_index_logs_offers_dto_t *offers_local_nonprim = NULL;

    // feed_index_logs_record_dto->download_time
    cJSON *download_time = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "downloadTime");
    if (download_time) { 
    if(!cJSON_IsString(download_time) && !cJSON_IsNull(download_time))
    {
    goto end; //DateTime
    }
    }

    // feed_index_logs_record_dto->file_time
    cJSON *file_time = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "fileTime");
    if (file_time) { 
    if(!cJSON_IsString(file_time) && !cJSON_IsNull(file_time))
    {
    goto end; //DateTime
    }
    }

    // feed_index_logs_record_dto->generation_id
    cJSON *generation_id = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "generationId");
    if (generation_id) { 
    if(!cJSON_IsNumber(generation_id))
    {
    goto end; //Numeric
    }
    }

    // feed_index_logs_record_dto->index_type
    cJSON *index_type = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "indexType");
    if (index_type) { 
    index_type_local_nonprim = feed_index_logs_index_type_parseFromJSON(index_type); //custom
    }

    // feed_index_logs_record_dto->published_time
    cJSON *published_time = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "publishedTime");
    if (published_time) { 
    if(!cJSON_IsString(published_time) && !cJSON_IsNull(published_time))
    {
    goto end; //DateTime
    }
    }

    // feed_index_logs_record_dto->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "status");
    if (status) { 
    status_local_nonprim = feed_index_logs_status_type_parseFromJSON(status); //custom
    }

    // feed_index_logs_record_dto->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "error");
    if (error) { 
    error_local_nonprim = feed_index_logs_error_dto_parseFromJSON(error); //nonprimitive
    }

    // feed_index_logs_record_dto->offers
    cJSON *offers = cJSON_GetObjectItemCaseSensitive(feed_index_logs_record_dtoJSON, "offers");
    if (offers) { 
    offers_local_nonprim = feed_index_logs_offers_dto_parseFromJSON(offers); //nonprimitive
    }


    feed_index_logs_record_dto_local_var = feed_index_logs_record_dto_create (
        download_time && !cJSON_IsNull(download_time) ? strdup(download_time->valuestring) : NULL,
        file_time && !cJSON_IsNull(file_time) ? strdup(file_time->valuestring) : NULL,
        generation_id ? generation_id->valuedouble : 0,
        index_type ? index_type_local_nonprim : NULL,
        published_time && !cJSON_IsNull(published_time) ? strdup(published_time->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        error ? error_local_nonprim : NULL,
        offers ? offers_local_nonprim : NULL
        );

    return feed_index_logs_record_dto_local_var;
end:
    if (index_type_local_nonprim) {
        feed_index_logs_index_type_free(index_type_local_nonprim);
        index_type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        feed_index_logs_status_type_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (error_local_nonprim) {
        feed_index_logs_error_dto_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    if (offers_local_nonprim) {
        feed_index_logs_offers_dto_free(offers_local_nonprim);
        offers_local_nonprim = NULL;
    }
    return NULL;

}
