#ifndef feed_parameter_dto_TEST
#define feed_parameter_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_parameter_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_parameter_dto.h"
feed_parameter_dto_t* instantiate_feed_parameter_dto(int include_optional);



feed_parameter_dto_t* instantiate_feed_parameter_dto(int include_optional) {
  feed_parameter_dto_t* feed_parameter_dto = NULL;
  if (include_optional) {
    feed_parameter_dto = feed_parameter_dto_create(
      1,
      "0",
      list_createList()
    );
  } else {
    feed_parameter_dto = feed_parameter_dto_create(
      1,
      "0",
      list_createList()
    );
  }

  return feed_parameter_dto;
}


#ifdef feed_parameter_dto_MAIN

void test_feed_parameter_dto(int include_optional) {
    feed_parameter_dto_t* feed_parameter_dto_1 = instantiate_feed_parameter_dto(include_optional);

	cJSON* jsonfeed_parameter_dto_1 = feed_parameter_dto_convertToJSON(feed_parameter_dto_1);
	printf("feed_parameter_dto :\n%s\n", cJSON_Print(jsonfeed_parameter_dto_1));
	feed_parameter_dto_t* feed_parameter_dto_2 = feed_parameter_dto_parseFromJSON(jsonfeed_parameter_dto_1);
	cJSON* jsonfeed_parameter_dto_2 = feed_parameter_dto_convertToJSON(feed_parameter_dto_2);
	printf("repeating feed_parameter_dto:\n%s\n", cJSON_Print(jsonfeed_parameter_dto_2));
}

int main() {
  test_feed_parameter_dto(1);
  test_feed_parameter_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_parameter_dto_MAIN
#endif // feed_parameter_dto_TEST
