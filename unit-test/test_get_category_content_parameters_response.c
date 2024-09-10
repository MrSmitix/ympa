#ifndef get_category_content_parameters_response_TEST
#define get_category_content_parameters_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_category_content_parameters_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_category_content_parameters_response.h"
get_category_content_parameters_response_t* instantiate_get_category_content_parameters_response(int include_optional);

#include "test_category_content_parameters_dto.c"


get_category_content_parameters_response_t* instantiate_get_category_content_parameters_response(int include_optional) {
  get_category_content_parameters_response_t* get_category_content_parameters_response = NULL;
  if (include_optional) {
    get_category_content_parameters_response = get_category_content_parameters_response_create(
      _api__get_category_content_parameters_response__OK,
       // false, not to have infinite recursion
      instantiate_category_content_parameters_dto(0)
    );
  } else {
    get_category_content_parameters_response = get_category_content_parameters_response_create(
      _api__get_category_content_parameters_response__OK,
      NULL
    );
  }

  return get_category_content_parameters_response;
}


#ifdef get_category_content_parameters_response_MAIN

void test_get_category_content_parameters_response(int include_optional) {
    get_category_content_parameters_response_t* get_category_content_parameters_response_1 = instantiate_get_category_content_parameters_response(include_optional);

	cJSON* jsonget_category_content_parameters_response_1 = get_category_content_parameters_response_convertToJSON(get_category_content_parameters_response_1);
	printf("get_category_content_parameters_response :\n%s\n", cJSON_Print(jsonget_category_content_parameters_response_1));
	get_category_content_parameters_response_t* get_category_content_parameters_response_2 = get_category_content_parameters_response_parseFromJSON(jsonget_category_content_parameters_response_1);
	cJSON* jsonget_category_content_parameters_response_2 = get_category_content_parameters_response_convertToJSON(get_category_content_parameters_response_2);
	printf("repeating get_category_content_parameters_response:\n%s\n", cJSON_Print(jsonget_category_content_parameters_response_2));
}

int main() {
  test_get_category_content_parameters_response(1);
  test_get_category_content_parameters_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_category_content_parameters_response_MAIN
#endif // get_category_content_parameters_response_TEST
