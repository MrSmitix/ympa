#ifndef placement_type_TEST
#define placement_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define placement_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/placement_type.h"
placement_type_t* instantiate_placement_type(int include_optional);



placement_type_t* instantiate_placement_type(int include_optional) {
  placement_type_t* placement_type = NULL;
  if (include_optional) {
    placement_type = placement_type_create(
    );
  } else {
    placement_type = placement_type_create(
    );
  }

  return placement_type;
}


#ifdef placement_type_MAIN

void test_placement_type(int include_optional) {
    placement_type_t* placement_type_1 = instantiate_placement_type(include_optional);

	cJSON* jsonplacement_type_1 = placement_type_convertToJSON(placement_type_1);
	printf("placement_type :\n%s\n", cJSON_Print(jsonplacement_type_1));
	placement_type_t* placement_type_2 = placement_type_parseFromJSON(jsonplacement_type_1);
	cJSON* jsonplacement_type_2 = placement_type_convertToJSON(placement_type_2);
	printf("repeating placement_type:\n%s\n", cJSON_Print(jsonplacement_type_2));
}

int main() {
  test_placement_type(1);
  test_placement_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // placement_type_MAIN
#endif // placement_type_TEST
