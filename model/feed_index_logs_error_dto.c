#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_error_dto.h"


char* feed_index_logs_error_dto_type_ToString(_api__feed_index_logs_error_dto__e type) {
    char* typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS", "NOT_INDEXED" };
    return typeArray[type];
}

_api__feed_index_logs_error_dto__e feed_index_logs_error_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS", "NOT_INDEXED" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feed_index_logs_error_dto_t *feed_index_logs_error_dto_create(
    int http_status_code,
    feed_index_logs_error_type_t *type,
    char *description
    ) {
    feed_index_logs_error_dto_t *feed_index_logs_error_dto_local_var = malloc(sizeof(feed_index_logs_error_dto_t));
    if (!feed_index_logs_error_dto_local_var) {
        return NULL;
    }
    feed_index_logs_error_dto_local_var->http_status_code = http_status_code;
    feed_index_logs_error_dto_local_var->type = type;
    feed_index_logs_error_dto_local_var->description = description;

    return feed_index_logs_error_dto_local_var;
}


void feed_index_logs_error_dto_free(feed_index_logs_error_dto_t *feed_index_logs_error_dto) {
    if(NULL == feed_index_logs_error_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_index_logs_error_dto->type) {
        feed_index_logs_error_type_free(feed_index_logs_error_dto->type);
        feed_index_logs_error_dto->type = NULL;
    }
    if (feed_index_logs_error_dto->description) {
        free(feed_index_logs_error_dto->description);
        feed_index_logs_error_dto->description = NULL;
    }
    free(feed_index_logs_error_dto);
}

cJSON *feed_index_logs_error_dto_convertToJSON(feed_index_logs_error_dto_t *feed_index_logs_error_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_index_logs_error_dto->http_status_code
    if(feed_index_logs_error_dto->http_status_code) {
    if(cJSON_AddNumberToObject(item, "httpStatusCode", feed_index_logs_error_dto->http_status_code) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_index_logs_error_dto->type
    if(feed_index_logs_error_dto->type != _api__feed_index_logs_error_dto__NULL) {
    cJSON *type_local_JSON = feed_index_logs_error_type_convertToJSON(feed_index_logs_error_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feed_index_logs_error_dto->description
    if(feed_index_logs_error_dto->description) {
    if(cJSON_AddStringToObject(item, "description", feed_index_logs_error_dto->description) == NULL) {
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

feed_index_logs_error_dto_t *feed_index_logs_error_dto_parseFromJSON(cJSON *feed_index_logs_error_dtoJSON){

    feed_index_logs_error_dto_t *feed_index_logs_error_dto_local_var = NULL;

    // define the local variable for feed_index_logs_error_dto->type
    feed_index_logs_error_type_t *type_local_nonprim = NULL;

    // feed_index_logs_error_dto->http_status_code
    cJSON *http_status_code = cJSON_GetObjectItemCaseSensitive(feed_index_logs_error_dtoJSON, "httpStatusCode");
    if (http_status_code) { 
    if(!cJSON_IsNumber(http_status_code))
    {
    goto end; //Numeric
    }
    }

    // feed_index_logs_error_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(feed_index_logs_error_dtoJSON, "type");
    if (type) { 
    type_local_nonprim = feed_index_logs_error_type_parseFromJSON(type); //custom
    }

    // feed_index_logs_error_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(feed_index_logs_error_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    feed_index_logs_error_dto_local_var = feed_index_logs_error_dto_create (
        http_status_code ? http_status_code->valuedouble : 0,
        type ? type_local_nonprim : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL
        );

    return feed_index_logs_error_dto_local_var;
end:
    if (type_local_nonprim) {
        feed_index_logs_error_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
