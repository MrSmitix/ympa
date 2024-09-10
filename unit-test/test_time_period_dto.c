#ifndef time_period_dto_TEST
#define time_period_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define time_period_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/time_period_dto.h"
time_period_dto_t* instantiate_time_period_dto(int include_optional);



time_period_dto_t* instantiate_time_period_dto(int include_optional) {
  time_period_dto_t* time_period_dto = NULL;
  if (include_optional) {
    time_period_dto = time_period_dto_create(
      56,
      _api__time_period_dto__HOUR,
      "0"
    );
  } else {
    time_period_dto = time_period_dto_create(
      56,
      _api__time_period_dto__HOUR,
      "0"
    );
  }

  return time_period_dto;
}


#ifdef time_period_dto_MAIN

void test_time_period_dto(int include_optional) {
    time_period_dto_t* time_period_dto_1 = instantiate_time_period_dto(include_optional);

	cJSON* jsontime_period_dto_1 = time_period_dto_convertToJSON(time_period_dto_1);
	printf("time_period_dto :\n%s\n", cJSON_Print(jsontime_period_dto_1));
	time_period_dto_t* time_period_dto_2 = time_period_dto_parseFromJSON(jsontime_period_dto_1);
	cJSON* jsontime_period_dto_2 = time_period_dto_convertToJSON(time_period_dto_2);
	printf("repeating time_period_dto:\n%s\n", cJSON_Print(jsontime_period_dto_2));
}

int main() {
  test_time_period_dto(1);
  test_time_period_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // time_period_dto_MAIN
#endif // time_period_dto_TEST
