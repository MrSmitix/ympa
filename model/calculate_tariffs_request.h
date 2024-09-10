/*
 * calculate_tariffs_request.h
 *
 * 
 */

#ifndef _calculate_tariffs_request_H_
#define _calculate_tariffs_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_request_t calculate_tariffs_request_t;

#include "calculate_tariffs_offer_dto.h"
#include "calculate_tariffs_parameters_dto.h"



typedef struct calculate_tariffs_request_t {
    struct calculate_tariffs_parameters_dto_t *parameters; //model
    list_t *offers; //nonprimitive container

} calculate_tariffs_request_t;

calculate_tariffs_request_t *calculate_tariffs_request_create(
    calculate_tariffs_parameters_dto_t *parameters,
    list_t *offers
);

void calculate_tariffs_request_free(calculate_tariffs_request_t *calculate_tariffs_request);

calculate_tariffs_request_t *calculate_tariffs_request_parseFromJSON(cJSON *calculate_tariffs_requestJSON);

cJSON *calculate_tariffs_request_convertToJSON(calculate_tariffs_request_t *calculate_tariffs_request);

#endif /* _calculate_tariffs_request_H_ */

