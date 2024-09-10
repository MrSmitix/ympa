#ifndef api_error_dto_TEST
#define api_error_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define api_error_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/api_error_dto.h"
api_error_dto_t* instantiate_api_error_dto(int include_optional);



api_error_dto_t* instantiate_api_error_dto(int include_optional) {
  api_error_dto_t* api_error_dto = NULL;
  if (include_optional) {
    api_error_dto = api_error_dto_create(
      "0",
      "0"
    );
  } else {
    api_error_dto = api_error_dto_create(
      "0",
      "0"
    );
  }

  return api_error_dto;
}


#ifdef api_error_dto_MAIN

void test_api_error_dto(int include_optional) {
    api_error_dto_t* api_error_dto_1 = instantiate_api_error_dto(include_optional);

	cJSON* jsonapi_error_dto_1 = api_error_dto_convertToJSON(api_error_dto_1);
	printf("api_error_dto :\n%s\n", cJSON_Print(jsonapi_error_dto_1));
	api_error_dto_t* api_error_dto_2 = api_error_dto_parseFromJSON(jsonapi_error_dto_1);
	cJSON* jsonapi_error_dto_2 = api_error_dto_convertToJSON(api_error_dto_2);
	printf("repeating api_error_dto:\n%s\n", cJSON_Print(jsonapi_error_dto_2));
}

int main() {
  test_api_error_dto(1);
  test_api_error_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // api_error_dto_MAIN
#endif // api_error_dto_TEST
