#ifndef feedback_state_type_TEST
#define feedback_state_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_state_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_state_type.h"
feedback_state_type_t* instantiate_feedback_state_type(int include_optional);



feedback_state_type_t* instantiate_feedback_state_type(int include_optional) {
  feedback_state_type_t* feedback_state_type = NULL;
  if (include_optional) {
    feedback_state_type = feedback_state_type_create(
    );
  } else {
    feedback_state_type = feedback_state_type_create(
    );
  }

  return feedback_state_type;
}


#ifdef feedback_state_type_MAIN

void test_feedback_state_type(int include_optional) {
    feedback_state_type_t* feedback_state_type_1 = instantiate_feedback_state_type(include_optional);

	cJSON* jsonfeedback_state_type_1 = feedback_state_type_convertToJSON(feedback_state_type_1);
	printf("feedback_state_type :\n%s\n", cJSON_Print(jsonfeedback_state_type_1));
	feedback_state_type_t* feedback_state_type_2 = feedback_state_type_parseFromJSON(jsonfeedback_state_type_1);
	cJSON* jsonfeedback_state_type_2 = feedback_state_type_convertToJSON(feedback_state_type_2);
	printf("repeating feedback_state_type:\n%s\n", cJSON_Print(jsonfeedback_state_type_2));
}

int main() {
  test_feedback_state_type(1);
  test_feedback_state_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_state_type_MAIN
#endif // feedback_state_type_TEST
