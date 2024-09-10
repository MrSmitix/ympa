/*
 * generate_report_response.h
 *
 * Ответ на запрос генерации отчета.
 */

#ifndef _generate_report_response_H_
#define _generate_report_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_report_response_t generate_report_response_t;

#include "api_response_status_type.h"
#include "generate_report_dto.h"

// Enum  for generate_report_response

typedef enum  { _api__generate_report_response__NULL = 0, _api__generate_report_response__OK, _api__generate_report_response__ERROR } _api__generate_report_response__e;

char* generate_report_response_status_ToString(_api__generate_report_response__e status);

_api__generate_report_response__e generate_report_response_status_FromString(char* status);



typedef struct generate_report_response_t {
    api_response_status_type_t *status; // custom
    struct generate_report_dto_t *result; //model

} generate_report_response_t;

generate_report_response_t *generate_report_response_create(
    api_response_status_type_t *status,
    generate_report_dto_t *result
);

void generate_report_response_free(generate_report_response_t *generate_report_response);

generate_report_response_t *generate_report_response_parseFromJSON(cJSON *generate_report_responseJSON);

cJSON *generate_report_response_convertToJSON(generate_report_response_t *generate_report_response);

#endif /* _generate_report_response_H_ */

