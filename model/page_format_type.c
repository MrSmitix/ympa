#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "page_format_type.h"


char* page_format_type_page_format_type_ToString(_api__page_format_type__e page_format_type) {
    char *page_format_typeArray[] =  { "NULL", "A7", "A4" };
    return page_format_typeArray[page_format_type];
}

_api__page_format_type__e page_format_type_page_format_type_FromString(char* page_format_type) {
    int stringToReturn = 0;
    char *page_format_typeArray[] =  { "NULL", "A7", "A4" };
    size_t sizeofArray = sizeof(page_format_typeArray) / sizeof(page_format_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(page_format_type, page_format_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *page_format_type_page_format_type_convertToJSON(_api__page_format_type__e page_format_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "page_format_type", page_format_type_page_format_type_ToString(page_format_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__page_format_type__e page_format_type_page_format_type_parseFromJSON(cJSON *page_format_typeJSON) {
    _api__page_format_type__e *page_format_type = NULL;
    _api__page_format_type__e page_format_typeVariable;
    cJSON *page_format_typeVar = cJSON_GetObjectItemCaseSensitive(page_format_typeJSON, "page_format_type");
    if(!cJSON_IsString(page_format_typeVar) || (page_format_typeVar->valuestring == NULL)){
        goto end;
    }
    page_format_typeVariable = page_format_type_page_format_type_FromString(page_format_typeVar->valuestring);
    return page_format_typeVariable;
end:
    return 0;
}
