package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OfferCardStatusType {
  HAS_CARD_CAN_NOT_UPDATE,
  HAS_CARD_CAN_UPDATE,
  HAS_CARD_CAN_UPDATE_ERRORS,
  HAS_CARD_CAN_UPDATE_PROCESSING,
  NO_CARD_NEED_CONTENT,
  NO_CARD_MARKET_WILL_CREATE,
  NO_CARD_ERRORS,
  NO_CARD_PROCESSING,
  NO_CARD_ADD_TO_CAMPAIGN;
}
