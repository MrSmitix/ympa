#ifndef order_item_subsidy_dto_TEST
#define order_item_subsidy_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_item_subsidy_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_item_subsidy_dto.h"
order_item_subsidy_dto_t* instantiate_order_item_subsidy_dto(int include_optional);



order_item_subsidy_dto_t* instantiate_order_item_subsidy_dto(int include_optional) {
  order_item_subsidy_dto_t* order_item_subsidy_dto = NULL;
  if (include_optional) {
    order_item_subsidy_dto = order_item_subsidy_dto_create(
      _api__order_item_subsidy_dto__YANDEX_CASHBACK,
      1.337
    );
  } else {
    order_item_subsidy_dto = order_item_subsidy_dto_create(
      _api__order_item_subsidy_dto__YANDEX_CASHBACK,
      1.337
    );
  }

  return order_item_subsidy_dto;
}


#ifdef order_item_subsidy_dto_MAIN

void test_order_item_subsidy_dto(int include_optional) {
    order_item_subsidy_dto_t* order_item_subsidy_dto_1 = instantiate_order_item_subsidy_dto(include_optional);

	cJSON* jsonorder_item_subsidy_dto_1 = order_item_subsidy_dto_convertToJSON(order_item_subsidy_dto_1);
	printf("order_item_subsidy_dto :\n%s\n", cJSON_Print(jsonorder_item_subsidy_dto_1));
	order_item_subsidy_dto_t* order_item_subsidy_dto_2 = order_item_subsidy_dto_parseFromJSON(jsonorder_item_subsidy_dto_1);
	cJSON* jsonorder_item_subsidy_dto_2 = order_item_subsidy_dto_convertToJSON(order_item_subsidy_dto_2);
	printf("repeating order_item_subsidy_dto:\n%s\n", cJSON_Print(jsonorder_item_subsidy_dto_2));
}

int main() {
  test_order_item_subsidy_dto(1);
  test_order_item_subsidy_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_item_subsidy_dto_MAIN
#endif // order_item_subsidy_dto_TEST
