#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "report_format_type.h"


char* report_format_type_report_format_type_ToString(_api__report_format_type__e report_format_type) {
    char *report_format_typeArray[] =  { "NULL", "FILE", "CSV" };
    return report_format_typeArray[report_format_type];
}

_api__report_format_type__e report_format_type_report_format_type_FromString(char* report_format_type) {
    int stringToReturn = 0;
    char *report_format_typeArray[] =  { "NULL", "FILE", "CSV" };
    size_t sizeofArray = sizeof(report_format_typeArray) / sizeof(report_format_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_format_type, report_format_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *report_format_type_report_format_type_convertToJSON(_api__report_format_type__e report_format_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "report_format_type", report_format_type_report_format_type_ToString(report_format_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

_api__report_format_type__e report_format_type_report_format_type_parseFromJSON(cJSON *report_format_typeJSON) {
    _api__report_format_type__e *report_format_type = NULL;
    _api__report_format_type__e report_format_typeVariable;
    cJSON *report_format_typeVar = cJSON_GetObjectItemCaseSensitive(report_format_typeJSON, "report_format_type");
    if(!cJSON_IsString(report_format_typeVar) || (report_format_typeVar->valuestring == NULL)){
        goto end;
    }
    report_format_typeVariable = report_format_type_report_format_type_FromString(report_format_typeVar->valuestring);
    return report_format_typeVariable;
end:
    return 0;
}
