#ifndef get_promos_response_TEST
#define get_promos_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promos_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promos_response.h"
get_promos_response_t* instantiate_get_promos_response(int include_optional);

#include "test_get_promos_result_dto.c"


get_promos_response_t* instantiate_get_promos_response(int include_optional) {
  get_promos_response_t* get_promos_response = NULL;
  if (include_optional) {
    get_promos_response = get_promos_response_create(
      _api__get_promos_response__OK,
       // false, not to have infinite recursion
      instantiate_get_promos_result_dto(0)
    );
  } else {
    get_promos_response = get_promos_response_create(
      _api__get_promos_response__OK,
      NULL
    );
  }

  return get_promos_response;
}


#ifdef get_promos_response_MAIN

void test_get_promos_response(int include_optional) {
    get_promos_response_t* get_promos_response_1 = instantiate_get_promos_response(include_optional);

	cJSON* jsonget_promos_response_1 = get_promos_response_convertToJSON(get_promos_response_1);
	printf("get_promos_response :\n%s\n", cJSON_Print(jsonget_promos_response_1));
	get_promos_response_t* get_promos_response_2 = get_promos_response_parseFromJSON(jsonget_promos_response_1);
	cJSON* jsonget_promos_response_2 = get_promos_response_convertToJSON(get_promos_response_2);
	printf("repeating get_promos_response:\n%s\n", cJSON_Print(jsonget_promos_response_2));
}

int main() {
  test_get_promos_response(1);
  test_get_promos_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promos_response_MAIN
#endif // get_promos_response_TEST
