#ifndef order_substatus_type_TEST
#define order_substatus_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_substatus_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_substatus_type.h"
order_substatus_type_t* instantiate_order_substatus_type(int include_optional);



order_substatus_type_t* instantiate_order_substatus_type(int include_optional) {
  order_substatus_type_t* order_substatus_type = NULL;
  if (include_optional) {
    order_substatus_type = order_substatus_type_create(
    );
  } else {
    order_substatus_type = order_substatus_type_create(
    );
  }

  return order_substatus_type;
}


#ifdef order_substatus_type_MAIN

void test_order_substatus_type(int include_optional) {
    order_substatus_type_t* order_substatus_type_1 = instantiate_order_substatus_type(include_optional);

	cJSON* jsonorder_substatus_type_1 = order_substatus_type_convertToJSON(order_substatus_type_1);
	printf("order_substatus_type :\n%s\n", cJSON_Print(jsonorder_substatus_type_1));
	order_substatus_type_t* order_substatus_type_2 = order_substatus_type_parseFromJSON(jsonorder_substatus_type_1);
	cJSON* jsonorder_substatus_type_2 = order_substatus_type_convertToJSON(order_substatus_type_2);
	printf("repeating order_substatus_type:\n%s\n", cJSON_Print(jsonorder_substatus_type_2));
}

int main() {
  test_order_substatus_type(1);
  test_order_substatus_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_substatus_type_MAIN
#endif // order_substatus_type_TEST
