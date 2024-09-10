#ifndef orders_stats_warehouse_dto_TEST
#define orders_stats_warehouse_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_warehouse_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_warehouse_dto.h"
orders_stats_warehouse_dto_t* instantiate_orders_stats_warehouse_dto(int include_optional);



orders_stats_warehouse_dto_t* instantiate_orders_stats_warehouse_dto(int include_optional) {
  orders_stats_warehouse_dto_t* orders_stats_warehouse_dto = NULL;
  if (include_optional) {
    orders_stats_warehouse_dto = orders_stats_warehouse_dto_create(
      56,
      "0"
    );
  } else {
    orders_stats_warehouse_dto = orders_stats_warehouse_dto_create(
      56,
      "0"
    );
  }

  return orders_stats_warehouse_dto;
}


#ifdef orders_stats_warehouse_dto_MAIN

void test_orders_stats_warehouse_dto(int include_optional) {
    orders_stats_warehouse_dto_t* orders_stats_warehouse_dto_1 = instantiate_orders_stats_warehouse_dto(include_optional);

	cJSON* jsonorders_stats_warehouse_dto_1 = orders_stats_warehouse_dto_convertToJSON(orders_stats_warehouse_dto_1);
	printf("orders_stats_warehouse_dto :\n%s\n", cJSON_Print(jsonorders_stats_warehouse_dto_1));
	orders_stats_warehouse_dto_t* orders_stats_warehouse_dto_2 = orders_stats_warehouse_dto_parseFromJSON(jsonorders_stats_warehouse_dto_1);
	cJSON* jsonorders_stats_warehouse_dto_2 = orders_stats_warehouse_dto_convertToJSON(orders_stats_warehouse_dto_2);
	printf("repeating orders_stats_warehouse_dto:\n%s\n", cJSON_Print(jsonorders_stats_warehouse_dto_2));
}

int main() {
  test_orders_stats_warehouse_dto(1);
  test_orders_stats_warehouse_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_warehouse_dto_MAIN
#endif // orders_stats_warehouse_dto_TEST
