package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnDecisionSubreasonType {
  USER_DID_NOT_LIKE,
  USER_CHANGED_MIND,
  DELIVERED_TOO_LONG,
  BAD_PACKAGE,
  DAMAGED,
  NOT_WORKING,
  INCOMPLETENESS,
  WRONG_ITEM,
  WRONG_COLOR,
  DID_NOT_MATCH_DESCRIPTION,
  UNKNOWN;
}
