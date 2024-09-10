#ifndef day_of_week_type_TEST
#define day_of_week_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define day_of_week_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/day_of_week_type.h"
day_of_week_type_t* instantiate_day_of_week_type(int include_optional);



day_of_week_type_t* instantiate_day_of_week_type(int include_optional) {
  day_of_week_type_t* day_of_week_type = NULL;
  if (include_optional) {
    day_of_week_type = day_of_week_type_create(
    );
  } else {
    day_of_week_type = day_of_week_type_create(
    );
  }

  return day_of_week_type;
}


#ifdef day_of_week_type_MAIN

void test_day_of_week_type(int include_optional) {
    day_of_week_type_t* day_of_week_type_1 = instantiate_day_of_week_type(include_optional);

	cJSON* jsonday_of_week_type_1 = day_of_week_type_convertToJSON(day_of_week_type_1);
	printf("day_of_week_type :\n%s\n", cJSON_Print(jsonday_of_week_type_1));
	day_of_week_type_t* day_of_week_type_2 = day_of_week_type_parseFromJSON(jsonday_of_week_type_1);
	cJSON* jsonday_of_week_type_2 = day_of_week_type_convertToJSON(day_of_week_type_2);
	printf("repeating day_of_week_type:\n%s\n", cJSON_Print(jsonday_of_week_type_2));
}

int main() {
  test_day_of_week_type(1);
  test_day_of_week_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // day_of_week_type_MAIN
#endif // day_of_week_type_TEST
