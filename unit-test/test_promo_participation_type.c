#ifndef promo_participation_type_TEST
#define promo_participation_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promo_participation_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promo_participation_type.h"
promo_participation_type_t* instantiate_promo_participation_type(int include_optional);



promo_participation_type_t* instantiate_promo_participation_type(int include_optional) {
  promo_participation_type_t* promo_participation_type = NULL;
  if (include_optional) {
    promo_participation_type = promo_participation_type_create(
    );
  } else {
    promo_participation_type = promo_participation_type_create(
    );
  }

  return promo_participation_type;
}


#ifdef promo_participation_type_MAIN

void test_promo_participation_type(int include_optional) {
    promo_participation_type_t* promo_participation_type_1 = instantiate_promo_participation_type(include_optional);

	cJSON* jsonpromo_participation_type_1 = promo_participation_type_convertToJSON(promo_participation_type_1);
	printf("promo_participation_type :\n%s\n", cJSON_Print(jsonpromo_participation_type_1));
	promo_participation_type_t* promo_participation_type_2 = promo_participation_type_parseFromJSON(jsonpromo_participation_type_1);
	cJSON* jsonpromo_participation_type_2 = promo_participation_type_convertToJSON(promo_participation_type_2);
	printf("repeating promo_participation_type:\n%s\n", cJSON_Print(jsonpromo_participation_type_2));
}

int main() {
  test_promo_participation_type(1);
  test_promo_participation_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // promo_participation_type_MAIN
#endif // promo_participation_type_TEST
