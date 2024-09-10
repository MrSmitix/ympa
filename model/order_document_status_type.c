#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_document_status_type.h"


char* order_document_status_type_order_document_status_type_ToString(_api__order_document_status_type__e order_document_status_type) {
    char *order_document_status_typeArray[] =  { "NULL", "READY", "NOT_READY" };
    return order_document_status_typeArray[order_document_status_type];
}

_api__order_document_status_type__e order_document_status_type_order_document_status_type_FromString(char* order_document_status_type) {
    int stringToReturn = 0;
    char *order_document_status_typeArray[] =  { "NULL", "READY", "NOT_READY" };
    size_t sizeofArray = sizeof(order_document_status_typeArray) / sizeof(order_document_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_document_status_type, order_document_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *order_document_status_type_order_document_status_type_convertToJSON(_api__order_document_status_type__e order_document_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order_document_status_type", order_document_status_type_order_document_status_type_ToString(order_document_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__order_document_status_type__e order_document_status_type_order_document_status_type_parseFromJSON(cJSON *order_document_status_typeJSON) {
    _api__order_document_status_type__e *order_document_status_type = NULL;
    _api__order_document_status_type__e order_document_status_typeVariable;
    cJSON *order_document_status_typeVar = cJSON_GetObjectItemCaseSensitive(order_document_status_typeJSON, "order_document_status_type");
    if(!cJSON_IsString(order_document_status_typeVar) || (order_document_status_typeVar->valuestring == NULL)){
        goto end;
    }
    order_document_status_typeVariable = order_document_status_type_order_document_status_type_FromString(order_document_status_typeVar->valuestring);
    return order_document_status_typeVariable;
end:
    return 0;
}
