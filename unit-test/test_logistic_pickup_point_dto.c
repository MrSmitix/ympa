#ifndef logistic_pickup_point_dto_TEST
#define logistic_pickup_point_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define logistic_pickup_point_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/logistic_pickup_point_dto.h"
logistic_pickup_point_dto_t* instantiate_logistic_pickup_point_dto(int include_optional);

#include "test_pickup_address_dto.c"


logistic_pickup_point_dto_t* instantiate_logistic_pickup_point_dto(int include_optional) {
  logistic_pickup_point_dto_t* logistic_pickup_point_dto = NULL;
  if (include_optional) {
    logistic_pickup_point_dto = logistic_pickup_point_dto_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_pickup_address_dto(0),
      "0",
      _api__logistic_pickup_point_dto__WAREHOUSE,
      56
    );
  } else {
    logistic_pickup_point_dto = logistic_pickup_point_dto_create(
      56,
      "0",
      NULL,
      "0",
      _api__logistic_pickup_point_dto__WAREHOUSE,
      56
    );
  }

  return logistic_pickup_point_dto;
}


#ifdef logistic_pickup_point_dto_MAIN

void test_logistic_pickup_point_dto(int include_optional) {
    logistic_pickup_point_dto_t* logistic_pickup_point_dto_1 = instantiate_logistic_pickup_point_dto(include_optional);

	cJSON* jsonlogistic_pickup_point_dto_1 = logistic_pickup_point_dto_convertToJSON(logistic_pickup_point_dto_1);
	printf("logistic_pickup_point_dto :\n%s\n", cJSON_Print(jsonlogistic_pickup_point_dto_1));
	logistic_pickup_point_dto_t* logistic_pickup_point_dto_2 = logistic_pickup_point_dto_parseFromJSON(jsonlogistic_pickup_point_dto_1);
	cJSON* jsonlogistic_pickup_point_dto_2 = logistic_pickup_point_dto_convertToJSON(logistic_pickup_point_dto_2);
	printf("repeating logistic_pickup_point_dto:\n%s\n", cJSON_Print(jsonlogistic_pickup_point_dto_2));
}

int main() {
  test_logistic_pickup_point_dto(1);
  test_logistic_pickup_point_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // logistic_pickup_point_dto_MAIN
#endif // logistic_pickup_point_dto_TEST
