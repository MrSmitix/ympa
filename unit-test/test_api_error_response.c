#ifndef api_error_response_TEST
#define api_error_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define api_error_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/api_error_response.h"
api_error_response_t* instantiate_api_error_response(int include_optional);



api_error_response_t* instantiate_api_error_response(int include_optional) {
  api_error_response_t* api_error_response = NULL;
  if (include_optional) {
    api_error_response = api_error_response_create(
      _api__api_error_response__OK,
      list_createList()
    );
  } else {
    api_error_response = api_error_response_create(
      _api__api_error_response__OK,
      list_createList()
    );
  }

  return api_error_response;
}


#ifdef api_error_response_MAIN

void test_api_error_response(int include_optional) {
    api_error_response_t* api_error_response_1 = instantiate_api_error_response(include_optional);

	cJSON* jsonapi_error_response_1 = api_error_response_convertToJSON(api_error_response_1);
	printf("api_error_response :\n%s\n", cJSON_Print(jsonapi_error_response_1));
	api_error_response_t* api_error_response_2 = api_error_response_parseFromJSON(jsonapi_error_response_1);
	cJSON* jsonapi_error_response_2 = api_error_response_convertToJSON(api_error_response_2);
	printf("repeating api_error_response:\n%s\n", cJSON_Print(jsonapi_error_response_2));
}

int main() {
  test_api_error_response(1);
  test_api_error_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // api_error_response_MAIN
#endif // api_error_response_TEST
