#ifndef feedback_comment_author_dto_TEST
#define feedback_comment_author_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_comment_author_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_comment_author_dto.h"
feedback_comment_author_dto_t* instantiate_feedback_comment_author_dto(int include_optional);



feedback_comment_author_dto_t* instantiate_feedback_comment_author_dto(int include_optional) {
  feedback_comment_author_dto_t* feedback_comment_author_dto = NULL;
  if (include_optional) {
    feedback_comment_author_dto = feedback_comment_author_dto_create(
      _api__feedback_comment_author_dto__USER,
      "0"
    );
  } else {
    feedback_comment_author_dto = feedback_comment_author_dto_create(
      _api__feedback_comment_author_dto__USER,
      "0"
    );
  }

  return feedback_comment_author_dto;
}


#ifdef feedback_comment_author_dto_MAIN

void test_feedback_comment_author_dto(int include_optional) {
    feedback_comment_author_dto_t* feedback_comment_author_dto_1 = instantiate_feedback_comment_author_dto(include_optional);

	cJSON* jsonfeedback_comment_author_dto_1 = feedback_comment_author_dto_convertToJSON(feedback_comment_author_dto_1);
	printf("feedback_comment_author_dto :\n%s\n", cJSON_Print(jsonfeedback_comment_author_dto_1));
	feedback_comment_author_dto_t* feedback_comment_author_dto_2 = feedback_comment_author_dto_parseFromJSON(jsonfeedback_comment_author_dto_1);
	cJSON* jsonfeedback_comment_author_dto_2 = feedback_comment_author_dto_convertToJSON(feedback_comment_author_dto_2);
	printf("repeating feedback_comment_author_dto:\n%s\n", cJSON_Print(jsonfeedback_comment_author_dto_2));
}

int main() {
  test_feedback_comment_author_dto(1);
  test_feedback_comment_author_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_comment_author_dto_MAIN
#endif // feedback_comment_author_dto_TEST
