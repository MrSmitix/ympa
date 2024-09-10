/*
 * generate_competitors_position_report_request.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _generate_competitors_position_report_request_H_
#define _generate_competitors_position_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_competitors_position_report_request_t generate_competitors_position_report_request_t;




typedef struct generate_competitors_position_report_request_t {
    long business_id; //numeric
    long category_id; //numeric
    char *date_from; //date
    char *date_to; //date

} generate_competitors_position_report_request_t;

generate_competitors_position_report_request_t *generate_competitors_position_report_request_create(
    long business_id,
    long category_id,
    char *date_from,
    char *date_to
);

void generate_competitors_position_report_request_free(generate_competitors_position_report_request_t *generate_competitors_position_report_request);

generate_competitors_position_report_request_t *generate_competitors_position_report_request_parseFromJSON(cJSON *generate_competitors_position_report_requestJSON);

cJSON *generate_competitors_position_report_request_convertToJSON(generate_competitors_position_report_request_t *generate_competitors_position_report_request);

#endif /* _generate_competitors_position_report_request_H_ */

