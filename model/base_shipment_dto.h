/*
 * base_shipment_dto.h
 *
 * Информация об отгрузке.
 */

#ifndef _base_shipment_dto_H_
#define _base_shipment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_shipment_dto_t base_shipment_dto_t;

#include "delivery_service_dto.h"
#include "pallets_count_dto.h"
#include "partner_shipment_warehouse_dto.h"
#include "shipment_type.h"

// Enum  for base_shipment_dto

typedef enum  { _api__base_shipment_dto__NULL = 0, _api__base_shipment_dto__IMPORT, _api__base_shipment_dto__WITHDRAW } _api__base_shipment_dto__e;

char* base_shipment_dto_shipment_type_ToString(_api__base_shipment_dto__e shipment_type);

_api__base_shipment_dto__e base_shipment_dto_shipment_type_FromString(char* shipment_type);



typedef struct base_shipment_dto_t {
    long id; //numeric
    char *plan_interval_from; //date time
    char *plan_interval_to; //date time
    shipment_type_t *shipment_type; // custom
    struct partner_shipment_warehouse_dto_t *warehouse; //model
    struct partner_shipment_warehouse_dto_t *warehouse_to; //model
    char *external_id; // string
    struct delivery_service_dto_t *delivery_service; //model
    struct pallets_count_dto_t *pallets_count; //model
    list_t *order_ids; //primitive container
    int draft_count; //numeric
    int planned_count; //numeric
    int fact_count; //numeric

} base_shipment_dto_t;

base_shipment_dto_t *base_shipment_dto_create(
    long id,
    char *plan_interval_from,
    char *plan_interval_to,
    shipment_type_t *shipment_type,
    partner_shipment_warehouse_dto_t *warehouse,
    partner_shipment_warehouse_dto_t *warehouse_to,
    char *external_id,
    delivery_service_dto_t *delivery_service,
    pallets_count_dto_t *pallets_count,
    list_t *order_ids,
    int draft_count,
    int planned_count,
    int fact_count
);

void base_shipment_dto_free(base_shipment_dto_t *base_shipment_dto);

base_shipment_dto_t *base_shipment_dto_parseFromJSON(cJSON *base_shipment_dtoJSON);

cJSON *base_shipment_dto_convertToJSON(base_shipment_dto_t *base_shipment_dto);

#endif /* _base_shipment_dto_H_ */

