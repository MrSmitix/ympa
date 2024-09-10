#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "add_offers_to_archive_error_type.h"


char* add_offers_to_archive_error_type_add_offers_to_archive_error_type_ToString(_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type) {
    char *add_offers_to_archive_error_typeArray[] =  { "NULL", "OFFER_HAS_STOCKS", "UNKNOWN" };
    return add_offers_to_archive_error_typeArray[add_offers_to_archive_error_type];
}

_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type_add_offers_to_archive_error_type_FromString(char* add_offers_to_archive_error_type) {
    int stringToReturn = 0;
    char *add_offers_to_archive_error_typeArray[] =  { "NULL", "OFFER_HAS_STOCKS", "UNKNOWN" };
    size_t sizeofArray = sizeof(add_offers_to_archive_error_typeArray) / sizeof(add_offers_to_archive_error_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(add_offers_to_archive_error_type, add_offers_to_archive_error_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *add_offers_to_archive_error_type_add_offers_to_archive_error_type_convertToJSON(_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "add_offers_to_archive_error_type", add_offers_to_archive_error_type_add_offers_to_archive_error_type_ToString(add_offers_to_archive_error_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type_add_offers_to_archive_error_type_parseFromJSON(cJSON *add_offers_to_archive_error_typeJSON) {
    _api__add_offers_to_archive_error_type__e *add_offers_to_archive_error_type = NULL;
    _api__add_offers_to_archive_error_type__e add_offers_to_archive_error_typeVariable;
    cJSON *add_offers_to_archive_error_typeVar = cJSON_GetObjectItemCaseSensitive(add_offers_to_archive_error_typeJSON, "add_offers_to_archive_error_type");
    if(!cJSON_IsString(add_offers_to_archive_error_typeVar) || (add_offers_to_archive_error_typeVar->valuestring == NULL)){
        goto end;
    }
    add_offers_to_archive_error_typeVariable = add_offers_to_archive_error_type_add_offers_to_archive_error_type_FromString(add_offers_to_archive_error_typeVar->valuestring);
    return add_offers_to_archive_error_typeVariable;
end:
    return 0;
}
