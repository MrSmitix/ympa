#ifndef tariff_parameter_dto_TEST
#define tariff_parameter_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define tariff_parameter_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/tariff_parameter_dto.h"
tariff_parameter_dto_t* instantiate_tariff_parameter_dto(int include_optional);



tariff_parameter_dto_t* instantiate_tariff_parameter_dto(int include_optional) {
  tariff_parameter_dto_t* tariff_parameter_dto = NULL;
  if (include_optional) {
    tariff_parameter_dto = tariff_parameter_dto_create(
      "0",
      "0"
    );
  } else {
    tariff_parameter_dto = tariff_parameter_dto_create(
      "0",
      "0"
    );
  }

  return tariff_parameter_dto;
}


#ifdef tariff_parameter_dto_MAIN

void test_tariff_parameter_dto(int include_optional) {
    tariff_parameter_dto_t* tariff_parameter_dto_1 = instantiate_tariff_parameter_dto(include_optional);

	cJSON* jsontariff_parameter_dto_1 = tariff_parameter_dto_convertToJSON(tariff_parameter_dto_1);
	printf("tariff_parameter_dto :\n%s\n", cJSON_Print(jsontariff_parameter_dto_1));
	tariff_parameter_dto_t* tariff_parameter_dto_2 = tariff_parameter_dto_parseFromJSON(jsontariff_parameter_dto_1);
	cJSON* jsontariff_parameter_dto_2 = tariff_parameter_dto_convertToJSON(tariff_parameter_dto_2);
	printf("repeating tariff_parameter_dto:\n%s\n", cJSON_Print(jsontariff_parameter_dto_2));
}

int main() {
  test_tariff_parameter_dto(1);
  test_tariff_parameter_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // tariff_parameter_dto_MAIN
#endif // tariff_parameter_dto_TEST
