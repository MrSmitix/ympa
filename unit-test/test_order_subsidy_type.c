#ifndef order_subsidy_type_TEST
#define order_subsidy_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_subsidy_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_subsidy_type.h"
order_subsidy_type_t* instantiate_order_subsidy_type(int include_optional);



order_subsidy_type_t* instantiate_order_subsidy_type(int include_optional) {
  order_subsidy_type_t* order_subsidy_type = NULL;
  if (include_optional) {
    order_subsidy_type = order_subsidy_type_create(
    );
  } else {
    order_subsidy_type = order_subsidy_type_create(
    );
  }

  return order_subsidy_type;
}


#ifdef order_subsidy_type_MAIN

void test_order_subsidy_type(int include_optional) {
    order_subsidy_type_t* order_subsidy_type_1 = instantiate_order_subsidy_type(include_optional);

	cJSON* jsonorder_subsidy_type_1 = order_subsidy_type_convertToJSON(order_subsidy_type_1);
	printf("order_subsidy_type :\n%s\n", cJSON_Print(jsonorder_subsidy_type_1));
	order_subsidy_type_t* order_subsidy_type_2 = order_subsidy_type_parseFromJSON(jsonorder_subsidy_type_1);
	cJSON* jsonorder_subsidy_type_2 = order_subsidy_type_convertToJSON(order_subsidy_type_2);
	printf("repeating order_subsidy_type:\n%s\n", cJSON_Print(jsonorder_subsidy_type_2));
}

int main() {
  test_order_subsidy_type(1);
  test_order_subsidy_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_subsidy_type_MAIN
#endif // order_subsidy_type_TEST
