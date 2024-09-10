#ifndef rejected_promo_offer_update_dto_TEST
#define rejected_promo_offer_update_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define rejected_promo_offer_update_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/rejected_promo_offer_update_dto.h"
rejected_promo_offer_update_dto_t* instantiate_rejected_promo_offer_update_dto(int include_optional);



rejected_promo_offer_update_dto_t* instantiate_rejected_promo_offer_update_dto(int include_optional) {
  rejected_promo_offer_update_dto_t* rejected_promo_offer_update_dto = NULL;
  if (include_optional) {
    rejected_promo_offer_update_dto = rejected_promo_offer_update_dto_create(
      "a",
      _api__rejected_promo_offer_update_dto__OFFER_DOES_NOT_EXIST
    );
  } else {
    rejected_promo_offer_update_dto = rejected_promo_offer_update_dto_create(
      "a",
      _api__rejected_promo_offer_update_dto__OFFER_DOES_NOT_EXIST
    );
  }

  return rejected_promo_offer_update_dto;
}


#ifdef rejected_promo_offer_update_dto_MAIN

void test_rejected_promo_offer_update_dto(int include_optional) {
    rejected_promo_offer_update_dto_t* rejected_promo_offer_update_dto_1 = instantiate_rejected_promo_offer_update_dto(include_optional);

	cJSON* jsonrejected_promo_offer_update_dto_1 = rejected_promo_offer_update_dto_convertToJSON(rejected_promo_offer_update_dto_1);
	printf("rejected_promo_offer_update_dto :\n%s\n", cJSON_Print(jsonrejected_promo_offer_update_dto_1));
	rejected_promo_offer_update_dto_t* rejected_promo_offer_update_dto_2 = rejected_promo_offer_update_dto_parseFromJSON(jsonrejected_promo_offer_update_dto_1);
	cJSON* jsonrejected_promo_offer_update_dto_2 = rejected_promo_offer_update_dto_convertToJSON(rejected_promo_offer_update_dto_2);
	printf("repeating rejected_promo_offer_update_dto:\n%s\n", cJSON_Print(jsonrejected_promo_offer_update_dto_2));
}

int main() {
  test_rejected_promo_offer_update_dto(1);
  test_rejected_promo_offer_update_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // rejected_promo_offer_update_dto_MAIN
#endif // rejected_promo_offer_update_dto_TEST
