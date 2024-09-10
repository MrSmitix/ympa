#ifndef outlet_response_dto_TEST
#define outlet_response_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_response_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_response_dto.h"
outlet_response_dto_t* instantiate_outlet_response_dto(int include_optional);



outlet_response_dto_t* instantiate_outlet_response_dto(int include_optional) {
  outlet_response_dto_t* outlet_response_dto = NULL;
  if (include_optional) {
    outlet_response_dto = outlet_response_dto_create(
      56
    );
  } else {
    outlet_response_dto = outlet_response_dto_create(
      56
    );
  }

  return outlet_response_dto;
}


#ifdef outlet_response_dto_MAIN

void test_outlet_response_dto(int include_optional) {
    outlet_response_dto_t* outlet_response_dto_1 = instantiate_outlet_response_dto(include_optional);

	cJSON* jsonoutlet_response_dto_1 = outlet_response_dto_convertToJSON(outlet_response_dto_1);
	printf("outlet_response_dto :\n%s\n", cJSON_Print(jsonoutlet_response_dto_1));
	outlet_response_dto_t* outlet_response_dto_2 = outlet_response_dto_parseFromJSON(jsonoutlet_response_dto_1);
	cJSON* jsonoutlet_response_dto_2 = outlet_response_dto_convertToJSON(outlet_response_dto_2);
	printf("repeating outlet_response_dto:\n%s\n", cJSON_Print(jsonoutlet_response_dto_2));
}

int main() {
  test_outlet_response_dto(1);
  test_outlet_response_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_response_dto_MAIN
#endif // outlet_response_dto_TEST
