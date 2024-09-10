#ifndef feedback_author_dto_TEST
#define feedback_author_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_author_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_author_dto.h"
feedback_author_dto_t* instantiate_feedback_author_dto(int include_optional);

#include "test_region_dto.c"


feedback_author_dto_t* instantiate_feedback_author_dto(int include_optional) {
  feedback_author_dto_t* feedback_author_dto = NULL;
  if (include_optional) {
    feedback_author_dto = feedback_author_dto_create(
      "0",
       // false, not to have infinite recursion
      instantiate_region_dto(0)
    );
  } else {
    feedback_author_dto = feedback_author_dto_create(
      "0",
      NULL
    );
  }

  return feedback_author_dto;
}


#ifdef feedback_author_dto_MAIN

void test_feedback_author_dto(int include_optional) {
    feedback_author_dto_t* feedback_author_dto_1 = instantiate_feedback_author_dto(include_optional);

	cJSON* jsonfeedback_author_dto_1 = feedback_author_dto_convertToJSON(feedback_author_dto_1);
	printf("feedback_author_dto :\n%s\n", cJSON_Print(jsonfeedback_author_dto_1));
	feedback_author_dto_t* feedback_author_dto_2 = feedback_author_dto_parseFromJSON(jsonfeedback_author_dto_1);
	cJSON* jsonfeedback_author_dto_2 = feedback_author_dto_convertToJSON(feedback_author_dto_2);
	printf("repeating feedback_author_dto:\n%s\n", cJSON_Print(jsonfeedback_author_dto_2));
}

int main() {
  test_feedback_author_dto(1);
  test_feedback_author_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_author_dto_MAIN
#endif // feedback_author_dto_TEST
