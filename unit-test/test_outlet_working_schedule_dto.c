#ifndef outlet_working_schedule_dto_TEST
#define outlet_working_schedule_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_working_schedule_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_working_schedule_dto.h"
outlet_working_schedule_dto_t* instantiate_outlet_working_schedule_dto(int include_optional);



outlet_working_schedule_dto_t* instantiate_outlet_working_schedule_dto(int include_optional) {
  outlet_working_schedule_dto_t* outlet_working_schedule_dto = NULL;
  if (include_optional) {
    outlet_working_schedule_dto = outlet_working_schedule_dto_create(
      1,
      list_createList()
    );
  } else {
    outlet_working_schedule_dto = outlet_working_schedule_dto_create(
      1,
      list_createList()
    );
  }

  return outlet_working_schedule_dto;
}


#ifdef outlet_working_schedule_dto_MAIN

void test_outlet_working_schedule_dto(int include_optional) {
    outlet_working_schedule_dto_t* outlet_working_schedule_dto_1 = instantiate_outlet_working_schedule_dto(include_optional);

	cJSON* jsonoutlet_working_schedule_dto_1 = outlet_working_schedule_dto_convertToJSON(outlet_working_schedule_dto_1);
	printf("outlet_working_schedule_dto :\n%s\n", cJSON_Print(jsonoutlet_working_schedule_dto_1));
	outlet_working_schedule_dto_t* outlet_working_schedule_dto_2 = outlet_working_schedule_dto_parseFromJSON(jsonoutlet_working_schedule_dto_1);
	cJSON* jsonoutlet_working_schedule_dto_2 = outlet_working_schedule_dto_convertToJSON(outlet_working_schedule_dto_2);
	printf("repeating outlet_working_schedule_dto:\n%s\n", cJSON_Print(jsonoutlet_working_schedule_dto_2));
}

int main() {
  test_outlet_working_schedule_dto(1);
  test_outlet_working_schedule_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_working_schedule_dto_MAIN
#endif // outlet_working_schedule_dto_TEST
