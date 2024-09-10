#ifndef feedback_grades_dto_TEST
#define feedback_grades_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_grades_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_grades_dto.h"
feedback_grades_dto_t* instantiate_feedback_grades_dto(int include_optional);



feedback_grades_dto_t* instantiate_feedback_grades_dto(int include_optional) {
  feedback_grades_dto_t* feedback_grades_dto = NULL;
  if (include_optional) {
    feedback_grades_dto = feedback_grades_dto_create(
      1.337,
      56,
      56,
      list_createList()
    );
  } else {
    feedback_grades_dto = feedback_grades_dto_create(
      1.337,
      56,
      56,
      list_createList()
    );
  }

  return feedback_grades_dto;
}


#ifdef feedback_grades_dto_MAIN

void test_feedback_grades_dto(int include_optional) {
    feedback_grades_dto_t* feedback_grades_dto_1 = instantiate_feedback_grades_dto(include_optional);

	cJSON* jsonfeedback_grades_dto_1 = feedback_grades_dto_convertToJSON(feedback_grades_dto_1);
	printf("feedback_grades_dto :\n%s\n", cJSON_Print(jsonfeedback_grades_dto_1));
	feedback_grades_dto_t* feedback_grades_dto_2 = feedback_grades_dto_parseFromJSON(jsonfeedback_grades_dto_1);
	cJSON* jsonfeedback_grades_dto_2 = feedback_grades_dto_convertToJSON(feedback_grades_dto_2);
	printf("repeating feedback_grades_dto:\n%s\n", cJSON_Print(jsonfeedback_grades_dto_2));
}

int main() {
  test_feedback_grades_dto(1);
  test_feedback_grades_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_grades_dto_MAIN
#endif // feedback_grades_dto_TEST
