/*
 * shipment_boxes_dto.h
 *
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */

#ifndef _shipment_boxes_dto_H_
#define _shipment_boxes_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_boxes_dto_t shipment_boxes_dto_t;

#include "parcel_box_dto.h"



typedef struct shipment_boxes_dto_t {
    list_t *boxes; //nonprimitive container

} shipment_boxes_dto_t;

shipment_boxes_dto_t *shipment_boxes_dto_create(
    list_t *boxes
);

void shipment_boxes_dto_free(shipment_boxes_dto_t *shipment_boxes_dto);

shipment_boxes_dto_t *shipment_boxes_dto_parseFromJSON(cJSON *shipment_boxes_dtoJSON);

cJSON *shipment_boxes_dto_convertToJSON(shipment_boxes_dto_t *shipment_boxes_dto);

#endif /* _shipment_boxes_dto_H_ */

