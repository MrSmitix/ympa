#ifndef order_box_layout_dto_TEST
#define order_box_layout_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_box_layout_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_box_layout_dto.h"
order_box_layout_dto_t* instantiate_order_box_layout_dto(int include_optional);



order_box_layout_dto_t* instantiate_order_box_layout_dto(int include_optional) {
  order_box_layout_dto_t* order_box_layout_dto = NULL;
  if (include_optional) {
    order_box_layout_dto = order_box_layout_dto_create(
      list_createList()
    );
  } else {
    order_box_layout_dto = order_box_layout_dto_create(
      list_createList()
    );
  }

  return order_box_layout_dto;
}


#ifdef order_box_layout_dto_MAIN

void test_order_box_layout_dto(int include_optional) {
    order_box_layout_dto_t* order_box_layout_dto_1 = instantiate_order_box_layout_dto(include_optional);

	cJSON* jsonorder_box_layout_dto_1 = order_box_layout_dto_convertToJSON(order_box_layout_dto_1);
	printf("order_box_layout_dto :\n%s\n", cJSON_Print(jsonorder_box_layout_dto_1));
	order_box_layout_dto_t* order_box_layout_dto_2 = order_box_layout_dto_parseFromJSON(jsonorder_box_layout_dto_1);
	cJSON* jsonorder_box_layout_dto_2 = order_box_layout_dto_convertToJSON(order_box_layout_dto_2);
	printf("repeating order_box_layout_dto:\n%s\n", cJSON_Print(jsonorder_box_layout_dto_2));
}

int main() {
  test_order_box_layout_dto(1);
  test_order_box_layout_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_box_layout_dto_MAIN
#endif // order_box_layout_dto_TEST
