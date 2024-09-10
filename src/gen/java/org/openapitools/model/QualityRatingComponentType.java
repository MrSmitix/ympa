package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum QualityRatingComponentType {
  DBS_CANCELLATION_RATE,
  DBS_LATE_DELIVERY_RATE,
  FBS_CANCELLATION_RATE,
  FBS_LATE_SHIP_RATE,
  FBY_LATE_DELIVERY_RATE,
  FBY_CANCELLATION_RATE,
  FBY_DELIVERY_DIFF_RATE,
  FBY_LATE_EDITING_RATE;
}
