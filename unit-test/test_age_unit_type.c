#ifndef age_unit_type_TEST
#define age_unit_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define age_unit_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/age_unit_type.h"
age_unit_type_t* instantiate_age_unit_type(int include_optional);



age_unit_type_t* instantiate_age_unit_type(int include_optional) {
  age_unit_type_t* age_unit_type = NULL;
  if (include_optional) {
    age_unit_type = age_unit_type_create(
    );
  } else {
    age_unit_type = age_unit_type_create(
    );
  }

  return age_unit_type;
}


#ifdef age_unit_type_MAIN

void test_age_unit_type(int include_optional) {
    age_unit_type_t* age_unit_type_1 = instantiate_age_unit_type(include_optional);

	cJSON* jsonage_unit_type_1 = age_unit_type_convertToJSON(age_unit_type_1);
	printf("age_unit_type :\n%s\n", cJSON_Print(jsonage_unit_type_1));
	age_unit_type_t* age_unit_type_2 = age_unit_type_parseFromJSON(jsonage_unit_type_1);
	cJSON* jsonage_unit_type_2 = age_unit_type_convertToJSON(age_unit_type_2);
	printf("repeating age_unit_type:\n%s\n", cJSON_Print(jsonage_unit_type_2));
}

int main() {
  test_age_unit_type(1);
  test_age_unit_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // age_unit_type_MAIN
#endif // age_unit_type_TEST
