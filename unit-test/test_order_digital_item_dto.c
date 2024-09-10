#ifndef order_digital_item_dto_TEST
#define order_digital_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_digital_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_digital_item_dto.h"
order_digital_item_dto_t* instantiate_order_digital_item_dto(int include_optional);



order_digital_item_dto_t* instantiate_order_digital_item_dto(int include_optional) {
  order_digital_item_dto_t* order_digital_item_dto = NULL;
  if (include_optional) {
    order_digital_item_dto = order_digital_item_dto_create(
      56,
      "0",
      "0",
      "2013-10-20"
    );
  } else {
    order_digital_item_dto = order_digital_item_dto_create(
      56,
      "0",
      "0",
      "2013-10-20"
    );
  }

  return order_digital_item_dto;
}


#ifdef order_digital_item_dto_MAIN

void test_order_digital_item_dto(int include_optional) {
    order_digital_item_dto_t* order_digital_item_dto_1 = instantiate_order_digital_item_dto(include_optional);

	cJSON* jsonorder_digital_item_dto_1 = order_digital_item_dto_convertToJSON(order_digital_item_dto_1);
	printf("order_digital_item_dto :\n%s\n", cJSON_Print(jsonorder_digital_item_dto_1));
	order_digital_item_dto_t* order_digital_item_dto_2 = order_digital_item_dto_parseFromJSON(jsonorder_digital_item_dto_1);
	cJSON* jsonorder_digital_item_dto_2 = order_digital_item_dto_convertToJSON(order_digital_item_dto_2);
	printf("repeating order_digital_item_dto:\n%s\n", cJSON_Print(jsonorder_digital_item_dto_2));
}

int main() {
  test_order_digital_item_dto(1);
  test_order_digital_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_digital_item_dto_MAIN
#endif // order_digital_item_dto_TEST
