#ifndef get_quarantine_offers_request_TEST
#define get_quarantine_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_quarantine_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_quarantine_offers_request.h"
get_quarantine_offers_request_t* instantiate_get_quarantine_offers_request(int include_optional);



get_quarantine_offers_request_t* instantiate_get_quarantine_offers_request(int include_optional) {
  get_quarantine_offers_request_t* get_quarantine_offers_request = NULL;
  if (include_optional) {
    get_quarantine_offers_request = get_quarantine_offers_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    get_quarantine_offers_request = get_quarantine_offers_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return get_quarantine_offers_request;
}


#ifdef get_quarantine_offers_request_MAIN

void test_get_quarantine_offers_request(int include_optional) {
    get_quarantine_offers_request_t* get_quarantine_offers_request_1 = instantiate_get_quarantine_offers_request(include_optional);

	cJSON* jsonget_quarantine_offers_request_1 = get_quarantine_offers_request_convertToJSON(get_quarantine_offers_request_1);
	printf("get_quarantine_offers_request :\n%s\n", cJSON_Print(jsonget_quarantine_offers_request_1));
	get_quarantine_offers_request_t* get_quarantine_offers_request_2 = get_quarantine_offers_request_parseFromJSON(jsonget_quarantine_offers_request_1);
	cJSON* jsonget_quarantine_offers_request_2 = get_quarantine_offers_request_convertToJSON(get_quarantine_offers_request_2);
	printf("repeating get_quarantine_offers_request:\n%s\n", cJSON_Print(jsonget_quarantine_offers_request_2));
}

int main() {
  test_get_quarantine_offers_request(1);
  test_get_quarantine_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_quarantine_offers_request_MAIN
#endif // get_quarantine_offers_request_TEST
