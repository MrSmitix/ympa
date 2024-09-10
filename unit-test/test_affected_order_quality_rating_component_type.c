#ifndef affected_order_quality_rating_component_type_TEST
#define affected_order_quality_rating_component_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define affected_order_quality_rating_component_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/affected_order_quality_rating_component_type.h"
affected_order_quality_rating_component_type_t* instantiate_affected_order_quality_rating_component_type(int include_optional);



affected_order_quality_rating_component_type_t* instantiate_affected_order_quality_rating_component_type(int include_optional) {
  affected_order_quality_rating_component_type_t* affected_order_quality_rating_component_type = NULL;
  if (include_optional) {
    affected_order_quality_rating_component_type = affected_order_quality_rating_component_type_create(
    );
  } else {
    affected_order_quality_rating_component_type = affected_order_quality_rating_component_type_create(
    );
  }

  return affected_order_quality_rating_component_type;
}


#ifdef affected_order_quality_rating_component_type_MAIN

void test_affected_order_quality_rating_component_type(int include_optional) {
    affected_order_quality_rating_component_type_t* affected_order_quality_rating_component_type_1 = instantiate_affected_order_quality_rating_component_type(include_optional);

	cJSON* jsonaffected_order_quality_rating_component_type_1 = affected_order_quality_rating_component_type_convertToJSON(affected_order_quality_rating_component_type_1);
	printf("affected_order_quality_rating_component_type :\n%s\n", cJSON_Print(jsonaffected_order_quality_rating_component_type_1));
	affected_order_quality_rating_component_type_t* affected_order_quality_rating_component_type_2 = affected_order_quality_rating_component_type_parseFromJSON(jsonaffected_order_quality_rating_component_type_1);
	cJSON* jsonaffected_order_quality_rating_component_type_2 = affected_order_quality_rating_component_type_convertToJSON(affected_order_quality_rating_component_type_2);
	printf("repeating affected_order_quality_rating_component_type:\n%s\n", cJSON_Print(jsonaffected_order_quality_rating_component_type_2));
}

int main() {
  test_affected_order_quality_rating_component_type(1);
  test_affected_order_quality_rating_component_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // affected_order_quality_rating_component_type_MAIN
#endif // affected_order_quality_rating_component_type_TEST
