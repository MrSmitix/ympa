#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "payment_frequency_type.h"


char* payment_frequency_type_payment_frequency_type_ToString(_api__payment_frequency_type__e payment_frequency_type) {
    char *payment_frequency_typeArray[] =  { "NULL", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY" };
    return payment_frequency_typeArray[payment_frequency_type];
}

_api__payment_frequency_type__e payment_frequency_type_payment_frequency_type_FromString(char* payment_frequency_type) {
    int stringToReturn = 0;
    char *payment_frequency_typeArray[] =  { "NULL", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY" };
    size_t sizeofArray = sizeof(payment_frequency_typeArray) / sizeof(payment_frequency_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(payment_frequency_type, payment_frequency_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *payment_frequency_type_payment_frequency_type_convertToJSON(_api__payment_frequency_type__e payment_frequency_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "payment_frequency_type", payment_frequency_type_payment_frequency_type_ToString(payment_frequency_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__payment_frequency_type__e payment_frequency_type_payment_frequency_type_parseFromJSON(cJSON *payment_frequency_typeJSON) {
    _api__payment_frequency_type__e *payment_frequency_type = NULL;
    _api__payment_frequency_type__e payment_frequency_typeVariable;
    cJSON *payment_frequency_typeVar = cJSON_GetObjectItemCaseSensitive(payment_frequency_typeJSON, "payment_frequency_type");
    if(!cJSON_IsString(payment_frequency_typeVar) || (payment_frequency_typeVar->valuestring == NULL)){
        goto end;
    }
    payment_frequency_typeVariable = payment_frequency_type_payment_frequency_type_FromString(payment_frequency_typeVar->valuestring);
    return payment_frequency_typeVariable;
end:
    return 0;
}
