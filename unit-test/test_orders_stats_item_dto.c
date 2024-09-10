#ifndef orders_stats_item_dto_TEST
#define orders_stats_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_item_dto.h"
orders_stats_item_dto_t* instantiate_orders_stats_item_dto(int include_optional);

#include "test_orders_stats_warehouse_dto.c"


orders_stats_item_dto_t* instantiate_orders_stats_item_dto(int include_optional) {
  orders_stats_item_dto_t* orders_stats_item_dto = NULL;
  if (include_optional) {
    orders_stats_item_dto = orders_stats_item_dto_create(
      "0",
      56,
      "a",
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_orders_stats_warehouse_dto(0),
      list_createList(),
      list_createList(),
      56,
      570,
      1.337,
      1.337
    );
  } else {
    orders_stats_item_dto = orders_stats_item_dto_create(
      "0",
      56,
      "a",
      56,
      list_createList(),
      NULL,
      list_createList(),
      list_createList(),
      56,
      570,
      1.337,
      1.337
    );
  }

  return orders_stats_item_dto;
}


#ifdef orders_stats_item_dto_MAIN

void test_orders_stats_item_dto(int include_optional) {
    orders_stats_item_dto_t* orders_stats_item_dto_1 = instantiate_orders_stats_item_dto(include_optional);

	cJSON* jsonorders_stats_item_dto_1 = orders_stats_item_dto_convertToJSON(orders_stats_item_dto_1);
	printf("orders_stats_item_dto :\n%s\n", cJSON_Print(jsonorders_stats_item_dto_1));
	orders_stats_item_dto_t* orders_stats_item_dto_2 = orders_stats_item_dto_parseFromJSON(jsonorders_stats_item_dto_1);
	cJSON* jsonorders_stats_item_dto_2 = orders_stats_item_dto_convertToJSON(orders_stats_item_dto_2);
	printf("repeating orders_stats_item_dto:\n%s\n", cJSON_Print(jsonorders_stats_item_dto_2));
}

int main() {
  test_orders_stats_item_dto(1);
  test_orders_stats_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_item_dto_MAIN
#endif // orders_stats_item_dto_TEST
