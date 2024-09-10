#ifndef offer_recommendations_result_dto_TEST
#define offer_recommendations_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_recommendations_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_recommendations_result_dto.h"
offer_recommendations_result_dto_t* instantiate_offer_recommendations_result_dto(int include_optional);

#include "test_scrolling_pager_dto.c"


offer_recommendations_result_dto_t* instantiate_offer_recommendations_result_dto(int include_optional) {
  offer_recommendations_result_dto_t* offer_recommendations_result_dto = NULL;
  if (include_optional) {
    offer_recommendations_result_dto = offer_recommendations_result_dto_create(
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
      list_createList()
    );
  } else {
    offer_recommendations_result_dto = offer_recommendations_result_dto_create(
      NULL,
      list_createList()
    );
  }

  return offer_recommendations_result_dto;
}


#ifdef offer_recommendations_result_dto_MAIN

void test_offer_recommendations_result_dto(int include_optional) {
    offer_recommendations_result_dto_t* offer_recommendations_result_dto_1 = instantiate_offer_recommendations_result_dto(include_optional);

	cJSON* jsonoffer_recommendations_result_dto_1 = offer_recommendations_result_dto_convertToJSON(offer_recommendations_result_dto_1);
	printf("offer_recommendations_result_dto :\n%s\n", cJSON_Print(jsonoffer_recommendations_result_dto_1));
	offer_recommendations_result_dto_t* offer_recommendations_result_dto_2 = offer_recommendations_result_dto_parseFromJSON(jsonoffer_recommendations_result_dto_1);
	cJSON* jsonoffer_recommendations_result_dto_2 = offer_recommendations_result_dto_convertToJSON(offer_recommendations_result_dto_2);
	printf("repeating offer_recommendations_result_dto:\n%s\n", cJSON_Print(jsonoffer_recommendations_result_dto_2));
}

int main() {
  test_offer_recommendations_result_dto(1);
  test_offer_recommendations_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_recommendations_result_dto_MAIN
#endif // offer_recommendations_result_dto_TEST
