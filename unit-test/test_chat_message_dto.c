#ifndef chat_message_dto_TEST
#define chat_message_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_message_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_message_dto.h"
chat_message_dto_t* instantiate_chat_message_dto(int include_optional);



chat_message_dto_t* instantiate_chat_message_dto(int include_optional) {
  chat_message_dto_t* chat_message_dto = NULL;
  if (include_optional) {
    chat_message_dto = chat_message_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      _api__chat_message_dto__PARTNER,
      "0",
      list_createList()
    );
  } else {
    chat_message_dto = chat_message_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      _api__chat_message_dto__PARTNER,
      "0",
      list_createList()
    );
  }

  return chat_message_dto;
}


#ifdef chat_message_dto_MAIN

void test_chat_message_dto(int include_optional) {
    chat_message_dto_t* chat_message_dto_1 = instantiate_chat_message_dto(include_optional);

	cJSON* jsonchat_message_dto_1 = chat_message_dto_convertToJSON(chat_message_dto_1);
	printf("chat_message_dto :\n%s\n", cJSON_Print(jsonchat_message_dto_1));
	chat_message_dto_t* chat_message_dto_2 = chat_message_dto_parseFromJSON(jsonchat_message_dto_1);
	cJSON* jsonchat_message_dto_2 = chat_message_dto_convertToJSON(chat_message_dto_2);
	printf("repeating chat_message_dto:\n%s\n", cJSON_Print(jsonchat_message_dto_2));
}

int main() {
  test_chat_message_dto(1);
  test_chat_message_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_message_dto_MAIN
#endif // chat_message_dto_TEST
