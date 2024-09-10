package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnDecisionReasonType {
  BAD_QUALITY,
  DOES_NOT_FIT,
  WRONG_ITEM,
  DAMAGE_DELIVERY,
  LOYALTY_FAIL,
  CONTENT_FAIL,
  UNKNOWN;
}
