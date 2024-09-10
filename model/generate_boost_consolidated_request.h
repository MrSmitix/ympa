/*
 * generate_boost_consolidated_request.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _generate_boost_consolidated_request_H_
#define _generate_boost_consolidated_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_boost_consolidated_request_t generate_boost_consolidated_request_t;




typedef struct generate_boost_consolidated_request_t {
    long business_id; //numeric
    char *date_from; //date
    char *date_to; //date

} generate_boost_consolidated_request_t;

generate_boost_consolidated_request_t *generate_boost_consolidated_request_create(
    long business_id,
    char *date_from,
    char *date_to
);

void generate_boost_consolidated_request_free(generate_boost_consolidated_request_t *generate_boost_consolidated_request);

generate_boost_consolidated_request_t *generate_boost_consolidated_request_parseFromJSON(cJSON *generate_boost_consolidated_requestJSON);

cJSON *generate_boost_consolidated_request_convertToJSON(generate_boost_consolidated_request_t *generate_boost_consolidated_request);

#endif /* _generate_boost_consolidated_request_H_ */

