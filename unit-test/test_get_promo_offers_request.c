#ifndef get_promo_offers_request_TEST
#define get_promo_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promo_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promo_offers_request.h"
get_promo_offers_request_t* instantiate_get_promo_offers_request(int include_optional);



get_promo_offers_request_t* instantiate_get_promo_offers_request(int include_optional) {
  get_promo_offers_request_t* get_promo_offers_request = NULL;
  if (include_optional) {
    get_promo_offers_request = get_promo_offers_request_create(
      "0",
      _api__get_promo_offers_request__MANUALLY_ADDED
    );
  } else {
    get_promo_offers_request = get_promo_offers_request_create(
      "0",
      _api__get_promo_offers_request__MANUALLY_ADDED
    );
  }

  return get_promo_offers_request;
}


#ifdef get_promo_offers_request_MAIN

void test_get_promo_offers_request(int include_optional) {
    get_promo_offers_request_t* get_promo_offers_request_1 = instantiate_get_promo_offers_request(include_optional);

	cJSON* jsonget_promo_offers_request_1 = get_promo_offers_request_convertToJSON(get_promo_offers_request_1);
	printf("get_promo_offers_request :\n%s\n", cJSON_Print(jsonget_promo_offers_request_1));
	get_promo_offers_request_t* get_promo_offers_request_2 = get_promo_offers_request_parseFromJSON(jsonget_promo_offers_request_1);
	cJSON* jsonget_promo_offers_request_2 = get_promo_offers_request_convertToJSON(get_promo_offers_request_2);
	printf("repeating get_promo_offers_request:\n%s\n", cJSON_Print(jsonget_promo_offers_request_2));
}

int main() {
  test_get_promo_offers_request(1);
  test_get_promo_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promo_offers_request_MAIN
#endif // get_promo_offers_request_TEST
