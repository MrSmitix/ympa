#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shows_sales_grouping_type.h"


char* shows_sales_grouping_type_shows_sales_grouping_type_ToString(_api__shows_sales_grouping_type__e shows_sales_grouping_type) {
    char *shows_sales_grouping_typeArray[] =  { "NULL", "CATEGORIES", "OFFERS" };
    return shows_sales_grouping_typeArray[shows_sales_grouping_type];
}

_api__shows_sales_grouping_type__e shows_sales_grouping_type_shows_sales_grouping_type_FromString(char* shows_sales_grouping_type) {
    int stringToReturn = 0;
    char *shows_sales_grouping_typeArray[] =  { "NULL", "CATEGORIES", "OFFERS" };
    size_t sizeofArray = sizeof(shows_sales_grouping_typeArray) / sizeof(shows_sales_grouping_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(shows_sales_grouping_type, shows_sales_grouping_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *shows_sales_grouping_type_shows_sales_grouping_type_convertToJSON(_api__shows_sales_grouping_type__e shows_sales_grouping_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "shows_sales_grouping_type", shows_sales_grouping_type_shows_sales_grouping_type_ToString(shows_sales_grouping_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__shows_sales_grouping_type__e shows_sales_grouping_type_shows_sales_grouping_type_parseFromJSON(cJSON *shows_sales_grouping_typeJSON) {
    _api__shows_sales_grouping_type__e *shows_sales_grouping_type = NULL;
    _api__shows_sales_grouping_type__e shows_sales_grouping_typeVariable;
    cJSON *shows_sales_grouping_typeVar = cJSON_GetObjectItemCaseSensitive(shows_sales_grouping_typeJSON, "shows_sales_grouping_type");
    if(!cJSON_IsString(shows_sales_grouping_typeVar) || (shows_sales_grouping_typeVar->valuestring == NULL)){
        goto end;
    }
    shows_sales_grouping_typeVariable = shows_sales_grouping_type_shows_sales_grouping_type_FromString(shows_sales_grouping_typeVar->valuestring);
    return shows_sales_grouping_typeVariable;
end:
    return 0;
}
