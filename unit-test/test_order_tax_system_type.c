#ifndef order_tax_system_type_TEST
#define order_tax_system_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_tax_system_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_tax_system_type.h"
order_tax_system_type_t* instantiate_order_tax_system_type(int include_optional);



order_tax_system_type_t* instantiate_order_tax_system_type(int include_optional) {
  order_tax_system_type_t* order_tax_system_type = NULL;
  if (include_optional) {
    order_tax_system_type = order_tax_system_type_create(
    );
  } else {
    order_tax_system_type = order_tax_system_type_create(
    );
  }

  return order_tax_system_type;
}


#ifdef order_tax_system_type_MAIN

void test_order_tax_system_type(int include_optional) {
    order_tax_system_type_t* order_tax_system_type_1 = instantiate_order_tax_system_type(include_optional);

	cJSON* jsonorder_tax_system_type_1 = order_tax_system_type_convertToJSON(order_tax_system_type_1);
	printf("order_tax_system_type :\n%s\n", cJSON_Print(jsonorder_tax_system_type_1));
	order_tax_system_type_t* order_tax_system_type_2 = order_tax_system_type_parseFromJSON(jsonorder_tax_system_type_1);
	cJSON* jsonorder_tax_system_type_2 = order_tax_system_type_convertToJSON(order_tax_system_type_2);
	printf("repeating order_tax_system_type:\n%s\n", cJSON_Print(jsonorder_tax_system_type_2));
}

int main() {
  test_order_tax_system_type(1);
  test_order_tax_system_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_tax_system_type_MAIN
#endif // order_tax_system_type_TEST
