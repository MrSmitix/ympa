#ifndef shipment_info_dto_TEST
#define shipment_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shipment_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shipment_info_dto.h"
shipment_info_dto_t* instantiate_shipment_info_dto(int include_optional);

#include "test_partner_shipment_warehouse_dto.c"
#include "test_partner_shipment_warehouse_dto.c"
#include "test_delivery_service_dto.c"
#include "test_pallets_count_dto.c"


shipment_info_dto_t* instantiate_shipment_info_dto(int include_optional) {
  shipment_info_dto_t* shipment_info_dto = NULL;
  if (include_optional) {
    shipment_info_dto = shipment_info_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__shipment_info_dto__IMPORT,
       // false, not to have infinite recursion
      instantiate_partner_shipment_warehouse_dto(0),
       // false, not to have infinite recursion
      instantiate_partner_shipment_warehouse_dto(0),
      "0",
       // false, not to have infinite recursion
      instantiate_delivery_service_dto(0),
       // false, not to have infinite recursion
      instantiate_pallets_count_dto(0),
      list_createList(),
      56,
      56,
      56,
      _api__shipment_info_dto__OUTBOUND_CREATED,
      "0",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    shipment_info_dto = shipment_info_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__shipment_info_dto__IMPORT,
      NULL,
      NULL,
      "0",
      NULL,
      NULL,
      list_createList(),
      56,
      56,
      56,
      _api__shipment_info_dto__OUTBOUND_CREATED,
      "0",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return shipment_info_dto;
}


#ifdef shipment_info_dto_MAIN

void test_shipment_info_dto(int include_optional) {
    shipment_info_dto_t* shipment_info_dto_1 = instantiate_shipment_info_dto(include_optional);

	cJSON* jsonshipment_info_dto_1 = shipment_info_dto_convertToJSON(shipment_info_dto_1);
	printf("shipment_info_dto :\n%s\n", cJSON_Print(jsonshipment_info_dto_1));
	shipment_info_dto_t* shipment_info_dto_2 = shipment_info_dto_parseFromJSON(jsonshipment_info_dto_1);
	cJSON* jsonshipment_info_dto_2 = shipment_info_dto_convertToJSON(shipment_info_dto_2);
	printf("repeating shipment_info_dto:\n%s\n", cJSON_Print(jsonshipment_info_dto_2));
}

int main() {
  test_shipment_info_dto(1);
  test_shipment_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // shipment_info_dto_MAIN
#endif // shipment_info_dto_TEST
