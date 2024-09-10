#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "sort_order_type.h"


char* sort_order_type_sort_order_type_ToString(_api__sort_order_type__e sort_order_type) {
    char *sort_order_typeArray[] =  { "NULL", "ASC", "DESC" };
    return sort_order_typeArray[sort_order_type];
}

_api__sort_order_type__e sort_order_type_sort_order_type_FromString(char* sort_order_type) {
    int stringToReturn = 0;
    char *sort_order_typeArray[] =  { "NULL", "ASC", "DESC" };
    size_t sizeofArray = sizeof(sort_order_typeArray) / sizeof(sort_order_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sort_order_type, sort_order_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *sort_order_type_sort_order_type_convertToJSON(_api__sort_order_type__e sort_order_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "sort_order_type", sort_order_type_sort_order_type_ToString(sort_order_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__sort_order_type__e sort_order_type_sort_order_type_parseFromJSON(cJSON *sort_order_typeJSON) {
    _api__sort_order_type__e *sort_order_type = NULL;
    _api__sort_order_type__e sort_order_typeVariable;
    cJSON *sort_order_typeVar = cJSON_GetObjectItemCaseSensitive(sort_order_typeJSON, "sort_order_type");
    if(!cJSON_IsString(sort_order_typeVar) || (sort_order_typeVar->valuestring == NULL)){
        goto end;
    }
    sort_order_typeVariable = sort_order_type_sort_order_type_FromString(sort_order_typeVar->valuestring);
    return sort_order_typeVariable;
end:
    return 0;
}
