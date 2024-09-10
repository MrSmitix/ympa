#ifndef feed_placement_dto_TEST
#define feed_placement_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_placement_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_placement_dto.h"
feed_placement_dto_t* instantiate_feed_placement_dto(int include_optional);



feed_placement_dto_t* instantiate_feed_placement_dto(int include_optional) {
  feed_placement_dto_t* feed_placement_dto = NULL;
  if (include_optional) {
    feed_placement_dto = feed_placement_dto_create(
      _api__feed_placement_dto__ERROR,
      56
    );
  } else {
    feed_placement_dto = feed_placement_dto_create(
      _api__feed_placement_dto__ERROR,
      56
    );
  }

  return feed_placement_dto;
}


#ifdef feed_placement_dto_MAIN

void test_feed_placement_dto(int include_optional) {
    feed_placement_dto_t* feed_placement_dto_1 = instantiate_feed_placement_dto(include_optional);

	cJSON* jsonfeed_placement_dto_1 = feed_placement_dto_convertToJSON(feed_placement_dto_1);
	printf("feed_placement_dto :\n%s\n", cJSON_Print(jsonfeed_placement_dto_1));
	feed_placement_dto_t* feed_placement_dto_2 = feed_placement_dto_parseFromJSON(jsonfeed_placement_dto_1);
	cJSON* jsonfeed_placement_dto_2 = feed_placement_dto_convertToJSON(feed_placement_dto_2);
	printf("repeating feed_placement_dto:\n%s\n", cJSON_Print(jsonfeed_placement_dto_2));
}

int main() {
  test_feed_placement_dto(1);
  test_feed_placement_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_placement_dto_MAIN
#endif // feed_placement_dto_TEST
