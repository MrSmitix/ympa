#ifndef api_response_status_type_TEST
#define api_response_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define api_response_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/api_response_status_type.h"
api_response_status_type_t* instantiate_api_response_status_type(int include_optional);



api_response_status_type_t* instantiate_api_response_status_type(int include_optional) {
  api_response_status_type_t* api_response_status_type = NULL;
  if (include_optional) {
    api_response_status_type = api_response_status_type_create(
    );
  } else {
    api_response_status_type = api_response_status_type_create(
    );
  }

  return api_response_status_type;
}


#ifdef api_response_status_type_MAIN

void test_api_response_status_type(int include_optional) {
    api_response_status_type_t* api_response_status_type_1 = instantiate_api_response_status_type(include_optional);

	cJSON* jsonapi_response_status_type_1 = api_response_status_type_convertToJSON(api_response_status_type_1);
	printf("api_response_status_type :\n%s\n", cJSON_Print(jsonapi_response_status_type_1));
	api_response_status_type_t* api_response_status_type_2 = api_response_status_type_parseFromJSON(jsonapi_response_status_type_1);
	cJSON* jsonapi_response_status_type_2 = api_response_status_type_convertToJSON(api_response_status_type_2);
	printf("repeating api_response_status_type:\n%s\n", cJSON_Print(jsonapi_response_status_type_2));
}

int main() {
  test_api_response_status_type(1);
  test_api_response_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // api_response_status_type_MAIN
#endif // api_response_status_type_TEST
