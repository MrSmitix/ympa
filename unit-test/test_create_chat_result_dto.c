#ifndef create_chat_result_dto_TEST
#define create_chat_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_result_dto.h"
create_chat_result_dto_t* instantiate_create_chat_result_dto(int include_optional);



create_chat_result_dto_t* instantiate_create_chat_result_dto(int include_optional) {
  create_chat_result_dto_t* create_chat_result_dto = NULL;
  if (include_optional) {
    create_chat_result_dto = create_chat_result_dto_create(
      56
    );
  } else {
    create_chat_result_dto = create_chat_result_dto_create(
      56
    );
  }

  return create_chat_result_dto;
}


#ifdef create_chat_result_dto_MAIN

void test_create_chat_result_dto(int include_optional) {
    create_chat_result_dto_t* create_chat_result_dto_1 = instantiate_create_chat_result_dto(include_optional);

	cJSON* jsoncreate_chat_result_dto_1 = create_chat_result_dto_convertToJSON(create_chat_result_dto_1);
	printf("create_chat_result_dto :\n%s\n", cJSON_Print(jsoncreate_chat_result_dto_1));
	create_chat_result_dto_t* create_chat_result_dto_2 = create_chat_result_dto_parseFromJSON(jsoncreate_chat_result_dto_1);
	cJSON* jsoncreate_chat_result_dto_2 = create_chat_result_dto_convertToJSON(create_chat_result_dto_2);
	printf("repeating create_chat_result_dto:\n%s\n", cJSON_Print(jsoncreate_chat_result_dto_2));
}

int main() {
  test_create_chat_result_dto(1);
  test_create_chat_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_result_dto_MAIN
#endif // create_chat_result_dto_TEST
