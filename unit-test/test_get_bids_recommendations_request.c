#ifndef get_bids_recommendations_request_TEST
#define get_bids_recommendations_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_bids_recommendations_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_bids_recommendations_request.h"
get_bids_recommendations_request_t* instantiate_get_bids_recommendations_request(int include_optional);



get_bids_recommendations_request_t* instantiate_get_bids_recommendations_request(int include_optional) {
  get_bids_recommendations_request_t* get_bids_recommendations_request = NULL;
  if (include_optional) {
    get_bids_recommendations_request = get_bids_recommendations_request_create(
      list_createList()
    );
  } else {
    get_bids_recommendations_request = get_bids_recommendations_request_create(
      list_createList()
    );
  }

  return get_bids_recommendations_request;
}


#ifdef get_bids_recommendations_request_MAIN

void test_get_bids_recommendations_request(int include_optional) {
    get_bids_recommendations_request_t* get_bids_recommendations_request_1 = instantiate_get_bids_recommendations_request(include_optional);

	cJSON* jsonget_bids_recommendations_request_1 = get_bids_recommendations_request_convertToJSON(get_bids_recommendations_request_1);
	printf("get_bids_recommendations_request :\n%s\n", cJSON_Print(jsonget_bids_recommendations_request_1));
	get_bids_recommendations_request_t* get_bids_recommendations_request_2 = get_bids_recommendations_request_parseFromJSON(jsonget_bids_recommendations_request_1);
	cJSON* jsonget_bids_recommendations_request_2 = get_bids_recommendations_request_convertToJSON(get_bids_recommendations_request_2);
	printf("repeating get_bids_recommendations_request:\n%s\n", cJSON_Print(jsonget_bids_recommendations_request_2));
}

int main() {
  test_get_bids_recommendations_request(1);
  test_get_bids_recommendations_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_bids_recommendations_request_MAIN
#endif // get_bids_recommendations_request_TEST
