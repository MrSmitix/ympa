/*
 * get_order_labels_data_response.h
 *
 * Ответ с информацией для печати ярлыков.
 */

#ifndef _get_order_labels_data_response_H_
#define _get_order_labels_data_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_order_labels_data_response_t get_order_labels_data_response_t;

#include "api_response_status_type.h"
#include "order_label_dto.h"

// Enum  for get_order_labels_data_response

typedef enum  { _api__get_order_labels_data_response__NULL = 0, _api__get_order_labels_data_response__OK, _api__get_order_labels_data_response__ERROR } _api__get_order_labels_data_response__e;

char* get_order_labels_data_response_status_ToString(_api__get_order_labels_data_response__e status);

_api__get_order_labels_data_response__e get_order_labels_data_response_status_FromString(char* status);



typedef struct get_order_labels_data_response_t {
    api_response_status_type_t *status; // custom
    struct order_label_dto_t *result; //model

} get_order_labels_data_response_t;

get_order_labels_data_response_t *get_order_labels_data_response_create(
    api_response_status_type_t *status,
    order_label_dto_t *result
);

void get_order_labels_data_response_free(get_order_labels_data_response_t *get_order_labels_data_response);

get_order_labels_data_response_t *get_order_labels_data_response_parseFromJSON(cJSON *get_order_labels_data_responseJSON);

cJSON *get_order_labels_data_response_convertToJSON(get_order_labels_data_response_t *get_order_labels_data_response);

#endif /* _get_order_labels_data_response_H_ */

