#ifndef promo_offer_participation_status_type_TEST
#define promo_offer_participation_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promo_offer_participation_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promo_offer_participation_status_type.h"
promo_offer_participation_status_type_t* instantiate_promo_offer_participation_status_type(int include_optional);



promo_offer_participation_status_type_t* instantiate_promo_offer_participation_status_type(int include_optional) {
  promo_offer_participation_status_type_t* promo_offer_participation_status_type = NULL;
  if (include_optional) {
    promo_offer_participation_status_type = promo_offer_participation_status_type_create(
    );
  } else {
    promo_offer_participation_status_type = promo_offer_participation_status_type_create(
    );
  }

  return promo_offer_participation_status_type;
}


#ifdef promo_offer_participation_status_type_MAIN

void test_promo_offer_participation_status_type(int include_optional) {
    promo_offer_participation_status_type_t* promo_offer_participation_status_type_1 = instantiate_promo_offer_participation_status_type(include_optional);

	cJSON* jsonpromo_offer_participation_status_type_1 = promo_offer_participation_status_type_convertToJSON(promo_offer_participation_status_type_1);
	printf("promo_offer_participation_status_type :\n%s\n", cJSON_Print(jsonpromo_offer_participation_status_type_1));
	promo_offer_participation_status_type_t* promo_offer_participation_status_type_2 = promo_offer_participation_status_type_parseFromJSON(jsonpromo_offer_participation_status_type_1);
	cJSON* jsonpromo_offer_participation_status_type_2 = promo_offer_participation_status_type_convertToJSON(promo_offer_participation_status_type_2);
	printf("repeating promo_offer_participation_status_type:\n%s\n", cJSON_Print(jsonpromo_offer_participation_status_type_2));
}

int main() {
  test_promo_offer_participation_status_type(1);
  test_promo_offer_participation_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // promo_offer_participation_status_type_MAIN
#endif // promo_offer_participation_status_type_TEST
