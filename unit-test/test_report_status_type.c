#ifndef report_status_type_TEST
#define report_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define report_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/report_status_type.h"
report_status_type_t* instantiate_report_status_type(int include_optional);



report_status_type_t* instantiate_report_status_type(int include_optional) {
  report_status_type_t* report_status_type = NULL;
  if (include_optional) {
    report_status_type = report_status_type_create(
    );
  } else {
    report_status_type = report_status_type_create(
    );
  }

  return report_status_type;
}


#ifdef report_status_type_MAIN

void test_report_status_type(int include_optional) {
    report_status_type_t* report_status_type_1 = instantiate_report_status_type(include_optional);

	cJSON* jsonreport_status_type_1 = report_status_type_convertToJSON(report_status_type_1);
	printf("report_status_type :\n%s\n", cJSON_Print(jsonreport_status_type_1));
	report_status_type_t* report_status_type_2 = report_status_type_parseFromJSON(jsonreport_status_type_1);
	cJSON* jsonreport_status_type_2 = report_status_type_convertToJSON(report_status_type_2);
	printf("repeating report_status_type:\n%s\n", cJSON_Print(jsonreport_status_type_2));
}

int main() {
  test_report_status_type(1);
  test_report_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // report_status_type_MAIN
#endif // report_status_type_TEST
