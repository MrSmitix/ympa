package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum LogisticPointType {
  WAREHOUSE,
  PICKUP_POINT,
  PICKUP_TERMINAL,
  PICKUP_POST_OFFICE,
  PICKUP_MIXED,
  PICKUP_RETAIL,
  UNKNOWN;
}
