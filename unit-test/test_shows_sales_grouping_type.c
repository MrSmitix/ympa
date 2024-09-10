#ifndef shows_sales_grouping_type_TEST
#define shows_sales_grouping_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shows_sales_grouping_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shows_sales_grouping_type.h"
shows_sales_grouping_type_t* instantiate_shows_sales_grouping_type(int include_optional);



shows_sales_grouping_type_t* instantiate_shows_sales_grouping_type(int include_optional) {
  shows_sales_grouping_type_t* shows_sales_grouping_type = NULL;
  if (include_optional) {
    shows_sales_grouping_type = shows_sales_grouping_type_create(
    );
  } else {
    shows_sales_grouping_type = shows_sales_grouping_type_create(
    );
  }

  return shows_sales_grouping_type;
}


#ifdef shows_sales_grouping_type_MAIN

void test_shows_sales_grouping_type(int include_optional) {
    shows_sales_grouping_type_t* shows_sales_grouping_type_1 = instantiate_shows_sales_grouping_type(include_optional);

	cJSON* jsonshows_sales_grouping_type_1 = shows_sales_grouping_type_convertToJSON(shows_sales_grouping_type_1);
	printf("shows_sales_grouping_type :\n%s\n", cJSON_Print(jsonshows_sales_grouping_type_1));
	shows_sales_grouping_type_t* shows_sales_grouping_type_2 = shows_sales_grouping_type_parseFromJSON(jsonshows_sales_grouping_type_1);
	cJSON* jsonshows_sales_grouping_type_2 = shows_sales_grouping_type_convertToJSON(shows_sales_grouping_type_2);
	printf("repeating shows_sales_grouping_type:\n%s\n", cJSON_Print(jsonshows_sales_grouping_type_2));
}

int main() {
  test_shows_sales_grouping_type(1);
  test_shows_sales_grouping_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // shows_sales_grouping_type_MAIN
#endif // shows_sales_grouping_type_TEST
