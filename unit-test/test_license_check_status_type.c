#ifndef license_check_status_type_TEST
#define license_check_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define license_check_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/license_check_status_type.h"
license_check_status_type_t* instantiate_license_check_status_type(int include_optional);



license_check_status_type_t* instantiate_license_check_status_type(int include_optional) {
  license_check_status_type_t* license_check_status_type = NULL;
  if (include_optional) {
    license_check_status_type = license_check_status_type_create(
    );
  } else {
    license_check_status_type = license_check_status_type_create(
    );
  }

  return license_check_status_type;
}


#ifdef license_check_status_type_MAIN

void test_license_check_status_type(int include_optional) {
    license_check_status_type_t* license_check_status_type_1 = instantiate_license_check_status_type(include_optional);

	cJSON* jsonlicense_check_status_type_1 = license_check_status_type_convertToJSON(license_check_status_type_1);
	printf("license_check_status_type :\n%s\n", cJSON_Print(jsonlicense_check_status_type_1));
	license_check_status_type_t* license_check_status_type_2 = license_check_status_type_parseFromJSON(jsonlicense_check_status_type_1);
	cJSON* jsonlicense_check_status_type_2 = license_check_status_type_convertToJSON(license_check_status_type_2);
	printf("repeating license_check_status_type:\n%s\n", cJSON_Print(jsonlicense_check_status_type_2));
}

int main() {
  test_license_check_status_type(1);
  test_license_check_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // license_check_status_type_MAIN
#endif // license_check_status_type_TEST
