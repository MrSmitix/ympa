#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_status_type.h"


char* feed_index_logs_status_type_feed_index_logs_status_type_ToString(_api__feed_index_logs_status_type__e feed_index_logs_status_type) {
    char *feed_index_logs_status_typeArray[] =  { "NULL", "ERROR", "OK", "WARNING" };
    return feed_index_logs_status_typeArray[feed_index_logs_status_type];
}

_api__feed_index_logs_status_type__e feed_index_logs_status_type_feed_index_logs_status_type_FromString(char* feed_index_logs_status_type) {
    int stringToReturn = 0;
    char *feed_index_logs_status_typeArray[] =  { "NULL", "ERROR", "OK", "WARNING" };
    size_t sizeofArray = sizeof(feed_index_logs_status_typeArray) / sizeof(feed_index_logs_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feed_index_logs_status_type, feed_index_logs_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feed_index_logs_status_type_feed_index_logs_status_type_convertToJSON(_api__feed_index_logs_status_type__e feed_index_logs_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feed_index_logs_status_type", feed_index_logs_status_type_feed_index_logs_status_type_ToString(feed_index_logs_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feed_index_logs_status_type__e feed_index_logs_status_type_feed_index_logs_status_type_parseFromJSON(cJSON *feed_index_logs_status_typeJSON) {
    _api__feed_index_logs_status_type__e *feed_index_logs_status_type = NULL;
    _api__feed_index_logs_status_type__e feed_index_logs_status_typeVariable;
    cJSON *feed_index_logs_status_typeVar = cJSON_GetObjectItemCaseSensitive(feed_index_logs_status_typeJSON, "feed_index_logs_status_type");
    if(!cJSON_IsString(feed_index_logs_status_typeVar) || (feed_index_logs_status_typeVar->valuestring == NULL)){
        goto end;
    }
    feed_index_logs_status_typeVariable = feed_index_logs_status_type_feed_index_logs_status_type_FromString(feed_index_logs_status_typeVar->valuestring);
    return feed_index_logs_status_typeVariable;
end:
    return 0;
}
