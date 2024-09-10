/*
 * generate_shows_sales_report_request.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _generate_shows_sales_report_request_H_
#define _generate_shows_sales_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_shows_sales_report_request_t generate_shows_sales_report_request_t;

#include "shows_sales_grouping_type.h"

// Enum  for generate_shows_sales_report_request

typedef enum  { _api__generate_shows_sales_report_request__NULL = 0, _api__generate_shows_sales_report_request__CATEGORIES, _api__generate_shows_sales_report_request__OFFERS } _api__generate_shows_sales_report_request__e;

char* generate_shows_sales_report_request_grouping_ToString(_api__generate_shows_sales_report_request__e grouping);

_api__generate_shows_sales_report_request__e generate_shows_sales_report_request_grouping_FromString(char* grouping);



typedef struct generate_shows_sales_report_request_t {
    long business_id; //numeric
    long campaign_id; //numeric
    char *date_from; //date
    char *date_to; //date
    shows_sales_grouping_type_t *grouping; // custom

} generate_shows_sales_report_request_t;

generate_shows_sales_report_request_t *generate_shows_sales_report_request_create(
    long business_id,
    long campaign_id,
    char *date_from,
    char *date_to,
    shows_sales_grouping_type_t *grouping
);

void generate_shows_sales_report_request_free(generate_shows_sales_report_request_t *generate_shows_sales_report_request);

generate_shows_sales_report_request_t *generate_shows_sales_report_request_parseFromJSON(cJSON *generate_shows_sales_report_requestJSON);

cJSON *generate_shows_sales_report_request_convertToJSON(generate_shows_sales_report_request_t *generate_shows_sales_report_request);

#endif /* _generate_shows_sales_report_request_H_ */

