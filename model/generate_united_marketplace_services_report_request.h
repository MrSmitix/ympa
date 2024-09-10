/*
 * generate_united_marketplace_services_report_request.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */

#ifndef _generate_united_marketplace_services_report_request_H_
#define _generate_united_marketplace_services_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_united_marketplace_services_report_request_t generate_united_marketplace_services_report_request_t;

#include "placement_type.h"

// Enum  for generate_united_marketplace_services_report_request

typedef enum  { _api__generate_united_marketplace_services_report_request__NULL = 0, _api__generate_united_marketplace_services_report_request__FBS, _api__generate_united_marketplace_services_report_request__FBY, _api__generate_united_marketplace_services_report_request__DBS } _api__generate_united_marketplace_services_report_request__e;

char* generate_united_marketplace_services_report_request_placement_programs_ToString(_api__generate_united_marketplace_services_report_request__e placement_programs);

_api__generate_united_marketplace_services_report_request__e generate_united_marketplace_services_report_request_placement_programs_FromString(char* placement_programs);



typedef struct generate_united_marketplace_services_report_request_t {
    long business_id; //numeric
    char *date_time_from; //date time
    char *date_time_to; //date time
    char *date_from; //date
    char *date_to; //date
    int year_from; //numeric
    int month_from; //numeric
    int year_to; //numeric
    int month_to; //numeric
    list_t *placement_programs; //nonprimitive container
    list_t *inns; //primitive container
    list_t *campaign_ids; //primitive container

} generate_united_marketplace_services_report_request_t;

generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request_create(
    long business_id,
    char *date_time_from,
    char *date_time_to,
    char *date_from,
    char *date_to,
    int year_from,
    int month_from,
    int year_to,
    int month_to,
    list_t *placement_programs,
    list_t *inns,
    list_t *campaign_ids
);

void generate_united_marketplace_services_report_request_free(generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request);

generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request_parseFromJSON(cJSON *generate_united_marketplace_services_report_requestJSON);

cJSON *generate_united_marketplace_services_report_request_convertToJSON(generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request);

#endif /* _generate_united_marketplace_services_report_request_H_ */

