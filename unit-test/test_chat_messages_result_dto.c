#ifndef chat_messages_result_dto_TEST
#define chat_messages_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_messages_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_messages_result_dto.h"
chat_messages_result_dto_t* instantiate_chat_messages_result_dto(int include_optional);

#include "test_forward_scrolling_pager_dto.c"


chat_messages_result_dto_t* instantiate_chat_messages_result_dto(int include_optional) {
  chat_messages_result_dto_t* chat_messages_result_dto = NULL;
  if (include_optional) {
    chat_messages_result_dto = chat_messages_result_dto_create(
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_forward_scrolling_pager_dto(0)
    );
  } else {
    chat_messages_result_dto = chat_messages_result_dto_create(
      56,
      list_createList(),
      NULL
    );
  }

  return chat_messages_result_dto;
}


#ifdef chat_messages_result_dto_MAIN

void test_chat_messages_result_dto(int include_optional) {
    chat_messages_result_dto_t* chat_messages_result_dto_1 = instantiate_chat_messages_result_dto(include_optional);

	cJSON* jsonchat_messages_result_dto_1 = chat_messages_result_dto_convertToJSON(chat_messages_result_dto_1);
	printf("chat_messages_result_dto :\n%s\n", cJSON_Print(jsonchat_messages_result_dto_1));
	chat_messages_result_dto_t* chat_messages_result_dto_2 = chat_messages_result_dto_parseFromJSON(jsonchat_messages_result_dto_1);
	cJSON* jsonchat_messages_result_dto_2 = chat_messages_result_dto_convertToJSON(chat_messages_result_dto_2);
	printf("repeating chat_messages_result_dto:\n%s\n", cJSON_Print(jsonchat_messages_result_dto_2));
}

int main() {
  test_chat_messages_result_dto(1);
  test_chat_messages_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_messages_result_dto_MAIN
#endif // chat_messages_result_dto_TEST
