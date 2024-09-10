#ifndef order_boxes_layout_dto_TEST
#define order_boxes_layout_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_boxes_layout_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_boxes_layout_dto.h"
order_boxes_layout_dto_t* instantiate_order_boxes_layout_dto(int include_optional);



order_boxes_layout_dto_t* instantiate_order_boxes_layout_dto(int include_optional) {
  order_boxes_layout_dto_t* order_boxes_layout_dto = NULL;
  if (include_optional) {
    order_boxes_layout_dto = order_boxes_layout_dto_create(
      list_createList()
    );
  } else {
    order_boxes_layout_dto = order_boxes_layout_dto_create(
      list_createList()
    );
  }

  return order_boxes_layout_dto;
}


#ifdef order_boxes_layout_dto_MAIN

void test_order_boxes_layout_dto(int include_optional) {
    order_boxes_layout_dto_t* order_boxes_layout_dto_1 = instantiate_order_boxes_layout_dto(include_optional);

	cJSON* jsonorder_boxes_layout_dto_1 = order_boxes_layout_dto_convertToJSON(order_boxes_layout_dto_1);
	printf("order_boxes_layout_dto :\n%s\n", cJSON_Print(jsonorder_boxes_layout_dto_1));
	order_boxes_layout_dto_t* order_boxes_layout_dto_2 = order_boxes_layout_dto_parseFromJSON(jsonorder_boxes_layout_dto_1);
	cJSON* jsonorder_boxes_layout_dto_2 = order_boxes_layout_dto_convertToJSON(order_boxes_layout_dto_2);
	printf("repeating order_boxes_layout_dto:\n%s\n", cJSON_Print(jsonorder_boxes_layout_dto_2));
}

int main() {
  test_order_boxes_layout_dto(1);
  test_order_boxes_layout_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_boxes_layout_dto_MAIN
#endif // order_boxes_layout_dto_TEST
