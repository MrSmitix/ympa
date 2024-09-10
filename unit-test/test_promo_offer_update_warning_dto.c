#ifndef promo_offer_update_warning_dto_TEST
#define promo_offer_update_warning_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promo_offer_update_warning_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promo_offer_update_warning_dto.h"
promo_offer_update_warning_dto_t* instantiate_promo_offer_update_warning_dto(int include_optional);



promo_offer_update_warning_dto_t* instantiate_promo_offer_update_warning_dto(int include_optional) {
  promo_offer_update_warning_dto_t* promo_offer_update_warning_dto = NULL;
  if (include_optional) {
    promo_offer_update_warning_dto = promo_offer_update_warning_dto_create(
      _api__promo_offer_update_warning_dto__DEEP_DISCOUNT_OFFER,
      list_createList()
    );
  } else {
    promo_offer_update_warning_dto = promo_offer_update_warning_dto_create(
      _api__promo_offer_update_warning_dto__DEEP_DISCOUNT_OFFER,
      list_createList()
    );
  }

  return promo_offer_update_warning_dto;
}


#ifdef promo_offer_update_warning_dto_MAIN

void test_promo_offer_update_warning_dto(int include_optional) {
    promo_offer_update_warning_dto_t* promo_offer_update_warning_dto_1 = instantiate_promo_offer_update_warning_dto(include_optional);

	cJSON* jsonpromo_offer_update_warning_dto_1 = promo_offer_update_warning_dto_convertToJSON(promo_offer_update_warning_dto_1);
	printf("promo_offer_update_warning_dto :\n%s\n", cJSON_Print(jsonpromo_offer_update_warning_dto_1));
	promo_offer_update_warning_dto_t* promo_offer_update_warning_dto_2 = promo_offer_update_warning_dto_parseFromJSON(jsonpromo_offer_update_warning_dto_1);
	cJSON* jsonpromo_offer_update_warning_dto_2 = promo_offer_update_warning_dto_convertToJSON(promo_offer_update_warning_dto_2);
	printf("repeating promo_offer_update_warning_dto:\n%s\n", cJSON_Print(jsonpromo_offer_update_warning_dto_2));
}

int main() {
  test_promo_offer_update_warning_dto(1);
  test_promo_offer_update_warning_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // promo_offer_update_warning_dto_MAIN
#endif // promo_offer_update_warning_dto_TEST
