#ifndef report_format_type_TEST
#define report_format_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define report_format_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/report_format_type.h"
report_format_type_t* instantiate_report_format_type(int include_optional);



report_format_type_t* instantiate_report_format_type(int include_optional) {
  report_format_type_t* report_format_type = NULL;
  if (include_optional) {
    report_format_type = report_format_type_create(
    );
  } else {
    report_format_type = report_format_type_create(
    );
  }

  return report_format_type;
}


#ifdef report_format_type_MAIN

void test_report_format_type(int include_optional) {
    report_format_type_t* report_format_type_1 = instantiate_report_format_type(include_optional);

	cJSON* jsonreport_format_type_1 = report_format_type_convertToJSON(report_format_type_1);
	printf("report_format_type :\n%s\n", cJSON_Print(jsonreport_format_type_1));
	report_format_type_t* report_format_type_2 = report_format_type_parseFromJSON(jsonreport_format_type_1);
	cJSON* jsonreport_format_type_2 = report_format_type_convertToJSON(report_format_type_2);
	printf("repeating report_format_type:\n%s\n", cJSON_Print(jsonreport_format_type_2));
}

int main() {
  test_report_format_type(1);
  test_report_format_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // report_format_type_MAIN
#endif // report_format_type_TEST
