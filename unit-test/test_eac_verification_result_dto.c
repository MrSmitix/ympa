#ifndef eac_verification_result_dto_TEST
#define eac_verification_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define eac_verification_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/eac_verification_result_dto.h"
eac_verification_result_dto_t* instantiate_eac_verification_result_dto(int include_optional);



eac_verification_result_dto_t* instantiate_eac_verification_result_dto(int include_optional) {
  eac_verification_result_dto_t* eac_verification_result_dto = NULL;
  if (include_optional) {
    eac_verification_result_dto = eac_verification_result_dto_create(
      _api__eac_verification_result_dto__ACCEPTED,
      56
    );
  } else {
    eac_verification_result_dto = eac_verification_result_dto_create(
      _api__eac_verification_result_dto__ACCEPTED,
      56
    );
  }

  return eac_verification_result_dto;
}


#ifdef eac_verification_result_dto_MAIN

void test_eac_verification_result_dto(int include_optional) {
    eac_verification_result_dto_t* eac_verification_result_dto_1 = instantiate_eac_verification_result_dto(include_optional);

	cJSON* jsoneac_verification_result_dto_1 = eac_verification_result_dto_convertToJSON(eac_verification_result_dto_1);
	printf("eac_verification_result_dto :\n%s\n", cJSON_Print(jsoneac_verification_result_dto_1));
	eac_verification_result_dto_t* eac_verification_result_dto_2 = eac_verification_result_dto_parseFromJSON(jsoneac_verification_result_dto_1);
	cJSON* jsoneac_verification_result_dto_2 = eac_verification_result_dto_convertToJSON(eac_verification_result_dto_2);
	printf("repeating eac_verification_result_dto:\n%s\n", cJSON_Print(jsoneac_verification_result_dto_2));
}

int main() {
  test_eac_verification_result_dto(1);
  test_eac_verification_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // eac_verification_result_dto_MAIN
#endif // eac_verification_result_dto_TEST
