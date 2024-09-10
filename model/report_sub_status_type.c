#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "report_sub_status_type.h"


char* report_sub_status_type_report_sub_status_type_ToString(_api__report_sub_status_type__e report_sub_status_type) {
    char *report_sub_status_typeArray[] =  { "NULL", "NO_DATA", "TOO_LARGE", "RESOURCE_NOT_FOUND" };
    return report_sub_status_typeArray[report_sub_status_type];
}

_api__report_sub_status_type__e report_sub_status_type_report_sub_status_type_FromString(char* report_sub_status_type) {
    int stringToReturn = 0;
    char *report_sub_status_typeArray[] =  { "NULL", "NO_DATA", "TOO_LARGE", "RESOURCE_NOT_FOUND" };
    size_t sizeofArray = sizeof(report_sub_status_typeArray) / sizeof(report_sub_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_sub_status_type, report_sub_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *report_sub_status_type_report_sub_status_type_convertToJSON(_api__report_sub_status_type__e report_sub_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "report_sub_status_type", report_sub_status_type_report_sub_status_type_ToString(report_sub_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__report_sub_status_type__e report_sub_status_type_report_sub_status_type_parseFromJSON(cJSON *report_sub_status_typeJSON) {
    _api__report_sub_status_type__e *report_sub_status_type = NULL;
    _api__report_sub_status_type__e report_sub_status_typeVariable;
    cJSON *report_sub_status_typeVar = cJSON_GetObjectItemCaseSensitive(report_sub_status_typeJSON, "report_sub_status_type");
    if(!cJSON_IsString(report_sub_status_typeVar) || (report_sub_status_typeVar->valuestring == NULL)){
        goto end;
    }
    report_sub_status_typeVariable = report_sub_status_type_report_sub_status_type_FromString(report_sub_status_typeVar->valuestring);
    return report_sub_status_typeVariable;
end:
    return 0;
}
