#ifndef update_promo_offers_request_TEST
#define update_promo_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_promo_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_promo_offers_request.h"
update_promo_offers_request_t* instantiate_update_promo_offers_request(int include_optional);



update_promo_offers_request_t* instantiate_update_promo_offers_request(int include_optional) {
  update_promo_offers_request_t* update_promo_offers_request = NULL;
  if (include_optional) {
    update_promo_offers_request = update_promo_offers_request_create(
      "0",
      list_createList()
    );
  } else {
    update_promo_offers_request = update_promo_offers_request_create(
      "0",
      list_createList()
    );
  }

  return update_promo_offers_request;
}


#ifdef update_promo_offers_request_MAIN

void test_update_promo_offers_request(int include_optional) {
    update_promo_offers_request_t* update_promo_offers_request_1 = instantiate_update_promo_offers_request(include_optional);

	cJSON* jsonupdate_promo_offers_request_1 = update_promo_offers_request_convertToJSON(update_promo_offers_request_1);
	printf("update_promo_offers_request :\n%s\n", cJSON_Print(jsonupdate_promo_offers_request_1));
	update_promo_offers_request_t* update_promo_offers_request_2 = update_promo_offers_request_parseFromJSON(jsonupdate_promo_offers_request_1);
	cJSON* jsonupdate_promo_offers_request_2 = update_promo_offers_request_convertToJSON(update_promo_offers_request_2);
	printf("repeating update_promo_offers_request:\n%s\n", cJSON_Print(jsonupdate_promo_offers_request_2));
}

int main() {
  test_update_promo_offers_request(1);
  test_update_promo_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_promo_offers_request_MAIN
#endif // update_promo_offers_request_TEST
