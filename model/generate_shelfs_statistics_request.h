/*
 * generate_shelfs_statistics_request.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _generate_shelfs_statistics_request_H_
#define _generate_shelfs_statistics_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_shelfs_statistics_request_t generate_shelfs_statistics_request_t;

#include "shelfs_statistics_attribution_type.h"

// Enum  for generate_shelfs_statistics_request

typedef enum  { _api__generate_shelfs_statistics_request__NULL = 0, _api__generate_shelfs_statistics_request__CLICKS, _api__generate_shelfs_statistics_request__SHOWS } _api__generate_shelfs_statistics_request__e;

char* generate_shelfs_statistics_request_attribution_type_ToString(_api__generate_shelfs_statistics_request__e attribution_type);

_api__generate_shelfs_statistics_request__e generate_shelfs_statistics_request_attribution_type_FromString(char* attribution_type);



typedef struct generate_shelfs_statistics_request_t {
    long business_id; //numeric
    char *date_from; //date
    char *date_to; //date
    shelfs_statistics_attribution_type_t *attribution_type; // custom

} generate_shelfs_statistics_request_t;

generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_create(
    long business_id,
    char *date_from,
    char *date_to,
    shelfs_statistics_attribution_type_t *attribution_type
);

void generate_shelfs_statistics_request_free(generate_shelfs_statistics_request_t *generate_shelfs_statistics_request);

generate_shelfs_statistics_request_t *generate_shelfs_statistics_request_parseFromJSON(cJSON *generate_shelfs_statistics_requestJSON);

cJSON *generate_shelfs_statistics_request_convertToJSON(generate_shelfs_statistics_request_t *generate_shelfs_statistics_request);

#endif /* _generate_shelfs_statistics_request_H_ */

