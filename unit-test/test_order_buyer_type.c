#ifndef order_buyer_type_TEST
#define order_buyer_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_buyer_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_buyer_type.h"
order_buyer_type_t* instantiate_order_buyer_type(int include_optional);



order_buyer_type_t* instantiate_order_buyer_type(int include_optional) {
  order_buyer_type_t* order_buyer_type = NULL;
  if (include_optional) {
    order_buyer_type = order_buyer_type_create(
    );
  } else {
    order_buyer_type = order_buyer_type_create(
    );
  }

  return order_buyer_type;
}


#ifdef order_buyer_type_MAIN

void test_order_buyer_type(int include_optional) {
    order_buyer_type_t* order_buyer_type_1 = instantiate_order_buyer_type(include_optional);

	cJSON* jsonorder_buyer_type_1 = order_buyer_type_convertToJSON(order_buyer_type_1);
	printf("order_buyer_type :\n%s\n", cJSON_Print(jsonorder_buyer_type_1));
	order_buyer_type_t* order_buyer_type_2 = order_buyer_type_parseFromJSON(jsonorder_buyer_type_1);
	cJSON* jsonorder_buyer_type_2 = order_buyer_type_convertToJSON(order_buyer_type_2);
	printf("repeating order_buyer_type:\n%s\n", cJSON_Print(jsonorder_buyer_type_2));
}

int main() {
  test_order_buyer_type(1);
  test_order_buyer_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_buyer_type_MAIN
#endif // order_buyer_type_TEST
