/*
 * order_shipment_dto.h
 *
 * Список посылок.  В параметре может указываться несколько посылок. 
 */

#ifndef _order_shipment_dto_H_
#define _order_shipment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_shipment_dto_t order_shipment_dto_t;

#include "order_parcel_box_dto.h"
#include "order_track_dto.h"



typedef struct order_shipment_dto_t {
    long id; //numeric
    char *shipment_date; // string
    char *shipment_time; // string
    list_t *tracks; //nonprimitive container
    list_t *boxes; //nonprimitive container

} order_shipment_dto_t;

order_shipment_dto_t *order_shipment_dto_create(
    long id,
    char *shipment_date,
    char *shipment_time,
    list_t *tracks,
    list_t *boxes
);

void order_shipment_dto_free(order_shipment_dto_t *order_shipment_dto);

order_shipment_dto_t *order_shipment_dto_parseFromJSON(cJSON *order_shipment_dtoJSON);

cJSON *order_shipment_dto_convertToJSON(order_shipment_dto_t *order_shipment_dto);

#endif /* _order_shipment_dto_H_ */

