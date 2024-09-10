/*
 * get_models_request.h
 *
 * Запрос информации о моделях.
 */

#ifndef _get_models_request_H_
#define _get_models_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_models_request_t get_models_request_t;




typedef struct get_models_request_t {
    list_t *models; //primitive container

} get_models_request_t;

get_models_request_t *get_models_request_create(
    list_t *models
);

void get_models_request_free(get_models_request_t *get_models_request);

get_models_request_t *get_models_request_parseFromJSON(cJSON *get_models_requestJSON);

cJSON *get_models_request_convertToJSON(get_models_request_t *get_models_request);

#endif /* _get_models_request_H_ */

