#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "region_type.h"


char* region_type_region_type_ToString(_api__region_type__e region_type) {
    char *region_typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    return region_typeArray[region_type];
}

_api__region_type__e region_type_region_type_FromString(char* region_type) {
    int stringToReturn = 0;
    char *region_typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    size_t sizeofArray = sizeof(region_typeArray) / sizeof(region_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(region_type, region_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *region_type_region_type_convertToJSON(_api__region_type__e region_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "region_type", region_type_region_type_ToString(region_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__region_type__e region_type_region_type_parseFromJSON(cJSON *region_typeJSON) {
    _api__region_type__e *region_type = NULL;
    _api__region_type__e region_typeVariable;
    cJSON *region_typeVar = cJSON_GetObjectItemCaseSensitive(region_typeJSON, "region_type");
    if(!cJSON_IsString(region_typeVar) || (region_typeVar->valuestring == NULL)){
        goto end;
    }
    region_typeVariable = region_type_region_type_FromString(region_typeVar->valuestring);
    return region_typeVariable;
end:
    return 0;
}
