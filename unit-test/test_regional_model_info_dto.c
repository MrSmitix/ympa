#ifndef regional_model_info_dto_TEST
#define regional_model_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define regional_model_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/regional_model_info_dto.h"
regional_model_info_dto_t* instantiate_regional_model_info_dto(int include_optional);



regional_model_info_dto_t* instantiate_regional_model_info_dto(int include_optional) {
  regional_model_info_dto_t* regional_model_info_dto = NULL;
  if (include_optional) {
    regional_model_info_dto = regional_model_info_dto_create(
      _api__regional_model_info_dto__RUR,
      56
    );
  } else {
    regional_model_info_dto = regional_model_info_dto_create(
      _api__regional_model_info_dto__RUR,
      56
    );
  }

  return regional_model_info_dto;
}


#ifdef regional_model_info_dto_MAIN

void test_regional_model_info_dto(int include_optional) {
    regional_model_info_dto_t* regional_model_info_dto_1 = instantiate_regional_model_info_dto(include_optional);

	cJSON* jsonregional_model_info_dto_1 = regional_model_info_dto_convertToJSON(regional_model_info_dto_1);
	printf("regional_model_info_dto :\n%s\n", cJSON_Print(jsonregional_model_info_dto_1));
	regional_model_info_dto_t* regional_model_info_dto_2 = regional_model_info_dto_parseFromJSON(jsonregional_model_info_dto_1);
	cJSON* jsonregional_model_info_dto_2 = regional_model_info_dto_convertToJSON(regional_model_info_dto_2);
	printf("repeating regional_model_info_dto:\n%s\n", cJSON_Print(jsonregional_model_info_dto_2));
}

int main() {
  test_regional_model_info_dto(1);
  test_regional_model_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // regional_model_info_dto_MAIN
#endif // regional_model_info_dto_TEST
