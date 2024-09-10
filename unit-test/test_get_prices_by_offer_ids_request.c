#ifndef get_prices_by_offer_ids_request_TEST
#define get_prices_by_offer_ids_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_prices_by_offer_ids_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_prices_by_offer_ids_request.h"
get_prices_by_offer_ids_request_t* instantiate_get_prices_by_offer_ids_request(int include_optional);



get_prices_by_offer_ids_request_t* instantiate_get_prices_by_offer_ids_request(int include_optional) {
  get_prices_by_offer_ids_request_t* get_prices_by_offer_ids_request = NULL;
  if (include_optional) {
    get_prices_by_offer_ids_request = get_prices_by_offer_ids_request_create(
      list_createList()
    );
  } else {
    get_prices_by_offer_ids_request = get_prices_by_offer_ids_request_create(
      list_createList()
    );
  }

  return get_prices_by_offer_ids_request;
}


#ifdef get_prices_by_offer_ids_request_MAIN

void test_get_prices_by_offer_ids_request(int include_optional) {
    get_prices_by_offer_ids_request_t* get_prices_by_offer_ids_request_1 = instantiate_get_prices_by_offer_ids_request(include_optional);

	cJSON* jsonget_prices_by_offer_ids_request_1 = get_prices_by_offer_ids_request_convertToJSON(get_prices_by_offer_ids_request_1);
	printf("get_prices_by_offer_ids_request :\n%s\n", cJSON_Print(jsonget_prices_by_offer_ids_request_1));
	get_prices_by_offer_ids_request_t* get_prices_by_offer_ids_request_2 = get_prices_by_offer_ids_request_parseFromJSON(jsonget_prices_by_offer_ids_request_1);
	cJSON* jsonget_prices_by_offer_ids_request_2 = get_prices_by_offer_ids_request_convertToJSON(get_prices_by_offer_ids_request_2);
	printf("repeating get_prices_by_offer_ids_request:\n%s\n", cJSON_Print(jsonget_prices_by_offer_ids_request_2));
}

int main() {
  test_get_prices_by_offer_ids_request(1);
  test_get_prices_by_offer_ids_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_prices_by_offer_ids_request_MAIN
#endif // get_prices_by_offer_ids_request_TEST
