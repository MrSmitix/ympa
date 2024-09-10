#ifndef offer_price_dto_TEST
#define offer_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_price_dto.h"
offer_price_dto_t* instantiate_offer_price_dto(int include_optional);

#include "test_price_dto.c"


offer_price_dto_t* instantiate_offer_price_dto(int include_optional) {
  offer_price_dto_t* offer_price_dto = NULL;
  if (include_optional) {
    offer_price_dto = offer_price_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_price_dto(0)
    );
  } else {
    offer_price_dto = offer_price_dto_create(
      "a",
      NULL
    );
  }

  return offer_price_dto;
}


#ifdef offer_price_dto_MAIN

void test_offer_price_dto(int include_optional) {
    offer_price_dto_t* offer_price_dto_1 = instantiate_offer_price_dto(include_optional);

	cJSON* jsonoffer_price_dto_1 = offer_price_dto_convertToJSON(offer_price_dto_1);
	printf("offer_price_dto :\n%s\n", cJSON_Print(jsonoffer_price_dto_1));
	offer_price_dto_t* offer_price_dto_2 = offer_price_dto_parseFromJSON(jsonoffer_price_dto_1);
	cJSON* jsonoffer_price_dto_2 = offer_price_dto_convertToJSON(offer_price_dto_2);
	printf("repeating offer_price_dto:\n%s\n", cJSON_Print(jsonoffer_price_dto_2));
}

int main() {
  test_offer_price_dto(1);
  test_offer_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_price_dto_MAIN
#endif // offer_price_dto_TEST
