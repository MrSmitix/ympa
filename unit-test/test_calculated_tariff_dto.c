#ifndef calculated_tariff_dto_TEST
#define calculated_tariff_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define calculated_tariff_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/calculated_tariff_dto.h"
calculated_tariff_dto_t* instantiate_calculated_tariff_dto(int include_optional);



calculated_tariff_dto_t* instantiate_calculated_tariff_dto(int include_optional) {
  calculated_tariff_dto_t* calculated_tariff_dto = NULL;
  if (include_optional) {
    calculated_tariff_dto = calculated_tariff_dto_create(
      _api__calculated_tariff_dto__AGENCY_COMMISSION,
      1.337,
      list_createList()
    );
  } else {
    calculated_tariff_dto = calculated_tariff_dto_create(
      _api__calculated_tariff_dto__AGENCY_COMMISSION,
      1.337,
      list_createList()
    );
  }

  return calculated_tariff_dto;
}


#ifdef calculated_tariff_dto_MAIN

void test_calculated_tariff_dto(int include_optional) {
    calculated_tariff_dto_t* calculated_tariff_dto_1 = instantiate_calculated_tariff_dto(include_optional);

	cJSON* jsoncalculated_tariff_dto_1 = calculated_tariff_dto_convertToJSON(calculated_tariff_dto_1);
	printf("calculated_tariff_dto :\n%s\n", cJSON_Print(jsoncalculated_tariff_dto_1));
	calculated_tariff_dto_t* calculated_tariff_dto_2 = calculated_tariff_dto_parseFromJSON(jsoncalculated_tariff_dto_1);
	cJSON* jsoncalculated_tariff_dto_2 = calculated_tariff_dto_convertToJSON(calculated_tariff_dto_2);
	printf("repeating calculated_tariff_dto:\n%s\n", cJSON_Print(jsoncalculated_tariff_dto_2));
}

int main() {
  test_calculated_tariff_dto(1);
  test_calculated_tariff_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // calculated_tariff_dto_MAIN
#endif // calculated_tariff_dto_TEST
