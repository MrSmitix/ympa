/*
 * partner_shipment_warehouse_dto.h
 *
 * Данные о складе отправления.
 */

#ifndef _partner_shipment_warehouse_dto_H_
#define _partner_shipment_warehouse_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct partner_shipment_warehouse_dto_t partner_shipment_warehouse_dto_t;




typedef struct partner_shipment_warehouse_dto_t {
    long id; //numeric
    char *name; // string
    char *address; // string

} partner_shipment_warehouse_dto_t;

partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_create(
    long id,
    char *name,
    char *address
);

void partner_shipment_warehouse_dto_free(partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto);

partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto_parseFromJSON(cJSON *partner_shipment_warehouse_dtoJSON);

cJSON *partner_shipment_warehouse_dto_convertToJSON(partner_shipment_warehouse_dto_t *partner_shipment_warehouse_dto);

#endif /* _partner_shipment_warehouse_dto_H_ */

