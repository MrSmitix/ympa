#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tariff_type.h"


char* tariff_type_tariff_type_ToString(_api__tariff_type__e tariff_type) {
    char *tariff_typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "STORAGE", "WITHDRAW", "SURPLUS", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "CROSSREGIONAL_DELIVERY_RETURN", "DISPOSAL", "SORTING_CENTER_STORAGE", "EXPRESS_DELIVERY", "FF_XDOC_SUPPLY_BOX", "FF_XDOC_SUPPLY_PALLET", "SORTING", "MIDDLE_MILE", "RETURN_PROCESSING", "EXPRESS_CANCELLED_BY_PARTNER", "DELIVERY_TO_CUSTOMER_RETURN", "CROSSBORDER_DELIVERY", "INTAKE_SORTING_BULKY_CARGO", "INTAKE_SORTING_SMALL_GOODS", "INTAKE_SORTING_DAILY", "FF_STORAGE_BILLING", "CANCELLED_ORDER_FEE_QI", "LATE_ORDER_EXECUTION_FEE_QI" };
    return tariff_typeArray[tariff_type];
}

_api__tariff_type__e tariff_type_tariff_type_FromString(char* tariff_type) {
    int stringToReturn = 0;
    char *tariff_typeArray[] =  { "NULL", "AGENCY_COMMISSION", "PAYMENT_TRANSFER", "STORAGE", "WITHDRAW", "SURPLUS", "FEE", "DELIVERY_TO_CUSTOMER", "CROSSREGIONAL_DELIVERY", "CROSSREGIONAL_DELIVERY_RETURN", "DISPOSAL", "SORTING_CENTER_STORAGE", "EXPRESS_DELIVERY", "FF_XDOC_SUPPLY_BOX", "FF_XDOC_SUPPLY_PALLET", "SORTING", "MIDDLE_MILE", "RETURN_PROCESSING", "EXPRESS_CANCELLED_BY_PARTNER", "DELIVERY_TO_CUSTOMER_RETURN", "CROSSBORDER_DELIVERY", "INTAKE_SORTING_BULKY_CARGO", "INTAKE_SORTING_SMALL_GOODS", "INTAKE_SORTING_DAILY", "FF_STORAGE_BILLING", "CANCELLED_ORDER_FEE_QI", "LATE_ORDER_EXECUTION_FEE_QI" };
    size_t sizeofArray = sizeof(tariff_typeArray) / sizeof(tariff_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(tariff_type, tariff_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *tariff_type_tariff_type_convertToJSON(_api__tariff_type__e tariff_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "tariff_type", tariff_type_tariff_type_ToString(tariff_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__tariff_type__e tariff_type_tariff_type_parseFromJSON(cJSON *tariff_typeJSON) {
    _api__tariff_type__e *tariff_type = NULL;
    _api__tariff_type__e tariff_typeVariable;
    cJSON *tariff_typeVar = cJSON_GetObjectItemCaseSensitive(tariff_typeJSON, "tariff_type");
    if(!cJSON_IsString(tariff_typeVar) || (tariff_typeVar->valuestring == NULL)){
        goto end;
    }
    tariff_typeVariable = tariff_type_tariff_type_FromString(tariff_typeVar->valuestring);
    return tariff_typeVariable;
end:
    return 0;
}
