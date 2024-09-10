#ifndef promo_period_dto_TEST
#define promo_period_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promo_period_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promo_period_dto.h"
promo_period_dto_t* instantiate_promo_period_dto(int include_optional);



promo_period_dto_t* instantiate_promo_period_dto(int include_optional) {
  promo_period_dto_t* promo_period_dto = NULL;
  if (include_optional) {
    promo_period_dto = promo_period_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    promo_period_dto = promo_period_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return promo_period_dto;
}


#ifdef promo_period_dto_MAIN

void test_promo_period_dto(int include_optional) {
    promo_period_dto_t* promo_period_dto_1 = instantiate_promo_period_dto(include_optional);

	cJSON* jsonpromo_period_dto_1 = promo_period_dto_convertToJSON(promo_period_dto_1);
	printf("promo_period_dto :\n%s\n", cJSON_Print(jsonpromo_period_dto_1));
	promo_period_dto_t* promo_period_dto_2 = promo_period_dto_parseFromJSON(jsonpromo_period_dto_1);
	cJSON* jsonpromo_period_dto_2 = promo_period_dto_convertToJSON(promo_period_dto_2);
	printf("repeating promo_period_dto:\n%s\n", cJSON_Print(jsonpromo_period_dto_2));
}

int main() {
  test_promo_period_dto(1);
  test_promo_period_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // promo_period_dto_MAIN
#endif // promo_period_dto_TEST
