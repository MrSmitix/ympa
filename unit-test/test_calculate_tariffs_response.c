#ifndef calculate_tariffs_response_TEST
#define calculate_tariffs_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define calculate_tariffs_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/calculate_tariffs_response.h"
calculate_tariffs_response_t* instantiate_calculate_tariffs_response(int include_optional);

#include "test_calculate_tariffs_response_dto.c"


calculate_tariffs_response_t* instantiate_calculate_tariffs_response(int include_optional) {
  calculate_tariffs_response_t* calculate_tariffs_response = NULL;
  if (include_optional) {
    calculate_tariffs_response = calculate_tariffs_response_create(
      _api__calculate_tariffs_response__OK,
       // false, not to have infinite recursion
      instantiate_calculate_tariffs_response_dto(0)
    );
  } else {
    calculate_tariffs_response = calculate_tariffs_response_create(
      _api__calculate_tariffs_response__OK,
      NULL
    );
  }

  return calculate_tariffs_response;
}


#ifdef calculate_tariffs_response_MAIN

void test_calculate_tariffs_response(int include_optional) {
    calculate_tariffs_response_t* calculate_tariffs_response_1 = instantiate_calculate_tariffs_response(include_optional);

	cJSON* jsoncalculate_tariffs_response_1 = calculate_tariffs_response_convertToJSON(calculate_tariffs_response_1);
	printf("calculate_tariffs_response :\n%s\n", cJSON_Print(jsoncalculate_tariffs_response_1));
	calculate_tariffs_response_t* calculate_tariffs_response_2 = calculate_tariffs_response_parseFromJSON(jsoncalculate_tariffs_response_1);
	cJSON* jsoncalculate_tariffs_response_2 = calculate_tariffs_response_convertToJSON(calculate_tariffs_response_2);
	printf("repeating calculate_tariffs_response:\n%s\n", cJSON_Print(jsoncalculate_tariffs_response_2));
}

int main() {
  test_calculate_tariffs_response(1);
  test_calculate_tariffs_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // calculate_tariffs_response_MAIN
#endif // calculate_tariffs_response_TEST
