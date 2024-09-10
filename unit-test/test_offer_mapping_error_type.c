#ifndef offer_mapping_error_type_TEST
#define offer_mapping_error_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_mapping_error_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_mapping_error_type.h"
offer_mapping_error_type_t* instantiate_offer_mapping_error_type(int include_optional);



offer_mapping_error_type_t* instantiate_offer_mapping_error_type(int include_optional) {
  offer_mapping_error_type_t* offer_mapping_error_type = NULL;
  if (include_optional) {
    offer_mapping_error_type = offer_mapping_error_type_create(
    );
  } else {
    offer_mapping_error_type = offer_mapping_error_type_create(
    );
  }

  return offer_mapping_error_type;
}


#ifdef offer_mapping_error_type_MAIN

void test_offer_mapping_error_type(int include_optional) {
    offer_mapping_error_type_t* offer_mapping_error_type_1 = instantiate_offer_mapping_error_type(include_optional);

	cJSON* jsonoffer_mapping_error_type_1 = offer_mapping_error_type_convertToJSON(offer_mapping_error_type_1);
	printf("offer_mapping_error_type :\n%s\n", cJSON_Print(jsonoffer_mapping_error_type_1));
	offer_mapping_error_type_t* offer_mapping_error_type_2 = offer_mapping_error_type_parseFromJSON(jsonoffer_mapping_error_type_1);
	cJSON* jsonoffer_mapping_error_type_2 = offer_mapping_error_type_convertToJSON(offer_mapping_error_type_2);
	printf("repeating offer_mapping_error_type:\n%s\n", cJSON_Print(jsonoffer_mapping_error_type_2));
}

int main() {
  test_offer_mapping_error_type(1);
  test_offer_mapping_error_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_mapping_error_type_MAIN
#endif // offer_mapping_error_type_TEST
