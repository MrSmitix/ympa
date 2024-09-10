/*
 * shipment_dto.h
 *
 * Информация об отгрузке.
 */

#ifndef _shipment_dto_H_
#define _shipment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_dto_t shipment_dto_t;

#include "delivery_service_dto.h"
#include "pallets_count_dto.h"
#include "partner_shipment_warehouse_dto.h"
#include "shipment_action_type.h"
#include "shipment_status_change_dto.h"
#include "shipment_type.h"

// Enum  for shipment_dto

typedef enum  { _api__shipment_dto__NULL = 0, _api__shipment_dto__IMPORT, _api__shipment_dto__WITHDRAW } _api__shipment_dto__e;

char* shipment_dto_shipment_type_ToString(_api__shipment_dto__e shipment_type);

_api__shipment_dto__e shipment_dto_shipment_type_FromString(char* shipment_type);

// Enum  for shipment_dto

typedef enum  { _api__shipment_dto__NULL = 0, _api__shipment_dto__CONFIRM, _api__shipment_dto__DOWNLOAD_ACT, _api__shipment_dto__DOWNLOAD_INBOUND_ACT, _api__shipment_dto__DOWNLOAD_DISCREPANCY_ACT, _api__shipment_dto__CHANGE_PALLETS_COUNT } _api__shipment_dto__e;

char* shipment_dto_available_actions_ToString(_api__shipment_dto__e available_actions);

_api__shipment_dto__e shipment_dto_available_actions_FromString(char* available_actions);



typedef struct shipment_dto_t {
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
    struct shipment_status_change_dto_t *current_status; //model
    list_t *available_actions; //nonprimitive container

} shipment_dto_t;

shipment_dto_t *shipment_dto_create(
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
    shipment_status_change_dto_t *current_status,
    list_t *available_actions
);

void shipment_dto_free(shipment_dto_t *shipment_dto);

shipment_dto_t *shipment_dto_parseFromJSON(cJSON *shipment_dtoJSON);

cJSON *shipment_dto_convertToJSON(shipment_dto_t *shipment_dto);

#endif /* _shipment_dto_H_ */

