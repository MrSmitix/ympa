#ifndef order_status_change_delivery_dto_TEST
#define order_status_change_delivery_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_status_change_delivery_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_status_change_delivery_dto.h"
order_status_change_delivery_dto_t* instantiate_order_status_change_delivery_dto(int include_optional);

#include "test_order_status_change_delivery_dates_dto.c"


order_status_change_delivery_dto_t* instantiate_order_status_change_delivery_dto(int include_optional) {
  order_status_change_delivery_dto_t* order_status_change_delivery_dto = NULL;
  if (include_optional) {
    order_status_change_delivery_dto = order_status_change_delivery_dto_create(
       // false, not to have infinite recursion
      instantiate_order_status_change_delivery_dates_dto(0)
    );
  } else {
    order_status_change_delivery_dto = order_status_change_delivery_dto_create(
      NULL
    );
  }

  return order_status_change_delivery_dto;
}


#ifdef order_status_change_delivery_dto_MAIN

void test_order_status_change_delivery_dto(int include_optional) {
    order_status_change_delivery_dto_t* order_status_change_delivery_dto_1 = instantiate_order_status_change_delivery_dto(include_optional);

	cJSON* jsonorder_status_change_delivery_dto_1 = order_status_change_delivery_dto_convertToJSON(order_status_change_delivery_dto_1);
	printf("order_status_change_delivery_dto :\n%s\n", cJSON_Print(jsonorder_status_change_delivery_dto_1));
	order_status_change_delivery_dto_t* order_status_change_delivery_dto_2 = order_status_change_delivery_dto_parseFromJSON(jsonorder_status_change_delivery_dto_1);
	cJSON* jsonorder_status_change_delivery_dto_2 = order_status_change_delivery_dto_convertToJSON(order_status_change_delivery_dto_2);
	printf("repeating order_status_change_delivery_dto:\n%s\n", cJSON_Print(jsonorder_status_change_delivery_dto_2));
}

int main() {
  test_order_status_change_delivery_dto(1);
  test_order_status_change_delivery_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_status_change_delivery_dto_MAIN
#endif // order_status_change_delivery_dto_TEST
