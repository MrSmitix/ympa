package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum TurnoverType {
  LOW,
  ALMOST_LOW,
  HIGH,
  VERY_HIGH,
  NO_SALES,
  FREE_STORE;
}
