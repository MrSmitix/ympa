#ifndef offer_content_error_type_TEST
#define offer_content_error_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_content_error_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_content_error_type.h"
offer_content_error_type_t* instantiate_offer_content_error_type(int include_optional);



offer_content_error_type_t* instantiate_offer_content_error_type(int include_optional) {
  offer_content_error_type_t* offer_content_error_type = NULL;
  if (include_optional) {
    offer_content_error_type = offer_content_error_type_create(
    );
  } else {
    offer_content_error_type = offer_content_error_type_create(
    );
  }

  return offer_content_error_type;
}


#ifdef offer_content_error_type_MAIN

void test_offer_content_error_type(int include_optional) {
    offer_content_error_type_t* offer_content_error_type_1 = instantiate_offer_content_error_type(include_optional);

	cJSON* jsonoffer_content_error_type_1 = offer_content_error_type_convertToJSON(offer_content_error_type_1);
	printf("offer_content_error_type :\n%s\n", cJSON_Print(jsonoffer_content_error_type_1));
	offer_content_error_type_t* offer_content_error_type_2 = offer_content_error_type_parseFromJSON(jsonoffer_content_error_type_1);
	cJSON* jsonoffer_content_error_type_2 = offer_content_error_type_convertToJSON(offer_content_error_type_2);
	printf("repeating offer_content_error_type:\n%s\n", cJSON_Print(jsonoffer_content_error_type_2));
}

int main() {
  test_offer_content_error_type(1);
  test_offer_content_error_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_content_error_type_MAIN
#endif // offer_content_error_type_TEST
