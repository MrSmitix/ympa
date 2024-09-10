#ifndef shelfs_statistics_attribution_type_TEST
#define shelfs_statistics_attribution_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shelfs_statistics_attribution_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shelfs_statistics_attribution_type.h"
shelfs_statistics_attribution_type_t* instantiate_shelfs_statistics_attribution_type(int include_optional);



shelfs_statistics_attribution_type_t* instantiate_shelfs_statistics_attribution_type(int include_optional) {
  shelfs_statistics_attribution_type_t* shelfs_statistics_attribution_type = NULL;
  if (include_optional) {
    shelfs_statistics_attribution_type = shelfs_statistics_attribution_type_create(
    );
  } else {
    shelfs_statistics_attribution_type = shelfs_statistics_attribution_type_create(
    );
  }

  return shelfs_statistics_attribution_type;
}


#ifdef shelfs_statistics_attribution_type_MAIN

void test_shelfs_statistics_attribution_type(int include_optional) {
    shelfs_statistics_attribution_type_t* shelfs_statistics_attribution_type_1 = instantiate_shelfs_statistics_attribution_type(include_optional);

	cJSON* jsonshelfs_statistics_attribution_type_1 = shelfs_statistics_attribution_type_convertToJSON(shelfs_statistics_attribution_type_1);
	printf("shelfs_statistics_attribution_type :\n%s\n", cJSON_Print(jsonshelfs_statistics_attribution_type_1));
	shelfs_statistics_attribution_type_t* shelfs_statistics_attribution_type_2 = shelfs_statistics_attribution_type_parseFromJSON(jsonshelfs_statistics_attribution_type_1);
	cJSON* jsonshelfs_statistics_attribution_type_2 = shelfs_statistics_attribution_type_convertToJSON(shelfs_statistics_attribution_type_2);
	printf("repeating shelfs_statistics_attribution_type:\n%s\n", cJSON_Print(jsonshelfs_statistics_attribution_type_2));
}

int main() {
  test_shelfs_statistics_attribution_type(1);
  test_shelfs_statistics_attribution_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // shelfs_statistics_attribution_type_MAIN
#endif // shelfs_statistics_attribution_type_TEST
