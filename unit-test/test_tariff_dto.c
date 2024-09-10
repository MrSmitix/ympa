#ifndef tariff_dto_TEST
#define tariff_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define tariff_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/tariff_dto.h"
tariff_dto_t* instantiate_tariff_dto(int include_optional);



tariff_dto_t* instantiate_tariff_dto(int include_optional) {
  tariff_dto_t* tariff_dto = NULL;
  if (include_optional) {
    tariff_dto = tariff_dto_create(
      _api__tariff_dto__AGENCY_COMMISSION,
      1.337,
      1.337,
      list_createList()
    );
  } else {
    tariff_dto = tariff_dto_create(
      _api__tariff_dto__AGENCY_COMMISSION,
      1.337,
      1.337,
      list_createList()
    );
  }

  return tariff_dto;
}


#ifdef tariff_dto_MAIN

void test_tariff_dto(int include_optional) {
    tariff_dto_t* tariff_dto_1 = instantiate_tariff_dto(include_optional);

	cJSON* jsontariff_dto_1 = tariff_dto_convertToJSON(tariff_dto_1);
	printf("tariff_dto :\n%s\n", cJSON_Print(jsontariff_dto_1));
	tariff_dto_t* tariff_dto_2 = tariff_dto_parseFromJSON(jsontariff_dto_1);
	cJSON* jsontariff_dto_2 = tariff_dto_convertToJSON(tariff_dto_2);
	printf("repeating tariff_dto:\n%s\n", cJSON_Print(jsontariff_dto_2));
}

int main() {
  test_tariff_dto(1);
  test_tariff_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // tariff_dto_MAIN
#endif // tariff_dto_TEST
