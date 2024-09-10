/*
 * shipment_info_dto.h
 *
 * Список с информацией об отгрузках.
 */

#ifndef _shipment_info_dto_H_
#define _shipment_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_info_dto_t shipment_info_dto_t;

#include "delivery_service_dto.h"
#include "pallets_count_dto.h"
#include "partner_shipment_warehouse_dto.h"
#include "shipment_status_type.h"
#include "shipment_type.h"

// Enum  for shipment_info_dto

typedef enum  { _api__shipment_info_dto__NULL = 0, _api__shipment_info_dto__IMPORT, _api__shipment_info_dto__WITHDRAW } _api__shipment_info_dto__e;

char* shipment_info_dto_shipment_type_ToString(_api__shipment_info_dto__e shipment_type);

_api__shipment_info_dto__e shipment_info_dto_shipment_type_FromString(char* shipment_type);

// Enum  for shipment_info_dto

typedef enum  { _api__shipment_info_dto__NULL = 0, _api__shipment_info_dto__OUTBOUND_CREATED, _api__shipment_info_dto__OUTBOUND_READY_FOR_CONFIRMATION, _api__shipment_info_dto__OUTBOUND_CONFIRMED, _api__shipment_info_dto__OUTBOUND_SIGNED, _api__shipment_info_dto__FINISHED, _api__shipment_info_dto__ACCEPTED, _api__shipment_info_dto__ACCEPTED_WITH_DISCREPANCIES, _api__shipment_info_dto__ERROR } _api__shipment_info_dto__e;

char* shipment_info_dto_status_ToString(_api__shipment_info_dto__e status);

_api__shipment_info_dto__e shipment_info_dto_status_FromString(char* status);



typedef struct shipment_info_dto_t {
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
    shipment_status_type_t *status; // custom
    char *status_description; // string
    char *status_update_time; //date time

} shipment_info_dto_t;

shipment_info_dto_t *shipment_info_dto_create(
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
    int fact_count,
    shipment_status_type_t *status,
    char *status_description,
    char *status_update_time
);

void shipment_info_dto_free(shipment_info_dto_t *shipment_info_dto);

shipment_info_dto_t *shipment_info_dto_parseFromJSON(cJSON *shipment_info_dtoJSON);

cJSON *shipment_info_dto_convertToJSON(shipment_info_dto_t *shipment_info_dto);

#endif /* _shipment_info_dto_H_ */

