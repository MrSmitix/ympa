#ifndef logistic_point_type_TEST
#define logistic_point_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define logistic_point_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/logistic_point_type.h"
logistic_point_type_t* instantiate_logistic_point_type(int include_optional);



logistic_point_type_t* instantiate_logistic_point_type(int include_optional) {
  logistic_point_type_t* logistic_point_type = NULL;
  if (include_optional) {
    logistic_point_type = logistic_point_type_create(
    );
  } else {
    logistic_point_type = logistic_point_type_create(
    );
  }

  return logistic_point_type;
}


#ifdef logistic_point_type_MAIN

void test_logistic_point_type(int include_optional) {
    logistic_point_type_t* logistic_point_type_1 = instantiate_logistic_point_type(include_optional);

	cJSON* jsonlogistic_point_type_1 = logistic_point_type_convertToJSON(logistic_point_type_1);
	printf("logistic_point_type :\n%s\n", cJSON_Print(jsonlogistic_point_type_1));
	logistic_point_type_t* logistic_point_type_2 = logistic_point_type_parseFromJSON(jsonlogistic_point_type_1);
	cJSON* jsonlogistic_point_type_2 = logistic_point_type_convertToJSON(logistic_point_type_2);
	printf("repeating logistic_point_type:\n%s\n", cJSON_Print(jsonlogistic_point_type_2));
}

int main() {
  test_logistic_point_type(1);
  test_logistic_point_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // logistic_point_type_MAIN
#endif // logistic_point_type_TEST
