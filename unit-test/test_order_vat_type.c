#ifndef order_vat_type_TEST
#define order_vat_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_vat_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_vat_type.h"
order_vat_type_t* instantiate_order_vat_type(int include_optional);



order_vat_type_t* instantiate_order_vat_type(int include_optional) {
  order_vat_type_t* order_vat_type = NULL;
  if (include_optional) {
    order_vat_type = order_vat_type_create(
    );
  } else {
    order_vat_type = order_vat_type_create(
    );
  }

  return order_vat_type;
}


#ifdef order_vat_type_MAIN

void test_order_vat_type(int include_optional) {
    order_vat_type_t* order_vat_type_1 = instantiate_order_vat_type(include_optional);

	cJSON* jsonorder_vat_type_1 = order_vat_type_convertToJSON(order_vat_type_1);
	printf("order_vat_type :\n%s\n", cJSON_Print(jsonorder_vat_type_1));
	order_vat_type_t* order_vat_type_2 = order_vat_type_parseFromJSON(jsonorder_vat_type_1);
	cJSON* jsonorder_vat_type_2 = order_vat_type_convertToJSON(order_vat_type_2);
	printf("repeating order_vat_type:\n%s\n", cJSON_Print(jsonorder_vat_type_2));
}

int main() {
  test_order_vat_type(1);
  test_order_vat_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_vat_type_MAIN
#endif // order_vat_type_TEST
