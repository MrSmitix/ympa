#ifndef calculated_tariff_type_TEST
#define calculated_tariff_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define calculated_tariff_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/calculated_tariff_type.h"
calculated_tariff_type_t* instantiate_calculated_tariff_type(int include_optional);



calculated_tariff_type_t* instantiate_calculated_tariff_type(int include_optional) {
  calculated_tariff_type_t* calculated_tariff_type = NULL;
  if (include_optional) {
    calculated_tariff_type = calculated_tariff_type_create(
    );
  } else {
    calculated_tariff_type = calculated_tariff_type_create(
    );
  }

  return calculated_tariff_type;
}


#ifdef calculated_tariff_type_MAIN

void test_calculated_tariff_type(int include_optional) {
    calculated_tariff_type_t* calculated_tariff_type_1 = instantiate_calculated_tariff_type(include_optional);

	cJSON* jsoncalculated_tariff_type_1 = calculated_tariff_type_convertToJSON(calculated_tariff_type_1);
	printf("calculated_tariff_type :\n%s\n", cJSON_Print(jsoncalculated_tariff_type_1));
	calculated_tariff_type_t* calculated_tariff_type_2 = calculated_tariff_type_parseFromJSON(jsoncalculated_tariff_type_1);
	cJSON* jsoncalculated_tariff_type_2 = calculated_tariff_type_convertToJSON(calculated_tariff_type_2);
	printf("repeating calculated_tariff_type:\n%s\n", cJSON_Print(jsoncalculated_tariff_type_2));
}

int main() {
  test_calculated_tariff_type(1);
  test_calculated_tariff_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // calculated_tariff_type_MAIN
#endif // calculated_tariff_type_TEST
