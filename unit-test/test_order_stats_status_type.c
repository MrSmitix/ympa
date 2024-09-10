#ifndef order_stats_status_type_TEST
#define order_stats_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_stats_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_stats_status_type.h"
order_stats_status_type_t* instantiate_order_stats_status_type(int include_optional);



order_stats_status_type_t* instantiate_order_stats_status_type(int include_optional) {
  order_stats_status_type_t* order_stats_status_type = NULL;
  if (include_optional) {
    order_stats_status_type = order_stats_status_type_create(
    );
  } else {
    order_stats_status_type = order_stats_status_type_create(
    );
  }

  return order_stats_status_type;
}


#ifdef order_stats_status_type_MAIN

void test_order_stats_status_type(int include_optional) {
    order_stats_status_type_t* order_stats_status_type_1 = instantiate_order_stats_status_type(include_optional);

	cJSON* jsonorder_stats_status_type_1 = order_stats_status_type_convertToJSON(order_stats_status_type_1);
	printf("order_stats_status_type :\n%s\n", cJSON_Print(jsonorder_stats_status_type_1));
	order_stats_status_type_t* order_stats_status_type_2 = order_stats_status_type_parseFromJSON(jsonorder_stats_status_type_1);
	cJSON* jsonorder_stats_status_type_2 = order_stats_status_type_convertToJSON(order_stats_status_type_2);
	printf("repeating order_stats_status_type:\n%s\n", cJSON_Print(jsonorder_stats_status_type_2));
}

int main() {
  test_order_stats_status_type(1);
  test_order_stats_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_stats_status_type_MAIN
#endif // order_stats_status_type_TEST
