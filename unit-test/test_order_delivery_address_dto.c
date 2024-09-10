#ifndef order_delivery_address_dto_TEST
#define order_delivery_address_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_delivery_address_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_delivery_address_dto.h"
order_delivery_address_dto_t* instantiate_order_delivery_address_dto(int include_optional);

#include "test_gps_dto.c"


order_delivery_address_dto_t* instantiate_order_delivery_address_dto(int include_optional) {
  order_delivery_address_dto_t* order_delivery_address_dto = NULL;
  if (include_optional) {
    order_delivery_address_dto = order_delivery_address_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_gps_dto(0)
    );
  } else {
    order_delivery_address_dto = order_delivery_address_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL
    );
  }

  return order_delivery_address_dto;
}


#ifdef order_delivery_address_dto_MAIN

void test_order_delivery_address_dto(int include_optional) {
    order_delivery_address_dto_t* order_delivery_address_dto_1 = instantiate_order_delivery_address_dto(include_optional);

	cJSON* jsonorder_delivery_address_dto_1 = order_delivery_address_dto_convertToJSON(order_delivery_address_dto_1);
	printf("order_delivery_address_dto :\n%s\n", cJSON_Print(jsonorder_delivery_address_dto_1));
	order_delivery_address_dto_t* order_delivery_address_dto_2 = order_delivery_address_dto_parseFromJSON(jsonorder_delivery_address_dto_1);
	cJSON* jsonorder_delivery_address_dto_2 = order_delivery_address_dto_convertToJSON(order_delivery_address_dto_2);
	printf("repeating order_delivery_address_dto:\n%s\n", cJSON_Print(jsonorder_delivery_address_dto_2));
}

int main() {
  test_order_delivery_address_dto(1);
  test_order_delivery_address_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_delivery_address_dto_MAIN
#endif // order_delivery_address_dto_TEST
