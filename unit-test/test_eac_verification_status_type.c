#ifndef eac_verification_status_type_TEST
#define eac_verification_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define eac_verification_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/eac_verification_status_type.h"
eac_verification_status_type_t* instantiate_eac_verification_status_type(int include_optional);



eac_verification_status_type_t* instantiate_eac_verification_status_type(int include_optional) {
  eac_verification_status_type_t* eac_verification_status_type = NULL;
  if (include_optional) {
    eac_verification_status_type = eac_verification_status_type_create(
    );
  } else {
    eac_verification_status_type = eac_verification_status_type_create(
    );
  }

  return eac_verification_status_type;
}


#ifdef eac_verification_status_type_MAIN

void test_eac_verification_status_type(int include_optional) {
    eac_verification_status_type_t* eac_verification_status_type_1 = instantiate_eac_verification_status_type(include_optional);

	cJSON* jsoneac_verification_status_type_1 = eac_verification_status_type_convertToJSON(eac_verification_status_type_1);
	printf("eac_verification_status_type :\n%s\n", cJSON_Print(jsoneac_verification_status_type_1));
	eac_verification_status_type_t* eac_verification_status_type_2 = eac_verification_status_type_parseFromJSON(jsoneac_verification_status_type_1);
	cJSON* jsoneac_verification_status_type_2 = eac_verification_status_type_convertToJSON(eac_verification_status_type_2);
	printf("repeating eac_verification_status_type:\n%s\n", cJSON_Print(jsoneac_verification_status_type_2));
}

int main() {
  test_eac_verification_status_type(1);
  test_eac_verification_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // eac_verification_status_type_MAIN
#endif // eac_verification_status_type_TEST
