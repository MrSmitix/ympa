#ifndef offer_weight_dimensions_dto_TEST
#define offer_weight_dimensions_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_weight_dimensions_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_weight_dimensions_dto.h"
offer_weight_dimensions_dto_t* instantiate_offer_weight_dimensions_dto(int include_optional);



offer_weight_dimensions_dto_t* instantiate_offer_weight_dimensions_dto(int include_optional) {
  offer_weight_dimensions_dto_t* offer_weight_dimensions_dto = NULL;
  if (include_optional) {
    offer_weight_dimensions_dto = offer_weight_dimensions_dto_create(
      65.55,
      50.7,
      20,
      1.001
    );
  } else {
    offer_weight_dimensions_dto = offer_weight_dimensions_dto_create(
      65.55,
      50.7,
      20,
      1.001
    );
  }

  return offer_weight_dimensions_dto;
}


#ifdef offer_weight_dimensions_dto_MAIN

void test_offer_weight_dimensions_dto(int include_optional) {
    offer_weight_dimensions_dto_t* offer_weight_dimensions_dto_1 = instantiate_offer_weight_dimensions_dto(include_optional);

	cJSON* jsonoffer_weight_dimensions_dto_1 = offer_weight_dimensions_dto_convertToJSON(offer_weight_dimensions_dto_1);
	printf("offer_weight_dimensions_dto :\n%s\n", cJSON_Print(jsonoffer_weight_dimensions_dto_1));
	offer_weight_dimensions_dto_t* offer_weight_dimensions_dto_2 = offer_weight_dimensions_dto_parseFromJSON(jsonoffer_weight_dimensions_dto_1);
	cJSON* jsonoffer_weight_dimensions_dto_2 = offer_weight_dimensions_dto_convertToJSON(offer_weight_dimensions_dto_2);
	printf("repeating offer_weight_dimensions_dto:\n%s\n", cJSON_Print(jsonoffer_weight_dimensions_dto_2));
}

int main() {
  test_offer_weight_dimensions_dto(1);
  test_offer_weight_dimensions_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_weight_dimensions_dto_MAIN
#endif // offer_weight_dimensions_dto_TEST
