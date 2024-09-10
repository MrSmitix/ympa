/*
 * order_label_dto.h
 *
 * Данные для печати ярлыка.
 */

#ifndef _order_label_dto_H_
#define _order_label_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_label_dto_t order_label_dto_t;

#include "parcel_box_label_dto.h"



typedef struct order_label_dto_t {
    long order_id; //numeric
    int places_number; //numeric
    char *url; // string
    list_t *parcel_box_labels; //nonprimitive container

} order_label_dto_t;

order_label_dto_t *order_label_dto_create(
    long order_id,
    int places_number,
    char *url,
    list_t *parcel_box_labels
);

void order_label_dto_free(order_label_dto_t *order_label_dto);

order_label_dto_t *order_label_dto_parseFromJSON(cJSON *order_label_dtoJSON);

cJSON *order_label_dto_convertToJSON(order_label_dto_t *order_label_dto);

#endif /* _order_label_dto_H_ */

