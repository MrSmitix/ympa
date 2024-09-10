#ifndef orders_stats_commission_dto_TEST
#define orders_stats_commission_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_commission_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_commission_dto.h"
orders_stats_commission_dto_t* instantiate_orders_stats_commission_dto(int include_optional);



orders_stats_commission_dto_t* instantiate_orders_stats_commission_dto(int include_optional) {
  orders_stats_commission_dto_t* orders_stats_commission_dto = NULL;
  if (include_optional) {
    orders_stats_commission_dto = orders_stats_commission_dto_create(
      _api__orders_stats_commission_dto__FEE,
      1.337
    );
  } else {
    orders_stats_commission_dto = orders_stats_commission_dto_create(
      _api__orders_stats_commission_dto__FEE,
      1.337
    );
  }

  return orders_stats_commission_dto;
}


#ifdef orders_stats_commission_dto_MAIN

void test_orders_stats_commission_dto(int include_optional) {
    orders_stats_commission_dto_t* orders_stats_commission_dto_1 = instantiate_orders_stats_commission_dto(include_optional);

	cJSON* jsonorders_stats_commission_dto_1 = orders_stats_commission_dto_convertToJSON(orders_stats_commission_dto_1);
	printf("orders_stats_commission_dto :\n%s\n", cJSON_Print(jsonorders_stats_commission_dto_1));
	orders_stats_commission_dto_t* orders_stats_commission_dto_2 = orders_stats_commission_dto_parseFromJSON(jsonorders_stats_commission_dto_1);
	cJSON* jsonorders_stats_commission_dto_2 = orders_stats_commission_dto_convertToJSON(orders_stats_commission_dto_2);
	printf("repeating orders_stats_commission_dto:\n%s\n", cJSON_Print(jsonorders_stats_commission_dto_2));
}

int main() {
  test_orders_stats_commission_dto(1);
  test_orders_stats_commission_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_commission_dto_MAIN
#endif // orders_stats_commission_dto_TEST
