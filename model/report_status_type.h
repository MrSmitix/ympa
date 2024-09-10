/*
 * report_status_type.h
 *
 * Статус генерации отчета:  * &#x60;PENDING&#x60; — отчет ожидает генерации. * &#x60;PROCESSING&#x60; — отчет генерируется. * &#x60;FAILED&#x60; — во время генерации произошла ошибка. * &#x60;DONE&#x60; — отчет готов. 
 */

#ifndef _report_status_type_H_
#define _report_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct report_status_type_t report_status_type_t;


// Enum  for report_status_type

typedef enum { _api__report_status_type__NULL = 0, _api__report_status_type__PENDING, _api__report_status_type__PROCESSING, _api__report_status_type__FAILED, _api__report_status_type__DONE } _api__report_status_type__e;

char* report_status_type_report_status_type_ToString(_api__report_status_type__e report_status_type);

_api__report_status_type__e report_status_type_report_status_type_FromString(char* report_status_type);

//cJSON *report_status_type_report_status_type_convertToJSON(_api__report_status_type__e report_status_type);

//_api__report_status_type__e report_status_type_report_status_type_parseFromJSON(cJSON *report_status_typeJSON);

#endif /* _report_status_type_H_ */

