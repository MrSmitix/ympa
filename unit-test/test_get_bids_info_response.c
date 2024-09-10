#ifndef get_bids_info_response_TEST
#define get_bids_info_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_bids_info_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_bids_info_response.h"
get_bids_info_response_t* instantiate_get_bids_info_response(int include_optional);

#include "test_get_bids_info_response_dto.c"


get_bids_info_response_t* instantiate_get_bids_info_response(int include_optional) {
  get_bids_info_response_t* get_bids_info_response = NULL;
  if (include_optional) {
    get_bids_info_response = get_bids_info_response_create(
      _api__get_bids_info_response__OK,
       // false, not to have infinite recursion
      instantiate_get_bids_info_response_dto(0)
    );
  } else {
    get_bids_info_response = get_bids_info_response_create(
      _api__get_bids_info_response__OK,
      NULL
    );
  }

  return get_bids_info_response;
}


#ifdef get_bids_info_response_MAIN

void test_get_bids_info_response(int include_optional) {
    get_bids_info_response_t* get_bids_info_response_1 = instantiate_get_bids_info_response(include_optional);

	cJSON* jsonget_bids_info_response_1 = get_bids_info_response_convertToJSON(get_bids_info_response_1);
	printf("get_bids_info_response :\n%s\n", cJSON_Print(jsonget_bids_info_response_1));
	get_bids_info_response_t* get_bids_info_response_2 = get_bids_info_response_parseFromJSON(jsonget_bids_info_response_1);
	cJSON* jsonget_bids_info_response_2 = get_bids_info_response_convertToJSON(get_bids_info_response_2);
	printf("repeating get_bids_info_response:\n%s\n", cJSON_Print(jsonget_bids_info_response_2));
}

int main() {
  test_get_bids_info_response(1);
  test_get_bids_info_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_bids_info_response_MAIN
#endif // get_bids_info_response_TEST
