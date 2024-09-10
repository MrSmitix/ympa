#ifndef offer_selling_program_dto_TEST
#define offer_selling_program_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_selling_program_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_selling_program_dto.h"
offer_selling_program_dto_t* instantiate_offer_selling_program_dto(int include_optional);



offer_selling_program_dto_t* instantiate_offer_selling_program_dto(int include_optional) {
  offer_selling_program_dto_t* offer_selling_program_dto = NULL;
  if (include_optional) {
    offer_selling_program_dto = offer_selling_program_dto_create(
      _api__offer_selling_program_dto__FBY,
      _api__offer_selling_program_dto__FINE
    );
  } else {
    offer_selling_program_dto = offer_selling_program_dto_create(
      _api__offer_selling_program_dto__FBY,
      _api__offer_selling_program_dto__FINE
    );
  }

  return offer_selling_program_dto;
}


#ifdef offer_selling_program_dto_MAIN

void test_offer_selling_program_dto(int include_optional) {
    offer_selling_program_dto_t* offer_selling_program_dto_1 = instantiate_offer_selling_program_dto(include_optional);

	cJSON* jsonoffer_selling_program_dto_1 = offer_selling_program_dto_convertToJSON(offer_selling_program_dto_1);
	printf("offer_selling_program_dto :\n%s\n", cJSON_Print(jsonoffer_selling_program_dto_1));
	offer_selling_program_dto_t* offer_selling_program_dto_2 = offer_selling_program_dto_parseFromJSON(jsonoffer_selling_program_dto_1);
	cJSON* jsonoffer_selling_program_dto_2 = offer_selling_program_dto_convertToJSON(offer_selling_program_dto_2);
	printf("repeating offer_selling_program_dto:\n%s\n", cJSON_Print(jsonoffer_selling_program_dto_2));
}

int main() {
  test_offer_selling_program_dto(1);
  test_offer_selling_program_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_selling_program_dto_MAIN
#endif // offer_selling_program_dto_TEST
