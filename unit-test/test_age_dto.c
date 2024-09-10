#ifndef age_dto_TEST
#define age_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define age_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/age_dto.h"
age_dto_t* instantiate_age_dto(int include_optional);



age_dto_t* instantiate_age_dto(int include_optional) {
  age_dto_t* age_dto = NULL;
  if (include_optional) {
    age_dto = age_dto_create(
      0,
      _api__age_dto__YEAR
    );
  } else {
    age_dto = age_dto_create(
      0,
      _api__age_dto__YEAR
    );
  }

  return age_dto;
}


#ifdef age_dto_MAIN

void test_age_dto(int include_optional) {
    age_dto_t* age_dto_1 = instantiate_age_dto(include_optional);

	cJSON* jsonage_dto_1 = age_dto_convertToJSON(age_dto_1);
	printf("age_dto :\n%s\n", cJSON_Print(jsonage_dto_1));
	age_dto_t* age_dto_2 = age_dto_parseFromJSON(jsonage_dto_1);
	cJSON* jsonage_dto_2 = age_dto_convertToJSON(age_dto_2);
	printf("repeating age_dto:\n%s\n", cJSON_Print(jsonage_dto_2));
}

int main() {
  test_age_dto(1);
  test_age_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // age_dto_MAIN
#endif // age_dto_TEST
