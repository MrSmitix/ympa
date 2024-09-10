#ifndef feed_index_logs_offers_dto_TEST
#define feed_index_logs_offers_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_index_logs_offers_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_index_logs_offers_dto.h"
feed_index_logs_offers_dto_t* instantiate_feed_index_logs_offers_dto(int include_optional);



feed_index_logs_offers_dto_t* instantiate_feed_index_logs_offers_dto(int include_optional) {
  feed_index_logs_offers_dto_t* feed_index_logs_offers_dto = NULL;
  if (include_optional) {
    feed_index_logs_offers_dto = feed_index_logs_offers_dto_create(
      56,
      56
    );
  } else {
    feed_index_logs_offers_dto = feed_index_logs_offers_dto_create(
      56,
      56
    );
  }

  return feed_index_logs_offers_dto;
}


#ifdef feed_index_logs_offers_dto_MAIN

void test_feed_index_logs_offers_dto(int include_optional) {
    feed_index_logs_offers_dto_t* feed_index_logs_offers_dto_1 = instantiate_feed_index_logs_offers_dto(include_optional);

	cJSON* jsonfeed_index_logs_offers_dto_1 = feed_index_logs_offers_dto_convertToJSON(feed_index_logs_offers_dto_1);
	printf("feed_index_logs_offers_dto :\n%s\n", cJSON_Print(jsonfeed_index_logs_offers_dto_1));
	feed_index_logs_offers_dto_t* feed_index_logs_offers_dto_2 = feed_index_logs_offers_dto_parseFromJSON(jsonfeed_index_logs_offers_dto_1);
	cJSON* jsonfeed_index_logs_offers_dto_2 = feed_index_logs_offers_dto_convertToJSON(feed_index_logs_offers_dto_2);
	printf("repeating feed_index_logs_offers_dto:\n%s\n", cJSON_Print(jsonfeed_index_logs_offers_dto_2));
}

int main() {
  test_feed_index_logs_offers_dto(1);
  test_feed_index_logs_offers_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_index_logs_offers_dto_MAIN
#endif // feed_index_logs_offers_dto_TEST
