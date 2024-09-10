#ifndef mechanics_type_TEST
#define mechanics_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define mechanics_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/mechanics_type.h"
mechanics_type_t* instantiate_mechanics_type(int include_optional);



mechanics_type_t* instantiate_mechanics_type(int include_optional) {
  mechanics_type_t* mechanics_type = NULL;
  if (include_optional) {
    mechanics_type = mechanics_type_create(
    );
  } else {
    mechanics_type = mechanics_type_create(
    );
  }

  return mechanics_type;
}


#ifdef mechanics_type_MAIN

void test_mechanics_type(int include_optional) {
    mechanics_type_t* mechanics_type_1 = instantiate_mechanics_type(include_optional);

	cJSON* jsonmechanics_type_1 = mechanics_type_convertToJSON(mechanics_type_1);
	printf("mechanics_type :\n%s\n", cJSON_Print(jsonmechanics_type_1));
	mechanics_type_t* mechanics_type_2 = mechanics_type_parseFromJSON(jsonmechanics_type_1);
	cJSON* jsonmechanics_type_2 = mechanics_type_convertToJSON(mechanics_type_2);
	printf("repeating mechanics_type:\n%s\n", cJSON_Print(jsonmechanics_type_2));
}

int main() {
  test_mechanics_type(1);
  test_mechanics_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // mechanics_type_MAIN
#endif // mechanics_type_TEST
