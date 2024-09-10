#ifndef order_items_modification_result_dto_TEST
#define order_items_modification_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_items_modification_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_items_modification_result_dto.h"
order_items_modification_result_dto_t* instantiate_order_items_modification_result_dto(int include_optional);



order_items_modification_result_dto_t* instantiate_order_items_modification_result_dto(int include_optional) {
  order_items_modification_result_dto_t* order_items_modification_result_dto = NULL;
  if (include_optional) {
    order_items_modification_result_dto = order_items_modification_result_dto_create(
      list_createList()
    );
  } else {
    order_items_modification_result_dto = order_items_modification_result_dto_create(
      list_createList()
    );
  }

  return order_items_modification_result_dto;
}


#ifdef order_items_modification_result_dto_MAIN

void test_order_items_modification_result_dto(int include_optional) {
    order_items_modification_result_dto_t* order_items_modification_result_dto_1 = instantiate_order_items_modification_result_dto(include_optional);

	cJSON* jsonorder_items_modification_result_dto_1 = order_items_modification_result_dto_convertToJSON(order_items_modification_result_dto_1);
	printf("order_items_modification_result_dto :\n%s\n", cJSON_Print(jsonorder_items_modification_result_dto_1));
	order_items_modification_result_dto_t* order_items_modification_result_dto_2 = order_items_modification_result_dto_parseFromJSON(jsonorder_items_modification_result_dto_1);
	cJSON* jsonorder_items_modification_result_dto_2 = order_items_modification_result_dto_convertToJSON(order_items_modification_result_dto_2);
	printf("repeating order_items_modification_result_dto:\n%s\n", cJSON_Print(jsonorder_items_modification_result_dto_2));
}

int main() {
  test_order_items_modification_result_dto(1);
  test_order_items_modification_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_items_modification_result_dto_MAIN
#endif // order_items_modification_result_dto_TEST
