#ifndef order_box_layout_item_dto_TEST
#define order_box_layout_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_box_layout_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_box_layout_item_dto.h"
order_box_layout_item_dto_t* instantiate_order_box_layout_item_dto(int include_optional);

#include "test_order_box_layout_partial_count_dto.c"


order_box_layout_item_dto_t* instantiate_order_box_layout_item_dto(int include_optional) {
  order_box_layout_item_dto_t* order_box_layout_item_dto = NULL;
  if (include_optional) {
    order_box_layout_item_dto = order_box_layout_item_dto_create(
      56,
      1,
       // false, not to have infinite recursion
      instantiate_order_box_layout_partial_count_dto(0),
      list_createList()
    );
  } else {
    order_box_layout_item_dto = order_box_layout_item_dto_create(
      56,
      1,
      NULL,
      list_createList()
    );
  }

  return order_box_layout_item_dto;
}


#ifdef order_box_layout_item_dto_MAIN

void test_order_box_layout_item_dto(int include_optional) {
    order_box_layout_item_dto_t* order_box_layout_item_dto_1 = instantiate_order_box_layout_item_dto(include_optional);

	cJSON* jsonorder_box_layout_item_dto_1 = order_box_layout_item_dto_convertToJSON(order_box_layout_item_dto_1);
	printf("order_box_layout_item_dto :\n%s\n", cJSON_Print(jsonorder_box_layout_item_dto_1));
	order_box_layout_item_dto_t* order_box_layout_item_dto_2 = order_box_layout_item_dto_parseFromJSON(jsonorder_box_layout_item_dto_1);
	cJSON* jsonorder_box_layout_item_dto_2 = order_box_layout_item_dto_convertToJSON(order_box_layout_item_dto_2);
	printf("repeating order_box_layout_item_dto:\n%s\n", cJSON_Print(jsonorder_box_layout_item_dto_2));
}

int main() {
  test_order_box_layout_item_dto(1);
  test_order_box_layout_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_box_layout_item_dto_MAIN
#endif // order_box_layout_item_dto_TEST
