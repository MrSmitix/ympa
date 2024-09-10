#ifndef outlet_status_type_TEST
#define outlet_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_status_type.h"
outlet_status_type_t* instantiate_outlet_status_type(int include_optional);



outlet_status_type_t* instantiate_outlet_status_type(int include_optional) {
  outlet_status_type_t* outlet_status_type = NULL;
  if (include_optional) {
    outlet_status_type = outlet_status_type_create(
    );
  } else {
    outlet_status_type = outlet_status_type_create(
    );
  }

  return outlet_status_type;
}


#ifdef outlet_status_type_MAIN

void test_outlet_status_type(int include_optional) {
    outlet_status_type_t* outlet_status_type_1 = instantiate_outlet_status_type(include_optional);

	cJSON* jsonoutlet_status_type_1 = outlet_status_type_convertToJSON(outlet_status_type_1);
	printf("outlet_status_type :\n%s\n", cJSON_Print(jsonoutlet_status_type_1));
	outlet_status_type_t* outlet_status_type_2 = outlet_status_type_parseFromJSON(jsonoutlet_status_type_1);
	cJSON* jsonoutlet_status_type_2 = outlet_status_type_convertToJSON(outlet_status_type_2);
	printf("repeating outlet_status_type:\n%s\n", cJSON_Print(jsonoutlet_status_type_2));
}

int main() {
  test_outlet_status_type(1);
  test_outlet_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_status_type_MAIN
#endif // outlet_status_type_TEST
