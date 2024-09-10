#ifndef fulfillment_warehouse_dto_TEST
#define fulfillment_warehouse_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fulfillment_warehouse_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fulfillment_warehouse_dto.h"
fulfillment_warehouse_dto_t* instantiate_fulfillment_warehouse_dto(int include_optional);

#include "test_warehouse_address_dto.c"


fulfillment_warehouse_dto_t* instantiate_fulfillment_warehouse_dto(int include_optional) {
  fulfillment_warehouse_dto_t* fulfillment_warehouse_dto = NULL;
  if (include_optional) {
    fulfillment_warehouse_dto = fulfillment_warehouse_dto_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_warehouse_address_dto(0)
    );
  } else {
    fulfillment_warehouse_dto = fulfillment_warehouse_dto_create(
      56,
      "0",
      NULL
    );
  }

  return fulfillment_warehouse_dto;
}


#ifdef fulfillment_warehouse_dto_MAIN

void test_fulfillment_warehouse_dto(int include_optional) {
    fulfillment_warehouse_dto_t* fulfillment_warehouse_dto_1 = instantiate_fulfillment_warehouse_dto(include_optional);

	cJSON* jsonfulfillment_warehouse_dto_1 = fulfillment_warehouse_dto_convertToJSON(fulfillment_warehouse_dto_1);
	printf("fulfillment_warehouse_dto :\n%s\n", cJSON_Print(jsonfulfillment_warehouse_dto_1));
	fulfillment_warehouse_dto_t* fulfillment_warehouse_dto_2 = fulfillment_warehouse_dto_parseFromJSON(jsonfulfillment_warehouse_dto_1);
	cJSON* jsonfulfillment_warehouse_dto_2 = fulfillment_warehouse_dto_convertToJSON(fulfillment_warehouse_dto_2);
	printf("repeating fulfillment_warehouse_dto:\n%s\n", cJSON_Print(jsonfulfillment_warehouse_dto_2));
}

int main() {
  test_fulfillment_warehouse_dto(1);
  test_fulfillment_warehouse_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // fulfillment_warehouse_dto_MAIN
#endif // fulfillment_warehouse_dto_TEST
