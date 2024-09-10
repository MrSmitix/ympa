#ifndef partner_shipment_warehouse_dto_TEST
#define partner_shipment_warehouse_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define partner_shipment_warehouse_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/partner_shipment_warehouse_dto.h"
partner_shipment_warehouse_dto_t* instantiate_partner_shipment_warehouse_dto(int include_optional);



partner_shipment_warehouse_dto_t* instantiate_partner_shipment_warehouse_dto(int include_optional) {
  partner_shipment_warehouse_dto_t* partner_shipment_warehouse_dto = NULL;
  if (include_optional) {
    partner_shipment_warehouse_dto = partner_shipment_warehouse_dto_create(
      56,
      "0",
      "0"
    );
  } else {
    partner_shipment_warehouse_dto = partner_shipment_warehouse_dto_create(
      56,
      "0",
      "0"
    );
  }

  return partner_shipment_warehouse_dto;
}


#ifdef partner_shipment_warehouse_dto_MAIN

void test_partner_shipment_warehouse_dto(int include_optional) {
    partner_shipment_warehouse_dto_t* partner_shipment_warehouse_dto_1 = instantiate_partner_shipment_warehouse_dto(include_optional);

	cJSON* jsonpartner_shipment_warehouse_dto_1 = partner_shipment_warehouse_dto_convertToJSON(partner_shipment_warehouse_dto_1);
	printf("partner_shipment_warehouse_dto :\n%s\n", cJSON_Print(jsonpartner_shipment_warehouse_dto_1));
	partner_shipment_warehouse_dto_t* partner_shipment_warehouse_dto_2 = partner_shipment_warehouse_dto_parseFromJSON(jsonpartner_shipment_warehouse_dto_1);
	cJSON* jsonpartner_shipment_warehouse_dto_2 = partner_shipment_warehouse_dto_convertToJSON(partner_shipment_warehouse_dto_2);
	printf("repeating partner_shipment_warehouse_dto:\n%s\n", cJSON_Print(jsonpartner_shipment_warehouse_dto_2));
}

int main() {
  test_partner_shipment_warehouse_dto(1);
  test_partner_shipment_warehouse_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // partner_shipment_warehouse_dto_MAIN
#endif // partner_shipment_warehouse_dto_TEST
