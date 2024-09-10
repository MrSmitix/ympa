/*
 * generate_prices_report_request.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _generate_prices_report_request_H_
#define _generate_prices_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_prices_report_request_t generate_prices_report_request_t;




typedef struct generate_prices_report_request_t {
    long business_id; //numeric
    long campaign_id; //numeric
    list_t *category_ids; //primitive container
    char *creation_date_from; //date
    char *creation_date_to; //date

} generate_prices_report_request_t;

generate_prices_report_request_t *generate_prices_report_request_create(
    long business_id,
    long campaign_id,
    list_t *category_ids,
    char *creation_date_from,
    char *creation_date_to
);

void generate_prices_report_request_free(generate_prices_report_request_t *generate_prices_report_request);

generate_prices_report_request_t *generate_prices_report_request_parseFromJSON(cJSON *generate_prices_report_requestJSON);

cJSON *generate_prices_report_request_convertToJSON(generate_prices_report_request_t *generate_prices_report_request);

#endif /* _generate_prices_report_request_H_ */

