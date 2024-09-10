#ifndef turnover_type_TEST
#define turnover_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define turnover_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/turnover_type.h"
turnover_type_t* instantiate_turnover_type(int include_optional);



turnover_type_t* instantiate_turnover_type(int include_optional) {
  turnover_type_t* turnover_type = NULL;
  if (include_optional) {
    turnover_type = turnover_type_create(
    );
  } else {
    turnover_type = turnover_type_create(
    );
  }

  return turnover_type;
}


#ifdef turnover_type_MAIN

void test_turnover_type(int include_optional) {
    turnover_type_t* turnover_type_1 = instantiate_turnover_type(include_optional);

	cJSON* jsonturnover_type_1 = turnover_type_convertToJSON(turnover_type_1);
	printf("turnover_type :\n%s\n", cJSON_Print(jsonturnover_type_1));
	turnover_type_t* turnover_type_2 = turnover_type_parseFromJSON(jsonturnover_type_1);
	cJSON* jsonturnover_type_2 = turnover_type_convertToJSON(turnover_type_2);
	printf("repeating turnover_type:\n%s\n", cJSON_Print(jsonturnover_type_2));
}

int main() {
  test_turnover_type(1);
  test_turnover_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // turnover_type_MAIN
#endif // turnover_type_TEST
