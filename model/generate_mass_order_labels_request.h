/*
 * generate_mass_order_labels_request.h
 *
 * Данные, необходимые для генерации файла. 
 */

#ifndef _generate_mass_order_labels_request_H_
#define _generate_mass_order_labels_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_mass_order_labels_request_t generate_mass_order_labels_request_t;




typedef struct generate_mass_order_labels_request_t {
    long business_id; //numeric
    list_t *order_ids; //primitive container

} generate_mass_order_labels_request_t;

generate_mass_order_labels_request_t *generate_mass_order_labels_request_create(
    long business_id,
    list_t *order_ids
);

void generate_mass_order_labels_request_free(generate_mass_order_labels_request_t *generate_mass_order_labels_request);

generate_mass_order_labels_request_t *generate_mass_order_labels_request_parseFromJSON(cJSON *generate_mass_order_labels_requestJSON);

cJSON *generate_mass_order_labels_request_convertToJSON(generate_mass_order_labels_request_t *generate_mass_order_labels_request);

#endif /* _generate_mass_order_labels_request_H_ */

