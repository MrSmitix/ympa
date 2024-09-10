/*
 * generate_stocks_on_warehouses_report_request.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _generate_stocks_on_warehouses_report_request_H_
#define _generate_stocks_on_warehouses_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_stocks_on_warehouses_report_request_t generate_stocks_on_warehouses_report_request_t;




typedef struct generate_stocks_on_warehouses_report_request_t {
    long campaign_id; //numeric
    list_t *warehouse_ids; //primitive container
    char *report_date; //date
    list_t *category_ids; //primitive container
    int has_stocks; //boolean

} generate_stocks_on_warehouses_report_request_t;

generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_create(
    long campaign_id,
    list_t *warehouse_ids,
    char *report_date,
    list_t *category_ids,
    int has_stocks
);

void generate_stocks_on_warehouses_report_request_free(generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request);

generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request_parseFromJSON(cJSON *generate_stocks_on_warehouses_report_requestJSON);

cJSON *generate_stocks_on_warehouses_report_request_convertToJSON(generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request);

#endif /* _generate_stocks_on_warehouses_report_request_H_ */

