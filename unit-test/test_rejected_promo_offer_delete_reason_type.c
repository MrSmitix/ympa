#ifndef rejected_promo_offer_delete_reason_type_TEST
#define rejected_promo_offer_delete_reason_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define rejected_promo_offer_delete_reason_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/rejected_promo_offer_delete_reason_type.h"
rejected_promo_offer_delete_reason_type_t* instantiate_rejected_promo_offer_delete_reason_type(int include_optional);



rejected_promo_offer_delete_reason_type_t* instantiate_rejected_promo_offer_delete_reason_type(int include_optional) {
  rejected_promo_offer_delete_reason_type_t* rejected_promo_offer_delete_reason_type = NULL;
  if (include_optional) {
    rejected_promo_offer_delete_reason_type = rejected_promo_offer_delete_reason_type_create(
    );
  } else {
    rejected_promo_offer_delete_reason_type = rejected_promo_offer_delete_reason_type_create(
    );
  }

  return rejected_promo_offer_delete_reason_type;
}


#ifdef rejected_promo_offer_delete_reason_type_MAIN

void test_rejected_promo_offer_delete_reason_type(int include_optional) {
    rejected_promo_offer_delete_reason_type_t* rejected_promo_offer_delete_reason_type_1 = instantiate_rejected_promo_offer_delete_reason_type(include_optional);

	cJSON* jsonrejected_promo_offer_delete_reason_type_1 = rejected_promo_offer_delete_reason_type_convertToJSON(rejected_promo_offer_delete_reason_type_1);
	printf("rejected_promo_offer_delete_reason_type :\n%s\n", cJSON_Print(jsonrejected_promo_offer_delete_reason_type_1));
	rejected_promo_offer_delete_reason_type_t* rejected_promo_offer_delete_reason_type_2 = rejected_promo_offer_delete_reason_type_parseFromJSON(jsonrejected_promo_offer_delete_reason_type_1);
	cJSON* jsonrejected_promo_offer_delete_reason_type_2 = rejected_promo_offer_delete_reason_type_convertToJSON(rejected_promo_offer_delete_reason_type_2);
	printf("repeating rejected_promo_offer_delete_reason_type:\n%s\n", cJSON_Print(jsonrejected_promo_offer_delete_reason_type_2));
}

int main() {
  test_rejected_promo_offer_delete_reason_type(1);
  test_rejected_promo_offer_delete_reason_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // rejected_promo_offer_delete_reason_type_MAIN
#endif // rejected_promo_offer_delete_reason_type_TEST
