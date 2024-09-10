#ifndef order_payment_method_type_TEST
#define order_payment_method_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_payment_method_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_payment_method_type.h"
order_payment_method_type_t* instantiate_order_payment_method_type(int include_optional);



order_payment_method_type_t* instantiate_order_payment_method_type(int include_optional) {
  order_payment_method_type_t* order_payment_method_type = NULL;
  if (include_optional) {
    order_payment_method_type = order_payment_method_type_create(
    );
  } else {
    order_payment_method_type = order_payment_method_type_create(
    );
  }

  return order_payment_method_type;
}


#ifdef order_payment_method_type_MAIN

void test_order_payment_method_type(int include_optional) {
    order_payment_method_type_t* order_payment_method_type_1 = instantiate_order_payment_method_type(include_optional);

	cJSON* jsonorder_payment_method_type_1 = order_payment_method_type_convertToJSON(order_payment_method_type_1);
	printf("order_payment_method_type :\n%s\n", cJSON_Print(jsonorder_payment_method_type_1));
	order_payment_method_type_t* order_payment_method_type_2 = order_payment_method_type_parseFromJSON(jsonorder_payment_method_type_1);
	cJSON* jsonorder_payment_method_type_2 = order_payment_method_type_convertToJSON(order_payment_method_type_2);
	printf("repeating order_payment_method_type:\n%s\n", cJSON_Print(jsonorder_payment_method_type_2));
}

int main() {
  test_order_payment_method_type(1);
  test_order_payment_method_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_payment_method_type_MAIN
#endif // order_payment_method_type_TEST
