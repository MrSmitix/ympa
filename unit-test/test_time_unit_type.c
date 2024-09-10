#ifndef time_unit_type_TEST
#define time_unit_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define time_unit_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/time_unit_type.h"
time_unit_type_t* instantiate_time_unit_type(int include_optional);



time_unit_type_t* instantiate_time_unit_type(int include_optional) {
  time_unit_type_t* time_unit_type = NULL;
  if (include_optional) {
    time_unit_type = time_unit_type_create(
    );
  } else {
    time_unit_type = time_unit_type_create(
    );
  }

  return time_unit_type;
}


#ifdef time_unit_type_MAIN

void test_time_unit_type(int include_optional) {
    time_unit_type_t* time_unit_type_1 = instantiate_time_unit_type(include_optional);

	cJSON* jsontime_unit_type_1 = time_unit_type_convertToJSON(time_unit_type_1);
	printf("time_unit_type :\n%s\n", cJSON_Print(jsontime_unit_type_1));
	time_unit_type_t* time_unit_type_2 = time_unit_type_parseFromJSON(jsontime_unit_type_1);
	cJSON* jsontime_unit_type_2 = time_unit_type_convertToJSON(time_unit_type_2);
	printf("repeating time_unit_type:\n%s\n", cJSON_Print(jsontime_unit_type_2));
}

int main() {
  test_time_unit_type(1);
  test_time_unit_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // time_unit_type_MAIN
#endif // time_unit_type_TEST
