#ifndef offer_price_list_response_dto_TEST
#define offer_price_list_response_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_price_list_response_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_price_list_response_dto.h"
offer_price_list_response_dto_t* instantiate_offer_price_list_response_dto(int include_optional);

#include "test_scrolling_pager_dto.c"


offer_price_list_response_dto_t* instantiate_offer_price_list_response_dto(int include_optional) {
  offer_price_list_response_dto_t* offer_price_list_response_dto = NULL;
  if (include_optional) {
    offer_price_list_response_dto = offer_price_list_response_dto_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
      56
    );
  } else {
    offer_price_list_response_dto = offer_price_list_response_dto_create(
      list_createList(),
      NULL,
      56
    );
  }

  return offer_price_list_response_dto;
}


#ifdef offer_price_list_response_dto_MAIN

void test_offer_price_list_response_dto(int include_optional) {
    offer_price_list_response_dto_t* offer_price_list_response_dto_1 = instantiate_offer_price_list_response_dto(include_optional);

	cJSON* jsonoffer_price_list_response_dto_1 = offer_price_list_response_dto_convertToJSON(offer_price_list_response_dto_1);
	printf("offer_price_list_response_dto :\n%s\n", cJSON_Print(jsonoffer_price_list_response_dto_1));
	offer_price_list_response_dto_t* offer_price_list_response_dto_2 = offer_price_list_response_dto_parseFromJSON(jsonoffer_price_list_response_dto_1);
	cJSON* jsonoffer_price_list_response_dto_2 = offer_price_list_response_dto_convertToJSON(offer_price_list_response_dto_2);
	printf("repeating offer_price_list_response_dto:\n%s\n", cJSON_Print(jsonoffer_price_list_response_dto_2));
}

int main() {
  test_offer_price_list_response_dto(1);
  test_offer_price_list_response_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_price_list_response_dto_MAIN
#endif // offer_price_list_response_dto_TEST
