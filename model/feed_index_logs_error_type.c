#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_error_type.h"


char* feed_index_logs_error_type_feed_index_logs_error_type_ToString(_api__feed_index_logs_error_type__e feed_index_logs_error_type) {
    char *feed_index_logs_error_typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS", "NOT_INDEXED" };
    return feed_index_logs_error_typeArray[feed_index_logs_error_type];
}

_api__feed_index_logs_error_type__e feed_index_logs_error_type_feed_index_logs_error_type_FromString(char* feed_index_logs_error_type) {
    int stringToReturn = 0;
    char *feed_index_logs_error_typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS", "NOT_INDEXED" };
    size_t sizeofArray = sizeof(feed_index_logs_error_typeArray) / sizeof(feed_index_logs_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feed_index_logs_error_type, feed_index_logs_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feed_index_logs_error_type_feed_index_logs_error_type_convertToJSON(_api__feed_index_logs_error_type__e feed_index_logs_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feed_index_logs_error_type", feed_index_logs_error_type_feed_index_logs_error_type_ToString(feed_index_logs_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feed_index_logs_error_type__e feed_index_logs_error_type_feed_index_logs_error_type_parseFromJSON(cJSON *feed_index_logs_error_typeJSON) {
    _api__feed_index_logs_error_type__e *feed_index_logs_error_type = NULL;
    _api__feed_index_logs_error_type__e feed_index_logs_error_typeVariable;
    cJSON *feed_index_logs_error_typeVar = cJSON_GetObjectItemCaseSensitive(feed_index_logs_error_typeJSON, "feed_index_logs_error_type");
    if(!cJSON_IsString(feed_index_logs_error_typeVar) || (feed_index_logs_error_typeVar->valuestring == NULL)){
        goto end;
    }
    feed_index_logs_error_typeVariable = feed_index_logs_error_type_feed_index_logs_error_type_FromString(feed_index_logs_error_typeVar->valuestring);
    return feed_index_logs_error_typeVariable;
end:
    return 0;
}
