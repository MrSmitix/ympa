#ifndef order_lift_type_TEST
#define order_lift_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_lift_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_lift_type.h"
order_lift_type_t* instantiate_order_lift_type(int include_optional);



order_lift_type_t* instantiate_order_lift_type(int include_optional) {
  order_lift_type_t* order_lift_type = NULL;
  if (include_optional) {
    order_lift_type = order_lift_type_create(
    );
  } else {
    order_lift_type = order_lift_type_create(
    );
  }

  return order_lift_type;
}


#ifdef order_lift_type_MAIN

void test_order_lift_type(int include_optional) {
    order_lift_type_t* order_lift_type_1 = instantiate_order_lift_type(include_optional);

	cJSON* jsonorder_lift_type_1 = order_lift_type_convertToJSON(order_lift_type_1);
	printf("order_lift_type :\n%s\n", cJSON_Print(jsonorder_lift_type_1));
	order_lift_type_t* order_lift_type_2 = order_lift_type_parseFromJSON(jsonorder_lift_type_1);
	cJSON* jsonorder_lift_type_2 = order_lift_type_convertToJSON(order_lift_type_2);
	printf("repeating order_lift_type:\n%s\n", cJSON_Print(jsonorder_lift_type_2));
}

int main() {
  test_order_lift_type(1);
  test_order_lift_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_lift_type_MAIN
#endif // order_lift_type_TEST
