#ifndef shipment_status_change_dto_TEST
#define shipment_status_change_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shipment_status_change_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shipment_status_change_dto.h"
shipment_status_change_dto_t* instantiate_shipment_status_change_dto(int include_optional);



shipment_status_change_dto_t* instantiate_shipment_status_change_dto(int include_optional) {
  shipment_status_change_dto_t* shipment_status_change_dto = NULL;
  if (include_optional) {
    shipment_status_change_dto = shipment_status_change_dto_create(
      _api__shipment_status_change_dto__OUTBOUND_CREATED,
      "0",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    shipment_status_change_dto = shipment_status_change_dto_create(
      _api__shipment_status_change_dto__OUTBOUND_CREATED,
      "0",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return shipment_status_change_dto;
}


#ifdef shipment_status_change_dto_MAIN

void test_shipment_status_change_dto(int include_optional) {
    shipment_status_change_dto_t* shipment_status_change_dto_1 = instantiate_shipment_status_change_dto(include_optional);

	cJSON* jsonshipment_status_change_dto_1 = shipment_status_change_dto_convertToJSON(shipment_status_change_dto_1);
	printf("shipment_status_change_dto :\n%s\n", cJSON_Print(jsonshipment_status_change_dto_1));
	shipment_status_change_dto_t* shipment_status_change_dto_2 = shipment_status_change_dto_parseFromJSON(jsonshipment_status_change_dto_1);
	cJSON* jsonshipment_status_change_dto_2 = shipment_status_change_dto_convertToJSON(shipment_status_change_dto_2);
	printf("repeating shipment_status_change_dto:\n%s\n", cJSON_Print(jsonshipment_status_change_dto_2));
}

int main() {
  test_shipment_status_change_dto(1);
  test_shipment_status_change_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // shipment_status_change_dto_MAIN
#endif // shipment_status_change_dto_TEST
