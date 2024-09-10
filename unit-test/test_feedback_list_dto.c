#ifndef feedback_list_dto_TEST
#define feedback_list_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_list_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_list_dto.h"
feedback_list_dto_t* instantiate_feedback_list_dto(int include_optional);

#include "test_scrolling_pager_dto.c"


feedback_list_dto_t* instantiate_feedback_list_dto(int include_optional) {
  feedback_list_dto_t* feedback_list_dto = NULL;
  if (include_optional) {
    feedback_list_dto = feedback_list_dto_create(
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
      list_createList()
    );
  } else {
    feedback_list_dto = feedback_list_dto_create(
      NULL,
      list_createList()
    );
  }

  return feedback_list_dto;
}


#ifdef feedback_list_dto_MAIN

void test_feedback_list_dto(int include_optional) {
    feedback_list_dto_t* feedback_list_dto_1 = instantiate_feedback_list_dto(include_optional);

	cJSON* jsonfeedback_list_dto_1 = feedback_list_dto_convertToJSON(feedback_list_dto_1);
	printf("feedback_list_dto :\n%s\n", cJSON_Print(jsonfeedback_list_dto_1));
	feedback_list_dto_t* feedback_list_dto_2 = feedback_list_dto_parseFromJSON(jsonfeedback_list_dto_1);
	cJSON* jsonfeedback_list_dto_2 = feedback_list_dto_convertToJSON(feedback_list_dto_2);
	printf("repeating feedback_list_dto:\n%s\n", cJSON_Print(jsonfeedback_list_dto_2));
}

int main() {
  test_feedback_list_dto(1);
  test_feedback_list_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_list_dto_MAIN
#endif // feedback_list_dto_TEST
