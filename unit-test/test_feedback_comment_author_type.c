#ifndef feedback_comment_author_type_TEST
#define feedback_comment_author_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_comment_author_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_comment_author_type.h"
feedback_comment_author_type_t* instantiate_feedback_comment_author_type(int include_optional);



feedback_comment_author_type_t* instantiate_feedback_comment_author_type(int include_optional) {
  feedback_comment_author_type_t* feedback_comment_author_type = NULL;
  if (include_optional) {
    feedback_comment_author_type = feedback_comment_author_type_create(
    );
  } else {
    feedback_comment_author_type = feedback_comment_author_type_create(
    );
  }

  return feedback_comment_author_type;
}


#ifdef feedback_comment_author_type_MAIN

void test_feedback_comment_author_type(int include_optional) {
    feedback_comment_author_type_t* feedback_comment_author_type_1 = instantiate_feedback_comment_author_type(include_optional);

	cJSON* jsonfeedback_comment_author_type_1 = feedback_comment_author_type_convertToJSON(feedback_comment_author_type_1);
	printf("feedback_comment_author_type :\n%s\n", cJSON_Print(jsonfeedback_comment_author_type_1));
	feedback_comment_author_type_t* feedback_comment_author_type_2 = feedback_comment_author_type_parseFromJSON(jsonfeedback_comment_author_type_1);
	cJSON* jsonfeedback_comment_author_type_2 = feedback_comment_author_type_convertToJSON(feedback_comment_author_type_2);
	printf("repeating feedback_comment_author_type:\n%s\n", cJSON_Print(jsonfeedback_comment_author_type_2));
}

int main() {
  test_feedback_comment_author_type(1);
  test_feedback_comment_author_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_comment_author_type_MAIN
#endif // feedback_comment_author_type_TEST
