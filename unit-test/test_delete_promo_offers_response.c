#ifndef delete_promo_offers_response_TEST
#define delete_promo_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_promo_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_promo_offers_response.h"
delete_promo_offers_response_t* instantiate_delete_promo_offers_response(int include_optional);

#include "test_delete_promo_offers_result_dto.c"


delete_promo_offers_response_t* instantiate_delete_promo_offers_response(int include_optional) {
  delete_promo_offers_response_t* delete_promo_offers_response = NULL;
  if (include_optional) {
    delete_promo_offers_response = delete_promo_offers_response_create(
      _api__delete_promo_offers_response__OK,
       // false, not to have infinite recursion
      instantiate_delete_promo_offers_result_dto(0)
    );
  } else {
    delete_promo_offers_response = delete_promo_offers_response_create(
      _api__delete_promo_offers_response__OK,
      NULL
    );
  }

  return delete_promo_offers_response;
}


#ifdef delete_promo_offers_response_MAIN

void test_delete_promo_offers_response(int include_optional) {
    delete_promo_offers_response_t* delete_promo_offers_response_1 = instantiate_delete_promo_offers_response(include_optional);

	cJSON* jsondelete_promo_offers_response_1 = delete_promo_offers_response_convertToJSON(delete_promo_offers_response_1);
	printf("delete_promo_offers_response :\n%s\n", cJSON_Print(jsondelete_promo_offers_response_1));
	delete_promo_offers_response_t* delete_promo_offers_response_2 = delete_promo_offers_response_parseFromJSON(jsondelete_promo_offers_response_1);
	cJSON* jsondelete_promo_offers_response_2 = delete_promo_offers_response_convertToJSON(delete_promo_offers_response_2);
	printf("repeating delete_promo_offers_response:\n%s\n", cJSON_Print(jsondelete_promo_offers_response_2));
}

int main() {
  test_delete_promo_offers_response(1);
  test_delete_promo_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_promo_offers_response_MAIN
#endif // delete_promo_offers_response_TEST
