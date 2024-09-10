#ifndef order_delivery_dto_TEST
#define order_delivery_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_delivery_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_delivery_dto.h"
order_delivery_dto_t* instantiate_order_delivery_dto(int include_optional);

#include "test_order_courier_dto.c"
#include "test_order_delivery_dates_dto.c"
#include "test_region_dto.c"
#include "test_order_delivery_address_dto.c"


order_delivery_dto_t* instantiate_order_delivery_dto(int include_optional) {
  order_delivery_dto_t* order_delivery_dto = NULL;
  if (include_optional) {
    order_delivery_dto = order_delivery_dto_create(
      "0",
      _api__order_delivery_dto__DELIVERY,
      "0",
      1.337,
      _api__order_delivery_dto__SHOP,
       // false, not to have infinite recursion
      instantiate_order_courier_dto(0),
       // false, not to have infinite recursion
      instantiate_order_delivery_dates_dto(0),
       // false, not to have infinite recursion
      instantiate_region_dto(0),
       // false, not to have infinite recursion
      instantiate_order_delivery_address_dto(0),
      _api__order_delivery_dto__NO_VAT,
      56,
      _api__order_delivery_dto__NOT_NEEDED,
      1.337,
      "0",
      "23-09-2022",
      _api__order_delivery_dto__UNKNOWN,
      list_createList(),
      list_createList(),
      1,
      _api__order_delivery_dto__MERCHANT_TO_COURIER,
      "0"
    );
  } else {
    order_delivery_dto = order_delivery_dto_create(
      "0",
      _api__order_delivery_dto__DELIVERY,
      "0",
      1.337,
      _api__order_delivery_dto__SHOP,
      NULL,
      NULL,
      NULL,
      NULL,
      _api__order_delivery_dto__NO_VAT,
      56,
      _api__order_delivery_dto__NOT_NEEDED,
      1.337,
      "0",
      "23-09-2022",
      _api__order_delivery_dto__UNKNOWN,
      list_createList(),
      list_createList(),
      1,
      _api__order_delivery_dto__MERCHANT_TO_COURIER,
      "0"
    );
  }

  return order_delivery_dto;
}


#ifdef order_delivery_dto_MAIN

void test_order_delivery_dto(int include_optional) {
    order_delivery_dto_t* order_delivery_dto_1 = instantiate_order_delivery_dto(include_optional);

	cJSON* jsonorder_delivery_dto_1 = order_delivery_dto_convertToJSON(order_delivery_dto_1);
	printf("order_delivery_dto :\n%s\n", cJSON_Print(jsonorder_delivery_dto_1));
	order_delivery_dto_t* order_delivery_dto_2 = order_delivery_dto_parseFromJSON(jsonorder_delivery_dto_1);
	cJSON* jsonorder_delivery_dto_2 = order_delivery_dto_convertToJSON(order_delivery_dto_2);
	printf("repeating order_delivery_dto:\n%s\n", cJSON_Print(jsonorder_delivery_dto_2));
}

int main() {
  test_order_delivery_dto(1);
  test_order_delivery_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_delivery_dto_MAIN
#endif // order_delivery_dto_TEST
