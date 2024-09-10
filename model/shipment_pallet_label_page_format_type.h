/*
 * shipment_pallet_label_page_format_type.h
 *
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 */

#ifndef _shipment_pallet_label_page_format_type_H_
#define _shipment_pallet_label_page_format_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_pallet_label_page_format_type_t shipment_pallet_label_page_format_type_t;


// Enum  for shipment_pallet_label_page_format_type

typedef enum { _api__shipment_pallet_label_page_format_type__NULL = 0, _api__shipment_pallet_label_page_format_type__A4, _api__shipment_pallet_label_page_format_type__A8 } _api__shipment_pallet_label_page_format_type__e;

char* shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_ToString(_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type);

_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_FromString(char* shipment_pallet_label_page_format_type);

//cJSON *shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_convertToJSON(_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type);

//_api__shipment_pallet_label_page_format_type__e shipment_pallet_label_page_format_type_shipment_pallet_label_page_format_type_parseFromJSON(cJSON *shipment_pallet_label_page_format_typeJSON);

#endif /* _shipment_pallet_label_page_format_type_H_ */

