#ifndef update_promo_offers_response_TEST
#define update_promo_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_promo_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_promo_offers_response.h"
update_promo_offers_response_t* instantiate_update_promo_offers_response(int include_optional);

#include "test_update_promo_offers_result_dto.c"


update_promo_offers_response_t* instantiate_update_promo_offers_response(int include_optional) {
  update_promo_offers_response_t* update_promo_offers_response = NULL;
  if (include_optional) {
    update_promo_offers_response = update_promo_offers_response_create(
      _api__update_promo_offers_response__OK,
       // false, not to have infinite recursion
      instantiate_update_promo_offers_result_dto(0)
    );
  } else {
    update_promo_offers_response = update_promo_offers_response_create(
      _api__update_promo_offers_response__OK,
      NULL
    );
  }

  return update_promo_offers_response;
}


#ifdef update_promo_offers_response_MAIN

void test_update_promo_offers_response(int include_optional) {
    update_promo_offers_response_t* update_promo_offers_response_1 = instantiate_update_promo_offers_response(include_optional);

	cJSON* jsonupdate_promo_offers_response_1 = update_promo_offers_response_convertToJSON(update_promo_offers_response_1);
	printf("update_promo_offers_response :\n%s\n", cJSON_Print(jsonupdate_promo_offers_response_1));
	update_promo_offers_response_t* update_promo_offers_response_2 = update_promo_offers_response_parseFromJSON(jsonupdate_promo_offers_response_1);
	cJSON* jsonupdate_promo_offers_response_2 = update_promo_offers_response_convertToJSON(update_promo_offers_response_2);
	printf("repeating update_promo_offers_response:\n%s\n", cJSON_Print(jsonupdate_promo_offers_response_2));
}

int main() {
  test_update_promo_offers_response(1);
  test_update_promo_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_promo_offers_response_MAIN
#endif // update_promo_offers_response_TEST
