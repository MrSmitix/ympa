#ifndef order_item_instance_type_TEST
#define order_item_instance_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_item_instance_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_item_instance_type.h"
order_item_instance_type_t* instantiate_order_item_instance_type(int include_optional);



order_item_instance_type_t* instantiate_order_item_instance_type(int include_optional) {
  order_item_instance_type_t* order_item_instance_type = NULL;
  if (include_optional) {
    order_item_instance_type = order_item_instance_type_create(
    );
  } else {
    order_item_instance_type = order_item_instance_type_create(
    );
  }

  return order_item_instance_type;
}


#ifdef order_item_instance_type_MAIN

void test_order_item_instance_type(int include_optional) {
    order_item_instance_type_t* order_item_instance_type_1 = instantiate_order_item_instance_type(include_optional);

	cJSON* jsonorder_item_instance_type_1 = order_item_instance_type_convertToJSON(order_item_instance_type_1);
	printf("order_item_instance_type :\n%s\n", cJSON_Print(jsonorder_item_instance_type_1));
	order_item_instance_type_t* order_item_instance_type_2 = order_item_instance_type_parseFromJSON(jsonorder_item_instance_type_1);
	cJSON* jsonorder_item_instance_type_2 = order_item_instance_type_convertToJSON(order_item_instance_type_2);
	printf("repeating order_item_instance_type:\n%s\n", cJSON_Print(jsonorder_item_instance_type_2));
}

int main() {
  test_order_item_instance_type(1);
  test_order_item_instance_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_item_instance_type_MAIN
#endif // order_item_instance_type_TEST
