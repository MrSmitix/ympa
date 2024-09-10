#ifndef offer_condition_quality_type_TEST
#define offer_condition_quality_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_condition_quality_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_condition_quality_type.h"
offer_condition_quality_type_t* instantiate_offer_condition_quality_type(int include_optional);



offer_condition_quality_type_t* instantiate_offer_condition_quality_type(int include_optional) {
  offer_condition_quality_type_t* offer_condition_quality_type = NULL;
  if (include_optional) {
    offer_condition_quality_type = offer_condition_quality_type_create(
    );
  } else {
    offer_condition_quality_type = offer_condition_quality_type_create(
    );
  }

  return offer_condition_quality_type;
}


#ifdef offer_condition_quality_type_MAIN

void test_offer_condition_quality_type(int include_optional) {
    offer_condition_quality_type_t* offer_condition_quality_type_1 = instantiate_offer_condition_quality_type(include_optional);

	cJSON* jsonoffer_condition_quality_type_1 = offer_condition_quality_type_convertToJSON(offer_condition_quality_type_1);
	printf("offer_condition_quality_type :\n%s\n", cJSON_Print(jsonoffer_condition_quality_type_1));
	offer_condition_quality_type_t* offer_condition_quality_type_2 = offer_condition_quality_type_parseFromJSON(jsonoffer_condition_quality_type_1);
	cJSON* jsonoffer_condition_quality_type_2 = offer_condition_quality_type_convertToJSON(offer_condition_quality_type_2);
	printf("repeating offer_condition_quality_type:\n%s\n", cJSON_Print(jsonoffer_condition_quality_type_2));
}

int main() {
  test_offer_condition_quality_type(1);
  test_offer_condition_quality_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_condition_quality_type_MAIN
#endif // offer_condition_quality_type_TEST
