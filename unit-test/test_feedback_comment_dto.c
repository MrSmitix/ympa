#ifndef feedback_comment_dto_TEST
#define feedback_comment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_comment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_comment_dto.h"
feedback_comment_dto_t* instantiate_feedback_comment_dto(int include_optional);

#include "test_feedback_comment_author_dto.c"


feedback_comment_dto_t* instantiate_feedback_comment_dto(int include_optional) {
  feedback_comment_dto_t* feedback_comment_dto = NULL;
  if (include_optional) {
    feedback_comment_dto = feedback_comment_dto_create(
      56,
      56,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
       // false, not to have infinite recursion
      instantiate_feedback_comment_author_dto(0),
      list_createList()
    );
  } else {
    feedback_comment_dto = feedback_comment_dto_create(
      56,
      56,
      "0",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      NULL,
      list_createList()
    );
  }

  return feedback_comment_dto;
}


#ifdef feedback_comment_dto_MAIN

void test_feedback_comment_dto(int include_optional) {
    feedback_comment_dto_t* feedback_comment_dto_1 = instantiate_feedback_comment_dto(include_optional);

	cJSON* jsonfeedback_comment_dto_1 = feedback_comment_dto_convertToJSON(feedback_comment_dto_1);
	printf("feedback_comment_dto :\n%s\n", cJSON_Print(jsonfeedback_comment_dto_1));
	feedback_comment_dto_t* feedback_comment_dto_2 = feedback_comment_dto_parseFromJSON(jsonfeedback_comment_dto_1);
	cJSON* jsonfeedback_comment_dto_2 = feedback_comment_dto_convertToJSON(feedback_comment_dto_2);
	printf("repeating feedback_comment_dto:\n%s\n", cJSON_Print(jsonfeedback_comment_dto_2));
}

int main() {
  test_feedback_comment_dto(1);
  test_feedback_comment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_comment_dto_MAIN
#endif // feedback_comment_dto_TEST
