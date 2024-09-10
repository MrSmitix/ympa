#ifndef orders_stats_stock_type_TEST
#define orders_stats_stock_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_stock_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_stock_type.h"
orders_stats_stock_type_t* instantiate_orders_stats_stock_type(int include_optional);



orders_stats_stock_type_t* instantiate_orders_stats_stock_type(int include_optional) {
  orders_stats_stock_type_t* orders_stats_stock_type = NULL;
  if (include_optional) {
    orders_stats_stock_type = orders_stats_stock_type_create(
    );
  } else {
    orders_stats_stock_type = orders_stats_stock_type_create(
    );
  }

  return orders_stats_stock_type;
}


#ifdef orders_stats_stock_type_MAIN

void test_orders_stats_stock_type(int include_optional) {
    orders_stats_stock_type_t* orders_stats_stock_type_1 = instantiate_orders_stats_stock_type(include_optional);

	cJSON* jsonorders_stats_stock_type_1 = orders_stats_stock_type_convertToJSON(orders_stats_stock_type_1);
	printf("orders_stats_stock_type :\n%s\n", cJSON_Print(jsonorders_stats_stock_type_1));
	orders_stats_stock_type_t* orders_stats_stock_type_2 = orders_stats_stock_type_parseFromJSON(jsonorders_stats_stock_type_1);
	cJSON* jsonorders_stats_stock_type_2 = orders_stats_stock_type_convertToJSON(orders_stats_stock_type_2);
	printf("repeating orders_stats_stock_type:\n%s\n", cJSON_Print(jsonorders_stats_stock_type_2));
}

int main() {
  test_orders_stats_stock_type(1);
  test_orders_stats_stock_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_stock_type_MAIN
#endif // orders_stats_stock_type_TEST
