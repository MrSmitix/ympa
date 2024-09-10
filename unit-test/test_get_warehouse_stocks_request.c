#ifndef get_warehouse_stocks_request_TEST
#define get_warehouse_stocks_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_warehouse_stocks_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_warehouse_stocks_request.h"
get_warehouse_stocks_request_t* instantiate_get_warehouse_stocks_request(int include_optional);



get_warehouse_stocks_request_t* instantiate_get_warehouse_stocks_request(int include_optional) {
  get_warehouse_stocks_request_t* get_warehouse_stocks_request = NULL;
  if (include_optional) {
    get_warehouse_stocks_request = get_warehouse_stocks_request_create(
      1,
      1,
      list_createList()
    );
  } else {
    get_warehouse_stocks_request = get_warehouse_stocks_request_create(
      1,
      1,
      list_createList()
    );
  }

  return get_warehouse_stocks_request;
}


#ifdef get_warehouse_stocks_request_MAIN

void test_get_warehouse_stocks_request(int include_optional) {
    get_warehouse_stocks_request_t* get_warehouse_stocks_request_1 = instantiate_get_warehouse_stocks_request(include_optional);

	cJSON* jsonget_warehouse_stocks_request_1 = get_warehouse_stocks_request_convertToJSON(get_warehouse_stocks_request_1);
	printf("get_warehouse_stocks_request :\n%s\n", cJSON_Print(jsonget_warehouse_stocks_request_1));
	get_warehouse_stocks_request_t* get_warehouse_stocks_request_2 = get_warehouse_stocks_request_parseFromJSON(jsonget_warehouse_stocks_request_1);
	cJSON* jsonget_warehouse_stocks_request_2 = get_warehouse_stocks_request_convertToJSON(get_warehouse_stocks_request_2);
	printf("repeating get_warehouse_stocks_request:\n%s\n", cJSON_Print(jsonget_warehouse_stocks_request_2));
}

int main() {
  test_get_warehouse_stocks_request(1);
  test_get_warehouse_stocks_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_warehouse_stocks_request_MAIN
#endif // get_warehouse_stocks_request_TEST
