#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_download_error_type.h"


char* feed_download_error_type_feed_download_error_type_ToString(_api__feed_download_error_type__e feed_download_error_type) {
    char *feed_download_error_typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR" };
    return feed_download_error_typeArray[feed_download_error_type];
}

_api__feed_download_error_type__e feed_download_error_type_feed_download_error_type_FromString(char* feed_download_error_type) {
    int stringToReturn = 0;
    char *feed_download_error_typeArray[] =  { "NULL", "DOWNLOAD_ERROR", "DOWNLOAD_HTTP_ERROR" };
    size_t sizeofArray = sizeof(feed_download_error_typeArray) / sizeof(feed_download_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feed_download_error_type, feed_download_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feed_download_error_type_feed_download_error_type_convertToJSON(_api__feed_download_error_type__e feed_download_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feed_download_error_type", feed_download_error_type_feed_download_error_type_ToString(feed_download_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feed_download_error_type__e feed_download_error_type_feed_download_error_type_parseFromJSON(cJSON *feed_download_error_typeJSON) {
    _api__feed_download_error_type__e *feed_download_error_type = NULL;
    _api__feed_download_error_type__e feed_download_error_typeVariable;
    cJSON *feed_download_error_typeVar = cJSON_GetObjectItemCaseSensitive(feed_download_error_typeJSON, "feed_download_error_type");
    if(!cJSON_IsString(feed_download_error_typeVar) || (feed_download_error_typeVar->valuestring == NULL)){
        goto end;
    }
    feed_download_error_typeVariable = feed_download_error_type_feed_download_error_type_FromString(feed_download_error_typeVar->valuestring);
    return feed_download_error_typeVariable;
end:
    return 0;
}
