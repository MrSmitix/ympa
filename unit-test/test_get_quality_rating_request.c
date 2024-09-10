#ifndef get_quality_rating_request_TEST
#define get_quality_rating_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_quality_rating_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_quality_rating_request.h"
get_quality_rating_request_t* instantiate_get_quality_rating_request(int include_optional);



get_quality_rating_request_t* instantiate_get_quality_rating_request(int include_optional) {
  get_quality_rating_request_t* get_quality_rating_request = NULL;
  if (include_optional) {
    get_quality_rating_request = get_quality_rating_request_create(
      "2013-10-20",
      "2013-10-20",
      list_createList()
    );
  } else {
    get_quality_rating_request = get_quality_rating_request_create(
      "2013-10-20",
      "2013-10-20",
      list_createList()
    );
  }

  return get_quality_rating_request;
}


#ifdef get_quality_rating_request_MAIN

void test_get_quality_rating_request(int include_optional) {
    get_quality_rating_request_t* get_quality_rating_request_1 = instantiate_get_quality_rating_request(include_optional);

	cJSON* jsonget_quality_rating_request_1 = get_quality_rating_request_convertToJSON(get_quality_rating_request_1);
	printf("get_quality_rating_request :\n%s\n", cJSON_Print(jsonget_quality_rating_request_1));
	get_quality_rating_request_t* get_quality_rating_request_2 = get_quality_rating_request_parseFromJSON(jsonget_quality_rating_request_1);
	cJSON* jsonget_quality_rating_request_2 = get_quality_rating_request_convertToJSON(get_quality_rating_request_2);
	printf("repeating get_quality_rating_request:\n%s\n", cJSON_Print(jsonget_quality_rating_request_2));
}

int main() {
  test_get_quality_rating_request(1);
  test_get_quality_rating_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_quality_rating_request_MAIN
#endif // get_quality_rating_request_TEST
