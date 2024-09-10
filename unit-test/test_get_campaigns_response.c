#ifndef get_campaigns_response_TEST
#define get_campaigns_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_campaigns_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_campaigns_response.h"
get_campaigns_response_t* instantiate_get_campaigns_response(int include_optional);

#include "test_flipping_pager_dto.c"


get_campaigns_response_t* instantiate_get_campaigns_response(int include_optional) {
  get_campaigns_response_t* get_campaigns_response = NULL;
  if (include_optional) {
    get_campaigns_response = get_campaigns_response_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_flipping_pager_dto(0)
    );
  } else {
    get_campaigns_response = get_campaigns_response_create(
      list_createList(),
      NULL
    );
  }

  return get_campaigns_response;
}


#ifdef get_campaigns_response_MAIN

void test_get_campaigns_response(int include_optional) {
    get_campaigns_response_t* get_campaigns_response_1 = instantiate_get_campaigns_response(include_optional);

	cJSON* jsonget_campaigns_response_1 = get_campaigns_response_convertToJSON(get_campaigns_response_1);
	printf("get_campaigns_response :\n%s\n", cJSON_Print(jsonget_campaigns_response_1));
	get_campaigns_response_t* get_campaigns_response_2 = get_campaigns_response_parseFromJSON(jsonget_campaigns_response_1);
	cJSON* jsonget_campaigns_response_2 = get_campaigns_response_convertToJSON(get_campaigns_response_2);
	printf("repeating get_campaigns_response:\n%s\n", cJSON_Print(jsonget_campaigns_response_2));
}

int main() {
  test_get_campaigns_response(1);
  test_get_campaigns_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_campaigns_response_MAIN
#endif // get_campaigns_response_TEST
