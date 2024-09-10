/*
 * generate_shipment_list_document_report_request.h
 *
 * Данные, необходимые для генерации документа. 
 */

#ifndef _generate_shipment_list_document_report_request_H_
#define _generate_shipment_list_document_report_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_shipment_list_document_report_request_t generate_shipment_list_document_report_request_t;




typedef struct generate_shipment_list_document_report_request_t {
    long campaign_id; //numeric
    long shipment_id; //numeric
    list_t *order_ids; //primitive container

} generate_shipment_list_document_report_request_t;

generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_create(
    long campaign_id,
    long shipment_id,
    list_t *order_ids
);

void generate_shipment_list_document_report_request_free(generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request);

generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request_parseFromJSON(cJSON *generate_shipment_list_document_report_requestJSON);

cJSON *generate_shipment_list_document_report_request_convertToJSON(generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request);

#endif /* _generate_shipment_list_document_report_request_H_ */

