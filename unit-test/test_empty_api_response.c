#ifndef empty_api_response_TEST
#define empty_api_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define empty_api_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/empty_api_response.h"
empty_api_response_t* instantiate_empty_api_response(int include_optional);



empty_api_response_t* instantiate_empty_api_response(int include_optional) {
  empty_api_response_t* empty_api_response = NULL;
  if (include_optional) {
    empty_api_response = empty_api_response_create(
      _api__empty_api_response__OK
    );
  } else {
    empty_api_response = empty_api_response_create(
      _api__empty_api_response__OK
    );
  }

  return empty_api_response;
}


#ifdef empty_api_response_MAIN

void test_empty_api_response(int include_optional) {
    empty_api_response_t* empty_api_response_1 = instantiate_empty_api_response(include_optional);

	cJSON* jsonempty_api_response_1 = empty_api_response_convertToJSON(empty_api_response_1);
	printf("empty_api_response :\n%s\n", cJSON_Print(jsonempty_api_response_1));
	empty_api_response_t* empty_api_response_2 = empty_api_response_parseFromJSON(jsonempty_api_response_1);
	cJSON* jsonempty_api_response_2 = empty_api_response_convertToJSON(empty_api_response_2);
	printf("repeating empty_api_response:\n%s\n", cJSON_Print(jsonempty_api_response_2));
}

int main() {
  test_empty_api_response(1);
  test_empty_api_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // empty_api_response_MAIN
#endif // empty_api_response_TEST
