#ifndef get_offers_response_TEST
#define get_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_offers_response.h"
get_offers_response_t* instantiate_get_offers_response(int include_optional);

#include "test_flipping_pager_dto.c"


get_offers_response_t* instantiate_get_offers_response(int include_optional) {
  get_offers_response_t* get_offers_response = NULL;
  if (include_optional) {
    get_offers_response = get_offers_response_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0)
    );
  } else {
    get_offers_response = get_offers_response_create(
      list_createList(),
      NULL
    );
  }

  return get_offers_response;
}


#ifdef get_offers_response_MAIN

void test_get_offers_response(int include_optional) {
    get_offers_response_t* get_offers_response_1 = instantiate_get_offers_response(include_optional);

	cJSON* jsonget_offers_response_1 = get_offers_response_convertToJSON(get_offers_response_1);
	printf("get_offers_response :\n%s\n", cJSON_Print(jsonget_offers_response_1));
	get_offers_response_t* get_offers_response_2 = get_offers_response_parseFromJSON(jsonget_offers_response_1);
	cJSON* jsonget_offers_response_2 = get_offers_response_convertToJSON(get_offers_response_2);
	printf("repeating get_offers_response:\n%s\n", cJSON_Print(jsonget_offers_response_2));
}

int main() {
  test_get_offers_response(1);
  test_get_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_offers_response_MAIN
#endif // get_offers_response_TEST
