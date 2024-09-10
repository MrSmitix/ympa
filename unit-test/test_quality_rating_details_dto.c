#ifndef quality_rating_details_dto_TEST
#define quality_rating_details_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quality_rating_details_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quality_rating_details_dto.h"
quality_rating_details_dto_t* instantiate_quality_rating_details_dto(int include_optional);



quality_rating_details_dto_t* instantiate_quality_rating_details_dto(int include_optional) {
  quality_rating_details_dto_t* quality_rating_details_dto = NULL;
  if (include_optional) {
    quality_rating_details_dto = quality_rating_details_dto_create(
      list_createList()
    );
  } else {
    quality_rating_details_dto = quality_rating_details_dto_create(
      list_createList()
    );
  }

  return quality_rating_details_dto;
}


#ifdef quality_rating_details_dto_MAIN

void test_quality_rating_details_dto(int include_optional) {
    quality_rating_details_dto_t* quality_rating_details_dto_1 = instantiate_quality_rating_details_dto(include_optional);

	cJSON* jsonquality_rating_details_dto_1 = quality_rating_details_dto_convertToJSON(quality_rating_details_dto_1);
	printf("quality_rating_details_dto :\n%s\n", cJSON_Print(jsonquality_rating_details_dto_1));
	quality_rating_details_dto_t* quality_rating_details_dto_2 = quality_rating_details_dto_parseFromJSON(jsonquality_rating_details_dto_1);
	cJSON* jsonquality_rating_details_dto_2 = quality_rating_details_dto_convertToJSON(quality_rating_details_dto_2);
	printf("repeating quality_rating_details_dto:\n%s\n", cJSON_Print(jsonquality_rating_details_dto_2));
}

int main() {
  test_quality_rating_details_dto(1);
  test_quality_rating_details_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // quality_rating_details_dto_MAIN
#endif // quality_rating_details_dto_TEST
