#ifndef orders_stats_order_dto_TEST
#define orders_stats_order_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_order_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_order_dto.h"
orders_stats_order_dto_t* instantiate_orders_stats_order_dto(int include_optional);

#include "test_orders_stats_delivery_region_dto.c"


orders_stats_order_dto_t* instantiate_orders_stats_order_dto(int include_optional) {
  orders_stats_order_dto_t* orders_stats_order_dto = NULL;
  if (include_optional) {
    orders_stats_order_dto = orders_stats_order_dto_create(
      56,
      "2013-10-20",
      "2013-10-20T19:20:30+01:00",
      _api__orders_stats_order_dto__CANCELLED_BEFORE_PROCESSING,
      "0",
      _api__orders_stats_order_dto__CREDIT,
      1,
       // false, not to have infinite recursion
      instantiate_orders_stats_delivery_region_dto(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    orders_stats_order_dto = orders_stats_order_dto_create(
      56,
      "2013-10-20",
      "2013-10-20T19:20:30+01:00",
      _api__orders_stats_order_dto__CANCELLED_BEFORE_PROCESSING,
      "0",
      _api__orders_stats_order_dto__CREDIT,
      1,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return orders_stats_order_dto;
}


#ifdef orders_stats_order_dto_MAIN

void test_orders_stats_order_dto(int include_optional) {
    orders_stats_order_dto_t* orders_stats_order_dto_1 = instantiate_orders_stats_order_dto(include_optional);

	cJSON* jsonorders_stats_order_dto_1 = orders_stats_order_dto_convertToJSON(orders_stats_order_dto_1);
	printf("orders_stats_order_dto :\n%s\n", cJSON_Print(jsonorders_stats_order_dto_1));
	orders_stats_order_dto_t* orders_stats_order_dto_2 = orders_stats_order_dto_parseFromJSON(jsonorders_stats_order_dto_1);
	cJSON* jsonorders_stats_order_dto_2 = orders_stats_order_dto_convertToJSON(orders_stats_order_dto_2);
	printf("repeating orders_stats_order_dto:\n%s\n", cJSON_Print(jsonorders_stats_order_dto_2));
}

int main() {
  test_orders_stats_order_dto(1);
  test_orders_stats_order_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_order_dto_MAIN
#endif // orders_stats_order_dto_TEST
