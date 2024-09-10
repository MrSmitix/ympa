/*
 * generate_goods_movement_report_request.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _generate_goods_movement_report_request_H_
#define _generate_goods_movement_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_goods_movement_report_request_t generate_goods_movement_report_request_t;




typedef struct generate_goods_movement_report_request_t {
    long campaign_id; //numeric
    char *date_from; //date
    char *date_to; //date
    char *shop_sku; // string

} generate_goods_movement_report_request_t;

generate_goods_movement_report_request_t *generate_goods_movement_report_request_create(
    long campaign_id,
    char *date_from,
    char *date_to,
    char *shop_sku
);

void generate_goods_movement_report_request_free(generate_goods_movement_report_request_t *generate_goods_movement_report_request);

generate_goods_movement_report_request_t *generate_goods_movement_report_request_parseFromJSON(cJSON *generate_goods_movement_report_requestJSON);

cJSON *generate_goods_movement_report_request_convertToJSON(generate_goods_movement_report_request_t *generate_goods_movement_report_request);

#endif /* _generate_goods_movement_report_request_H_ */

