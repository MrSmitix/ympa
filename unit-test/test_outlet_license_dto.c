#ifndef outlet_license_dto_TEST
#define outlet_license_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_license_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_license_dto.h"
outlet_license_dto_t* instantiate_outlet_license_dto(int include_optional);



outlet_license_dto_t* instantiate_outlet_license_dto(int include_optional) {
  outlet_license_dto_t* outlet_license_dto = NULL;
  if (include_optional) {
    outlet_license_dto = outlet_license_dto_create(
      56,
      56,
      _api__outlet_license_dto__ALCOHOL,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    outlet_license_dto = outlet_license_dto_create(
      56,
      56,
      _api__outlet_license_dto__ALCOHOL,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return outlet_license_dto;
}


#ifdef outlet_license_dto_MAIN

void test_outlet_license_dto(int include_optional) {
    outlet_license_dto_t* outlet_license_dto_1 = instantiate_outlet_license_dto(include_optional);

	cJSON* jsonoutlet_license_dto_1 = outlet_license_dto_convertToJSON(outlet_license_dto_1);
	printf("outlet_license_dto :\n%s\n", cJSON_Print(jsonoutlet_license_dto_1));
	outlet_license_dto_t* outlet_license_dto_2 = outlet_license_dto_parseFromJSON(jsonoutlet_license_dto_1);
	cJSON* jsonoutlet_license_dto_2 = outlet_license_dto_convertToJSON(outlet_license_dto_2);
	printf("repeating outlet_license_dto:\n%s\n", cJSON_Print(jsonoutlet_license_dto_2));
}

int main() {
  test_outlet_license_dto(1);
  test_outlet_license_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_license_dto_MAIN
#endif // outlet_license_dto_TEST
