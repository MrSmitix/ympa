/*
 * report_sub_status_type.h
 *
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 */

#ifndef _report_sub_status_type_H_
#define _report_sub_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct report_sub_status_type_t report_sub_status_type_t;


// Enum  for report_sub_status_type

typedef enum { _api__report_sub_status_type__NULL = 0, _api__report_sub_status_type__NO_DATA, _api__report_sub_status_type__TOO_LARGE, _api__report_sub_status_type__RESOURCE_NOT_FOUND } _api__report_sub_status_type__e;

char* report_sub_status_type_report_sub_status_type_ToString(_api__report_sub_status_type__e report_sub_status_type);

_api__report_sub_status_type__e report_sub_status_type_report_sub_status_type_FromString(char* report_sub_status_type);

//cJSON *report_sub_status_type_report_sub_status_type_convertToJSON(_api__report_sub_status_type__e report_sub_status_type);

//_api__report_sub_status_type__e report_sub_status_type_report_sub_status_type_parseFromJSON(cJSON *report_sub_status_typeJSON);

#endif /* _report_sub_status_type_H_ */

