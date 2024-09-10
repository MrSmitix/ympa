#ifndef feedback_reaction_status_type_TEST
#define feedback_reaction_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_reaction_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_reaction_status_type.h"
feedback_reaction_status_type_t* instantiate_feedback_reaction_status_type(int include_optional);



feedback_reaction_status_type_t* instantiate_feedback_reaction_status_type(int include_optional) {
  feedback_reaction_status_type_t* feedback_reaction_status_type = NULL;
  if (include_optional) {
    feedback_reaction_status_type = feedback_reaction_status_type_create(
    );
  } else {
    feedback_reaction_status_type = feedback_reaction_status_type_create(
    );
  }

  return feedback_reaction_status_type;
}


#ifdef feedback_reaction_status_type_MAIN

void test_feedback_reaction_status_type(int include_optional) {
    feedback_reaction_status_type_t* feedback_reaction_status_type_1 = instantiate_feedback_reaction_status_type(include_optional);

	cJSON* jsonfeedback_reaction_status_type_1 = feedback_reaction_status_type_convertToJSON(feedback_reaction_status_type_1);
	printf("feedback_reaction_status_type :\n%s\n", cJSON_Print(jsonfeedback_reaction_status_type_1));
	feedback_reaction_status_type_t* feedback_reaction_status_type_2 = feedback_reaction_status_type_parseFromJSON(jsonfeedback_reaction_status_type_1);
	cJSON* jsonfeedback_reaction_status_type_2 = feedback_reaction_status_type_convertToJSON(feedback_reaction_status_type_2);
	printf("repeating feedback_reaction_status_type:\n%s\n", cJSON_Print(jsonfeedback_reaction_status_type_2));
}

int main() {
  test_feedback_reaction_status_type(1);
  test_feedback_reaction_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_reaction_status_type_MAIN
#endif // feedback_reaction_status_type_TEST
