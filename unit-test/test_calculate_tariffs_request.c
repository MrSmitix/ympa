#ifndef calculate_tariffs_request_TEST
#define calculate_tariffs_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define calculate_tariffs_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/calculate_tariffs_request.h"
calculate_tariffs_request_t* instantiate_calculate_tariffs_request(int include_optional);

#include "test_calculate_tariffs_parameters_dto.c"


calculate_tariffs_request_t* instantiate_calculate_tariffs_request(int include_optional) {
  calculate_tariffs_request_t* calculate_tariffs_request = NULL;
  if (include_optional) {
    calculate_tariffs_request = calculate_tariffs_request_create(
       // false, not to have infinite recursion
      instantiate_calculate_tariffs_parameters_dto(0),
      list_createList()
    );
  } else {
    calculate_tariffs_request = calculate_tariffs_request_create(
      NULL,
      list_createList()
    );
  }

  return calculate_tariffs_request;
}


#ifdef calculate_tariffs_request_MAIN

void test_calculate_tariffs_request(int include_optional) {
    calculate_tariffs_request_t* calculate_tariffs_request_1 = instantiate_calculate_tariffs_request(include_optional);

	cJSON* jsoncalculate_tariffs_request_1 = calculate_tariffs_request_convertToJSON(calculate_tariffs_request_1);
	printf("calculate_tariffs_request :\n%s\n", cJSON_Print(jsoncalculate_tariffs_request_1));
	calculate_tariffs_request_t* calculate_tariffs_request_2 = calculate_tariffs_request_parseFromJSON(jsoncalculate_tariffs_request_1);
	cJSON* jsoncalculate_tariffs_request_2 = calculate_tariffs_request_convertToJSON(calculate_tariffs_request_2);
	printf("repeating calculate_tariffs_request:\n%s\n", cJSON_Print(jsoncalculate_tariffs_request_2));
}

int main() {
  test_calculate_tariffs_request(1);
  test_calculate_tariffs_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // calculate_tariffs_request_MAIN
#endif // calculate_tariffs_request_TEST
