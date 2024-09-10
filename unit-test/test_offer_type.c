#ifndef offer_type_TEST
#define offer_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_type.h"
offer_type_t* instantiate_offer_type(int include_optional);



offer_type_t* instantiate_offer_type(int include_optional) {
  offer_type_t* offer_type = NULL;
  if (include_optional) {
    offer_type = offer_type_create(
    );
  } else {
    offer_type = offer_type_create(
    );
  }

  return offer_type;
}


#ifdef offer_type_MAIN

void test_offer_type(int include_optional) {
    offer_type_t* offer_type_1 = instantiate_offer_type(include_optional);

	cJSON* jsonoffer_type_1 = offer_type_convertToJSON(offer_type_1);
	printf("offer_type :\n%s\n", cJSON_Print(jsonoffer_type_1));
	offer_type_t* offer_type_2 = offer_type_parseFromJSON(jsonoffer_type_1);
	cJSON* jsonoffer_type_2 = offer_type_convertToJSON(offer_type_2);
	printf("repeating offer_type:\n%s\n", cJSON_Print(jsonoffer_type_2));
}

int main() {
  test_offer_type(1);
  test_offer_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_type_MAIN
#endif // offer_type_TEST
