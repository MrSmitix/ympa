#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "calculated_tariff_type.h"


char* calculated_tariff_type_calculated_tariff_type_ToString(_api__calculated_tariff_type__e calculated_tariff_type) {
    char *calculated_tariff_typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "EXPRESS_DELIVERY", "SORTING", "MIDDLE_MILE" };
    return calculated_tariff_typeArray[calculated_tariff_type];
}

_api__calculated_tariff_type__e calculated_tariff_type_calculated_tariff_type_FromString(char* calculated_tariff_type) {
    int stringToReturn = 0;
    char *calculated_tariff_typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "EXPRESS_DELIVERY", "SORTING", "MIDDLE_MILE" };
    size_t sizeofArray = sizeof(calculated_tariff_typeArray) / sizeof(calculated_tariff_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(calculated_tariff_type, calculated_tariff_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *calculated_tariff_type_calculated_tariff_type_convertToJSON(_api__calculated_tariff_type__e calculated_tariff_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "calculated_tariff_type", calculated_tariff_type_calculated_tariff_type_ToString(calculated_tariff_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__calculated_tariff_type__e calculated_tariff_type_calculated_tariff_type_parseFromJSON(cJSON *calculated_tariff_typeJSON) {
    _api__calculated_tariff_type__e *calculated_tariff_type = NULL;
    _api__calculated_tariff_type__e calculated_tariff_typeVariable;
    cJSON *calculated_tariff_typeVar = cJSON_GetObjectItemCaseSensitive(calculated_tariff_typeJSON, "calculated_tariff_type");
    if(!cJSON_IsString(calculated_tariff_typeVar) || (calculated_tariff_typeVar->valuestring == NULL)){
        goto end;
    }
    calculated_tariff_typeVariable = calculated_tariff_type_calculated_tariff_type_FromString(calculated_tariff_typeVar->valuestring);
    return calculated_tariff_typeVariable;
end:
    return 0;
}
