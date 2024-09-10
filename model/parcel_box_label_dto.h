/*
 * parcel_box_label_dto.h
 *
 * Информация о ярлыке для коробки.
 */

#ifndef _parcel_box_label_dto_H_
#define _parcel_box_label_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parcel_box_label_dto_t parcel_box_label_dto_t;




typedef struct parcel_box_label_dto_t {
    char *url; // string
    char *supplier_name; // string
    char *delivery_service_name; // string
    long order_id; //numeric
    char *order_num; // string
    char *recipient_name; // string
    long box_id; //numeric
    char *fulfilment_id; // string
    char *place; // string
    char *weight; // string
    char *delivery_service_id; // string
    char *delivery_address; // string
    char *shipment_date; // string

} parcel_box_label_dto_t;

parcel_box_label_dto_t *parcel_box_label_dto_create(
    char *url,
    char *supplier_name,
    char *delivery_service_name,
    long order_id,
    char *order_num,
    char *recipient_name,
    long box_id,
    char *fulfilment_id,
    char *place,
    char *weight,
    char *delivery_service_id,
    char *delivery_address,
    char *shipment_date
);

void parcel_box_label_dto_free(parcel_box_label_dto_t *parcel_box_label_dto);

parcel_box_label_dto_t *parcel_box_label_dto_parseFromJSON(cJSON *parcel_box_label_dtoJSON);

cJSON *parcel_box_label_dto_convertToJSON(parcel_box_label_dto_t *parcel_box_label_dto);

#endif /* _parcel_box_label_dto_H_ */

