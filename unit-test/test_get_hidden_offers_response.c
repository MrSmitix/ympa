#ifndef get_hidden_offers_response_TEST
#define get_hidden_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_hidden_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_hidden_offers_response.h"
get_hidden_offers_response_t* instantiate_get_hidden_offers_response(int include_optional);

#include "test_get_hidden_offers_result_dto.c"


get_hidden_offers_response_t* instantiate_get_hidden_offers_response(int include_optional) {
  get_hidden_offers_response_t* get_hidden_offers_response = NULL;
  if (include_optional) {
    get_hidden_offers_response = get_hidden_offers_response_create(
      _api__get_hidden_offers_response__OK,
       // false, not to have infinite recursion
      instantiate_get_hidden_offers_result_dto(0)
    );
  } else {
    get_hidden_offers_response = get_hidden_offers_response_create(
      _api__get_hidden_offers_response__OK,
      NULL
    );
  }

  return get_hidden_offers_response;
}


#ifdef get_hidden_offers_response_MAIN

void test_get_hidden_offers_response(int include_optional) {
    get_hidden_offers_response_t* get_hidden_offers_response_1 = instantiate_get_hidden_offers_response(include_optional);

	cJSON* jsonget_hidden_offers_response_1 = get_hidden_offers_response_convertToJSON(get_hidden_offers_response_1);
	printf("get_hidden_offers_response :\n%s\n", cJSON_Print(jsonget_hidden_offers_response_1));
	get_hidden_offers_response_t* get_hidden_offers_response_2 = get_hidden_offers_response_parseFromJSON(jsonget_hidden_offers_response_1);
	cJSON* jsonget_hidden_offers_response_2 = get_hidden_offers_response_convertToJSON(get_hidden_offers_response_2);
	printf("repeating get_hidden_offers_response:\n%s\n", cJSON_Print(jsonget_hidden_offers_response_2));
}

int main() {
  test_get_hidden_offers_response(1);
  test_get_hidden_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_hidden_offers_response_MAIN
#endif // get_hidden_offers_response_TEST
