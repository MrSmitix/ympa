#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "price_quarantine_verdict_param_name_type.h"


char* price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_ToString(_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type) {
    char *price_quarantine_verdict_param_name_typeArray[] =  { "NULL", "CURRENT_PRICE", "LAST_VALID_PRICE", "MIN_PRICE", "CURRENCY" };
    return price_quarantine_verdict_param_name_typeArray[price_quarantine_verdict_param_name_type];
}

_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_FromString(char* price_quarantine_verdict_param_name_type) {
    int stringToReturn = 0;
    char *price_quarantine_verdict_param_name_typeArray[] =  { "NULL", "CURRENT_PRICE", "LAST_VALID_PRICE", "MIN_PRICE", "CURRENCY" };
    size_t sizeofArray = sizeof(price_quarantine_verdict_param_name_typeArray) / sizeof(price_quarantine_verdict_param_name_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(price_quarantine_verdict_param_name_type, price_quarantine_verdict_param_name_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_convertToJSON(_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "price_quarantine_verdict_param_name_type", price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_ToString(price_quarantine_verdict_param_name_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_parseFromJSON(cJSON *price_quarantine_verdict_param_name_typeJSON) {
    _api__price_quarantine_verdict_param_name_type__e *price_quarantine_verdict_param_name_type = NULL;
    _api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_typeVariable;
    cJSON *price_quarantine_verdict_param_name_typeVar = cJSON_GetObjectItemCaseSensitive(price_quarantine_verdict_param_name_typeJSON, "price_quarantine_verdict_param_name_type");
    if(!cJSON_IsString(price_quarantine_verdict_param_name_typeVar) || (price_quarantine_verdict_param_name_typeVar->valuestring == NULL)){
        goto end;
    }
    price_quarantine_verdict_param_name_typeVariable = price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_FromString(price_quarantine_verdict_param_name_typeVar->valuestring);
    return price_quarantine_verdict_param_name_typeVariable;
end:
    return 0;
}
