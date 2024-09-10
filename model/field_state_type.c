#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "field_state_type.h"


char* field_state_type_field_state_type_ToString(_api__field_state_type__e field_state_type) {
    char *field_state_typeArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    return field_state_typeArray[field_state_type];
}

_api__field_state_type__e field_state_type_field_state_type_FromString(char* field_state_type) {
    int stringToReturn = 0;
    char *field_state_typeArray[] =  { "NULL", "SPECIFIED", "EMPTY" };
    size_t sizeofArray = sizeof(field_state_typeArray) / sizeof(field_state_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(field_state_type, field_state_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *field_state_type_field_state_type_convertToJSON(_api__field_state_type__e field_state_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "field_state_type", field_state_type_field_state_type_ToString(field_state_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__field_state_type__e field_state_type_field_state_type_parseFromJSON(cJSON *field_state_typeJSON) {
    _api__field_state_type__e *field_state_type = NULL;
    _api__field_state_type__e field_state_typeVariable;
    cJSON *field_state_typeVar = cJSON_GetObjectItemCaseSensitive(field_state_typeJSON, "field_state_type");
    if(!cJSON_IsString(field_state_typeVar) || (field_state_typeVar->valuestring == NULL)){
        goto end;
    }
    field_state_typeVariable = field_state_type_field_state_type_FromString(field_state_typeVar->valuestring);
    return field_state_typeVariable;
end:
    return 0;
}
