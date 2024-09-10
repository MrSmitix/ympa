#ifndef suggest_prices_response_TEST
#define suggest_prices_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define suggest_prices_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/suggest_prices_response.h"
suggest_prices_response_t* instantiate_suggest_prices_response(int include_optional);

#include "test_suggest_prices_result_dto.c"


suggest_prices_response_t* instantiate_suggest_prices_response(int include_optional) {
  suggest_prices_response_t* suggest_prices_response = NULL;
  if (include_optional) {
    suggest_prices_response = suggest_prices_response_create(
      _api__suggest_prices_response__OK,
       // false, not to have infinite recursion
      instantiate_suggest_prices_result_dto(0)
    );
  } else {
    suggest_prices_response = suggest_prices_response_create(
      _api__suggest_prices_response__OK,
      NULL
    );
  }

  return suggest_prices_response;
}


#ifdef suggest_prices_response_MAIN

void test_suggest_prices_response(int include_optional) {
    suggest_prices_response_t* suggest_prices_response_1 = instantiate_suggest_prices_response(include_optional);

	cJSON* jsonsuggest_prices_response_1 = suggest_prices_response_convertToJSON(suggest_prices_response_1);
	printf("suggest_prices_response :\n%s\n", cJSON_Print(jsonsuggest_prices_response_1));
	suggest_prices_response_t* suggest_prices_response_2 = suggest_prices_response_parseFromJSON(jsonsuggest_prices_response_1);
	cJSON* jsonsuggest_prices_response_2 = suggest_prices_response_convertToJSON(suggest_prices_response_2);
	printf("repeating suggest_prices_response:\n%s\n", cJSON_Print(jsonsuggest_prices_response_2));
}

int main() {
  test_suggest_prices_response(1);
  test_suggest_prices_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // suggest_prices_response_MAIN
#endif // suggest_prices_response_TEST
