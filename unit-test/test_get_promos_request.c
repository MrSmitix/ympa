#ifndef get_promos_request_TEST
#define get_promos_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promos_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promos_request.h"
get_promos_request_t* instantiate_get_promos_request(int include_optional);



get_promos_request_t* instantiate_get_promos_request(int include_optional) {
  get_promos_request_t* get_promos_request = NULL;
  if (include_optional) {
    get_promos_request = get_promos_request_create(
      _api__get_promos_request__PARTICIPATING_NOW,
      _api__get_promos_request__DIRECT_DISCOUNT
    );
  } else {
    get_promos_request = get_promos_request_create(
      _api__get_promos_request__PARTICIPATING_NOW,
      _api__get_promos_request__DIRECT_DISCOUNT
    );
  }

  return get_promos_request;
}


#ifdef get_promos_request_MAIN

void test_get_promos_request(int include_optional) {
    get_promos_request_t* get_promos_request_1 = instantiate_get_promos_request(include_optional);

	cJSON* jsonget_promos_request_1 = get_promos_request_convertToJSON(get_promos_request_1);
	printf("get_promos_request :\n%s\n", cJSON_Print(jsonget_promos_request_1));
	get_promos_request_t* get_promos_request_2 = get_promos_request_parseFromJSON(jsonget_promos_request_1);
	cJSON* jsonget_promos_request_2 = get_promos_request_convertToJSON(get_promos_request_2);
	printf("repeating get_promos_request:\n%s\n", cJSON_Print(jsonget_promos_request_2));
}

int main() {
  test_get_promos_request(1);
  test_get_promos_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promos_request_MAIN
#endif // get_promos_request_TEST
