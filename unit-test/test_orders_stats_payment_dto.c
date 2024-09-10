#ifndef orders_stats_payment_dto_TEST
#define orders_stats_payment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_stats_payment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_stats_payment_dto.h"
orders_stats_payment_dto_t* instantiate_orders_stats_payment_dto(int include_optional);

#include "test_orders_stats_payment_order_dto.c"


orders_stats_payment_dto_t* instantiate_orders_stats_payment_dto(int include_optional) {
  orders_stats_payment_dto_t* orders_stats_payment_dto = NULL;
  if (include_optional) {
    orders_stats_payment_dto = orders_stats_payment_dto_create(
      "0",
      "2013-10-20",
      _api__orders_stats_payment_dto__PAYMENT,
      _api__orders_stats_payment_dto__BUYER,
      1.337,
       // false, not to have infinite recursion
      instantiate_orders_stats_payment_order_dto(0)
    );
  } else {
    orders_stats_payment_dto = orders_stats_payment_dto_create(
      "0",
      "2013-10-20",
      _api__orders_stats_payment_dto__PAYMENT,
      _api__orders_stats_payment_dto__BUYER,
      1.337,
      NULL
    );
  }

  return orders_stats_payment_dto;
}


#ifdef orders_stats_payment_dto_MAIN

void test_orders_stats_payment_dto(int include_optional) {
    orders_stats_payment_dto_t* orders_stats_payment_dto_1 = instantiate_orders_stats_payment_dto(include_optional);

	cJSON* jsonorders_stats_payment_dto_1 = orders_stats_payment_dto_convertToJSON(orders_stats_payment_dto_1);
	printf("orders_stats_payment_dto :\n%s\n", cJSON_Print(jsonorders_stats_payment_dto_1));
	orders_stats_payment_dto_t* orders_stats_payment_dto_2 = orders_stats_payment_dto_parseFromJSON(jsonorders_stats_payment_dto_1);
	cJSON* jsonorders_stats_payment_dto_2 = orders_stats_payment_dto_convertToJSON(orders_stats_payment_dto_2);
	printf("repeating orders_stats_payment_dto:\n%s\n", cJSON_Print(jsonorders_stats_payment_dto_2));
}

int main() {
  test_orders_stats_payment_dto(1);
  test_orders_stats_payment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_stats_payment_dto_MAIN
#endif // orders_stats_payment_dto_TEST
