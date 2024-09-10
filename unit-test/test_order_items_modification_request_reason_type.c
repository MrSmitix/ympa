#ifndef order_items_modification_request_reason_type_TEST
#define order_items_modification_request_reason_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_items_modification_request_reason_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_items_modification_request_reason_type.h"
order_items_modification_request_reason_type_t* instantiate_order_items_modification_request_reason_type(int include_optional);



order_items_modification_request_reason_type_t* instantiate_order_items_modification_request_reason_type(int include_optional) {
  order_items_modification_request_reason_type_t* order_items_modification_request_reason_type = NULL;
  if (include_optional) {
    order_items_modification_request_reason_type = order_items_modification_request_reason_type_create(
    );
  } else {
    order_items_modification_request_reason_type = order_items_modification_request_reason_type_create(
    );
  }

  return order_items_modification_request_reason_type;
}


#ifdef order_items_modification_request_reason_type_MAIN

void test_order_items_modification_request_reason_type(int include_optional) {
    order_items_modification_request_reason_type_t* order_items_modification_request_reason_type_1 = instantiate_order_items_modification_request_reason_type(include_optional);

	cJSON* jsonorder_items_modification_request_reason_type_1 = order_items_modification_request_reason_type_convertToJSON(order_items_modification_request_reason_type_1);
	printf("order_items_modification_request_reason_type :\n%s\n", cJSON_Print(jsonorder_items_modification_request_reason_type_1));
	order_items_modification_request_reason_type_t* order_items_modification_request_reason_type_2 = order_items_modification_request_reason_type_parseFromJSON(jsonorder_items_modification_request_reason_type_1);
	cJSON* jsonorder_items_modification_request_reason_type_2 = order_items_modification_request_reason_type_convertToJSON(order_items_modification_request_reason_type_2);
	printf("repeating order_items_modification_request_reason_type:\n%s\n", cJSON_Print(jsonorder_items_modification_request_reason_type_2));
}

int main() {
  test_order_items_modification_request_reason_type(1);
  test_order_items_modification_request_reason_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_items_modification_request_reason_type_MAIN
#endif // order_items_modification_request_reason_type_TEST
