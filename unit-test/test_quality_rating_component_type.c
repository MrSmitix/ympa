#ifndef quality_rating_component_type_TEST
#define quality_rating_component_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quality_rating_component_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quality_rating_component_type.h"
quality_rating_component_type_t* instantiate_quality_rating_component_type(int include_optional);



quality_rating_component_type_t* instantiate_quality_rating_component_type(int include_optional) {
  quality_rating_component_type_t* quality_rating_component_type = NULL;
  if (include_optional) {
    quality_rating_component_type = quality_rating_component_type_create(
    );
  } else {
    quality_rating_component_type = quality_rating_component_type_create(
    );
  }

  return quality_rating_component_type;
}


#ifdef quality_rating_component_type_MAIN

void test_quality_rating_component_type(int include_optional) {
    quality_rating_component_type_t* quality_rating_component_type_1 = instantiate_quality_rating_component_type(include_optional);

	cJSON* jsonquality_rating_component_type_1 = quality_rating_component_type_convertToJSON(quality_rating_component_type_1);
	printf("quality_rating_component_type :\n%s\n", cJSON_Print(jsonquality_rating_component_type_1));
	quality_rating_component_type_t* quality_rating_component_type_2 = quality_rating_component_type_parseFromJSON(jsonquality_rating_component_type_1);
	cJSON* jsonquality_rating_component_type_2 = quality_rating_component_type_convertToJSON(quality_rating_component_type_2);
	printf("repeating quality_rating_component_type:\n%s\n", cJSON_Print(jsonquality_rating_component_type_2));
}

int main() {
  test_quality_rating_component_type(1);
  test_quality_rating_component_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // quality_rating_component_type_MAIN
#endif // quality_rating_component_type_TEST
