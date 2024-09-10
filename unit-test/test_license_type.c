#ifndef license_type_TEST
#define license_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define license_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/license_type.h"
license_type_t* instantiate_license_type(int include_optional);



license_type_t* instantiate_license_type(int include_optional) {
  license_type_t* license_type = NULL;
  if (include_optional) {
    license_type = license_type_create(
    );
  } else {
    license_type = license_type_create(
    );
  }

  return license_type;
}


#ifdef license_type_MAIN

void test_license_type(int include_optional) {
    license_type_t* license_type_1 = instantiate_license_type(include_optional);

	cJSON* jsonlicense_type_1 = license_type_convertToJSON(license_type_1);
	printf("license_type :\n%s\n", cJSON_Print(jsonlicense_type_1));
	license_type_t* license_type_2 = license_type_parseFromJSON(jsonlicense_type_1);
	cJSON* jsonlicense_type_2 = license_type_convertToJSON(license_type_2);
	printf("repeating license_type:\n%s\n", cJSON_Print(jsonlicense_type_2));
}

int main() {
  test_license_type(1);
  test_license_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // license_type_MAIN
#endif // license_type_TEST
