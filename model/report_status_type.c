#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "report_status_type.h"


char* report_status_type_report_status_type_ToString(_api__report_status_type__e report_status_type) {
    char *report_status_typeArray[] =  { "NULL", "PENDING", "PROCESSING", "FAILED", "DONE" };
    return report_status_typeArray[report_status_type];
}

_api__report_status_type__e report_status_type_report_status_type_FromString(char* report_status_type) {
    int stringToReturn = 0;
    char *report_status_typeArray[] =  { "NULL", "PENDING", "PROCESSING", "FAILED", "DONE" };
    size_t sizeofArray = sizeof(report_status_typeArray) / sizeof(report_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_status_type, report_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *report_status_type_report_status_type_convertToJSON(_api__report_status_type__e report_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "report_status_type", report_status_type_report_status_type_ToString(report_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__report_status_type__e report_status_type_report_status_type_parseFromJSON(cJSON *report_status_typeJSON) {
    _api__report_status_type__e *report_status_type = NULL;
    _api__report_status_type__e report_status_typeVariable;
    cJSON *report_status_typeVar = cJSON_GetObjectItemCaseSensitive(report_status_typeJSON, "report_status_type");
    if(!cJSON_IsString(report_status_typeVar) || (report_status_typeVar->valuestring == NULL)){
        goto end;
    }
    report_status_typeVariable = report_status_type_report_status_type_FromString(report_status_typeVar->valuestring);
    return report_status_typeVariable;
end:
    return 0;
}
