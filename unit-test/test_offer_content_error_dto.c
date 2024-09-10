#ifndef offer_content_error_dto_TEST
#define offer_content_error_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_content_error_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_content_error_dto.h"
offer_content_error_dto_t* instantiate_offer_content_error_dto(int include_optional);



offer_content_error_dto_t* instantiate_offer_content_error_dto(int include_optional) {
  offer_content_error_dto_t* offer_content_error_dto = NULL;
  if (include_optional) {
    offer_content_error_dto = offer_content_error_dto_create(
      _api__offer_content_error_dto__OFFER_NOT_FOUND,
      56,
      "0"
    );
  } else {
    offer_content_error_dto = offer_content_error_dto_create(
      _api__offer_content_error_dto__OFFER_NOT_FOUND,
      56,
      "0"
    );
  }

  return offer_content_error_dto;
}


#ifdef offer_content_error_dto_MAIN

void test_offer_content_error_dto(int include_optional) {
    offer_content_error_dto_t* offer_content_error_dto_1 = instantiate_offer_content_error_dto(include_optional);

	cJSON* jsonoffer_content_error_dto_1 = offer_content_error_dto_convertToJSON(offer_content_error_dto_1);
	printf("offer_content_error_dto :\n%s\n", cJSON_Print(jsonoffer_content_error_dto_1));
	offer_content_error_dto_t* offer_content_error_dto_2 = offer_content_error_dto_parseFromJSON(jsonoffer_content_error_dto_1);
	cJSON* jsonoffer_content_error_dto_2 = offer_content_error_dto_convertToJSON(offer_content_error_dto_2);
	printf("repeating offer_content_error_dto:\n%s\n", cJSON_Print(jsonoffer_content_error_dto_2));
}

int main() {
  test_offer_content_error_dto(1);
  test_offer_content_error_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_content_error_dto_MAIN
#endif // offer_content_error_dto_TEST
