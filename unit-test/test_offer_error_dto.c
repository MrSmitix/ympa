#ifndef offer_error_dto_TEST
#define offer_error_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_error_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_error_dto.h"
offer_error_dto_t* instantiate_offer_error_dto(int include_optional);



offer_error_dto_t* instantiate_offer_error_dto(int include_optional) {
  offer_error_dto_t* offer_error_dto = NULL;
  if (include_optional) {
    offer_error_dto = offer_error_dto_create(
      "0",
      "0"
    );
  } else {
    offer_error_dto = offer_error_dto_create(
      "0",
      "0"
    );
  }

  return offer_error_dto;
}


#ifdef offer_error_dto_MAIN

void test_offer_error_dto(int include_optional) {
    offer_error_dto_t* offer_error_dto_1 = instantiate_offer_error_dto(include_optional);

	cJSON* jsonoffer_error_dto_1 = offer_error_dto_convertToJSON(offer_error_dto_1);
	printf("offer_error_dto :\n%s\n", cJSON_Print(jsonoffer_error_dto_1));
	offer_error_dto_t* offer_error_dto_2 = offer_error_dto_parseFromJSON(jsonoffer_error_dto_1);
	cJSON* jsonoffer_error_dto_2 = offer_error_dto_convertToJSON(offer_error_dto_2);
	printf("repeating offer_error_dto:\n%s\n", cJSON_Print(jsonoffer_error_dto_2));
}

int main() {
  test_offer_error_dto(1);
  test_offer_error_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_error_dto_MAIN
#endif // offer_error_dto_TEST
