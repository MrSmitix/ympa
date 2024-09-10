#ifndef feedback_factor_dto_TEST
#define feedback_factor_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_factor_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_factor_dto.h"
feedback_factor_dto_t* instantiate_feedback_factor_dto(int include_optional);



feedback_factor_dto_t* instantiate_feedback_factor_dto(int include_optional) {
  feedback_factor_dto_t* feedback_factor_dto = NULL;
  if (include_optional) {
    feedback_factor_dto = feedback_factor_dto_create(
      56,
      "0",
      "0",
      56
    );
  } else {
    feedback_factor_dto = feedback_factor_dto_create(
      56,
      "0",
      "0",
      56
    );
  }

  return feedback_factor_dto;
}


#ifdef feedback_factor_dto_MAIN

void test_feedback_factor_dto(int include_optional) {
    feedback_factor_dto_t* feedback_factor_dto_1 = instantiate_feedback_factor_dto(include_optional);

	cJSON* jsonfeedback_factor_dto_1 = feedback_factor_dto_convertToJSON(feedback_factor_dto_1);
	printf("feedback_factor_dto :\n%s\n", cJSON_Print(jsonfeedback_factor_dto_1));
	feedback_factor_dto_t* feedback_factor_dto_2 = feedback_factor_dto_parseFromJSON(jsonfeedback_factor_dto_1);
	cJSON* jsonfeedback_factor_dto_2 = feedback_factor_dto_convertToJSON(feedback_factor_dto_2);
	printf("repeating feedback_factor_dto:\n%s\n", cJSON_Print(jsonfeedback_factor_dto_2));
}

int main() {
  test_feedback_factor_dto(1);
  test_feedback_factor_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_factor_dto_MAIN
#endif // feedback_factor_dto_TEST
