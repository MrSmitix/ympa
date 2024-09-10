#ifndef get_quality_rating_response_TEST
#define get_quality_rating_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_quality_rating_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_quality_rating_response.h"
get_quality_rating_response_t* instantiate_get_quality_rating_response(int include_optional);

#include "test_campaigns_quality_rating_dto.c"


get_quality_rating_response_t* instantiate_get_quality_rating_response(int include_optional) {
  get_quality_rating_response_t* get_quality_rating_response = NULL;
  if (include_optional) {
    get_quality_rating_response = get_quality_rating_response_create(
      _api__get_quality_rating_response__OK,
       // false, not to have infinite recursion
      instantiate_campaigns_quality_rating_dto(0)
    );
  } else {
    get_quality_rating_response = get_quality_rating_response_create(
      _api__get_quality_rating_response__OK,
      NULL
    );
  }

  return get_quality_rating_response;
}


#ifdef get_quality_rating_response_MAIN

void test_get_quality_rating_response(int include_optional) {
    get_quality_rating_response_t* get_quality_rating_response_1 = instantiate_get_quality_rating_response(include_optional);

	cJSON* jsonget_quality_rating_response_1 = get_quality_rating_response_convertToJSON(get_quality_rating_response_1);
	printf("get_quality_rating_response :\n%s\n", cJSON_Print(jsonget_quality_rating_response_1));
	get_quality_rating_response_t* get_quality_rating_response_2 = get_quality_rating_response_parseFromJSON(jsonget_quality_rating_response_1);
	cJSON* jsonget_quality_rating_response_2 = get_quality_rating_response_convertToJSON(get_quality_rating_response_2);
	printf("repeating get_quality_rating_response:\n%s\n", cJSON_Print(jsonget_quality_rating_response_2));
}

int main() {
  test_get_quality_rating_response(1);
  test_get_quality_rating_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_quality_rating_response_MAIN
#endif // get_quality_rating_response_TEST
