#ifndef order_courier_dto_TEST
#define order_courier_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_courier_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_courier_dto.h"
order_courier_dto_t* instantiate_order_courier_dto(int include_optional);



order_courier_dto_t* instantiate_order_courier_dto(int include_optional) {
  order_courier_dto_t* order_courier_dto = NULL;
  if (include_optional) {
    order_courier_dto = order_courier_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    order_courier_dto = order_courier_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  }

  return order_courier_dto;
}


#ifdef order_courier_dto_MAIN

void test_order_courier_dto(int include_optional) {
    order_courier_dto_t* order_courier_dto_1 = instantiate_order_courier_dto(include_optional);

	cJSON* jsonorder_courier_dto_1 = order_courier_dto_convertToJSON(order_courier_dto_1);
	printf("order_courier_dto :\n%s\n", cJSON_Print(jsonorder_courier_dto_1));
	order_courier_dto_t* order_courier_dto_2 = order_courier_dto_parseFromJSON(jsonorder_courier_dto_1);
	cJSON* jsonorder_courier_dto_2 = order_courier_dto_convertToJSON(order_courier_dto_2);
	printf("repeating order_courier_dto:\n%s\n", cJSON_Print(jsonorder_courier_dto_2));
}

int main() {
  test_order_courier_dto(1);
  test_order_courier_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_courier_dto_MAIN
#endif // order_courier_dto_TEST
