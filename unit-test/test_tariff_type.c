#ifndef tariff_type_TEST
#define tariff_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define tariff_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/tariff_type.h"
tariff_type_t* instantiate_tariff_type(int include_optional);



tariff_type_t* instantiate_tariff_type(int include_optional) {
  tariff_type_t* tariff_type = NULL;
  if (include_optional) {
    tariff_type = tariff_type_create(
    );
  } else {
    tariff_type = tariff_type_create(
    );
  }

  return tariff_type;
}


#ifdef tariff_type_MAIN

void test_tariff_type(int include_optional) {
    tariff_type_t* tariff_type_1 = instantiate_tariff_type(include_optional);

	cJSON* jsontariff_type_1 = tariff_type_convertToJSON(tariff_type_1);
	printf("tariff_type :\n%s\n", cJSON_Print(jsontariff_type_1));
	tariff_type_t* tariff_type_2 = tariff_type_parseFromJSON(jsontariff_type_1);
	cJSON* jsontariff_type_2 = tariff_type_convertToJSON(tariff_type_2);
	printf("repeating tariff_type:\n%s\n", cJSON_Print(jsontariff_type_2));
}

int main() {
  test_tariff_type(1);
  test_tariff_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // tariff_type_MAIN
#endif // tariff_type_TEST
