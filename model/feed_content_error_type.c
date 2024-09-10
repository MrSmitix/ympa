#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_content_error_type.h"


char* feed_content_error_type_feed_content_error_type_ToString(_api__feed_content_error_type__e feed_content_error_type) {
    char *feed_content_error_typeArray[] =  { "NULL", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS" };
    return feed_content_error_typeArray[feed_content_error_type];
}

_api__feed_content_error_type__e feed_content_error_type_feed_content_error_type_FromString(char* feed_content_error_type) {
    int stringToReturn = 0;
    char *feed_content_error_typeArray[] =  { "NULL", "PARSE_ERROR", "PARSE_XML_ERROR", "TOO_MANY_REJECTED_OFFERS" };
    size_t sizeofArray = sizeof(feed_content_error_typeArray) / sizeof(feed_content_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feed_content_error_type, feed_content_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *feed_content_error_type_feed_content_error_type_convertToJSON(_api__feed_content_error_type__e feed_content_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feed_content_error_type", feed_content_error_type_feed_content_error_type_ToString(feed_content_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__feed_content_error_type__e feed_content_error_type_feed_content_error_type_parseFromJSON(cJSON *feed_content_error_typeJSON) {
    _api__feed_content_error_type__e *feed_content_error_type = NULL;
    _api__feed_content_error_type__e feed_content_error_typeVariable;
    cJSON *feed_content_error_typeVar = cJSON_GetObjectItemCaseSensitive(feed_content_error_typeJSON, "feed_content_error_type");
    if(!cJSON_IsString(feed_content_error_typeVar) || (feed_content_error_typeVar->valuestring == NULL)){
        goto end;
    }
    feed_content_error_typeVariable = feed_content_error_type_feed_content_error_type_FromString(feed_content_error_typeVar->valuestring);
    return feed_content_error_typeVariable;
end:
    return 0;
}
