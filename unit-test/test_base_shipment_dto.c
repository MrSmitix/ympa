#ifndef base_shipment_dto_TEST
#define base_shipment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_shipment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_shipment_dto.h"
base_shipment_dto_t* instantiate_base_shipment_dto(int include_optional);

#include "test_partner_shipment_warehouse_dto.c"
#include "test_partner_shipment_warehouse_dto.c"
#include "test_delivery_service_dto.c"
#include "test_pallets_count_dto.c"


base_shipment_dto_t* instantiate_base_shipment_dto(int include_optional) {
  base_shipment_dto_t* base_shipment_dto = NULL;
  if (include_optional) {
    base_shipment_dto = base_shipment_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__base_shipment_dto__IMPORT,
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
      56
    );
  } else {
    base_shipment_dto = base_shipment_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__base_shipment_dto__IMPORT,
      NULL,
      NULL,
      "0",
      NULL,
      NULL,
      list_createList(),
      56,
      56,
      56
    );
  }

  return base_shipment_dto;
}


#ifdef base_shipment_dto_MAIN

void test_base_shipment_dto(int include_optional) {
    base_shipment_dto_t* base_shipment_dto_1 = instantiate_base_shipment_dto(include_optional);

	cJSON* jsonbase_shipment_dto_1 = base_shipment_dto_convertToJSON(base_shipment_dto_1);
	printf("base_shipment_dto :\n%s\n", cJSON_Print(jsonbase_shipment_dto_1));
	base_shipment_dto_t* base_shipment_dto_2 = base_shipment_dto_parseFromJSON(jsonbase_shipment_dto_1);
	cJSON* jsonbase_shipment_dto_2 = base_shipment_dto_convertToJSON(base_shipment_dto_2);
	printf("repeating base_shipment_dto:\n%s\n", cJSON_Print(jsonbase_shipment_dto_2));
}

int main() {
  test_base_shipment_dto(1);
  test_base_shipment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_shipment_dto_MAIN
#endif // base_shipment_dto_TEST
