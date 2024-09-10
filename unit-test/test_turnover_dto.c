#ifndef turnover_dto_TEST
#define turnover_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define turnover_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/turnover_dto.h"
turnover_dto_t* instantiate_turnover_dto(int include_optional);



turnover_dto_t* instantiate_turnover_dto(int include_optional) {
  turnover_dto_t* turnover_dto = NULL;
  if (include_optional) {
    turnover_dto = turnover_dto_create(
      _api__turnover_dto__LOW,
      1.337
    );
  } else {
    turnover_dto = turnover_dto_create(
      _api__turnover_dto__LOW,
      1.337
    );
  }

  return turnover_dto;
}


#ifdef turnover_dto_MAIN

void test_turnover_dto(int include_optional) {
    turnover_dto_t* turnover_dto_1 = instantiate_turnover_dto(include_optional);

	cJSON* jsonturnover_dto_1 = turnover_dto_convertToJSON(turnover_dto_1);
	printf("turnover_dto :\n%s\n", cJSON_Print(jsonturnover_dto_1));
	turnover_dto_t* turnover_dto_2 = turnover_dto_parseFromJSON(jsonturnover_dto_1);
	cJSON* jsonturnover_dto_2 = turnover_dto_convertToJSON(turnover_dto_2);
	printf("repeating turnover_dto:\n%s\n", cJSON_Print(jsonturnover_dto_2));
}

int main() {
  test_turnover_dto(1);
  test_turnover_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // turnover_dto_MAIN
#endif // turnover_dto_TEST
