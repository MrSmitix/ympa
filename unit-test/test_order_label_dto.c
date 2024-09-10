#ifndef order_label_dto_TEST
#define order_label_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_label_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_label_dto.h"
order_label_dto_t* instantiate_order_label_dto(int include_optional);



order_label_dto_t* instantiate_order_label_dto(int include_optional) {
  order_label_dto_t* order_label_dto = NULL;
  if (include_optional) {
    order_label_dto = order_label_dto_create(
      56,
      56,
      "0",
      list_createList()
    );
  } else {
    order_label_dto = order_label_dto_create(
      56,
      56,
      "0",
      list_createList()
    );
  }

  return order_label_dto;
}


#ifdef order_label_dto_MAIN

void test_order_label_dto(int include_optional) {
    order_label_dto_t* order_label_dto_1 = instantiate_order_label_dto(include_optional);

	cJSON* jsonorder_label_dto_1 = order_label_dto_convertToJSON(order_label_dto_1);
	printf("order_label_dto :\n%s\n", cJSON_Print(jsonorder_label_dto_1));
	order_label_dto_t* order_label_dto_2 = order_label_dto_parseFromJSON(jsonorder_label_dto_1);
	cJSON* jsonorder_label_dto_2 = order_label_dto_convertToJSON(order_label_dto_2);
	printf("repeating order_label_dto:\n%s\n", cJSON_Print(jsonorder_label_dto_2));
}

int main() {
  test_order_label_dto(1);
  test_order_label_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_label_dto_MAIN
#endif // order_label_dto_TEST
