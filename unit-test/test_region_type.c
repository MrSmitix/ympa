#ifndef region_type_TEST
#define region_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define region_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/region_type.h"
region_type_t* instantiate_region_type(int include_optional);



region_type_t* instantiate_region_type(int include_optional) {
  region_type_t* region_type = NULL;
  if (include_optional) {
    region_type = region_type_create(
    );
  } else {
    region_type = region_type_create(
    );
  }

  return region_type;
}


#ifdef region_type_MAIN

void test_region_type(int include_optional) {
    region_type_t* region_type_1 = instantiate_region_type(include_optional);

	cJSON* jsonregion_type_1 = region_type_convertToJSON(region_type_1);
	printf("region_type :\n%s\n", cJSON_Print(jsonregion_type_1));
	region_type_t* region_type_2 = region_type_parseFromJSON(jsonregion_type_1);
	cJSON* jsonregion_type_2 = region_type_convertToJSON(region_type_2);
	printf("repeating region_type:\n%s\n", cJSON_Print(jsonregion_type_2));
}

int main() {
  test_region_type(1);
  test_region_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // region_type_MAIN
#endif // region_type_TEST
