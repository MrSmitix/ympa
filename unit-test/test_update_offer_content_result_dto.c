#ifndef update_offer_content_result_dto_TEST
#define update_offer_content_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_offer_content_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_offer_content_result_dto.h"
update_offer_content_result_dto_t* instantiate_update_offer_content_result_dto(int include_optional);



update_offer_content_result_dto_t* instantiate_update_offer_content_result_dto(int include_optional) {
  update_offer_content_result_dto_t* update_offer_content_result_dto = NULL;
  if (include_optional) {
    update_offer_content_result_dto = update_offer_content_result_dto_create(
      "a",
      list_createList(),
      list_createList()
    );
  } else {
    update_offer_content_result_dto = update_offer_content_result_dto_create(
      "a",
      list_createList(),
      list_createList()
    );
  }

  return update_offer_content_result_dto;
}


#ifdef update_offer_content_result_dto_MAIN

void test_update_offer_content_result_dto(int include_optional) {
    update_offer_content_result_dto_t* update_offer_content_result_dto_1 = instantiate_update_offer_content_result_dto(include_optional);

	cJSON* jsonupdate_offer_content_result_dto_1 = update_offer_content_result_dto_convertToJSON(update_offer_content_result_dto_1);
	printf("update_offer_content_result_dto :\n%s\n", cJSON_Print(jsonupdate_offer_content_result_dto_1));
	update_offer_content_result_dto_t* update_offer_content_result_dto_2 = update_offer_content_result_dto_parseFromJSON(jsonupdate_offer_content_result_dto_1);
	cJSON* jsonupdate_offer_content_result_dto_2 = update_offer_content_result_dto_convertToJSON(update_offer_content_result_dto_2);
	printf("repeating update_offer_content_result_dto:\n%s\n", cJSON_Print(jsonupdate_offer_content_result_dto_2));
}

int main() {
  test_update_offer_content_result_dto(1);
  test_update_offer_content_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_offer_content_result_dto_MAIN
#endif // update_offer_content_result_dto_TEST
