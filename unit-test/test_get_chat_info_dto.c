#ifndef get_chat_info_dto_TEST
#define get_chat_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_chat_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_chat_info_dto.h"
get_chat_info_dto_t* instantiate_get_chat_info_dto(int include_optional);



get_chat_info_dto_t* instantiate_get_chat_info_dto(int include_optional) {
  get_chat_info_dto_t* get_chat_info_dto = NULL;
  if (include_optional) {
    get_chat_info_dto = get_chat_info_dto_create(
      56,
      56,
      _api__get_chat_info_dto__CHAT,
      _api__get_chat_info_dto__NEW,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    get_chat_info_dto = get_chat_info_dto_create(
      56,
      56,
      _api__get_chat_info_dto__CHAT,
      _api__get_chat_info_dto__NEW,
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00"
    );
  }

  return get_chat_info_dto;
}


#ifdef get_chat_info_dto_MAIN

void test_get_chat_info_dto(int include_optional) {
    get_chat_info_dto_t* get_chat_info_dto_1 = instantiate_get_chat_info_dto(include_optional);

	cJSON* jsonget_chat_info_dto_1 = get_chat_info_dto_convertToJSON(get_chat_info_dto_1);
	printf("get_chat_info_dto :\n%s\n", cJSON_Print(jsonget_chat_info_dto_1));
	get_chat_info_dto_t* get_chat_info_dto_2 = get_chat_info_dto_parseFromJSON(jsonget_chat_info_dto_1);
	cJSON* jsonget_chat_info_dto_2 = get_chat_info_dto_convertToJSON(get_chat_info_dto_2);
	printf("repeating get_chat_info_dto:\n%s\n", cJSON_Print(jsonget_chat_info_dto_2));
}

int main() {
  test_get_chat_info_dto(1);
  test_get_chat_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_chat_info_dto_MAIN
#endif // get_chat_info_dto_TEST
