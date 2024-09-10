#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shipment_pallet_label_page_format_type.h"


char* shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_ToString(_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type) {
    char *shipment_pallet_label_page_format_typeArray[] =  { "NULL", "A4", "A8" };
    return shipment_pallet_label_page_format_typeArray[shipment_pallet_label_page_format_type];
}

_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_FromString(char* shipment_pallet_label_page_format_type) {
    int stringToReturn = 0;
    char *shipment_pallet_label_page_format_typeArray[] =  { "NULL", "A4", "A8" };
    size_t sizeofArray = sizeof(shipment_pallet_label_page_format_typeArray) / sizeof(shipment_pallet_label_page_format_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shipment_pallet_label_page_format_type, shipment_pallet_label_page_format_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_convertToJSON(_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shipment_pallet_label_page_format_type", shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_ToString(shipment_pallet_label_page_format_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_parseFromJSON(cJSON *shipment_pallet_label_page_format_typeJSON) {
    _api__shipment_pallet_label_page_format_type__e *shipment_pallet_label_page_format_type = NULL;
    _api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_typeVariable;
    cJSON *shipment_pallet_label_page_format_typeVar = cJSON_GetObjectItemCaseSensitive(shipment_pallet_label_page_format_typeJSON, "shipment_pallet_label_page_format_type");
    if(!cJSON_IsString(shipment_pallet_label_page_format_typeVar) || (shipment_pallet_label_page_format_typeVar->valuestring == NULL)){
        goto end;
    }
    shipment_pallet_label_page_format_typeVariable = shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_FromString(shipment_pallet_label_page_format_typeVar->valuestring);
    return shipment_pallet_label_page_format_typeVariable;
end:
    return 0;
}
