#ifndef calculate_tariffs_parameters_dto_TEST
#define calculate_tariffs_parameters_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define calculate_tariffs_parameters_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/calculate_tariffs_parameters_dto.h"
calculate_tariffs_parameters_dto_t* instantiate_calculate_tariffs_parameters_dto(int include_optional);



calculate_tariffs_parameters_dto_t* instantiate_calculate_tariffs_parameters_dto(int include_optional) {
  calculate_tariffs_parameters_dto_t* calculate_tariffs_parameters_dto = NULL;
  if (include_optional) {
    calculate_tariffs_parameters_dto = calculate_tariffs_parameters_dto_create(
      56,
      _api__calculate_tariffs_parameters_dto__FBY,
      _api__calculate_tariffs_parameters_dto__DAILY
    );
  } else {
    calculate_tariffs_parameters_dto = calculate_tariffs_parameters_dto_create(
      56,
      _api__calculate_tariffs_parameters_dto__FBY,
      _api__calculate_tariffs_parameters_dto__DAILY
    );
  }

  return calculate_tariffs_parameters_dto;
}


#ifdef calculate_tariffs_parameters_dto_MAIN

void test_calculate_tariffs_parameters_dto(int include_optional) {
    calculate_tariffs_parameters_dto_t* calculate_tariffs_parameters_dto_1 = instantiate_calculate_tariffs_parameters_dto(include_optional);

	cJSON* jsoncalculate_tariffs_parameters_dto_1 = calculate_tariffs_parameters_dto_convertToJSON(calculate_tariffs_parameters_dto_1);
	printf("calculate_tariffs_parameters_dto :\n%s\n", cJSON_Print(jsoncalculate_tariffs_parameters_dto_1));
	calculate_tariffs_parameters_dto_t* calculate_tariffs_parameters_dto_2 = calculate_tariffs_parameters_dto_parseFromJSON(jsoncalculate_tariffs_parameters_dto_1);
	cJSON* jsoncalculate_tariffs_parameters_dto_2 = calculate_tariffs_parameters_dto_convertToJSON(calculate_tariffs_parameters_dto_2);
	printf("repeating calculate_tariffs_parameters_dto:\n%s\n", cJSON_Print(jsoncalculate_tariffs_parameters_dto_2));
}

int main() {
  test_calculate_tariffs_parameters_dto(1);
  test_calculate_tariffs_parameters_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // calculate_tariffs_parameters_dto_MAIN
#endif // calculate_tariffs_parameters_dto_TEST
