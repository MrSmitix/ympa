#ifndef order_promo_type_TEST
#define order_promo_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_promo_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_promo_type.h"
order_promo_type_t* instantiate_order_promo_type(int include_optional);



order_promo_type_t* instantiate_order_promo_type(int include_optional) {
  order_promo_type_t* order_promo_type = NULL;
  if (include_optional) {
    order_promo_type = order_promo_type_create(
    );
  } else {
    order_promo_type = order_promo_type_create(
    );
  }

  return order_promo_type;
}


#ifdef order_promo_type_MAIN

void test_order_promo_type(int include_optional) {
    order_promo_type_t* order_promo_type_1 = instantiate_order_promo_type(include_optional);

	cJSON* jsonorder_promo_type_1 = order_promo_type_convertToJSON(order_promo_type_1);
	printf("order_promo_type :\n%s\n", cJSON_Print(jsonorder_promo_type_1));
	order_promo_type_t* order_promo_type_2 = order_promo_type_parseFromJSON(jsonorder_promo_type_1);
	cJSON* jsonorder_promo_type_2 = order_promo_type_convertToJSON(order_promo_type_2);
	printf("repeating order_promo_type:\n%s\n", cJSON_Print(jsonorder_promo_type_2));
}

int main() {
  test_order_promo_type(1);
  test_order_promo_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_promo_type_MAIN
#endif // order_promo_type_TEST
