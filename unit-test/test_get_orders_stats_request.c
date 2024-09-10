#ifndef get_orders_stats_request_TEST
#define get_orders_stats_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_orders_stats_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_orders_stats_request.h"
get_orders_stats_request_t* instantiate_get_orders_stats_request(int include_optional);



get_orders_stats_request_t* instantiate_get_orders_stats_request(int include_optional) {
  get_orders_stats_request_t* get_orders_stats_request = NULL;
  if (include_optional) {
    get_orders_stats_request = get_orders_stats_request_create(
      "2013-10-20",
      "2013-10-20",
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      list_createList(),
      1
    );
  } else {
    get_orders_stats_request = get_orders_stats_request_create(
      "2013-10-20",
      "2013-10-20",
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      list_createList(),
      1
    );
  }

  return get_orders_stats_request;
}


#ifdef get_orders_stats_request_MAIN

void test_get_orders_stats_request(int include_optional) {
    get_orders_stats_request_t* get_orders_stats_request_1 = instantiate_get_orders_stats_request(include_optional);

	cJSON* jsonget_orders_stats_request_1 = get_orders_stats_request_convertToJSON(get_orders_stats_request_1);
	printf("get_orders_stats_request :\n%s\n", cJSON_Print(jsonget_orders_stats_request_1));
	get_orders_stats_request_t* get_orders_stats_request_2 = get_orders_stats_request_parseFromJSON(jsonget_orders_stats_request_1);
	cJSON* jsonget_orders_stats_request_2 = get_orders_stats_request_convertToJSON(get_orders_stats_request_2);
	printf("repeating get_orders_stats_request:\n%s\n", cJSON_Print(jsonget_orders_stats_request_2));
}

int main() {
  test_get_orders_stats_request(1);
  test_get_orders_stats_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_orders_stats_request_MAIN
#endif // get_orders_stats_request_TEST
