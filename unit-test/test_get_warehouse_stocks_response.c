#ifndef get_warehouse_stocks_response_TEST
#define get_warehouse_stocks_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_warehouse_stocks_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_warehouse_stocks_response.h"
get_warehouse_stocks_response_t* instantiate_get_warehouse_stocks_response(int include_optional);

#include "test_get_warehouse_stocks_dto.c"


get_warehouse_stocks_response_t* instantiate_get_warehouse_stocks_response(int include_optional) {
  get_warehouse_stocks_response_t* get_warehouse_stocks_response = NULL;
  if (include_optional) {
    get_warehouse_stocks_response = get_warehouse_stocks_response_create(
      _api__get_warehouse_stocks_response__OK,
       // false, not to have infinite recursion
      instantiate_get_warehouse_stocks_dto(0)
    );
  } else {
    get_warehouse_stocks_response = get_warehouse_stocks_response_create(
      _api__get_warehouse_stocks_response__OK,
      NULL
    );
  }

  return get_warehouse_stocks_response;
}


#ifdef get_warehouse_stocks_response_MAIN

void test_get_warehouse_stocks_response(int include_optional) {
    get_warehouse_stocks_response_t* get_warehouse_stocks_response_1 = instantiate_get_warehouse_stocks_response(include_optional);

	cJSON* jsonget_warehouse_stocks_response_1 = get_warehouse_stocks_response_convertToJSON(get_warehouse_stocks_response_1);
	printf("get_warehouse_stocks_response :\n%s\n", cJSON_Print(jsonget_warehouse_stocks_response_1));
	get_warehouse_stocks_response_t* get_warehouse_stocks_response_2 = get_warehouse_stocks_response_parseFromJSON(jsonget_warehouse_stocks_response_1);
	cJSON* jsonget_warehouse_stocks_response_2 = get_warehouse_stocks_response_convertToJSON(get_warehouse_stocks_response_2);
	printf("repeating get_warehouse_stocks_response:\n%s\n", cJSON_Print(jsonget_warehouse_stocks_response_2));
}

int main() {
  test_get_warehouse_stocks_response(1);
  test_get_warehouse_stocks_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_warehouse_stocks_response_MAIN
#endif // get_warehouse_stocks_response_TEST
