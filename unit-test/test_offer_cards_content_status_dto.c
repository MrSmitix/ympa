#ifndef offer_cards_content_status_dto_TEST
#define offer_cards_content_status_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_cards_content_status_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_cards_content_status_dto.h"
offer_cards_content_status_dto_t* instantiate_offer_cards_content_status_dto(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


offer_cards_content_status_dto_t* instantiate_offer_cards_content_status_dto(int include_optional) {
  offer_cards_content_status_dto_t* offer_cards_content_status_dto = NULL;
  if (include_optional) {
    offer_cards_content_status_dto = offer_cards_content_status_dto_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    offer_cards_content_status_dto = offer_cards_content_status_dto_create(
      list_createList(),
      NULL
    );
  }

  return offer_cards_content_status_dto;
}


#ifdef offer_cards_content_status_dto_MAIN

void test_offer_cards_content_status_dto(int include_optional) {
    offer_cards_content_status_dto_t* offer_cards_content_status_dto_1 = instantiate_offer_cards_content_status_dto(include_optional);

	cJSON* jsonoffer_cards_content_status_dto_1 = offer_cards_content_status_dto_convertToJSON(offer_cards_content_status_dto_1);
	printf("offer_cards_content_status_dto :\n%s\n", cJSON_Print(jsonoffer_cards_content_status_dto_1));
	offer_cards_content_status_dto_t* offer_cards_content_status_dto_2 = offer_cards_content_status_dto_parseFromJSON(jsonoffer_cards_content_status_dto_1);
	cJSON* jsonoffer_cards_content_status_dto_2 = offer_cards_content_status_dto_convertToJSON(offer_cards_content_status_dto_2);
	printf("repeating offer_cards_content_status_dto:\n%s\n", cJSON_Print(jsonoffer_cards_content_status_dto_2));
}

int main() {
  test_offer_cards_content_status_dto(1);
  test_offer_cards_content_status_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_cards_content_status_dto_MAIN
#endif // offer_cards_content_status_dto_TEST
