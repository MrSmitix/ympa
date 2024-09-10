#ifndef chat_message_payload_dto_TEST
#define chat_message_payload_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_message_payload_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_message_payload_dto.h"
chat_message_payload_dto_t* instantiate_chat_message_payload_dto(int include_optional);



chat_message_payload_dto_t* instantiate_chat_message_payload_dto(int include_optional) {
  chat_message_payload_dto_t* chat_message_payload_dto = NULL;
  if (include_optional) {
    chat_message_payload_dto = chat_message_payload_dto_create(
      "0",
      "0",
      56
    );
  } else {
    chat_message_payload_dto = chat_message_payload_dto_create(
      "0",
      "0",
      56
    );
  }

  return chat_message_payload_dto;
}


#ifdef chat_message_payload_dto_MAIN

void test_chat_message_payload_dto(int include_optional) {
    chat_message_payload_dto_t* chat_message_payload_dto_1 = instantiate_chat_message_payload_dto(include_optional);

	cJSON* jsonchat_message_payload_dto_1 = chat_message_payload_dto_convertToJSON(chat_message_payload_dto_1);
	printf("chat_message_payload_dto :\n%s\n", cJSON_Print(jsonchat_message_payload_dto_1));
	chat_message_payload_dto_t* chat_message_payload_dto_2 = chat_message_payload_dto_parseFromJSON(jsonchat_message_payload_dto_1);
	cJSON* jsonchat_message_payload_dto_2 = chat_message_payload_dto_convertToJSON(chat_message_payload_dto_2);
	printf("repeating chat_message_payload_dto:\n%s\n", cJSON_Print(jsonchat_message_payload_dto_2));
}

int main() {
  test_chat_message_payload_dto(1);
  test_chat_message_payload_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_message_payload_dto_MAIN
#endif // chat_message_payload_dto_TEST
