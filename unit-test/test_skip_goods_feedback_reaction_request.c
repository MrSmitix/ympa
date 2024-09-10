#ifndef skip_goods_feedback_reaction_request_TEST
#define skip_goods_feedback_reaction_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define skip_goods_feedback_reaction_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/skip_goods_feedback_reaction_request.h"
skip_goods_feedback_reaction_request_t* instantiate_skip_goods_feedback_reaction_request(int include_optional);



skip_goods_feedback_reaction_request_t* instantiate_skip_goods_feedback_reaction_request(int include_optional) {
  skip_goods_feedback_reaction_request_t* skip_goods_feedback_reaction_request = NULL;
  if (include_optional) {
    skip_goods_feedback_reaction_request = skip_goods_feedback_reaction_request_create(
      list_createList()
    );
  } else {
    skip_goods_feedback_reaction_request = skip_goods_feedback_reaction_request_create(
      list_createList()
    );
  }

  return skip_goods_feedback_reaction_request;
}


#ifdef skip_goods_feedback_reaction_request_MAIN

void test_skip_goods_feedback_reaction_request(int include_optional) {
    skip_goods_feedback_reaction_request_t* skip_goods_feedback_reaction_request_1 = instantiate_skip_goods_feedback_reaction_request(include_optional);

	cJSON* jsonskip_goods_feedback_reaction_request_1 = skip_goods_feedback_reaction_request_convertToJSON(skip_goods_feedback_reaction_request_1);
	printf("skip_goods_feedback_reaction_request :\n%s\n", cJSON_Print(jsonskip_goods_feedback_reaction_request_1));
	skip_goods_feedback_reaction_request_t* skip_goods_feedback_reaction_request_2 = skip_goods_feedback_reaction_request_parseFromJSON(jsonskip_goods_feedback_reaction_request_1);
	cJSON* jsonskip_goods_feedback_reaction_request_2 = skip_goods_feedback_reaction_request_convertToJSON(skip_goods_feedback_reaction_request_2);
	printf("repeating skip_goods_feedback_reaction_request:\n%s\n", cJSON_Print(jsonskip_goods_feedback_reaction_request_2));
}

int main() {
  test_skip_goods_feedback_reaction_request(1);
  test_skip_goods_feedback_reaction_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // skip_goods_feedback_reaction_request_MAIN
#endif // skip_goods_feedback_reaction_request_TEST
