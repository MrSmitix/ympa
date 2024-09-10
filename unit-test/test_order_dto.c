#ifndef order_dto_TEST
#define order_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_dto.h"
order_dto_t* instantiate_order_dto(int include_optional);

#include "test_order_delivery_dto.c"
#include "test_order_buyer_dto.c"


order_dto_t* instantiate_order_dto(int include_optional) {
  order_dto_t* order_dto = NULL;
  if (include_optional) {
    order_dto = order_dto_create(
      56,
      _api__order_dto__PLACING,
      _api__order_dto__RESERVATION_EXPIRED,
      "23-09-2022 09:12:41",
      "23-09-2022 09:12:41",
      _api__order_dto__RUR,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      _api__order_dto__PREPAID,
      _api__order_dto__CASH_ON_DELIVERY,
      1,
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_order_delivery_dto(0),
       // false, not to have infinite recursion
      instantiate_order_buyer_dto(0),
      "0",
      _api__order_dto__OSN,
      1,
      "23-09-2022 09:12:41"
    );
  } else {
    order_dto = order_dto_create(
      56,
      _api__order_dto__PLACING,
      _api__order_dto__RESERVATION_EXPIRED,
      "23-09-2022 09:12:41",
      "23-09-2022 09:12:41",
      _api__order_dto__RUR,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      _api__order_dto__PREPAID,
      _api__order_dto__CASH_ON_DELIVERY,
      1,
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      "0",
      _api__order_dto__OSN,
      1,
      "23-09-2022 09:12:41"
    );
  }

  return order_dto;
}


#ifdef order_dto_MAIN

void test_order_dto(int include_optional) {
    order_dto_t* order_dto_1 = instantiate_order_dto(include_optional);

	cJSON* jsonorder_dto_1 = order_dto_convertToJSON(order_dto_1);
	printf("order_dto :\n%s\n", cJSON_Print(jsonorder_dto_1));
	order_dto_t* order_dto_2 = order_dto_parseFromJSON(jsonorder_dto_1);
	cJSON* jsonorder_dto_2 = order_dto_convertToJSON(order_dto_2);
	printf("repeating order_dto:\n%s\n", cJSON_Print(jsonorder_dto_2));
}

int main() {
  test_order_dto(1);
  test_order_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_dto_MAIN
#endif // order_dto_TEST
