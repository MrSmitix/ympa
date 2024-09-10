/*
 * report_format_type.h
 *
 * Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */

#ifndef _report_format_type_H_
#define _report_format_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct report_format_type_t report_format_type_t;


// Enum  for report_format_type

typedef enum { _api__report_format_type__NULL = 0, _api__report_format_type__FILE, _api__report_format_type__CSV } _api__report_format_type__e;

char* report_format_type_report_format_type_ToString(_api__report_format_type__e report_format_type);

_api__report_format_type__e report_format_type_report_format_type_FromString(char* report_format_type);

//cJSON *report_format_type_report_format_type_convertToJSON(_api__report_format_type__e report_format_type);

//_api__report_format_type__e report_format_type_report_format_type_parseFromJSON(cJSON *report_format_typeJSON);

#endif /* _report_format_type_H_ */

