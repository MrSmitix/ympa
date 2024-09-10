#ifndef full_outlet_license_dto_TEST
#define full_outlet_license_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define full_outlet_license_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/full_outlet_license_dto.h"
full_outlet_license_dto_t* instantiate_full_outlet_license_dto(int include_optional);



full_outlet_license_dto_t* instantiate_full_outlet_license_dto(int include_optional) {
  full_outlet_license_dto_t* full_outlet_license_dto = NULL;
  if (include_optional) {
    full_outlet_license_dto = full_outlet_license_dto_create(
      56,
      56,
      _api__full_outlet_license_dto__ALCOHOL,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__full_outlet_license_dto__NEW,
      "0"
    );
  } else {
    full_outlet_license_dto = full_outlet_license_dto_create(
      56,
      56,
      _api__full_outlet_license_dto__ALCOHOL,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__full_outlet_license_dto__NEW,
      "0"
    );
  }

  return full_outlet_license_dto;
}


#ifdef full_outlet_license_dto_MAIN

void test_full_outlet_license_dto(int include_optional) {
    full_outlet_license_dto_t* full_outlet_license_dto_1 = instantiate_full_outlet_license_dto(include_optional);

	cJSON* jsonfull_outlet_license_dto_1 = full_outlet_license_dto_convertToJSON(full_outlet_license_dto_1);
	printf("full_outlet_license_dto :\n%s\n", cJSON_Print(jsonfull_outlet_license_dto_1));
	full_outlet_license_dto_t* full_outlet_license_dto_2 = full_outlet_license_dto_parseFromJSON(jsonfull_outlet_license_dto_1);
	cJSON* jsonfull_outlet_license_dto_2 = full_outlet_license_dto_convertToJSON(full_outlet_license_dto_2);
	printf("repeating full_outlet_license_dto:\n%s\n", cJSON_Print(jsonfull_outlet_license_dto_2));
}

int main() {
  test_full_outlet_license_dto(1);
  test_full_outlet_license_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // full_outlet_license_dto_MAIN
#endif // full_outlet_license_dto_TEST
