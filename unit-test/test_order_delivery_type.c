#ifndef order_delivery_type_TEST
#define order_delivery_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_delivery_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_delivery_type.h"
order_delivery_type_t* instantiate_order_delivery_type(int include_optional);



order_delivery_type_t* instantiate_order_delivery_type(int include_optional) {
  order_delivery_type_t* order_delivery_type = NULL;
  if (include_optional) {
    order_delivery_type = order_delivery_type_create(
    );
  } else {
    order_delivery_type = order_delivery_type_create(
    );
  }

  return order_delivery_type;
}


#ifdef order_delivery_type_MAIN

void test_order_delivery_type(int include_optional) {
    order_delivery_type_t* order_delivery_type_1 = instantiate_order_delivery_type(include_optional);

	cJSON* jsonorder_delivery_type_1 = order_delivery_type_convertToJSON(order_delivery_type_1);
	printf("order_delivery_type :\n%s\n", cJSON_Print(jsonorder_delivery_type_1));
	order_delivery_type_t* order_delivery_type_2 = order_delivery_type_parseFromJSON(jsonorder_delivery_type_1);
	cJSON* jsonorder_delivery_type_2 = order_delivery_type_convertToJSON(order_delivery_type_2);
	printf("repeating order_delivery_type:\n%s\n", cJSON_Print(jsonorder_delivery_type_2));
}

int main() {
  test_order_delivery_type(1);
  test_order_delivery_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_delivery_type_MAIN
#endif // order_delivery_type_TEST
