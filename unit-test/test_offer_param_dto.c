#ifndef offer_param_dto_TEST
#define offer_param_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_param_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_param_dto.h"
offer_param_dto_t* instantiate_offer_param_dto(int include_optional);



offer_param_dto_t* instantiate_offer_param_dto(int include_optional) {
  offer_param_dto_t* offer_param_dto = NULL;
  if (include_optional) {
    offer_param_dto = offer_param_dto_create(
      "Wi-Fi",
      "есть"
    );
  } else {
    offer_param_dto = offer_param_dto_create(
      "Wi-Fi",
      "есть"
    );
  }

  return offer_param_dto;
}


#ifdef offer_param_dto_MAIN

void test_offer_param_dto(int include_optional) {
    offer_param_dto_t* offer_param_dto_1 = instantiate_offer_param_dto(include_optional);

	cJSON* jsonoffer_param_dto_1 = offer_param_dto_convertToJSON(offer_param_dto_1);
	printf("offer_param_dto :\n%s\n", cJSON_Print(jsonoffer_param_dto_1));
	offer_param_dto_t* offer_param_dto_2 = offer_param_dto_parseFromJSON(jsonoffer_param_dto_1);
	cJSON* jsonoffer_param_dto_2 = offer_param_dto_convertToJSON(offer_param_dto_2);
	printf("repeating offer_param_dto:\n%s\n", cJSON_Print(jsonoffer_param_dto_2));
}

int main() {
  test_offer_param_dto(1);
  test_offer_param_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_param_dto_MAIN
#endif // offer_param_dto_TEST
