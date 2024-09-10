#ifndef outlet_address_dto_TEST
#define outlet_address_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_address_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_address_dto.h"
outlet_address_dto_t* instantiate_outlet_address_dto(int include_optional);



outlet_address_dto_t* instantiate_outlet_address_dto(int include_optional) {
  outlet_address_dto_t* outlet_address_dto = NULL;
  if (include_optional) {
    outlet_address_dto = outlet_address_dto_create(
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      "0"
    );
  } else {
    outlet_address_dto = outlet_address_dto_create(
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      "0"
    );
  }

  return outlet_address_dto;
}


#ifdef outlet_address_dto_MAIN

void test_outlet_address_dto(int include_optional) {
    outlet_address_dto_t* outlet_address_dto_1 = instantiate_outlet_address_dto(include_optional);

	cJSON* jsonoutlet_address_dto_1 = outlet_address_dto_convertToJSON(outlet_address_dto_1);
	printf("outlet_address_dto :\n%s\n", cJSON_Print(jsonoutlet_address_dto_1));
	outlet_address_dto_t* outlet_address_dto_2 = outlet_address_dto_parseFromJSON(jsonoutlet_address_dto_1);
	cJSON* jsonoutlet_address_dto_2 = outlet_address_dto_convertToJSON(outlet_address_dto_2);
	printf("repeating outlet_address_dto:\n%s\n", cJSON_Print(jsonoutlet_address_dto_2));
}

int main() {
  test_outlet_address_dto(1);
  test_outlet_address_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_address_dto_MAIN
#endif // outlet_address_dto_TEST
